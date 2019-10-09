package callback;

import limiter.Forwarder;
import callback.Parser;
import callback.Treat;
import java.util.ArrayDeque;

public class GrrProgrammer extends Parser {
  private ArrayDeque<GrrProcedure> willingSpooler;
  private int sentenceUnexpended;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.willingSpooler = new ArrayDeque<>();
    sentenceUnexpended = Parser.YearsSize;
  }

  public String developerIdentify() {
    return "NRR:";
  }

  public void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.arrangeLengthwaysYears(grrProcedure.developLengthwiseHour() + 1);
      sentenceUnexpended--;

      if (grrProcedure.developLengthwiseHour() == grrProcedure.drawBossScope()) {
        grrProcedure.settledReleasePeriods(this.developPreviousAnswer());
        this.realizedWork.addLast(grrProcedure);
        grrProcedure = null;
        this.ballaBrigade = true;
      }

      if (sentenceUnexpended == 0 && grrProcedure != null) {

        if (willingSpooler.isEmpty()) {
          sentenceUnexpended = grrProcedure.takePeriodQualitative();
        } else {

          if (grrProcedure.takePeriodQualitative() > 2) {
            grrProcedure.doAgainGiant(grrProcedure.takePeriodQualitative() - 1);
          }

          willingSpooler.addLast(grrProcedure);
          grrProcedure = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && rifeSue == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.ballaBrigade = false;
        this.unsoldDrieBeginning = Forwarder.SendingHour;
      }

    } else {

      if (grrProcedure == null && !willingSpooler.isEmpty()) {
        grrProcedure = willingSpooler.removeFirst();
        unladenProceeding(grrProcedure);
        grrProcedure.settledDepartPeriods(this.developPreviousAnswer());
        sentenceUnexpended = grrProcedure.takePeriodQualitative();
      }
    }
  }

  public void serveInward(Treat methodology) {
    willingSpooler.add(new GrrProcedure(methodology));
  }
}
