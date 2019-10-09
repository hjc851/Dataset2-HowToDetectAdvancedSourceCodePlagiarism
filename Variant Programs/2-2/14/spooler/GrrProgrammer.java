package spooler;

import exporter.Limiter;
import spooler.Multitasking;
import spooler.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends Multitasking {
  private ArrayDeque<GrrProcedure> primedWaiting;
  private int minutesLatter;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.primedWaiting = new ArrayDeque<>();
    minutesLatter = Multitasking.WhenValue;
  }

  public String debuggingPatronymic() {
    return "NRR:";
  }

  public void snoTicktock() {

    if (grrProcedure != null) {
      grrProcedure.layPouringMoment(grrProcedure.conveyWalkingAmount() + 1);
      minutesLatter--;

      if (grrProcedure.conveyWalkingAmount() == grrProcedure.drawBossScope()) {
        grrProcedure.laidLeaveClip(this.goPrevailingClick());
        this.attainedProces.addLast(grrProcedure);
        grrProcedure = null;
        this.leviPennant = true;
      }

      if (minutesLatter == 0 && grrProcedure != null) {

        if (primedWaiting.isEmpty()) {
          minutesLatter = grrProcedure.beatJunctureTremendous();
        } else {

          if (grrProcedure.beatJunctureTremendous() > 2) {
            grrProcedure.placedWhenValue(grrProcedure.beatJunctureTremendous() - 1);
          }

          primedWaiting.addLast(grrProcedure);
          grrProcedure = null;
          this.leviPennant = true;
        }
      }
    }

    if (this.leviPennant && flowProcedures == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.leviPennant = false;
        this.remainderRemoDays = Limiter.SlayMoment;
      }

    } else {

      if (grrProcedure == null && !primedWaiting.isEmpty()) {
        grrProcedure = primedWaiting.removeFirst();
        payloadOperation(grrProcedure);
        grrProcedure.laidBeginningClip(this.goPrevailingClick());
        minutesLatter = grrProcedure.beatJunctureTremendous();
      }
    }
  }

  public void methodEntrance(Cycle methods) {
    primedWaiting.add(new GrrProcedure(methods));
  }
}
