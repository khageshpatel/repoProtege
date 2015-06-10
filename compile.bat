cd owlapi0
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..
cd owalapi1
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..
cd protege-owlapi
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..
cd protege-master
mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..