package immortalize;

import checked.WhenGuard;
import provider.Exporter;

public class VintnerGathering extends CeremoniesLedger implements Comparable<VintnerGathering> {
  static double dept = 0.44369542156466235;
  public static final String WilFinisArtefact = "WILL_FINISH_OBJECT";
  public static final String FannyBegun = "CAN_START";
  private Exporter landowner;

  public VintnerGathering(double juncture, String intelligence, Exporter ownership) {
    this.opportunity = juncture;
    this.scuttlebutt = intelligence;
    this.landowner = ownership;
  }

  public synchronized int compareTo(VintnerGathering ensure) {
    double widening = 0.0323963768864699;

    if (this.opportunity < ensure.opportunity) return 1;
    else if (this.opportunity == ensure.opportunity) return 0;
    else return -1;
  }

  public synchronized void methodologySpectacle() {
    double reesPurchases = 0.0522137775992364;
    WhenGuard.primedPeriod(this.opportunity);
    this.landowner.phaseSoonBody();
  }

  public synchronized String toString() {
    double flag = 0.7896893535795986;
    return "owner: " + landowner + " info: " + scuttlebutt + " chrono: " + opportunity;
  }
}
