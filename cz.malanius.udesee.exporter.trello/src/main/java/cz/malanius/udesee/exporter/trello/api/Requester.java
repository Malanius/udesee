package cz.malanius.udesee.exporter.trello.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import cz.malanius.udesee.cli.util.ConsoleWriter;
import cz.malanius.udesee.exporter.trello.pojo.board.Board;
import cz.malanius.udesee.exporter.trello.pojo.card.Card;
import cz.malanius.udesee.exporter.trello.pojo.checklist.CheckItem;
import cz.malanius.udesee.exporter.trello.pojo.checklist.Checklist;
import cz.malanius.udesee.exporter.trello.pojo.list.TList;
import cz.malanius.udesee.exporter.trello.pojo.member.Member;
import cz.malanius.udesee.exporter.trello.pojo.token.Token;
import cz.malanius.udesee.exporter.trello.webclient.WebClient;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


public class Requester {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Requester.class);

    private static Gson gson = new Gson();

    final String authPoint = "https://trello.com/1/authorize";
    final String callback_method = "postMessage";
    final String return_url = "origin";
    private final String scope = "read,write";
    private final String expiration = "1hour";
    private final String name = "Udesee%20Trello%20Exporter";
    private final String response_type = "token";


    private String key;
    private String token;

    public URI getAuthUrl() throws URISyntaxException {
        LOG.trace("getAuthUrl() - start.");
        StringBuilder sb = new StringBuilder(authPoint);

        sb.append("?")
                .append("scope=")
                .append(scope)
                .append("&name=")
                .append(name)
                .append("&expiration=")
                .append(expiration)
                .append("&response_type=")
                .append(response_type)
                .append("&key=")
                .append(key);

        URI autUri = new URI(sb.toString());
        LOG.debug("Generated authorization URL: {}", autUri);
        return autUri;
    }

    public Token getToken() throws IOException, InterruptedException {
        LOG.trace("getToken() - start.");

        String tokenEndpoint = "https://api.trello.com/1/tokens/";
        URI getTokenUri = URI.create(tokenEndpoint + "/" + token + "?key=" + key + "&token=" + token);
        LOG.debug("Generated token request URL: {}", getTokenUri);
        ConsoleWriter.printUserInfo("Requesting token info...");

        String tokenJSON = WebClient.getRequest(getTokenUri);
        LOG.debug("Token successfully obtained: ()", tokenJSON);

        return gson.fromJson(tokenJSON, Token.class);
    }

    public Member getMember(String memberId) throws IOException, InterruptedException {
        LOG.trace("getMember() - start.");

        String memberEndpoint = "https://api.trello.com/1/members/";
        URI getMemberUri = URI.create(memberEndpoint + memberId + "?key=" + key + "&token=" + token);
        LOG.debug("Generated member request URL: {}", getMemberUri);
        ConsoleWriter.printUserInfo("Requesting member info...");

        String memberJSON = WebClient.getRequest(getMemberUri);
        LOG.debug("Member successfully obtained: {}", memberJSON);

        return gson.fromJson(memberJSON, Member.class);
    }

    public List<Board> getMemberBoards(String memberId) throws IOException, InterruptedException {
        LOG.trace("getMemberBoards() - start.");

        String memberBoardsEndpoint = "https://api.trello.com/1/members/" + memberId + "/boards";
        URI getMemberBoardsUri = URI.create(memberBoardsEndpoint + "?filter=open" + "&key=" + key + "&token=" + token);
        LOG.debug("Generated member request URL: {}", getMemberBoardsUri);
        ConsoleWriter.printUserInfo("Requesting member boards...");

        String boardsJSON = WebClient.getRequest(getMemberBoardsUri);
        LOG.debug("Boards successfully obtained: {}: ", boardsJSON);

        Type listType = new TypeToken<ArrayList<Board>>() {
        }.getType();
        return gson.fromJson(boardsJSON, listType);
    }

    public List<TList> getBoardLists(String boardId) throws IOException, InterruptedException {
        LOG.trace("getBoardLists() - start.");

        String memberBoardsEndpoint = "https://api.trello.com/1/boards/" + boardId + "/lists";
        URI getBoarListsUri = URI.create(memberBoardsEndpoint + "?filter=open" + "&cards=none" + "&key=" + key + "&token=" + token);
        LOG.debug("Generated member request URL: {}", getBoarListsUri);
        ConsoleWriter.printUserInfo("Requesting board lists...");

        String boardListsJSON = WebClient.getRequest(getBoarListsUri);
        LOG.debug("Board lists successfully obtained: " + boardListsJSON);

        Type listType = new TypeToken<ArrayList<TList>>() {
        }.getType();
        return gson.fromJson(boardListsJSON, listType);
    }

    public List<Card> getCardsForList(String listId) throws IOException, InterruptedException {
        LOG.trace("getCardsForList() - start.");

        String listCardsEndpoint = "https://api.trello.com/1/lists/" + listId + "/cards";
        URI getListCards = URI.create(listCardsEndpoint + "?key=" + key + "&token=" + token);
        LOG.debug("Generated member request URL: {}", getListCards);
        ConsoleWriter.printUserInfo("Requesting list cards...");

        String cardsJSON = WebClient.getRequest(getListCards);
        LOG.debug("Cards successfully obtained: " + cardsJSON);

        Type listType = new TypeToken<ArrayList<Card>>() {
        }.getType();
        return gson.fromJson(cardsJSON, listType);
    }

    public Checklist postChecklist(String checklistName, String cardId) throws IOException, InterruptedException {
        LOG.trace("postChecklist({}, {}) - start.", checklistName, cardId);

        String postChecklistEndpoint = "https://api.trello.com/1/checklists" + "?idCard=" + cardId + "&name=" + URLEncoder.encode(checklistName, "UTF-8") + "&pos=bottom" + "&key=" + key + "&token=" + token;
        URI postChecklistUri = URI.create(postChecklistEndpoint);
        LOG.debug("Generated checklist post request: {}", postChecklistUri);

        ConsoleWriter.printUserInfo("Sending new checklist for section: " + checklistName);
        String checklistJSON = WebClient.postRequest(postChecklistUri);
        LOG.debug("POST checklist reply: " + checklistJSON);

        return gson.fromJson(checklistJSON, Checklist.class);
    }

    public CheckItem postChecklistItem(String itemName, String checklistId) throws IOException, InterruptedException {
        LOG.trace("postChecklistItem({}, {}) - start.", itemName, checklistId);

        String postChekItemEndpoint = "https://api.trello.com/1/checklists/" + checklistId + "/checkItems" + "?name=" + URLEncoder.encode(itemName, "UTF-8") + "&pos=bottom" + "&key=" + key + "&token=" + token;
        URI postCheckItemUri = URI.create(postChekItemEndpoint);
        LOG.debug("Generated checklist post item request: {}", postCheckItemUri);

        ConsoleWriter.printUserInfo("\tSending checklist item: " + itemName);
        String chekItemJSON = WebClient.postRequest(postCheckItemUri);
        LOG.debug("POST check item reply: " + chekItemJSON);

        return gson.fromJson(chekItemJSON, CheckItem.class);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
