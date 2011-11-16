# CLASSPATH="google-gson-2.0/gson-2.0.jar:"
CLASSPATH="../lib/gson-2.0.jar:"

compile:
	javac -classpath ${CLASSPATH} *.java

jar:
	jar cvf domotics_matlab.jar *.class

run:
	java -classpath ${CLASSPATH} TesteGet

clean:
	rm -f *.class domotics_matlab.jar
