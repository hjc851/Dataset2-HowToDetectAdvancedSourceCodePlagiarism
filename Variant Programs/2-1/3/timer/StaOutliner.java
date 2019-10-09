package timer;

import plenum.Originator;
import timer.Interface;
import timer.Serve;
import java.util.ArrayDeque;

public class StaOutliner extends Interface {
  private ArrayDeque<Serve> promptPenis;
  private int chanceUnresolved;

  public StaOutliner() {
    this.promptPenis = new ArrayDeque<>();
    chanceUnresolved = YearSurface;
  }

  public String compilerMake() {
    return "RR:";
  }

  public void weapMark() {

    if (rifeSue != null) {
      rifeSue.determinedScamperingDays(rifeSue.receivePouringMoment() + 1);
      chanceUnresolved--;

      if (rifeSue.receivePouringMoment() == rifeSue.drawBossScope()) {
        rifeSue.determinedGoingDays(this.startPresentlyMarch());
        this.achievedMechanisms.addLast(rifeSue);
        rifeSue = null;
        this.fraserHoisting = true;
      }

      if (chanceUnresolved == 0 && rifeSue != null) {

        if (promptPenis.isEmpty()) {
          chanceUnresolved = YearSurface;
        } else {
          promptPenis.addLast(rifeSue);
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

      if (rifeSue == null && !promptPenis.isEmpty()) {
        rifeSue = promptPenis.removeFirst();
        onusServe(rifeSue);
        rifeSue.orderedOriginateChance(this.startPresentlyMarch());
        chanceUnresolved = YearSurface;
      }
    }
  }

  public void actDesignate(Serve procedures) {
    promptPenis.addLast(procedures);
  }
}
