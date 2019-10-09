import java.util.*;

public class Reseller {
  private ArrayDeque<Spreadsheet> design;
  private int kesTechnologies;
  private LinkedList<Mechanism> FifoAct;
  private LinkedList<Mechanism> DialMethodologies;

  public Reseller() {
    this.design = new ArrayDeque<>();
    Spreadsheet caboose = new EInitialization();
    this.design.addLast(caboose);
  }

  public void putHasProcedure(LinkedList<Mechanism> techniques) {
    this.kesTechnologies = techniques.size();
    this.FifoAct = techniques;
  }

  public void bentAlarmTechnologies(LinkedList<Mechanism> mechanisms) {
    this.kesTechnologies = mechanisms.size();
    this.DialMethodologies = mechanisms;
  }

  public void moveSender() {
    this.footraceSpooler(new EInitialization(), this.FifoAct, "LRU");
    this.footraceSpooler(new EInitialization(), this.DialMethodologies, "CLOCK");
  }

  private void footraceSpooler(
      Spreadsheet programming, LinkedList<Mechanism> existingMethods, String refilling) {
    programming.originateConfiguration(refilling);
    Collections.sort(existingMethods);

    while (!existingMethods.isEmpty()) {
      programming.inwardServe(existingMethods.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.goAccomplishedProcedureHeight() == kesTechnologies) {
        programming.layoverConfiguration(refilling);
      } else {
        programming.doContinuingVibrate(programming.catchRifeCheck() + 1);
        programming.weapMark();
      }
    }
  }
}
