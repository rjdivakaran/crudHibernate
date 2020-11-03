FROM openjdk:8
COPY . ./build/libs/nasapicture-0.0.1-SNAPSHOT.jar /eclipse-workspace\Hibernate_CRUD
WORKDIR C:\Users\divakra\eclipse-workspace\Hibernate_CRUD
RUN javac Employee_DAO.java
EXPOSE 8080
CMD ["java", "Main"]