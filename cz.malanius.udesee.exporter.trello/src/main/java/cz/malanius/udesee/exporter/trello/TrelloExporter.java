package cz.malanius.udesee.exporter.trello;

import cz.malanius.udesee.cli.util.ConsoleReader;
import cz.malanius.udesee.cli.util.ConsoleWriter;
import cz.malanius.udesee.course.Course;
import cz.malanius.udesee.course.Lesson;
import cz.malanius.udesee.course.Section;
import cz.malanius.udesee.exporter.Exporter;
import cz.malanius.udesee.exporter.trello.api.Requester;
import cz.malanius.udesee.exporter.trello.pojo.board.Board;
import cz.malanius.udesee.exporter.trello.pojo.card.Card;
import cz.malanius.udesee.exporter.trello.pojo.checklist.Checklist;
import cz.malanius.udesee.exporter.trello.pojo.list.TList;
import cz.malanius.udesee.exporter.trello.pojo.member.Member;
import cz.malanius.udesee.exporter.trello.pojo.token.Token;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class TrelloExporter implements Exporter {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TrelloExporter.class);

    private Requester requester = new Requester();

    @Override
    public void exportWithCli(Course course) {
        LOG.trace("exportWithCli() - start.");

        ConsoleWriter.printUserInfo("Trello export module started.");
        try {

            //API key
            ConsoleWriter.printUserInfo("Please provide your Trello API key (you can get one at https://trello.com/app-key): ");
            requester.setKey(ConsoleReader.readLine());

            //Token
            ConsoleWriter.printUserInfo("Please get requester token from " + requester.getAuthUrl());
            ConsoleWriter.printUserInfo("Enter the token:");
            requester.setToken(ConsoleReader.readLine());
            Token token = requester.getToken();
            Member trelloMember = requester.getMember(token.getIdMember());
            ConsoleWriter.printUserInfo("Successfully connected to Trello as " + trelloMember.getFullName());

            //Board selection
            List<Board> boards = requester.getMemberBoards(trelloMember.getId());
            ConsoleWriter.printListSelection(boards);
            int boardChoice = ConsoleReader.select(boards.size()) - 1;
            Board selectedBoard = boards.get(boardChoice);
            ConsoleWriter.printUserInfo("Selected board: " + selectedBoard.getName());

            //List selection
            List<TList> boardLists = requester.getBoardLists(selectedBoard.getId());
            ConsoleWriter.printListSelection(boardLists);
            int listChoice = ConsoleReader.select(boards.size()) - 1;
            TList selectedList = boardLists.get(listChoice);
            ConsoleWriter.printUserInfo("Selected list: " + selectedList.getName());

            //Card selection
            List<Card> cards = requester.getCardsForList(selectedList.getId());
            ConsoleWriter.printListSelection(cards);
            int cardChoice = ConsoleReader.select(cards.size()) - 1;
            Card selectedCard = cards.get(cardChoice);
            ConsoleWriter.printUserInfo("Selected card: " + selectedCard.getName());

            postChecklists(course, selectedCard.getId());

            ConsoleWriter.printUserOk("Export to Trello was successful!");

        } catch (URISyntaxException | InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    private void postChecklists(Course course, String cardId) throws IOException, InterruptedException {
        for (Section section : course.getSections()) {
            Checklist checklist = requester.postChecklist(section.getSectionLine(), cardId);
            for (Lesson lesson : section.getLessons()) {
                requester.postChecklistItem(lesson.getLessonLine(), checklist.getId());
            }
        }
    }
}
