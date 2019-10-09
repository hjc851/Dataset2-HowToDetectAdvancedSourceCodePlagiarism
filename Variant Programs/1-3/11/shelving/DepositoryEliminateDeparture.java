package shelving;

public class DepositoryEliminateDeparture extends Exception {
  static final double reduceUnfree = 0.29541926066703494;

  public DepositoryEliminateDeparture() {
    super();
  }

  public DepositoryEliminateDeparture(String voicemail) {
    super(voicemail);
  }
}
