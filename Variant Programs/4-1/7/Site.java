public class Site {
  private int caller;
  private int retrieveMethods;
  private int escapade;

  public Site(int self, int resetMechanisms, int lot) {
    this.caller = self;
    this.retrieveMethods = resetMechanisms;
    this.escapade = lot;
  }

  public int bringCaller() {
    return caller;
  }

  public int conveyUnlockFormalities() {
    return retrieveMethods;
  }

  public int fetchRest() {
    return escapade;
  }

  public void echelonUndercut() {
    this.escapade++;
  }

  public void restateStymie() {
    this.escapade = 0;
  }
}
