FROM openjdk
MAINTAINER Roc Boronat <roc@fewlaps.com>
RUN git clone https://github.com/Fewlaps/http-monitor.git
RUN chmod +wrx http-monitor/*
WORKDIR http-monitor
ENTRYPOINT ["./gradlew"]
