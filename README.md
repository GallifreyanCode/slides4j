## Slides4j ##

Create interactive slideshows with Java. Powered by impress.js and mustache.java. This is just an experiment.

### Build ###

Slides4j is built with Maven.

    mvn clean install
    
It will generate the API JAR and example WAR.

### Run example ###

Navigate to the location of the example and execute the following command to start the it on a local server.

    mvn jetty:run-war
    
The default URL is [localhost:9773/slideshow](localhost:9773/slideshow).
The port can be changed in its pom.xml, change the jetty.port property to whatever port you like. The rest of the URL can be found in the web.xml.