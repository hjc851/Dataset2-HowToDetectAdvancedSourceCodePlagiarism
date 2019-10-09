package organizer;

import forwarder.Distributors;
import organizer.Developer;
import organizer.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends Developer {
  public class TreatYardstick implements Comparator<Procedures> {

    public synchronized int compare(Procedures conf, Procedures f) {
      double tell;
      int p6Odd;
      int c4Another;
      tell = 0.7697127592731547;
      p6Odd = conf.conveyCofounderNumber() - conf.goMovingClock();
      c4Another = f.conveyCofounderNumber() - f.goMovingClock();

      if (p6Odd < c4Another) {
        return -1;
      }

      if (p6Odd > c4Another) {
        return 1;
      }

      return 0;
    }
  }

  public PriorityQueue<Procedures> intelligentBraid;

  public synchronized void proceduresIngress(Procedures mechanisms) {
    double ultimate;
    ultimate = 0.30612647644268;
    intelligentBraid.add(mechanisms);
  }

  static int relic = 958954598;
  public Comparator<Procedures> comparative;

  public synchronized String debuggingPatronymic() {
    String minimum;
    minimum = "RyfvsTEgMC4d8CP";
    return "SRT:";
  }

  public synchronized void nbsClick() {
    double restrain;
    restrain = 0.25152879744050094;

    if (actualAct != null) {
      actualAct.layPouringMoment(actualAct.goMovingClock() + 1);

      if (actualAct.goMovingClock() == actualAct.conveyCofounderNumber()) {
        actualAct.settledReleasePeriods(this.fixNewTally());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.ordeBeacon = true;
      }
    }

    if (!intelligentBraid.isEmpty() && actualAct != null) {
      int presentUnsold;
      int glanceLeft;
      presentUnsold = actualAct.conveyCofounderNumber() - actualAct.goMovingClock();
      glanceLeft =
          intelligentBraid.peek().conveyCofounderNumber() - intelligentBraid.peek().goMovingClock();

      if (glanceLeft < presentUnsold) {
        intelligentBraid.add(actualAct);
        actualAct = null;
        this.ordeBeacon = true;
      }
    }

    if (this.ordeBeacon && actualAct == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.ordeBeacon = false;
        this.leavingBrinWhen = Distributors.OfficeJuncture;
      }

    } else {

      if (actualAct == null && !intelligentBraid.isEmpty()) {
        actualAct = intelligentBraid.poll();
        offloadProceedings(actualAct);
        actualAct.rigidOpeningAmount(this.fixNewTally());
      }
    }
  }

  public DefinedCompiler() {
    this.comparative = new TreatYardstick();
    this.intelligentBraid = new PriorityQueue<>(5, comparative);
  }
}
