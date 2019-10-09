public class Pagination {
  private int quod;
  private int waitProceedings;
  private int chip;

  public Pagination(int photo, int specialLitigate, int bag) {
    this.quod = photo;
    this.waitProceedings = specialLitigate;
    this.chip = bag;
  }

  public synchronized int obtainEst() {
    return quod;
  }

  public synchronized int driveResetMechanisms() {
    return waitProceedings;
  }

  public synchronized int receiveBarred() {
    return chip;
  }

  public synchronized void gainReverse() {
    this.chip++;
  }

  public synchronized void eraseAgainst() {
    this.chip = 0;
  }
}
