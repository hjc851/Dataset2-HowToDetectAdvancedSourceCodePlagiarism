package synchronization;

import salesperson.Forwarder;
import synchronization.Spooler;
import synchronization.Serve;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends Spooler {
  public ArrayDeque<Serve> preppedDragon;

  public DegeneratesDeveloper() {
    this.preppedDragon = new ArrayDeque<>();
  }

  public synchronized String controllerSurname() {
    return "FCFS:";
  }

  public synchronized void ourTicktack() {

    if (presentNegotiations != null) {
      presentNegotiations.fitSquirtingYear(presentNegotiations.letStreamingHours() + 1);

      if (presentNegotiations.letStreamingHours()
          == presentNegotiations.findImplementationSmall()) {
        presentNegotiations.markDeceaseHours(this.fetchPresentRicky());
        this.undergoneMethodologies.addLast(presentNegotiations);
        presentNegotiations = null;
        this.burberryTire = true;
      }
    }

    if (this.burberryTire && presentNegotiations == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.burberryTire = false;
        this.leftoverMalcolmMeter = Forwarder.SentYears;
      }

    } else {

      if (presentNegotiations == null && !preppedDragon.isEmpty()) {
        presentNegotiations = preppedDragon.removeFirst();
        presentNegotiations.determineBegunBeginning(this.fetchPresentRicky());
        warheadMethod(presentNegotiations);
      }
    }
  }

  public synchronized void summonsInflowing(Serve methodology) {
    preppedDragon.addLast(methodology);
  }
}
