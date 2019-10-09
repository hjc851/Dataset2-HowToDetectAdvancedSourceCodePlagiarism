public class Dial extends RefillingGambit {

  public synchronized boolean isComplete() {
    return Racks[29] != null;
  }

  protected synchronized void summateTab(Pageboy contents, Operation liveOutgrowth) {

    if (Racks[ongoing] == null) {
      Racks[ongoing] = contents;
      this.locomoteIndex();
      return;
    }

    while (Racks[ongoing].takeAbortAppendage() != liveOutgrowth.fetchPictures()
        && Racks[ongoing].becomePlay() == 0) {

      if (Racks[ongoing].takeAbortAppendage() == liveOutgrowth.fetchPictures()) {
        Racks[ongoing].riseForesee();
      }

      locomoteIndex();
    }
    Racks[ongoing] = contents;
    locomoteIndex();
  }

  public int ongoing = 0;

  public synchronized void locomoteIndex() {
    ongoing++;

    if (ongoing == 30) ongoing = 0;
  }

  public Dial() {
    ongoing = 0;
    this.Racks = new Pageboy[30];
  }

  public Pageboy[] Racks = null;

  public synchronized boolean breakWishes(Operation continuingMechanisms) {

    if (Racks[0] == null) {
      return false;
    }

    for (int i = 0; i < Racks.length; i++) {

      if (Racks[i] == null) return false;

      if (Racks[i].takeAbortAppendage() == continuingMechanisms.fetchPictures()
          && continuingMechanisms.canApplications().peek().equals(Racks[i].arriveIdentifying())) {
        return true;
      }
    }
    return false;
  }
}
