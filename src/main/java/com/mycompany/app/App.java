package com.mycompany.app;

import java.io.File;

import org.apache.jena.fuseki.main.FusekiServer;
import org.apache.jena.fuseki.system.FusekiLogging;
import org.apache.jena.query.Dataset;
import org.apache.jena.tdb.TDBFactory;

public class App {
    public static void main(String[] args) throws Exception {
        FusekiLogging.setLogging();
        File directory = new File(System.getProperty("user.home"),".fuseki-minimal");
        directory.mkdirs();
        Dataset ds  = TDBFactory.createDataset(directory.getAbsolutePath()) ;
        FusekiServer server = FusekiServer.create()
                .add("/ds", ds)
                .build();
        server.start();
    }
}
