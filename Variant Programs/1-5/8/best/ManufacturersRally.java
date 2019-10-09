package best;

import metamorphic.HoursAdministrator;
import emitter.Growers;

public class ManufacturersRally extends MeetingAnnals implements Comparable<ManufacturersRally> {
  private static final String synX642String = " chrono: ";
  private static final String synX641String = " info: ";
  private static final String synX640String = "owner: ";
  private static final int synX639int = -1782695110;
  private static final int synX638int = 1985119175;
  private static final int synX637int = 1;
  private static final int synX636int = 0;
  private static final int synX635int = 1;
  private static final double synX634double = 0.6759279297528111;
  public Growers proprietors;
  public static final String SeatRun = "CAN_START";
  public static final String VolitionConclusionObjection = "WILL_FINISH_OBJECT";
  static int pettyIndentured = 1940115298;

  public ManufacturersRally(double hours, String news, Growers occupant) {
    this.meter = hours;
    this.nicky = news;
    this.proprietors = occupant;
  }

  public synchronized int compareTo(ManufacturersRally see) {
    double senateCurb;
    senateCurb = synX634double;

    if (this.meter < see.meter) return synX635int;
    else if (this.meter == see.meter) return synX636int;
    else return -synX637int;
  }

  public synchronized void cycleRace() {
    int reduce;
    reduce = synX638int;
    HoursAdministrator.primedPeriod(this.meter);
    this.proprietors.formalitiesComeDisagree();
  }

  public synchronized String toString() {
    int symbolism;
    symbolism = synX639int;
    return synX640String + proprietors + synX641String + nicky + synX642String + meter;
  }
}
