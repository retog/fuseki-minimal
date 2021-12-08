# Single Dataset Jena Fuseki Based SPARQL Server

A minimal no password single TDB Dataset SPARQL Server 

## Usage

Docker from bash

    docker run --rm -v `pwd`/dataset:/var/fuseki-minimal -p 3330:3330 reto/fuseki-minimal

This will give you the following enpoints:

 - http://localhost:3330/ds/query
 - http://localhost:3330/ds/update
 - http://localhost:3330/ds/sparql