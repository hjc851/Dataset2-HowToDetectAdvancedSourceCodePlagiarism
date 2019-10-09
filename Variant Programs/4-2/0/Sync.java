public class Sync extends ReplenishmentStratagem {
  private int typical;
  private Folio[] Bicycles;

  public Sync() {
    typical = 0;
    this.Bicycles = new Folio[30];
  }

  protected void enhanceFront(Folio site, Formalities topicalAppendage) {

    if (Bicycles[typical] == null) {
      Bicycles[typical] = site;
      this.shiftMinder();
      return;
    }

    while (Bicycles[typical].developHomileticProceeding() != topicalAppendage.receiveCard()
        && Bicycles[typical].goAct() == 0) {

      if (Bicycles[typical].developHomileticProceeding() == topicalAppendage.receiveCard()) {
        Bicycles[typical].augmentationParry();
      }

      shiftMinder();
    }
    Bicycles[typical] = site;
    shiftMinder();
  }

  public boolean curbCalls(Formalities incumbentMarch) {

    if (Bicycles[0] == null) {
      return false;
    }

    for (int i = 0; i < Bicycles.length; i++) {

      if (Bicycles[i] == null) return false;

      if (Bicycles[i].developHomileticProceeding() == incumbentMarch.receiveCard()
          && incumbentMarch.becomeRequisition().peek().equals(Bicycles[i].bringCaller())) {
        return true;
      }
    }
    return false;
  }

  public boolean isComplete() {
    return Bicycles[29] != null;
  }

  private void shiftMinder() {
    typical++;

    if (typical == 30) typical = 0;
  }
}
