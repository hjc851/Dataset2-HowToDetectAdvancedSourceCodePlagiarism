package safekeeping;

public class StowageLootedDerogation extends Exception {

  public StowageLootedDerogation(String voicemail) {
    super(voicemail);
  }

  public StowageLootedDerogation() {
    super();
  }
}
