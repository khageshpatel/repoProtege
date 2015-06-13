cd owlapi0
call mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..\owlapi1
call mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..\protege-owlapi
call mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..\protege-master
call mvn -DskipTests clean install -Dmaven.javadoc.skip=true
cd ..
del protege-master\protege-distribution\target\protege-5.0.0-beta-18-SNAPSHOT-platform-independent\Protege-5.0.0-beta-18-SNAPSHOT\plugins\org.coode.owlviz.jar
copy owlviz\target\org.coode.owlviz-4.1.6-SNAPSHOT.jar protege-master\protege-distribution\target\protege-5.0.0-beta-18-SNAPSHOT-platform-independent\Protege-5.0.0-beta-18-SNAPSHOT\plugins\org.coode.owlviz-4.1.6-SNAPSHOT.jar
cd protege-master\protege-distribution\target\protege-5.0.0-beta-18-SNAPSHOT-platform-independent\Protege-5.0.0-beta-18-SNAPSHOT\
call run.bat