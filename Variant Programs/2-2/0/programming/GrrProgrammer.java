package programming;

import retailer.Starter;
import programming.Spooler;
import programming.Formalities;
import java.util.ArrayDeque;

public class GrrProgrammer extends programming.Spooler {
  private java.util.ArrayDeque<GrrProcedure> ablePecker;
  private int dayOdd;
  private programming.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.ablePecker = new java.util.ArrayDeque<>();
    dayOdd = Spooler.PeriodsGigantic;
  }

  public String interfaceCall() {
    return "NRR:";
  }

  public void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.readyFlyingDay(grrProcedure.makeFlyingDay() + 1);
      dayOdd--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.produceVeepDensity()) {
        grrProcedure.fitDieYear(this.haveCirculatingShudder());
        this.realizedWork.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = true;
      }

      if (dayOdd == 0 && grrProcedure != null) {

        if (ablePecker.isEmpty()) {
          dayOdd = grrProcedure.findSentenceTeleportation();
        } else {

          if (grrProcedure.findSentenceTeleportation() > 2) {
            grrProcedure.solidifyingJunctureTremendous(
                grrProcedure.findSentenceTeleportation() - 1);
          }

          ablePecker.addLast(grrProcedure);
          grrProcedure = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && flowProcedures == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.reckTricolor = false;
        this.anotherBurberryYears = Starter.DispatchedMonth;
      }

    } else {

      if (grrProcedure == null && !ablePecker.isEmpty()) {
        grrProcedure = ablePecker.removeFirst();
        warheadMethod(grrProcedure);
        grrProcedure.arrangeBeganYears(this.haveCirculatingShudder());
        dayOdd = grrProcedure.findSentenceTeleportation();
      }
    }
  }

  public void operationInbound(Formalities mechanism) {
    ablePecker.add(new programming.GrrProcedure(mechanism));
  }
}
