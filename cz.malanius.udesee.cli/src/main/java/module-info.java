module cz.malanius.udesee.cli {
    uses cz.malanius.udesee.exporter.ExporterService;

    requires cz.malanius.udesee.course;
    requires cz.malanius.udesee.parser;
    requires cz.malanius.udesee.exporter;

    requires slf4j.api;

    exports cz.malanius.udesee.cli.util;
}
