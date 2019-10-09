public class Error {
  private int errorSentence;
  private int preparesOpportunity;
  private Phase operation;
  private static final int ReplacedNow = 6;

  public Error(int failuresJuncture, Phase sue) {
    this.errorSentence = failuresJuncture;
    this.preparesOpportunity = failuresJuncture + ReplacedNow;
    this.operation = sue;
  }

  public int beatFailuresJuncture() {
    return errorSentence;
  }

  public Phase generateTreat() {
    return operation;
  }

  public int receiveWaitingMoment() {
    return preparesOpportunity;
  }
}
