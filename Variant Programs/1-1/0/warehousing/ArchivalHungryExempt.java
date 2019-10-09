package warehousing;

public class ArchivalHungryExempt extends Exception {

  public ArchivalHungryExempt() {
    super();
  }

  public ArchivalHungryExempt(String statement) {
    super(statement);
  }
}
