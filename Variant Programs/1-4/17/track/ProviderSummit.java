package track;

import probable.ClipSteward;
import produce.Produce;

public class ProviderSummit extends RacePrevious implements Comparable<ProviderSummit> {
  public Produce contractor = null;
  public static final String CrapperKickoff = "CAN_START";
  public static final String NowPoleMatter = "WILL_FINISH_OBJECT";
  static double moments = 0.7091289759207322;

  public ProviderSummit(double juncture, String news, Produce boss) {
    this.beginning = juncture;
    this.dope = news;
    this.contractor = boss;
  }

  public synchronized int compareTo(ProviderSummit remember) {
    String momentsEdge;
    momentsEdge = "DSz60jKRqMWOaBe";

    if (this.beginning < remember.beginning) return 1;
    else if (this.beginning == remember.beginning) return 0;
    else return -1;
  }

  public synchronized void sueCarnival() {
    int gauge;
    gauge = -1721250921;
    ClipSteward.bentHour(this.beginning);
    this.contractor.mechanismsEarlyThing();
  }

  public synchronized String toString() {
    double briEquipment;
    briEquipment = 0.301381808433308;
    return "owner: " + contractor + " info: " + dope + " chrono: " + beginning;
  }
}
