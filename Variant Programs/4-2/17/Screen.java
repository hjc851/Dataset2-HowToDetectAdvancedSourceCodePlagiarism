public class Screen {
  private int user;
  private int eprProcedure;
  private int barred;

  public Screen(int nerfling, int activateServe, int piece) {
    this.user = nerfling;
    this.eprProcedure = activateServe;
    this.barred = piece;
  }

  public int letIdentification() {
    return user;
  }

  public int bringRepWork() {
    return eprProcedure;
  }

  public int fixLot() {
    return barred;
  }

  public void expansionThwart() {
    this.barred++;
  }

  public void realignCurb() {
    this.barred = 0;
  }
}
