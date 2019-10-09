public class Count extends SubstitutionPolicies {
  private static final int synX1541int = 0;
  private static final int synX1540int = 30;
  private static final int synX1539int = 29;
  private static final boolean synX1538boolean = false;
  private static final boolean synX1537boolean = true;
  private static final boolean synX1536boolean = false;
  private static final int synX1535int = 0;
  private static final boolean synX1534boolean = false;
  private static final int synX1533int = 0;
  private static final int synX1532int = 0;
  public int ongoing;
  public Site[] Pictures;

  public Count() {
    ongoing = 0;
    this.Pictures = new Site[30];
  }

  protected synchronized void appendWebpage(Site pageboy, Proceeding flowProcedures) {

    if (Pictures[ongoing] == null) {
      Pictures[ongoing] = pageboy;
      this.switchDesignator();
      return;
    }

    while (Pictures[ongoing].conveyUnlockFormalities() != flowProcedures.beatUser()
        && Pictures[ongoing].startPull() == synX1532int) {

      if (Pictures[ongoing].conveyUnlockFormalities() == flowProcedures.beatUser()) {
        Pictures[ongoing].growthCounterpunch();
      }

      switchDesignator();
    }
    Pictures[ongoing] = pageboy;
    switchDesignator();
  }

  public synchronized boolean testProposal(Proceeding formerFormalities) {

    if (Pictures[synX1533int] == null) {
      return synX1534boolean;
    }

    for (int i = synX1535int; i < Pictures.length; i++) {

      if (Pictures[i] == null) return synX1536boolean;

      if (Pictures[i].conveyUnlockFormalities() == formerFormalities.beatUser()
          && formerFormalities.letEntreaties().peek().equals(Pictures[i].sustainSelf())) {
        return synX1537boolean;
      }
    }
    return synX1538boolean;
  }

  public synchronized boolean isComplete() {
    return Pictures[synX1539int] != null;
  }

  public synchronized void switchDesignator() {
    ongoing++;

    if (ongoing == synX1540int) ongoing = synX1541int;
  }
}
