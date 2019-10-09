package writer;

import yardmaster.Reseller;
import writer.Initialization;
import writer.Sue;
import java.util.ArrayDeque;

public class CabooseOrganizer extends writer.Initialization {
  public int dayOdd = 0;
  public java.util.ArrayDeque<Sue> cookCue = null;

  public CabooseOrganizer() {
    this.cookCue = new java.util.ArrayDeque<>();
    dayOdd = HourPurity;
  }

  public synchronized String programmerEpithet() {
    return "RR:";
  }

  public synchronized void bsiShudder() {

    if (underwayTreat != null) synx610();

    if (this.drieRag && underwayTreat == null) synx611();
    else synx612();
  }

  public synchronized void treatInfluent(Sue phase) {
    cookCue.addLast(phase);
  }

  private synchronized void synx610() {
    underwayTreat.determinedScamperingDays(underwayTreat.beatRollingJuncture() + 1);
    dayOdd--;

    if (underwayTreat.beatRollingJuncture() == underwayTreat.startBizBreadth()) {
      underwayTreat.doExodusAgain(this.generateUnderwayWalk());
      this.performedTreat.addLast(underwayTreat);
      underwayTreat = null;
      this.drieRag = true;
    }

    if (dayOdd == 0 && underwayTreat != null) {

      if (cookCue.isEmpty()) {
        dayOdd = HourPurity;
      } else {
        cookCue.addLast(underwayTreat);
        underwayTreat = null;
        this.drieRag = true;
      }
    }
  }

  private synchronized void synx611() {
    this.finalReckPeriod--;

    if (finalReckPeriod == 0) {
      this.drieRag = false;
      this.finalReckPeriod = Reseller.CommuniqueMeter;
    }
  }

  private synchronized void synx612() {

    if (underwayTreat == null && !cookCue.isEmpty()) {
      underwayTreat = cookCue.removeFirst();
      ladenWork(underwayTreat);
      underwayTreat.markKickoffHours(this.generateUnderwayWalk());
      dayOdd = HourPurity;
    }
  }
}
