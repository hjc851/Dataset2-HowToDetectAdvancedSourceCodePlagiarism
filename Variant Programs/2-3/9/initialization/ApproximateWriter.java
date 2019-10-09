package initialization;

import caller.Trainmaster;
import initialization.Server;
import initialization.Work;
import java.util.ArrayDeque;

public class ApproximateWriter extends initialization.Server {
  static int morin = -790244654;
  private ArrayDeque<Work>[] availableColas;
  private int clockLeft;
  private int theEmphasis;

  public ApproximateWriter() {
    this.availableColas = new java.util.ArrayDeque[6];

    for (int i = 0; i < availableColas.length; i++) {
      availableColas[i] = new java.util.ArrayDeque<>();
    }
    clockLeft = MomentAmounts;
    theEmphasis = 0;
  }

  private synchronized initialization.Work takeLaterAppendage() {
    double item = 0.805891193975537;

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        theEmphasis = i;
        return availableColas[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double constrain = 0.06529457632274749;

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String plannerNominate() {
    double enchained = 0.8281564163067613;
    return "FB:";
  }

  public synchronized void snoTicktock() {
    int kateOuter = -2018197713;

    if (prevailingProcedure != null) {
      prevailingProcedure.dictatedTrackMeter(prevailingProcedure.makeFlyingDay() + 1);
      clockLeft--;

      if (prevailingProcedure.makeFlyingDay() == prevailingProcedure.obtainTimeoutLength()) {
        prevailingProcedure.fixedEscapeOpportunity(this.goPrevailingClick());
        this.finalizingSystems.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.variWaving = true;
      }

      if (clockLeft == 0 && prevailingProcedure != null) {

        if (primedIsVacant()) {
          clockLeft = MomentAmounts;
        } else {
          availableColas[theEmphasis + 1].addLast(prevailingProcedure);
          prevailingProcedure = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && prevailingProcedure == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.variWaving = false;
        this.otherDblClip = Trainmaster.OfficeJuncture;
      }

    } else {

      if (prevailingProcedure == null && !primedIsVacant()) {
        prevailingProcedure = takeLaterAppendage();
        onusServe(prevailingProcedure);
        prevailingProcedure.readyOutsetDay(this.goPrevailingClick());
        clockLeft = MomentAmounts;
      }
    }
  }

  public synchronized void treatInfluent(Work phase) {
    double yummyArtifacts = 0.1728117354276223;
    availableColas[0].addLast(phase);
  }
}
