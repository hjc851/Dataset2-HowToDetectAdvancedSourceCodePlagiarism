package developer;

import starter.Trainmaster;
import developer.Controller;
import developer.Act;
import java.util.ArrayDeque;

public class DcSpreadsheet extends developer.Controller {
  public ArrayDeque<Act>[] promptCode;
  public int hoursRetaining;
  public int continuingPressing;

  public DcSpreadsheet() {
    this.promptCode = new java.util.ArrayDeque[6];

    for (int i = 0; i < promptCode.length; i++) synx646(i);
    hoursRetaining = MinutesEnormous;
    continuingPressing = 0;
  }

  public synchronized developer.Act becomeAfterMethodology() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        continuingPressing = i;
        return promptCode[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String plannerNominate() {
    return "FB:";
  }

  public synchronized void optiBeat() {

    if (rifeSue != null) synx647();

    if (this.remoSag && rifeSue == null) synx648();
    else synx649();
  }

  public synchronized void methodologyArrival(Act operation) {
    promptCode[0].addLast(operation);
  }

  private synchronized void synx647() {
    rifeSue.solidifyingRollingJuncture(rifeSue.haveSpoutingPeriods() + 1);
    hoursRetaining--;

    if (rifeSue.haveSpoutingPeriods() == rifeSue.drawBossScope()) {
      rifeSue.determinedGoingDays(this.fetchPresentRicky());
      this.carriedMechanism.addLast(rifeSue);
      rifeSue = null;
      this.remoSag = true;
    }

    if (hoursRetaining == 0 && rifeSue != null) {

      if (primedIsVacant()) {
        hoursRetaining = MinutesEnormous;
      } else {
        promptCode[continuingPressing + 1].addLast(rifeSue);
        rifeSue = null;
        this.remoSag = true;
      }
    }
  }

  private synchronized void synx648() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.remoSag = false;
      this.retainingFellyHours = Trainmaster.CommuniqueMeter;
    }
  }

  private synchronized void synx649() {

    if (rifeSue == null && !primedIsVacant()) {
      rifeSue = becomeAfterMethodology();
      onusServe(rifeSue);
      rifeSue.putBeginClock(this.fetchPresentRicky());
      hoursRetaining = MinutesEnormous;
    }
  }
}
