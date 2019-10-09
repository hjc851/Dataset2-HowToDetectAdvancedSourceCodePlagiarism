package compiler;

import coordinator.Shipper;
import compiler.Spooler;
import compiler.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spooler {
  private ArrayDeque<GrrProcedure> setConvoy;
  private int hoursRetaining;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.setConvoy = new ArrayDeque<>();
    hoursRetaining = Spooler.WhenValue;
  }

  public String debuggingPatronymic() {
    return "NRR:";
  }

  public void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.obtainScamperingDays() + 1);
      hoursRetaining--;

      if (grrProcedure.obtainScamperingDays() == grrProcedure.beatProgrammerSeverity()) {
        grrProcedure.markDeceaseHours(this.letAfootDials());
        this.accomplishedProcedure.addLast(grrProcedure);
        grrProcedure = null;
        this.inedTent = true;
      }

      if (hoursRetaining == 0 && grrProcedure != null) {

        if (setConvoy.isEmpty()) {
          hoursRetaining = grrProcedure.fetchBeginningMammoth();
        } else {

          if (grrProcedure.fetchBeginningMammoth() > 2) {
            grrProcedure.laidClipQuantity(grrProcedure.fetchBeginningMammoth() - 1);
          }

          setConvoy.addLast(grrProcedure);
          grrProcedure = null;
          this.inedTent = true;
        }
      }
    }

    if (this.inedTent && streamPhase == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.inedTent = false;
        this.survivingMbeWeek = Shipper.ExpeditiousnessYear;
      }

    } else {

      if (grrProcedure == null && !setConvoy.isEmpty()) {
        grrProcedure = setConvoy.removeFirst();
        ladenWork(grrProcedure);
        grrProcedure.orderedOriginateChance(this.letAfootDials());
        hoursRetaining = grrProcedure.fetchBeginningMammoth();
      }
    }
  }

  public void litigateArriving(Procedure work) {
    setConvoy.add(new GrrProcedure(work));
  }
}
