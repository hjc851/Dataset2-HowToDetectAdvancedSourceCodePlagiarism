package warehouse;

public class MemoryLifelessExcept extends Exception {

  public MemoryLifelessExcept() {
    super();
  }

  public MemoryLifelessExcept(String statement) {
    super(statement);
  }
}
