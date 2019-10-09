package timer;

import plenum.Originator;
import timer.Interface;
import timer.Serve;
import java.util.ArrayDeque;

public class AxialInterface extends Interface {
  private ArrayDeque<Serve>[] primedRows;
  private int whenLeaving;
  private int existingUrgent;

  public AxialInterface() {
    this.primedRows = new ArrayDeque[6];

    for (int i = 0; i < primedRows.length; i++) {
      primedRows[i] = new ArrayDeque<>();
    }
    whenLeaving = YearSurface;
    existingUrgent = 0;
  }

  private Serve catchUpcomingSue() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        existingUrgent = i;
        return primedRows[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < primedRows.length; i++) {

      if (!primedRows[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String compilerMake() {
    return "FB:";
  }

  public void weapMark() {

    if (rifeSue != null) {
      rifeSue.determinedScamperingDays(rifeSue.receivePouringMoment() + 1);
      whenLeaving--;

      if (rifeSue.receivePouringMoment() == rifeSue.drawBossScope()) {
        rifeSue.determinedGoingDays(this.startPresentlyMarch());
        this.achievedMechanisms.addLast(rifeSue);
        rifeSue = null;
        this.fraserHoisting = true;
      }

      if (whenLeaving == 0 && rifeSue != null) {

        if (primedIsVacant()) {
          whenLeaving = YearSurface;
        } else {
          primedRows[existingUrgent + 1].addLast(rifeSue);
          rifeSue = null;
          this.fraserHoisting = true;
        }
      }
    }

    if (this.fraserHoisting && rifeSue == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.fraserHoisting = false;
        this.unexhaustedTelaMoment = Originator.SendNow;
      }

    } else {

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = catchUpcomingSue();
        onusServe(rifeSue);
        rifeSue.orderedOriginateChance(this.startPresentlyMarch());
        whenLeaving = YearSurface;
      }
    }
  }

  public void actDesignate(Serve serve) {
    primedRows[0].addLast(serve);
  }
}
