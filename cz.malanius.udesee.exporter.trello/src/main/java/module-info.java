module cz.malanius.udesee.exporter.trello {

    requires cz.malanius.udesee.exporter;

    exports cz.malanius.udesee.exporter.trello;

    provides cz.malanius.udesee.exporter.Exporter with cz.malanius.udesee.exporter.trello.TrelloExporter;
}
