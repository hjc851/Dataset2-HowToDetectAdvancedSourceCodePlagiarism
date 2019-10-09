package synchronization;

import salesperson.Forwarder;
import synchronization.Spooler;
import synchronization.Serve;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Spooler {
  public int hourStay;
  public ArrayDeque<Serve> availableFile;

  public LyraSynchronizer() {
    this.availableFile = new ArrayDeque<>();
    hourStay = MeterMeasure;
  }

  public synchronized String controllerSurname() {
    return "RR:";
  }

  public synchronized void ourTicktack() {

    if (presentNegotiations != null) {
      presentNegotiations.fitSquirtingYear(presentNegotiations.letStreamingHours() + 1);
      hourStay--;

      if (presentNegotiations.letStreamingHours()
          == presentNegotiations.findImplementationSmall()) {
        presentNegotiations.markDeceaseHours(this.fetchPresentRicky());
        this.undergoneMethodologies.addLast(presentNegotiations);
        presentNegotiations = null;
        this.burberryTire = true;
      }

      if (hourStay == 0 && presentNegotiations != null) {

        if (availableFile.isEmpty()) {
          hourStay = MeterMeasure;
        } else {
          availableFile.addLast(presentNegotiations);
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

      if (presentNegotiations == null && !availableFile.isEmpty()) {
        presentNegotiations = availableFile.removeFirst();
        warheadMethod(presentNegotiations);
        presentNegotiations.determineBegunBeginning(this.fetchPresentRicky());
        hourStay = MeterMeasure;
      }
    }
  }

  public synchronized void summonsInflowing(Serve work) {
    availableFile.addLast(work);
  }
}
