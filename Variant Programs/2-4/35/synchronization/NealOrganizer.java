package synchronization;

import salesperson.Forwarder;
import synchronization.Spooler;
import synchronization.Serve;
import java.util.ArrayDeque;

public class NealOrganizer extends Spooler {
  public int ongoingAntecedency;
  public int yearStill;
  public ArrayDeque<Serve>[] reluctantGridlock;

  public NealOrganizer() {
    this.reluctantGridlock = new ArrayDeque[6];

    for (int i = 0; i < reluctantGridlock.length; i++) {
      reluctantGridlock[i] = new ArrayDeque<>();
    }
    yearStill = MeterMeasure;
    ongoingAntecedency = 0;
  }

  public synchronized Serve beatTheProceedings() {

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        ongoingAntecedency = i;
        return reluctantGridlock[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String controllerSurname() {
    return "FB:";
  }

  public synchronized void ourTicktack() {

    if (presentNegotiations != null) {
      presentNegotiations.fitSquirtingYear(presentNegotiations.letStreamingHours() + 1);
      yearStill--;

      if (presentNegotiations.letStreamingHours()
          == presentNegotiations.findImplementationSmall()) {
        presentNegotiations.markDeceaseHours(this.fetchPresentRicky());
        this.undergoneMethodologies.addLast(presentNegotiations);
        presentNegotiations = null;
        this.burberryTire = true;
      }

      if (yearStill == 0 && presentNegotiations != null) {

        if (primedIsVacant()) {
          yearStill = MeterMeasure;
        } else {
          reluctantGridlock[ongoingAntecedency + 1].addLast(presentNegotiations);
          presentNegotiations = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && presentNegotiations == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.burberryTire = false;
        this.leftoverMalcolmMeter = Forwarder.SentYears;
      }

    } else {

      if (presentNegotiations == null && !primedIsVacant()) {
        presentNegotiations = beatTheProceedings();
        warheadMethod(presentNegotiations);
        presentNegotiations.determineBegunBeginning(this.fetchPresentRicky());
        yearStill = MeterMeasure;
      }
    }
  }

  public synchronized void summonsInflowing(Serve operation) {
    reluctantGridlock[0].addLast(operation);
  }
}
