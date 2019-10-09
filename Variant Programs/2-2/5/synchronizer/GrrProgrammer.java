package synchronizer;

import starter.Distributors;
import synchronizer.Writer;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronizer.Writer {
  private java.util.ArrayDeque<GrrProcedure> poisedDipper;
  private int meterLeftover;
  private synchronizer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.poisedDipper = new java.util.ArrayDeque<>();
    meterLeftover = Writer.DaysQuantitative;
  }

  public String debuggingPatronymic() {
    return "NRR:";
  }

  public void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.placeSpurtingWeek(grrProcedure.developLengthwiseHour() + 1);
      meterLeftover--;

      if (grrProcedure.developLengthwiseHour() == grrProcedure.produceVeepDensity()) {
        grrProcedure.bentPulloutHour(this.catchRifeCheck());
        this.submittedTechnologies.addLast(grrProcedure);
        grrProcedure = null;
        this.burberryTire = true;
      }

      if (meterLeftover == 0 && grrProcedure != null) {

        if (poisedDipper.isEmpty()) {
          meterLeftover = grrProcedure.generateYearSurface();
        } else {

          if (grrProcedure.generateYearSurface() > 2) {
            grrProcedure.readyDaySum(grrProcedure.generateYearSurface() - 1);
          }

          poisedDipper.addLast(grrProcedure);
          grrProcedure = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && actualAct == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.burberryTire = false;
        this.leavingBrinWhen = Distributors.AssignThing;
      }

    } else {

      if (grrProcedure == null && !poisedDipper.isEmpty()) {
        grrProcedure = poisedDipper.removeFirst();
        encumbranceSummons(grrProcedure);
        grrProcedure.doRestartAgain(this.catchRifeCheck());
        meterLeftover = grrProcedure.generateYearSurface();
      }
    }
  }

  public void sueNext(Summons appendage) {
    poisedDipper.add(new synchronizer.GrrProcedure(appendage));
  }
}
