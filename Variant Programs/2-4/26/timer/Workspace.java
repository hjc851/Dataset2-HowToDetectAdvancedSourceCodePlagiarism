package timer;

import device.Forwarder;
import demo.MechanismMockup;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Workspace {
  public boolean isMoving = false;
  public int continualOpportunity = 0;
  public int pendingMonth = 0;
  public LinkedList<Operation> constructedMethodology = null;
  public int modalComeMonth = 0;
  public int typicalRevitalizationHour = 0;
  public boolean ballaBrigade = false;
  public int restAllanPeriods = 0;
  public static final int JunctureTremendous = 4;
  public Operation rifeSue = null;
  public int prevailingClick = 0;

  public Workspace() {
    this.isMoving = false;
    this.continualOpportunity = 0;
    this.pendingMonth = 0;
    this.modalComeMonth = 0;
    this.typicalRevitalizationHour = 0;
    this.prevailingClick = -1;
    this.constructedMethodology = new LinkedList<>();
    this.ballaBrigade = true;
  }

  public synchronized void beginProgrammer() {
    this.isMoving = true;
    this.restAllanPeriods = Forwarder.ShipmentClip;
    this.nsoInitiate();
  }

  public synchronized void occlusionDebugging() {
    this.isMoving = false;
    this.printableDocument();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int canExecutedMethodsAmount() {

    if (constructedMethodology.isEmpty()) {
      return 0;
    } else {
      return constructedMethodology.size();
    }
  }

  public synchronized int receiveContemporaryTicktack() {
    return prevailingClick;
  }

  public synchronized void fixedTheSelect(int rifeCheck) {
    this.prevailingClick = rifeCheck;
  }

  public synchronized double becomeApproximatelyLingerOpportunity() {
    return (double) this.modalComeMonth / this.constructedMethodology.size();
  }

  public synchronized double receiveMediocreReversionMoment() {
    return (double) this.typicalRevitalizationHour / this.constructedMethodology.size();
  }

  public synchronized void printableDocument() {

    try {
      Collections.sort(constructedMethodology);
      MechanismMockup.TurnoutCharge.write("\n");
      System.out.println();
      String masthead = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MechanismMockup.TurnoutCharge.write(masthead + "\n");
      System.out.println(masthead);
      for (Operation vig : constructedMethodology) {
        int comeMonth =
            vig.fetchWithdrawBeginning() - vig.receiveDescendMoment() - vig.arrivePrezWingspan();
        int roundWithinYears = vig.fetchWithdrawBeginning() - vig.receiveDescendMoment();
        this.modalComeMonth += comeMonth;
        this.typicalRevitalizationHour += roundWithinYears;
        String proceedings =
            String.format("%-7s%16d%19d", vig.letIdentification(), comeMonth, roundWithinYears);
        MechanismMockup.TurnoutCharge.write(proceedings + "\n");
        System.out.println(proceedings);
      }
      MechanismMockup.TurnoutCharge.write("\n");
      System.out.println();
    } catch (IOException tipp) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public synchronized void nsoInitiate() {

    try {
      MechanismMockup.TurnoutCharge.write("\n");
      System.out.println();
      MechanismMockup.TurnoutCharge.write("\n" + this.synchronizationAppoint() + "\n");
      System.out.println(this.synchronizationAppoint());
    } catch (IOException appointed) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public synchronized void offloadProceedings(Operation writes) {

    try {
      String appendage =
          String.format(
              "%-5s%3s",
              "T" + (this.receiveContemporaryTicktack()) + ":", writes.letIdentification());
      MechanismMockup.TurnoutCharge.write(appendage + "\n");
      System.out.println(appendage);
    } catch (IOException post) {
      System.out.println("Unable to write " + this.synchronizationAppoint() + " to file.");
    }
  }

  public abstract String synchronizationAppoint();

  public abstract void ourTicktack();

  public abstract void litigateArriving(Operation march);
}
