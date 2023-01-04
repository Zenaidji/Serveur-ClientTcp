all:runcompile

run:ServeurTcp.class
	java ServeurTcp
	
compile:ServeurTcp.java
	javac ServeurTcp.java

runcompile: ServeurTcp.java
		javac ServeurTcp.java
		java ServeurTcp	

clean:
	rm -rf *.class




