package callback;

import limiter.Forwarder;
import callback.Parser;
import callback.Treat;
import java.util.ArrayDeque;

public class CommercialSpooler extends Parser {
  private ArrayDeque<Treat>[] cookFiles;
  private int thingLingering;
  private int circulatingImperative;

  public CommercialSpooler() {
    this.cookFiles = new ArrayDeque[6];

    for (int i = 0; i < cookFiles.length; i++) {
      cookFiles[i] = new ArrayDeque<>();
    }
    thingLingering = YearsSize;
    circulatingImperative = 0;
  }

  private Treat sustainThenMethods() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        circulatingImperative = i;
        return cookFiles[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String developerIdentify() {
    return "FB:";
  }

  public void ourTicktack() {

    if (rifeSue != null) {
      rifeSue.arrangeLengthwaysYears(rifeSue.developLengthwiseHour() + 1);
      thingLingering--;

      if (rifeSue.developLengthwiseHour() == rifeSue.drawBossScope()) {
        rifeSue.settledReleasePeriods(this.developPreviousAnswer());
        this.realizedWork.addLast(rifeSue);
        rifeSue = null;
        this.ballaBrigade = true;
      }

      if (thingLingering == 0 && rifeSue != null) {

        if (primedIsVacant()) {
          thingLingering = YearsSize;
        } else {
          cookFiles[circulatingImperative + 1].addLast(rifeSue);
          rifeSue = null;
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

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = sustainThenMethods();
        unladenProceeding(rifeSue);
        rifeSue.settledDepartPeriods(this.developPreviousAnswer());
        thingLingering = YearsSize;
      }
    }
  }

  public void serveInward(Treat proceedings) {
    cookFiles[0].addLast(proceedings);
  }
}
