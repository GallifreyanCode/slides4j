## Slides4j ##

Create interactive slideshows with Java. Powered by impress.js and mustache.java. This is just a fun experiment.

### Build ###

Slides4j is built with Maven.

    mvn clean install
    
It will generate the API JAR and example WAR.

### Run example ###
This example just shows of the cool stuff you can do when using Java for this. It's a WAR which has the generated slideshow inside and can be run from an embedded jetty.
To make this process easier, there's a template within the API that does the heavy lifting for building the webpage.

Navigate to the location of the example and execute the following command to start the it on a local server.

    mvn jetty:run-war
    
The default URL is [localhost:9773/slideshow](localhost:9773/slideshow).
The port can be changed in its pom.xml, change the jetty.port property to whatever port you like. The rest of the URL can be found in the web.xml.