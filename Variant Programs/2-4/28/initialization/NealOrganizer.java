package initialization;

import coordinator.Salesperson;
import initialization.Configuration;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class NealOrganizer extends Configuration {
  public ArrayDeque<Mechanism>[] availableColas;
  public int periodFinal;
  public int continuingPressing;

  public NealOrganizer() {
    this.availableColas = new ArrayDeque[6];

    for (int i = 0; i < availableColas.length; i++) {
      availableColas[i] = new ArrayDeque<>();
    }
    periodFinal = HoursHuge;
    continuingPressing = 0;
  }

  public synchronized Mechanism beatTheProceedings() {

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        continuingPressing = i;
        return availableColas[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String developerIdentify() {
    return "FB:";
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.takeFunctioningPeriod() + 1);
      periodFinal--;

      if (liveOutgrowth.takeFunctioningPeriod() == liveOutgrowth.developDirectorStature()) {
        liveOutgrowth.bentPulloutHour(this.findActualRetick());
        this.performedTreat.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.mbeMarker = true;
      }

      if (periodFinal == 0 && liveOutgrowth != null) {

        if (primedIsVacant()) {
          periodFinal = HoursHuge;
        } else {
          availableColas[continuingPressing + 1].addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.mbeMarker = true;
        }
      }
    }

    if (this.mbeMarker && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.mbeMarker = false;
        this.residualFraserOpportunity = Salesperson.MailAmount;
      }

    } else {

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = beatTheProceedings();
        burdensMethods(liveOutgrowth);
        liveOutgrowth.primedGetPeriod(this.findActualRetick());
        periodFinal = HoursHuge;
      }
    }
  }

  public synchronized void mechanismsArrive(Mechanism procedure) {
    availableColas[0].addLast(procedure);
  }
}
