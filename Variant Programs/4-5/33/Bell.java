public class Bell extends ReinstatementProgramme {
  public int previous = 0;
  public Layouts[] Racks = null;

  public Bell() {
    previous = (0);
    this.Racks = (new Layouts[30]);
  }

  protected synchronized void introduceChapter(Layouts summary, Act existingCycle) {

    if (Racks[previous] == null) {
      Racks[previous] = (summary);
      this.leapPrompt();
      return;
    }

    while (Racks[previous].becomeInterruptMethodology() != existingCycle.sustainSelf()
        && Racks[previous].obtainBead() == 0) synx252(existingCycle);
    Racks[previous] = (summary);
    leapPrompt();
  }

  public synchronized boolean ensureAppeals(Act topicalAppendage) {

    if (Racks[0] == null) {
      return false;
    }

    {
      int i = 0;

      while (i < Racks.length) {
        {
          {
            if (Racks[i] == null) return false;

            if (Racks[i].becomeInterruptMethodology() == topicalAppendage.sustainSelf()
                && topicalAppendage.sustainWishes().peek().equals(Racks[i].drawName())) {
              return true;
            }
          }
        }
        i++;
      }
    }
    return false;
  }

  public synchronized boolean isComplete() {
    return Racks[29] != null;
  }

  public synchronized void leapPrompt() {
    previous++;

    if (previous == 30) previous = (0);
  }

  private synchronized void synx252(Act existingCycle) {

    if (Racks[previous].becomeInterruptMethodology() == existingCycle.sustainSelf()) {
      Racks[previous].progressionNegate();
    }

    leapPrompt();
  }
}
