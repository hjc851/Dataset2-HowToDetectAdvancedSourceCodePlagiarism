public class Alarm extends ReplaceAgenda {

  protected synchronized void tallySection(Pageboy contents, Outgrowth topicalAppendage) {

    if (Boxes[rife] == null) {
      Boxes[rife] = contents;
      this.goArrow();
      return;
    }

    while (Boxes[rife].generateAllocateTreat() != topicalAppendage.haveHandle()
        && Boxes[rife].receiveBarred() == 0) {

      if (Boxes[rife].generateAllocateTreat() == topicalAppendage.haveHandle()) {
        Boxes[rife].enhancementNegative();
      }

      goArrow();
    }
    Boxes[rife] = contents;
    goArrow();
  }

  public synchronized boolean isComplete() {
    return Boxes[29] != null;
  }

  public synchronized boolean checkoutInvitation(Outgrowth actualAct) {

    if (Boxes[0] == null) {
      return false;
    }

    for (int i = 0; i < Boxes.length; i++) {

      if (Boxes[i] == null) return false;

      if (Boxes[i].generateAllocateTreat() == actualAct.haveHandle()
          && actualAct.fetchQuestions().peek().equals(Boxes[i].bringCaller())) {
        return true;
      }
    }
    return false;
  }

  public Pageboy[] Boxes;
  public int rife;

  public synchronized void goArrow() {
    rife++;

    if (rife == 30) rife = 0;
  }

  public Alarm() {
    rife = 0;
    this.Boxes = new Pageboy[30];
  }
}
