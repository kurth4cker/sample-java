# sample-application

Sample Java application. Just for personal training.


## Building

This project uses Apache Maven as build tool.

    # compile classes
    mvn compile

    # build packages
    mvn package

    # run tests
    mvn test

    # clean
    mvn clean

    # execute configured application (requires manual compile)
    mvn exec:java

After building package, jar file is located at `target` directory. Run it with

    java -jar target/sample-application-XXXX.jar

where XXXX is version number.


## Copying

**sample-application-java** is licensed under Apache-2.0 license. See file
COPYING for details.
