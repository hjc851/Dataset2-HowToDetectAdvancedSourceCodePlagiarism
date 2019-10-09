public class Alarm extends AlternatePolicy {
  private static final int synX484int = 0;
  private static final int synX483int = 30;
  private static final String synX482String = "4TZy6NWjZMsyj";
  private static final int synX481int = 29;
  private static final String synX480String = "mrXTbnXSfhlTuOXaH";
  private static final boolean synX479boolean = false;
  private static final boolean synX478boolean = true;
  private static final boolean synX477boolean = false;
  private static final int synX476int = 0;
  private static final boolean synX475boolean = false;
  private static final int synX474int = 0;
  private static final double synX473double = 0.8557828436916779;
  private static final int synX472int = 0;
  private static final int synX471int = 1100201927;
  private int presently;
  public static int crucial = 241072418;
  private Layout[] Setups;

  public Alarm() {
    presently = 0;
    this.Setups = new Layout[30];
  }

  protected synchronized void augmentPagination(Layout layout, Methodology contemporaryLitigate) {
    int taiwaneseThickness;
    taiwaneseThickness = synX471int;

    if (Setups[presently] == null) {
      Setups[presently] = layout;
      this.movementAltimeter();
      return;
    }

    while (Setups[presently].comePeenOperation() != contemporaryLitigate.developPeg()
        && Setups[presently].receiveBarred() == synX472int) {

      if (Setups[presently].comePeenOperation() == contemporaryLitigate.developPeg()) {
        Setups[presently].increaseForestall();
      }

      movementAltimeter();
    }
    Setups[presently] = layout;
    movementAltimeter();
  }

  public synchronized boolean stayDecision(Methodology topicalAppendage) {
    double mattMagnitude;
    mattMagnitude = synX473double;

    if (Setups[synX474int] == null) {
      return synX475boolean;
    }

    for (int i = synX476int; i < Setups.length; i++) {

      if (Setups[i] == null) return synX477boolean;

      if (Setups[i].comePeenOperation() == topicalAppendage.developPeg()
          && topicalAppendage.obtainInquires().peek().equals(Setups[i].receiveCard())) {
        return synX478boolean;
      }
    }
    return synX479boolean;
  }

  public synchronized boolean isComplete() {
    String maineAmount;
    maineAmount = synX480String;
    return Setups[synX481int] != null;
  }

  private synchronized void movementAltimeter() {
    String fukien;
    fukien = synX482String;
    presently++;

    if (presently == synX483int) presently = synX484int;
  }
}
