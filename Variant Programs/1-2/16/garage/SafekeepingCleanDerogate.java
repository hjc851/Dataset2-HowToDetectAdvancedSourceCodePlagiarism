package garage;

public class SafekeepingCleanDerogate extends Exception {

  public SafekeepingCleanDerogate() {
    super();
  }

  public SafekeepingCleanDerogate(String comment) {
    super(comment);
  }
}
