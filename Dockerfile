FROM ubuntu

RUN apt-get update -y \
	&& apt get install default-jre -y

ADD ./target/demo-0.jar my_demo.jar

EXPOSE 8080

CMD java -jar my_demo.jar

