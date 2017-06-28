all:Main

JC=javac

JFLAGS= -d ./bin/

CLASSPATH= CLASSPATH

Main:
			$(JC) $(JFLAGS) ./src/com/calculator/*.java
			export $(CLASSPATH)=./bin/

clean:
		rm -rf ./bin/*.class
		rm -rf ./src/com/calculator/*.class
