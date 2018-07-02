import cz.malanius.udesee.exporter.ExporterService;
import cz.malanius.udesee.exporter.trello.TrelloExporterService;

module cz.malanius.udesee.exporter.trello {

    requires cz.malanius.udesee.exporter;
    requires cz.malanius.udesee.cli;
    requires cz.malanius.udesee.course;
    requires jdk.incubator.httpclient;
    requires java.sql;
    requires gson;
    requires slf4j.api;

    opens cz.malanius.udesee.exporter.trello.pojo.board to gson;
    opens cz.malanius.udesee.exporter.trello.pojo.card to gson;
    opens cz.malanius.udesee.exporter.trello.pojo.checklist to gson;
    opens cz.malanius.udesee.exporter.trello.pojo.list to gson;
    opens cz.malanius.udesee.exporter.trello.pojo.member to gson;
    opens cz.malanius.udesee.exporter.trello.pojo.token to gson;

    exports cz.malanius.udesee.exporter.trello;
    provides ExporterService with TrelloExporterService;
}
