## Protege Development ##

This document is to help you setup development environment for protege and some basic knowledge about commonly used tools for maintaining project base.

Installing necessary tools
--------------------------

First lets install necessary tools required for developing code bases associated with protege.

#### Installing jdk ####
First install java jdk form [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html "Java JDK"). Important thing to note here is you must download JDK not JRE. Make sure you have `JAVA_HOME` variable setup in your computer if not set it up where you have installed your jdk generally in windows it is `C:\Program Files\Java\jdk1.8.0_45`. Also make sure you have java binaries in your system path if not add it. In my case it is `C:\Program Files\Java\jdk1.8.0_45\bin`. If you have problem in adding system path just search in google on adding system path and system variables instruction may vary depending on your platform. After all these steps you should be able to access java from command line.

#### Installing Graphviz
Visualization tools in protege use Graphviz for creating graphs therefore you need to install graphviz. You can get latest copy of graphviz from [here](http://www.graphviz.org/Download..php "GraphViz").

#### Git ####
This is an optional tool. You will only need it if you want to checkout different commit from my repository and have something to share with rest of the group.

- Windows users can download git tool from [here](https://git-scm.com/download/win "Git for windows").
- Linux users can check [this](https://git-scm.com/download/linux "Git for linux") page for commands to install git depending on their distros.
- Mac OS users can download git from [here](http://git-scm.com/download/mac "Git for mac").

#### Maven Development ####
There are two ways to work with maven projects.

1. Maven Command Line - _Prefered_
	- Windows users can follow instructions for installing from [here](https://git-scm.com/download/win "Maven for windows").
	- Linux users can check [this](https://maven.apache.org/download.cgi#Installation "Maven for linux") page for commands to install maven.
	- Mac OS users can download git from [here](http://www.mkyong.com/maven/install-maven-on-mac-osx/ "Maven for mac").
 
2. Maven Plugin for eclipse

	You can bypass maven by using m2eclipse plugin for eclipse. Although according to me using this plugin limits your control over project development. Instructions for installing mvn and using it can be found [here](http://theopentutorials.com/tutorials/eclipse/installing-m2eclipse-maven-plugin-for-eclipse/ "m2eclipse plugin").

Getting all required source code
--------------------------------

You can get necessary source code in following two manner:

1. Using Git - _Recommended_ 
	
	You can use `git clone https://github.com/khageshpatel/repoProtege.git` command to clone my repository.
2. Zipped source code

	Second option is to get zipped source code from [here](https://github.com/khageshpatel/repoProtege/archive/master.zip "Source Code")

Source Code Structure
---------------------

* `owlapi0`
	
	This folder contains source code for owlapi version 5.0

* `owlapi1`

	This folder contains source code for owlapi version 5.1

* `protege-owlapi`

	This folder contains source code for some extension to owlapi used by protege.

* `protege-master`

	Main source code of protege. All components of protege software.

* `owlviz`

	Source code structure visualization in protege.

Following graph source dependency between different projects. If you change any project make sure you compile that project as well as all dependents of that project. So if you modify `owlapi1` recompile in this order `owlapi1` -> `protege-master` -> `owlviz`.

![Dependency Graph](https://github.com/khageshpatel/repoProtege/blob/master/depGraph.PNG)

Compiling and Building
----------------------
To simply build a project go to root folder of that project for example `owlapi1` and run following command

`mvn -DskipTests clean install -Dmaven.javadoc.skip=true`

Different tags has different meaning:

* `clean`

	To clean project repository.

* `install`


	To create all binaries and jar files.

* `-DskipTests`

	To skip running test files. Including this option reduces build time.

* `-Dmaven.javadoc.skip=true`

	Skip building javadoc documentation. Also improves build time.

If you want to build all projects just run `compile.sh` at root folder and run `protege-master\protege-distribution\target\protege-5.0.0-beta-18-SNAPSHOT-platform-independent\Protege-5.0.0-beta-18-SNAPSHOT\run.[sh,cmd]` by double clicking. 
