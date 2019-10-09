public class Stopwatch extends UnderstudyStrategize {
  public int underway = 0;
  public Folio[] Tires = null;

  public Stopwatch() {
    underway = (0);
    this.Tires = (new Folio[30]);
  }

  protected synchronized void contributeVarlet(Folio tab, Phase previousProceeding) {

    if (Tires[underway] == null) {
      Tires[underway] = (tab);
      this.pushHint();
      return;
    }

    while (Tires[underway].canGetCycle() != previousProceeding.startPicture()
        && Tires[underway].sustainStop() == 0) {

      if (Tires[underway].canGetCycle() == previousProceeding.startPicture()) {
        Tires[underway].echelonUndercut();
      }

      pushHint();
    }
    Tires[underway] = (tab);
    pushHint();
  }

  public synchronized boolean tabAsked(Phase typicalProceedings) {

    if (Tires[0] == null) {
      return false;
    }

    {
      int i = 0;

      while (i < Tires.length) {
        {
          {
            if (Tires[i] == null) return false;

            if (Tires[i].canGetCycle() == typicalProceedings.startPicture()
                && typicalProceedings.receiveCalls().peek().equals(Tires[i].haveHandle())) {
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
    return Tires[29] != null;
  }

  public synchronized void pushHint() {
    underway++;

    if (underway == 30) underway = (0);
  }
}
