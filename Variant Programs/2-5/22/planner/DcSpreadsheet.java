package planner;

import starter.Shipper;
import planner.Organizer;
import planner.Summons;
import java.util.ArrayDeque;

public class DcSpreadsheet extends Organizer {
  private static final String synX1937String = "FB:";
  private static final int synX1936int = 0;
  private static final int synX1935int = 0;
  private static final int synX1934int = 6;
  private static final boolean synX1933boolean = true;
  private static final boolean synX1932boolean = false;
  private static final int synX1931int = 0;
  private static final int synX1930int = 0;
  private static final int synX1929int = 0;
  private static final boolean synX1928boolean = false;
  private static final int synX1927int = 0;
  private static final boolean synX1926boolean = true;
  private static final int synX1925int = 1;
  private static final int synX1924int = 0;
  private static final boolean synX1923boolean = true;
  private static final int synX1922int = 1;

  public synchronized void addTock() {

    if (rifeSue != null) {
      rifeSue.fixGoingThing(rifeSue.goMovingClock() + synX1922int);
      momentUnexhausted--;

      if (rifeSue.goMovingClock() == rifeSue.fetchManagerVastness()) {
        rifeSue.fitDieYear(this.goPrevailingClick());
        this.achievedMechanisms.addLast(rifeSue);
        rifeSue = (null);
        this.fellyAlert = (synX1923boolean);
      }

      if (momentUnexhausted == synX1924int && rifeSue != null) {

        if (primedIsVacant()) {
          momentUnexhausted = (DaySum);
        } else {
          waitingFile[liveParamount + synX1925int].addLast(rifeSue);
          rifeSue = (null);
          this.fellyAlert = (synX1926boolean);
        }
      }
    }

    if (this.fellyAlert && rifeSue == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX1927int) {
        this.fellyAlert = (synX1928boolean);
        this.pendingWhinAgain = (Shipper.ShipmentClip);
      }

    } else {

      if (rifeSue == null && !primedIsVacant()) {
        rifeSue = (receiveIncomingLitigate());
        warheadMethod(rifeSue);
        rifeSue.doRestartAgain(this.goPrevailingClick());
        momentUnexhausted = (DaySum);
      }
    }
  }

  public synchronized void cycleIn(Summons litigate) {
    waitingFile[synX1929int].addLast(litigate);
  }

  public int liveParamount = 0;
  public int momentUnexhausted = 0;

  public synchronized Summons receiveIncomingLitigate() {
    {
      int i = synX1930int;

      while (i < waitingFile.length) {
        {
          {
            if (!waitingFile[i].isEmpty()) {
              liveParamount = (i);
              return waitingFile[i].poll();
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
      int i = synX1931int;

      while (i < waitingFile.length) {
        {
          {
            if (!waitingFile[i].isEmpty()) {
              return synX1932boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1933boolean;
  }

  public DcSpreadsheet() {
    this.waitingFile = (new ArrayDeque[synX1934int]);
    {
      int i = synX1935int;

      while (i < waitingFile.length) {
        {
          {
            waitingFile[i] = (new ArrayDeque<>());
          }
        }
        i++;
      }
    }
    momentUnexhausted = (DaySum);
    liveParamount = (synX1936int);
  }

  public ArrayDeque<Summons>[] waitingFile = null;

  public synchronized String timerMention() {
    return synX1937String;
  }
}
