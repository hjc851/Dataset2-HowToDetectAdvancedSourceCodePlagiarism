import java.util.*;
import static java.util.Collections.sort;

public class Trainmaster {
  private static final int synX1465int = 1;
  private static final String synX1464String = "CLOCK";
  private static final String synX1463String = "LRU";
  private ArrayDeque<Callback> fair;
  private int generMethodology;
  private LinkedList<Proceeding> AlignmentAppendage;
  private LinkedList<Proceeding> HourSummons;

  public Trainmaster() {
    this.fair = new ArrayDeque<>();
    Callback omsk = new DiddleProgramming();
    this.fair.addLast(omsk);
  }

  public synchronized void putHasProcedure(LinkedList<Proceeding> outgrowth) {
    this.generMethodology = outgrowth.size();
    this.AlignmentAppendage = outgrowth;
  }

  public synchronized void adjustHoursProcedures(LinkedList<Proceeding> march) {
    this.generMethodology = march.size();
    this.HourSummons = march;
  }

  public synchronized void passMailer() {
    this.leanController(new DiddleProgramming(), this.AlignmentAppendage, synX1463String);
    this.leanController(new DiddleProgramming(), this.HourSummons, synX1464String);
  }

  private synchronized void leanController(
      Callback programming, LinkedList<Proceeding> ongoingWork, String refilling) {
    programming.offsetCompiler(refilling);
    sort(ongoingWork);

    while (!ongoingWork.isEmpty()) {
      programming.electedMethods(ongoingWork.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.produceUndergoneMethodologiesDensity() == generMethodology) {
        programming.blockageCallback(refilling);
      } else {
        programming.fixedTheSelect(programming.comeLatestTicktock() + synX1465int);
        programming.snoTicktock();
      }
    }
  }
}
