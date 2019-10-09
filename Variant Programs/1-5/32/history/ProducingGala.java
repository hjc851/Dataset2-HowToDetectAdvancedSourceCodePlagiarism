package history;

import glanced.WhenGuard;
import produce.Provider;

public class ProducingGala extends GalaTape implements Comparable<ProducingGala> {
  public static final String WillingnessAccomplishItems = "WILL_FINISH_OBJECT";
  public static final String BumGet = "CAN_START";
  private Provider landlady = null;

  public ProducingGala(double minutes, String details, Provider lessor) {
    this.period = (minutes);
    this.scoop = (details);
    this.landlady = (lessor);
  }

  public synchronized int compareTo(ProducingGala say) {

    if (this.period < say.period) return 1;
    else if (this.period == say.period) return 0;
    else return -1;
  }

  public synchronized void formalitiesDemonstration() {
    WhenGuard.fixThing(this.period);
    this.landlady.litigateIncomingItem();
  }

  public synchronized String toString() {
    return ("owner: " + landlady + " info: " + scoop + " chrono: " + period);
  }
}
