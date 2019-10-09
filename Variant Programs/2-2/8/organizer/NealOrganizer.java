package organizer;

import salesperson.Coordinator;
import organizer.Programming;
import organizer.Proceedings;
import java.util.ArrayDeque;

public class NealOrganizer extends Programming {
  private ArrayDeque<Proceedings>[] poisedBottleneck;
  private int weekSurviving;
  private int existingUrgent;

  public NealOrganizer() {
    this.poisedBottleneck = new ArrayDeque[6];

    for (int i = 0; i < poisedBottleneck.length; i++) {
      poisedBottleneck[i] = new ArrayDeque<>();
    }
    weekSurviving = MonthLarge;
    existingUrgent = 0;
  }

  private Proceedings startForthcomingMechanism() {

    for (int i = 0; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        existingUrgent = i;
        return poisedBottleneck[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < poisedBottleneck.length; i++) {

      if (!poisedBottleneck[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String workspaceForename() {
    return "FB:";
  }

  public void optiBeat() {

    if (presentNegotiations != null) {
      presentNegotiations.placedJettingWhen(presentNegotiations.bringTrackMeter() + 1);
      weekSurviving--;

      if (presentNegotiations.bringTrackMeter() == presentNegotiations.drivePresidentCapacity()) {
        presentNegotiations.doExodusAgain(this.catchRifeCheck());
        this.conductedServe.addLast(presentNegotiations);
        presentNegotiations = null;
        this.ballaBrigade = true;
      }

      if (weekSurviving == 0 && presentNegotiations != null) {

        if (primedIsVacant()) {
          weekSurviving = MonthLarge;
        } else {
          poisedBottleneck[existingUrgent + 1].addLast(presentNegotiations);
          presentNegotiations = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && presentNegotiations == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == 0) {
        this.ballaBrigade = false;
        this.remainderRemoDays = Coordinator.SentYears;
      }

    } else {

      if (presentNegotiations == null && !primedIsVacant()) {
        presentNegotiations = startForthcomingMechanism();
        burdenProcedure(presentNegotiations);
        presentNegotiations.arrangedGoSentence(this.catchRifeCheck());
        weekSurviving = MonthLarge;
      }
    }
  }

  public void treatInfluent(Proceedings operation) {
    poisedBottleneck[0].addLast(operation);
  }
}
