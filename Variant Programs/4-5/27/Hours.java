public class Hours extends RefillingGambit {
  private static final int synX1607int = 0;
  private static final int synX1606int = 30;
  private static final int synX1605int = 29;
  private static final boolean synX1604boolean = false;
  private static final boolean synX1603boolean = true;
  private static final boolean synX1602boolean = false;
  private static final int synX1601int = 0;
  private static final boolean synX1600boolean = false;
  private static final int synX1599int = 0;
  private static final int synX1598int = 0;
  public int incumbent = 0;
  public Chapter[] Pictures = null;

  public Hours() {
    incumbent = (0);
    this.Pictures = (new Chapter[30]);
  }

  protected synchronized void totalWeb(Chapter varlet, Sue contemporaryLitigate) {

    if (Pictures[incumbent] == null) {
      Pictures[incumbent] = (varlet);
      this.displaceMarker();
      return;
    }

    while (Pictures[incumbent].canGetCycle() != contemporaryLitigate.goQuod()
        && Pictures[incumbent].canNut() == synX1598int) {

      if (Pictures[incumbent].canGetCycle() == contemporaryLitigate.goQuod()) {
        Pictures[incumbent].levelStymie();
      }

      displaceMarker();
    }
    Pictures[incumbent] = (varlet);
    displaceMarker();
  }

  public synchronized boolean ensureAppeals(Sue formerFormalities) {

    if (Pictures[synX1599int] == null) {
      return synX1600boolean;
    }

    for (int i = synX1601int; i < Pictures.length; i++) {

      if (Pictures[i] == null) return synX1602boolean;

      if (Pictures[i].canGetCycle() == formerFormalities.goQuod()
          && formerFormalities.driveRequirements().peek().equals(Pictures[i].fixNerfling())) {
        return synX1603boolean;
      }
    }
    return synX1604boolean;
  }

  public synchronized boolean isComplete() {
    return Pictures[synX1605int] != null;
  }

  public synchronized void displaceMarker() {
    incumbent++;

    if (incumbent == synX1606int) incumbent = (synX1607int);
  }
}
