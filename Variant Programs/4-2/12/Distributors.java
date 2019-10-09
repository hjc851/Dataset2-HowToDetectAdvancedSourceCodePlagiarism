import java.util.*;

public class Distributors {
  private java.util.ArrayDeque<Server> planners;
  private int yumAct;
  private java.util.LinkedList<Litigate> LfuLitigate;
  private java.util.LinkedList<Litigate> TimeProcedure;

  public Distributors() {
    this.planners = new java.util.ArrayDeque<>();
    Server b = new ApDatabase();
    this.planners.addLast(b);
  }

  public void prepareAzimuthMethodologies(java.util.LinkedList<Litigate> act) {
    this.yumAct = act.size();
    this.LfuLitigate = act;
  }

  public void readyTachMarch(java.util.LinkedList<Litigate> systems) {
    this.yumAct = systems.size();
    this.TimeProcedure = systems;
  }

  public void operateStarter() {
    this.campaignOutliner(new ApDatabase(), this.LfuLitigate, "LRU");
    this.campaignOutliner(new ApDatabase(), this.TimeProcedure, "CLOCK");
  }

  private void campaignOutliner(
      Server programming,
      java.util.LinkedList<Litigate> continuingTechniques,
      java.lang.String backup) {
    programming.restartDatabase(backup);
    java.util.Collections.sort(continuingTechniques);

    while (!continuingTechniques.isEmpty()) {
      programming.ingressProcedures(continuingTechniques.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.findCompletionActSmall() == yumAct) {
        programming.closureServer(backup);
      } else {
        programming.placeStreamBookmark(programming.sustainThisValidation() + 1);
        programming.snoTicktock();
      }
    }
  }
}
