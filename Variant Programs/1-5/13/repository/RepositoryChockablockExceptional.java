package repository;

public class RepositoryChockablockExceptional extends Exception {

  public RepositoryChockablockExceptional() {
    super();
  }

  public RepositoryChockablockExceptional(String statement) {
    super(statement);
  }
}
