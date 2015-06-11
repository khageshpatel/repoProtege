set -e
cd owlapi0
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ../owlapi1
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ../protege-owlapi
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ../protege-master
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ../owlviz
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ../
rm protege-master/protege-distribution/target/protege-5.0.0-beta-18-SNAPSHOT-platform-independent/Protege-5.0.0-beta-18-SNAPSHOT/plugins/org.coode.owlviz.jar
cp owlviz/target/org.coode.owlviz-4.1.6-SNAPSHOT.jar protege-master/protege-distribution/target/protege-5.0.0-beta-18-SNAPSHOT-platform-independent/Protege-5.0.0-beta-18-SNAPSHOT/plugins/org.coode.owlviz-4.1.6-SNAPSHOT.jar
cd protege-master/protege-distribution/target/protege-5.0.0-beta-18-SNAPSHOT-platform-independent/Protege-5.0.0-beta-18-SNAPSHOT
./run.sh