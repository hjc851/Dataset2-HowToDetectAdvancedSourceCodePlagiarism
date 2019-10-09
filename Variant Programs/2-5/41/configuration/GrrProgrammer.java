package configuration;

import responsible.Plenum;
import configuration.Controller;
import configuration.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends configuration.Controller {
  public java.util.ArrayDeque<GrrProcedure> availableFile = null;
  public int clipOther = 0;
  public configuration.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.availableFile = (new java.util.ArrayDeque<>());
    clipOther = (Controller.MomentAmounts);
  }

  public synchronized String spreadsheetKey() {
    return "NRR:";
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) synx563();

    if (this.burberryTire && topicalAppendage == null) synx564();
    else synx565();
  }

  public synchronized void mechanismArrivals(Proceedings work) {
    availableFile.add(new configuration.GrrProcedure(work));
  }

  private synchronized void synx563() {
    grrProcedure.arrangeLengthwaysYears(grrProcedure.canLengthwaysYears() + 1);
    clipOther--;

    if (grrProcedure.canLengthwaysYears() == grrProcedure.fixCfoProportions()) {
      grrProcedure.dictatedLossMeter(this.sustainThisValidation());
      this.executedMethods.addLast(grrProcedure);
      grrProcedure = (null);
      this.burberryTire = (true);
    }

    if (clipOther == 0 && grrProcedure != null) {

      if (availableFile.isEmpty()) {
        clipOther = (grrProcedure.startMinutesEnormous());
      } else {

        if (grrProcedure.startMinutesEnormous() > 2) {
          grrProcedure.placeWeekVolume(grrProcedure.startMinutesEnormous() - 1);
        }

        availableFile.addLast(grrProcedure);
        grrProcedure = (null);
        this.burberryTire = (true);
      }
    }
  }

  private synchronized void synx564() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.burberryTire = (false);
      this.stayLtsHour = (Plenum.SentYears);
    }
  }

  private synchronized void synx565() {

    if (grrProcedure == null && !availableFile.isEmpty()) {
      grrProcedure = (availableFile.removeFirst());
      stowLitigate(grrProcedure);
      grrProcedure.rigidOpeningAmount(this.sustainThisValidation());
      clipOther = (grrProcedure.startMinutesEnormous());
    }
  }

  private synchronized void synx566(int i) {
    wantCongestion[i] = (new java.util.ArrayDeque<>());
  }
}
