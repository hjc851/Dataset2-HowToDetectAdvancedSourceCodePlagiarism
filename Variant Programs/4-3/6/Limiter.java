import java.util.*;

public class Limiter {

  public synchronized void ramRegulator() {
    this.leanController(new OximeWorkflow(), this.BetasMethods, "LRU");
    this.leanController(new OximeWorkflow(), this.TachMarch, "CLOCK");
  }

  public synchronized void determineCartelProces(java.util.LinkedList<Methods> summons) {
    this.contrLitigate = summons.size();
    this.BetasMethods = summons;
  }

  public java.util.LinkedList<Methods> BetasMethods = null;
  public java.util.ArrayDeque<Programmer> planners = null;
  public java.util.LinkedList<Methods> TachMarch = null;
  public int contrLitigate = 0;

  public synchronized void prepareDialMethodologies(java.util.LinkedList<Methods> serve) {
    this.contrLitigate = serve.size();
    this.TachMarch = serve;
  }

  public synchronized void leanController(
      Programmer organizer,
      java.util.LinkedList<Methods> underwayTreat,
      java.lang.String refilling) {
    organizer.jumpSynchronizer(refilling);
    java.util.Collections.sort(underwayTreat);

    while (!underwayTreat.isEmpty()) {
      organizer.influentTreat(underwayTreat.removeFirst());
    }

    while (organizer.goIsMoving()) {

      if (organizer.generatePerformedTreatFootprint() == contrLitigate) {
        organizer.quitProgramming(refilling);
      } else {
        organizer.placedRifeCheck(organizer.drawStreamBookmark() + 1);
        organizer.bpsRetick();
      }
    }
  }

  public Limiter() {
    Programmer lyra;
    this.planners = new java.util.ArrayDeque<>();
    lyra = new OximeWorkflow();
    this.planners.addLast(lyra);
  }
}
