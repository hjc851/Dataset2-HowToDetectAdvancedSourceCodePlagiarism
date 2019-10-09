package storing;

public class SafekeepingGoodDerogate extends Exception {

  public SafekeepingGoodDerogate() {
    super();
  }

  public SafekeepingGoodDerogate(String note) {
    super(note);
  }
}
