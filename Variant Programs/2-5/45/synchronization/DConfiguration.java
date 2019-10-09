package synchronization;

import salesperson.Resellers;
import synchronization.Writer;
import synchronization.Proceedings;
import java.util.ArrayDeque;

public class DConfiguration extends synchronization.Writer {
  private ArrayDeque<Proceedings>[] primedRows = null;
  private int clockLeft = 0;
  private int incumbentPrioritized = 0;

  public DConfiguration() {
    this.primedRows = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            primedRows[i] = new java.util.ArrayDeque<>();
          }
        }
        i++;
      }
    }
    clockLeft = AmountMarkers;
    incumbentPrioritized = 0;
  }

  private synchronized synchronization.Proceedings obtainLastOutgrowth() {
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            if (!primedRows[i].isEmpty()) {
              incumbentPrioritized = i;
              return primedRows[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            if (!primedRows[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String developerIdentify() {
    return "FB:";
  }

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.layPouringMoment(presentlyMechanism.obtainScamperingDays() + 1);
      clockLeft--;

      if (presentlyMechanism.obtainScamperingDays()
          == presentlyMechanism.findImplementationSmall()) {
        presentlyMechanism.fixDepartThing(this.receiveContemporaryTicktack());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.inedTent = true;
      }

      if (clockLeft == 0 && presentlyMechanism != null) {

        if (primedIsVacant()) {
          clockLeft = AmountMarkers;
        } else {
          primedRows[incumbentPrioritized + 1].addLast(presentlyMechanism);
          presentlyMechanism = null;
          this.inedTent = true;
        }
      }
    }

    if (this.inedTent && presentlyMechanism == null) {
      this.unexpendedThmSentence--;

      if (unexpendedThmSentence == 0) {
        this.inedTent = false;
        this.unexpendedThmSentence = Resellers.DispatchesHours;
      }

    } else {

      if (presentlyMechanism == null && !primedIsVacant()) {
        presentlyMechanism = obtainLastOutgrowth();
        shipmentOutgrowth(presentlyMechanism);
        presentlyMechanism.laidBeginningClip(this.receiveContemporaryTicktack());
        clockLeft = AmountMarkers;
      }
    }
  }

  public synchronized void systemInpouring(Proceedings system) {
    primedRows[0].addLast(system);
  }
}
