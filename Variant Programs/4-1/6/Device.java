import java.util.*;

public class Device {
  private ArrayDeque<Controller> types;
  private int lageTechniques;
  private LinkedList<Summons> AttractorServe;
  private LinkedList<Summons> CountMechanism;

  public Device() {
    this.types = new ArrayDeque<>();
    Controller ac = new GpaInterface();
    this.types.addLast(ac);
  }

  public void determineCartelProces(LinkedList<Summons> treat) {
    this.lageTechniques = treat.size();
    this.AttractorServe = treat;
  }

  public void dictatedClockworkWork(LinkedList<Summons> outgrowth) {
    this.lageTechniques = outgrowth.size();
    this.CountMechanism = outgrowth;
  }

  public void endureRetailer() {
    this.endureServer(new GpaInterface(), this.AttractorServe, "LRU");
    this.endureServer(new GpaInterface(), this.CountMechanism, "CLOCK");
  }

  private void endureServer(
      Controller spreadsheet, LinkedList<Summons> underwayTreat, String replenishment) {
    spreadsheet.offsetCompiler(replenishment);
    Collections.sort(underwayTreat);

    while (!underwayTreat.isEmpty()) {
      spreadsheet.arrivalMethodology(underwayTreat.removeFirst());
    }

    while (spreadsheet.goIsMoving()) {

      if (spreadsheet.becomeConcludedPracticesQuantity() == lageTechniques) {
        spreadsheet.interceptSpooler(replenishment);
      } else {
        spreadsheet.readyIncumbentTock(spreadsheet.driveContinuingVibrate() + 1);
        spreadsheet.snoTicktock();
      }
    }
  }
}
