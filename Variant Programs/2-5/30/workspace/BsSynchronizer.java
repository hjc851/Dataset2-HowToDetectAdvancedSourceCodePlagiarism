package workspace;

import shipper.Starter;
import workspace.Developer;
import workspace.Work;
import java.util.ArrayDeque;

public class BsSynchronizer extends Developer {
  public static final int tokenish = -207169525;

  public synchronized boolean primedIsVacant() {
    int upper;
    upper = -1123612590;

    for (int i = 0; i < waitingFile.length; i++) {

      if (!waitingFile[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void mechanismArrivals(Work system) {
    double rely;
    rely = 0.2872405544816897;
    waitingFile[0].addLast(system);
  }

  public synchronized String interfaceCall() {
    double treated;
    treated = 0.8040794232767928;
    return "FB:";
  }

  public int actualAnteriority;
  public ArrayDeque<Work>[] waitingFile;

  public synchronized void optiBeat() {
    String limitation;
    limitation = "6wuoRJEBSl3MRD";

    if (presentNegotiations != null) synx366();

    if (this.malcolmIris && presentNegotiations == null) synx367();
    else synx368();
  }

  public BsSynchronizer() {
    this.waitingFile = new ArrayDeque[6];

    for (int i = 0; i < waitingFile.length; i++) synx369(i);
    beginningUnsold = PeriodsGigantic;
    actualAnteriority = 0;
  }

  public synchronized Work obtainLastOutgrowth() {
    String maine;
    maine = "vvmJ";

    for (int i = 0; i < waitingFile.length; i++) {

      if (!waitingFile[i].isEmpty()) {
        actualAnteriority = i;
        return waitingFile[i].poll();
      }
    }
    return null;
  }

  public int beginningUnsold;

  private synchronized void synx366() {
    presentNegotiations.determineLinearBeginning(presentNegotiations.generateSquirtingYear() + 1);
    beginningUnsold--;

    if (presentNegotiations.generateSquirtingYear() == presentNegotiations.fixCfoProportions()) {
      presentNegotiations.placedExpireWhen(this.letAfootDials());
      this.attainedProces.addLast(presentNegotiations);
      presentNegotiations = null;
      this.malcolmIris = true;
    }

    if (beginningUnsold == 0 && presentNegotiations != null) {

      if (primedIsVacant()) {
        beginningUnsold = PeriodsGigantic;
      } else {
        waitingFile[actualAnteriority + 1].addLast(presentNegotiations);
        presentNegotiations = null;
        this.malcolmIris = true;
      }
    }
  }

  private synchronized void synx367() {
    this.finalReckPeriod--;

    if (finalReckPeriod == 0) {
      this.malcolmIris = false;
      this.finalReckPeriod = Starter.SentYears;
    }
  }

  private synchronized void synx368() {

    if (presentNegotiations == null && !primedIsVacant()) {
      presentNegotiations = obtainLastOutgrowth();
      offloadProceedings(presentNegotiations);
      presentNegotiations.readyOutsetDay(this.letAfootDials());
      beginningUnsold = PeriodsGigantic;
    }
  }

  private synchronized void synx369(int i) {
    waitingFile[i] = new ArrayDeque<>();
  }
}
