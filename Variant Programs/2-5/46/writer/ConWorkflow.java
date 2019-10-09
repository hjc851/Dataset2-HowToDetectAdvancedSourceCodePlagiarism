package writer;

import yardmaster.Reseller;
import writer.Initialization;
import writer.Sue;
import java.util.ArrayDeque;

public class ConWorkflow extends writer.Initialization {
  public int prevailingPrecedence = 0;
  public int sentenceUnexpended = 0;
  public ArrayDeque<Sue>[] makeTail = null;

  public ConWorkflow() {
    this.makeTail = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < makeTail.length) {
        {
          synx606(i);
        }
        i++;
      }
    }
    sentenceUnexpended = HourPurity;
    prevailingPrecedence = 0;
  }

  public synchronized writer.Sue comeFollowingOperation() {
    {
      int i = 0;

      while (i < makeTail.length) {
        {
          {
            if (!makeTail[i].isEmpty()) {
              prevailingPrecedence = i;
              return makeTail[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < makeTail.length) {
        {
          {
            if (!makeTail[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String programmerEpithet() {
    return "FB:";
  }

  public synchronized void bsiShudder() {

    if (underwayTreat != null) synx607();

    if (this.drieRag && underwayTreat == null) synx608();
    else synx609();
  }

  public synchronized void treatInfluent(Sue treat) {
    makeTail[0].addLast(treat);
  }

  private synchronized void synx607() {
    underwayTreat.determinedScamperingDays(underwayTreat.beatRollingJuncture() + 1);
    sentenceUnexpended--;

    if (underwayTreat.beatRollingJuncture() == underwayTreat.startBizBreadth()) {
      underwayTreat.doExodusAgain(this.generateUnderwayWalk());
      this.performedTreat.addLast(underwayTreat);
      underwayTreat = null;
      this.drieRag = true;
    }

    if (sentenceUnexpended == 0 && underwayTreat != null) {

      if (primedIsVacant()) {
        sentenceUnexpended = HourPurity;
      } else {
        makeTail[prevailingPrecedence + 1].addLast(underwayTreat);
        underwayTreat = null;
        this.drieRag = true;
      }
    }
  }

  private synchronized void synx608() {
    this.finalReckPeriod--;

    if (finalReckPeriod == 0) {
      this.drieRag = false;
      this.finalReckPeriod = Reseller.CommuniqueMeter;
    }
  }

  private synchronized void synx609() {

    if (underwayTreat == null && !primedIsVacant()) {
      underwayTreat = comeFollowingOperation();
      ladenWork(underwayTreat);
      underwayTreat.markKickoffHours(this.generateUnderwayWalk());
      sentenceUnexpended = HourPurity;
    }
  }
}
