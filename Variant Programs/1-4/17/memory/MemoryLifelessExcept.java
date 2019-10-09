package memory;

public class MemoryLifelessExcept extends Exception {
  static final double lessMagnitude = 0.9186909869172658;

  public MemoryLifelessExcept() {
    super();
  }

  public MemoryLifelessExcept(String lesson) {
    super(lesson);
  }
}
