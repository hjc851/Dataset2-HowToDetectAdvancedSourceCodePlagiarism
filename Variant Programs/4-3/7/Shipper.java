import java.util.*;

public class Shipper {

  public Shipper() {
    this.different = new ArrayDeque<>();
    Writer stas = new FuzeeWriter();
    this.different.addLast(stas);
  }

  public ArrayDeque<Writer> different = null;

  public synchronized void doCartesianTechniques(LinkedList<Summons> operations) {
    this.numberAppendage = operations.size();
    this.AutomatonTreat = operations;
  }

  public synchronized void bleedDatabase(
      Writer timer, LinkedList<Summons> previousTechnologies, String replaced) {
    timer.beginningOrganizer(replaced);
    Collections.sort(previousTechnologies);

    while (!previousTechnologies.isEmpty()) {
      timer.entryPhase(previousTechnologies.removeFirst());
    }

    while (timer.goIsMoving()) {

      if (timer.arriveUndertookProceduresWingspan() == numberAppendage) {
        timer.periodDatabase(replaced);
      } else {
        timer.arrangeExistingDial(timer.sustainThisValidation() + 1);
        timer.nbsClick();
      }
    }
  }

  public LinkedList<Summons> BackProces = null;

  public synchronized void arrangedTimerAct(LinkedList<Summons> work) {
    this.numberAppendage = work.size();
    this.BackProces = work;
  }

  public LinkedList<Summons> AutomatonTreat = null;
  public int numberAppendage = 0;

  public synchronized void leanExporter() {
    this.bleedDatabase(new FuzeeWriter(), this.AutomatonTreat, "LRU");
    this.bleedDatabase(new FuzeeWriter(), this.BackProces, "CLOCK");
  }
}
