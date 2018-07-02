module cz.malanius.udesee.exporter.trello {

    requires cz.malanius.udesee.exporter;
    requires cz.malanius.udesee.cli;
    requires cz.malanius.udesee.course;
    requires jdk.incubator.httpclient;
    requires gson;

    exports cz.malanius.udesee.exporter.trello;

    provides cz.malanius.udesee.exporter.Exporter with cz.malanius.udesee.exporter.trello.TrelloExporter;
}
