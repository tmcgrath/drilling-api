## Prerequisites to Build drilling-api:

git clone http://github.com/streamsets/datacollector-api

git clone http://github.com/streamsets/datacollector-plugin-api

cd datacollector-api

mvn clean install -DskipTests

cd ../datacollector-plugin-api

mvn clean install -DskipTests


Follow these instructions to build the Data Collector :

cd ..

git clone http://github.com/streamsets/datacollector

cd datacollector

mvn package -Pdist -DskipTests -DskipRat

mvn install -Pdist -DskipTests -DskipRat

mvn clean install -Pstage-lib-parent -DskipTests -DskipRat


## Build drilling-api

In this directory

mvn clean install -DskipTests

Extract the tar.gz file into user lib; e.g.
cd ~/dev/datacollector/dist/target/streamsets-datacollector-3.3.0.0-SNAPSHOT/streamsets-datacollector-3.3.0.0-SNAPSHOT/user-libs

tar xvfz ~/dev/drilling-api/target/drilling-api-3.3.0.0-SNAPSHOT.tar.gz

