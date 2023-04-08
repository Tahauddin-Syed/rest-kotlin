FROM ubuntu:latest

RUN mkdir -p /u01/softwares/java
RUN mkdir -p /u01/applications

ENV JAVA_HOME=/u01/softwares/java/jdk-17.0.2
ENV PATH=$PATH:$JAVA_HOME/bin

WORKDIR /u01/softwares/java
ADD https://download.java.net/java/GA/jdk17.0.2/dfd4a8d0985749f896bed50d7138ee7f/8/GPL/openjdk-17.0.2_linux-x64_bin.tar.gz .
RUN tar -xvf openjdk-17.0.2_linux-x64_bin.tar.gz
RUN rm openjdk-17.0.2_linux-x64_bin.tar.gz

WORKDIR /u01/applications
COPY target/kotlin-rest.jar .
COPY ./sh/launch.sh .
RUN chmod u+x launch.sh
ENTRYPOINT ["./launch.sh"]
#ENTRYPOINT ["java","-jar","kotlin-rest.jar", "&"]