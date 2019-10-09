package safekeeping;

public class StowageLadenDerogation extends Exception {

  public StowageLadenDerogation() {
    super();
  }

  public StowageLadenDerogation(String warning) {
    super(warning);
  }
}
