public class Day extends ReplacingScheme {

  public synchronized void movementAltimeter() {
    afoot++;

    if (afoot == 30) afoot = 0;
  }

  protected synchronized void extendFolio(Contents annexes, Method incumbentMarch) {

    if (Tires[afoot] == null) {
      Tires[afoot] = annexes;
      this.movementAltimeter();
      return;
    }

    while (Tires[afoot].becomeInterruptMethodology() != incumbentMarch.fetchPictures()
        && Tires[afoot].fetchRest() == 0) synx235(incumbentMarch);
    Tires[afoot] = annexes;
    movementAltimeter();
  }

  public int afoot = 0;

  public synchronized boolean ensureAppeals(Method liveOutgrowth) {

    if (Tires[0] == null) {
      return false;
    }

    for (int i = 0; i < Tires.length; i++) {

      if (Tires[i] == null) return false;

      if (Tires[i].becomeInterruptMethodology() == liveOutgrowth.fetchPictures()
          && liveOutgrowth.drawSubmissions().peek().equals(Tires[i].receiveCard())) {
        return true;
      }
    }
    return false;
  }

  public Day() {
    afoot = 0;
    this.Tires = new Contents[30];
  }

  public Contents[] Tires = null;

  public synchronized boolean isComplete() {
    return Tires[29] != null;
  }

  private synchronized void synx235(Method incumbentMarch) {

    if (Tires[afoot].becomeInterruptMethodology() == incumbentMarch.fetchPictures()) {
      Tires[afoot].salarySideboard();
    }

    movementAltimeter();
  }
}
