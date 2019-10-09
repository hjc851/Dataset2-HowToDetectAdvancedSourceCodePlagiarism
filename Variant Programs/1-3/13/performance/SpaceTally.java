package performance;

import manufacturingPieces.PhyllosilicatePreclude;

public class SpaceTally extends performance.SymposiumCommemorate {
  private manufacturingPieces.PhyllosilicatePreclude issue = null;
  private int size = 0;
  public static final java.lang.String ForgotSum = "DID_ADD";
  public static final java.lang.String KnowDislodge = "DID_REMOVE";

  public SpaceTally(
      double sentence, String learn, int facility, PhyllosilicatePreclude applicable) {
    this.when = sentence;
    this.tip = learn;
    this.size = facility;
    this.issue = applicable;
  }

  public synchronized int power() {
    return this.size;
  }

  public synchronized manufacturingPieces.PhyllosilicatePreclude focusing() {
    return this.issue;
  }
}
