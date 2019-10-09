package platter;

import maturational.OpportunityCarer;
import presenter.Manufacturer;

public class BreederCeremonies extends platter.ExtravaganzaDisc
    implements java.lang.Comparable<BreederCeremonies> {
  public static final java.lang.String IntendFinalElement = "WILL_FINISH_OBJECT";
  public static final java.lang.String BacksideStartle = "CAN_START";
  private presenter.Manufacturer entrepreneur = null;

  public BreederCeremonies(double beginning, String news, Manufacturer permittee) {
    this.clip = beginning;
    this.intelligence = news;
    this.entrepreneur = permittee;
  }

  public synchronized int compareTo(BreederCeremonies think) {

    if (this.clip < think.clip) return 1;
    else if (this.clip == think.clip) return 0;
    else return -1;
  }

  public synchronized void appendageSymposium() {
    maturational.OpportunityCarer.laidClip(this.clip);
    this.entrepreneur.proceedingsTheOpposes();
  }

  public synchronized String toString() {
    return "owner: " + entrepreneur + " info: " + intelligence + " chrono: " + clip;
  }
}
