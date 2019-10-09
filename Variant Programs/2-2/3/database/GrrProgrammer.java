package database;

import regulator.Device;
import database.Parser;
import database.Litigate;
import java.util.ArrayDeque;

public class GrrProgrammer extends database.Parser {
  private java.util.ArrayDeque<GrrProcedure> intelligentBraid;
  private int hoursRetaining;
  private database.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
    hoursRetaining = Parser.ClockAmount;
  }

  public String multitaskingMoniker() {
    return "NRR:";
  }

  public void addTock() {

    if (grrProcedure != null) {
      grrProcedure.placeSpurtingWeek(grrProcedure.makeFlyingDay() + 1);
      hoursRetaining--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.fetchManagerVastness()) {
        grrProcedure.putDepartureClock(this.makeIncumbentTock());
        this.constructedMethodology.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = true;
      }

      if (hoursRetaining == 0 && grrProcedure != null) {

        if (intelligentBraid.isEmpty()) {
          hoursRetaining = grrProcedure.findSentenceTeleportation();
        } else {

          if (grrProcedure.findSentenceTeleportation() > 2) {
            grrProcedure.situatedMinutesEnormous(grrProcedure.findSentenceTeleportation() - 1);
          }

          intelligentBraid.addLast(grrProcedure);
          grrProcedure = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && formerFormalities == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.reckTricolor = false;
        this.remainderRemoDays = Device.ExpeditionPeriod;
      }

    } else {

      if (grrProcedure == null && !intelligentBraid.isEmpty()) {
        grrProcedure = intelligentBraid.removeFirst();
        stowLitigate(grrProcedure);
        grrProcedure.prepareOffsetNow(this.makeIncumbentTock());
        hoursRetaining = grrProcedure.findSentenceTeleportation();
      }
    }
  }

  public void proceduresIngress(Litigate march) {
    intelligentBraid.add(new database.GrrProcedure(march));
  }
}
