package synchronizer;

import sender.Vendor;
import synchronizer.Controller;
import synchronizer.Phase;
import java.util.ArrayDeque;

public class NealOrganizer extends synchronizer.Controller {
  private static final int synX2936int = 0;
  private static final int synX2935int = 0;
  private static final int synX2934int = 0;
  private static final int synX2933int = 0;
  private static final int synX2932int = 6;
  private static final String synX2931String = "FB:";
  private static final boolean synX2930boolean = true;
  private static final boolean synX2929boolean = false;
  private static final int synX2928int = 0;
  public int presentlyPreference = 0;

  public synchronized boolean primedIsVacant() {
    {
      int i = synX2928int;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              return synX2929boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2930boolean;
  }

  public synchronized String configurationDiscover() {
    return synX2931String;
  }

  public NealOrganizer() {
    this.promptCode = (new java.util.ArrayDeque[synX2932int]);
    {
      int i = synX2933int;

      while (i < promptCode.length) {
        {
          synx586(i);
        }
        i++;
      }
    }
    junctureMaintaining = (PeriodQualitative);
    presentlyPreference = (synX2934int);
  }

  public synchronized synchronizer.Phase bringCloseWork() {
    {
      int i = synX2935int;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              presentlyPreference = (i);
              return promptCode[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized void nbsClick() {

    if (latestOperation != null) synx587();

    if (this.ballaBrigade && latestOperation == null) synx588();
    else synx589();
  }

  public int junctureMaintaining = 0;

  public synchronized void formalitiesImpending(Phase proceeding) {
    promptCode[synX2936int].addLast(proceeding);
  }

  public ArrayDeque<Phase>[] promptCode = null;

  private synchronized void synx586(int i) {
    promptCode[i] = (new java.util.ArrayDeque<>());
  }

  private synchronized void synx587() {
    latestOperation.rigidWalkingAmount(latestOperation.canLengthwaysYears() + 1);
    junctureMaintaining--;

    if (latestOperation.canLengthwaysYears() == latestOperation.conveyCofounderNumber()) {
      latestOperation.placedExpireWhen(this.canExistingDial());
      this.executedMethods.addLast(latestOperation);
      latestOperation = (null);
      this.ballaBrigade = (true);
    }

    if (junctureMaintaining == 0 && latestOperation != null) {

      if (primedIsVacant()) {
        junctureMaintaining = (PeriodQualitative);
      } else {
        promptCode[presentlyPreference + 1].addLast(latestOperation);
        latestOperation = (null);
        this.ballaBrigade = (true);
      }
    }
  }

  private synchronized void synx588() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.ballaBrigade = (false);
      this.survivingMbeWeek = (Vendor.CommuniqueMeter);
    }
  }

  private synchronized void synx589() {

    if (latestOperation == null && !primedIsVacant()) {
      latestOperation = (bringCloseWork());
      overloadingMechanisms(latestOperation);
      latestOperation.laidBeginningClip(this.canExistingDial());
      junctureMaintaining = (PeriodQualitative);
    }
  }
}
