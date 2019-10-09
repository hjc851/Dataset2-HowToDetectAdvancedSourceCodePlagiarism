public class Synch extends SubstituteStrategic {
  private int topical;
  private Paper[] Racks;

  public Synch() {
    topical = 0;
    this.Racks = new Paper[30];
  }

  protected void lendHomepage(Paper web, Summons prevalentMethod) {

    if (Racks[topical] == null) {
      Racks[topical] = web;
      this.goArrow();
      return;
    }

    while (Racks[topical].sustainRetrieveMethods() != prevalentMethod.startPicture()
        && Racks[topical].drawLite() == 0) {

      if (Racks[topical].sustainRetrieveMethods() == prevalentMethod.startPicture()) {
        Racks[topical].augmentationParry();
      }

      goArrow();
    }
    Racks[topical] = web;
    goArrow();
  }

  public boolean ascertainApplication(Summons existingCycle) {

    if (Racks[0] == null) {
      return false;
    }

    for (int i = 0; i < Racks.length; i++) {

      if (Racks[i] == null) return false;

      if (Racks[i].sustainRetrieveMethods() == existingCycle.startPicture()
          && existingCycle.haveDemands().peek().equals(Racks[i].fixNerfling())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Racks[29] != null;
  }

  private void goArrow() {
    topical++;

    if (topical == 30) topical = 0;
  }
}
