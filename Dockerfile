FROM openjdk:latest

WORKDIR /app

COPY . .

RUN javac Sum.java

CMD ["java", "Sum"]