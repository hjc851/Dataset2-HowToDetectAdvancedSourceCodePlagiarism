import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EInitialization extends Spreadsheet {
  private static final int synX194int = 128158532;
  private static final double synX193double = 0.6121608656061513;
  private static final String synX192String = "JZ";
  private static final int synX191int = 0;
  private static final int synX190int = 0;
  private static final int synX189int = 175986090;
  private static final int synX188int = 1221719814;

  private synchronized void transmitPageboyBlame() {
    int minute;
    Criticize f;
    minute = synX188int;
    f = new Criticize(this.receiveContemporaryTicktack(), actualAct);
    liabilityGlue.add(f);
    actualAct.haveFlaws().add(f);
  }

  public synchronized void ourTicktack() {
    int netherTrammel;
    List<Criticize> wrongdoings;
    netherTrammel = synX189int;
    wrongdoings = new LinkedList<>();
    for (Criticize f : liabilityGlue) {

      if (f.goPrimedClock() == this.receiveContemporaryTicktack()) wrongdoings.add(f);
    }
    for (Criticize anomaly : wrongdoings) {
      liabilityGlue.remove(anomaly);
      substituteStrategic.enhanceFront(
          new Annexes(
              anomaly.arriveProcedures().haveDemands().peek(),
              anomaly.arriveProcedures().catchIbid(),
              synX190int),
          anomaly.arriveProcedures());

      if (!cookCue.contains(anomaly.arriveProcedures())) {
        this.ingoingProcedure(anomaly.arriveProcedures());
      }
    }

    if (actualAct != null) {
      againPending--;

      if (actualAct.isEnded()) {
        actualAct.determineWithdrawBeginning(this.receiveContemporaryTicktack());
        this.finishedOutgrowth.addLast(actualAct);
        actualAct = null;
      }

      if (againPending == synX191int && actualAct != null) {

        if (cookCue.isEmpty()) {
          againPending = YearsSize;
        } else {
          this.ingoingProcedure(actualAct);
          actualAct = null;
        }
      }
    }

    if (actualAct == null && !cookCue.isEmpty()) {
      actualAct = this.wantMechanisms();
      againPending = YearsSize;
    }

    this.driveFutureAsking();
  }

  private ArrayDeque<Operation> cookCue = null;

  public EInitialization() {
    this.cookCue = new ArrayDeque<>();
    this.liabilityGlue = new ArrayDeque<>();
    againPending = YearsSize;
  }

  public static final String highWidening = "4qmdAICKe0F";

  public synchronized Operation wantMechanisms() {
    String enumeration;
    enumeration = synX192String;
    return cookCue.removeFirst();
  }

  private synchronized void driveFutureAsking() {
    double upperSkank;
    upperSkank = synX193double;

    if (this.actualAct == null) {
      return;
    }

    while (!substituteStrategic.tabAsked(this.actualAct)) {
      this.transmitPageboyBlame();
      againPending = YearsSize;

      if (!cookCue.isEmpty()) {
        actualAct = wantMechanisms();
      } else {
        actualAct = null;
        return;
      }
    }
    actualAct.methodSecondDecision();
  }

  private int againPending = 0;
  private ArrayDeque<Criticize> liabilityGlue = null;

  public synchronized void ingoingProcedure(Operation proceedings) {
    int upper;
    upper = synX194int;
    cookCue.addLast(proceedings);
  }
}
