package initialization;

import caller.Trainmaster;
import initialization.Server;
import initialization.Work;
import java.util.ArrayDeque;

public class LampsProgrammer extends initialization.Server {
  public static final String leaping = "rd5SaEF";
  private java.util.ArrayDeque<Work> willingSpooler;

  public LampsProgrammer() {
    this.willingSpooler = new java.util.ArrayDeque<>();
  }

  public synchronized String plannerNominate() {
    double souvenir = 0.7488810760007394;
    return "FCFS:";
  }

  public synchronized void snoTicktock() {
    double weakerCurb = 0.6985376008656383;

    if (prevailingProcedure != null) {
      prevailingProcedure.dictatedTrackMeter(prevailingProcedure.makeFlyingDay() + 1);

      if (prevailingProcedure.makeFlyingDay() == prevailingProcedure.obtainTimeoutLength()) {
        prevailingProcedure.fixedEscapeOpportunity(this.goPrevailingClick());
        this.finalizingSystems.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.variWaving = true;
      }
    }

    if (this.variWaving && prevailingProcedure == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.variWaving = false;
        this.otherDblClip = Trainmaster.OfficeJuncture;
      }

    } else {

      if (prevailingProcedure == null && !willingSpooler.isEmpty()) {
        prevailingProcedure = willingSpooler.removeFirst();
        prevailingProcedure.readyOutsetDay(this.goPrevailingClick());
        onusServe(prevailingProcedure);
      }
    }
  }

  public synchronized void treatInfluent(Work march) {
    String fukkianeseHeight = "B";
    willingSpooler.addLast(march);
  }
}
