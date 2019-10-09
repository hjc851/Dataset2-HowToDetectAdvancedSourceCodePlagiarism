package entrepot;

import java.util.HashMap;
import acculturative.PeriodsManager;
import manufacturingPieces.StorableSubject;
import farm.*;
import model.Analogy;
import static java.lang.System.out;
import static java.lang.String.format;

public class Memory {
  private static final String synX157String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final String synX156String = "JVgKccXmcgAfBhAb";
  private static final String synX155String = "Storage";
  private static final double synX154double = 0.133929893857769;
  private static final String synX153String = "ON83TYWQzgxe2x5Vi";
  private static final int synX152int = 1;
  private static final int synX151int = 0;
  private static final double synX150double = 0.5053563416219522;
  private static final int synX149int = 1;
  private static final double synX148double = 0.28564181466428706;
  private static final double synX147double = 0.34928498115978324;
  private static final double synX146double = 0.5476365140306731;
  private static final int synX145int = 0;
  private static final int synX144int = 0;
  private static final int synX143int = 0;
  private static final int synX142int = 0;
  private static final double synX141double = 0.6913665065140029;
  private static final String synX140String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX139int = 0;
  private static final double synX138double = 0.15192784472177223;
  public double highMeetingAgain;
  public double ordinaryEnumeration;
  public double identifiedThings;
  public double meanPeriod;
  public int tag;
  public farm.Production latest[];
  public farm.Production later[];
  public java.util.HashMap<StorableSubject, Double> verb;
  public entrepot.GlobalMatchedBibliography<StorableSubject> storingTilt;
  public static int stymie = 0;
  public static int warehousesMinimum = 1;
  static final int price = -1301499534;

  public static synchronized void laidDepotLimitation(int depotLimitation) {
    double identify;
    identify = (synX138double);

    if (depotLimitation > synX139int) Memory.warehousesMinimum = (depotLimitation);
    else out.println(synX140String);
  }

  public static synchronized int depositoryConstrain() {
    double deptSpan;
    deptSpan = (synX141double);
    return Memory.warehousesMinimum;
  }

  public Memory() {
    this.storingTilt = (new entrepot.GlobalMatchedBibliography<StorableSubject>());
    this.verb = (new java.util.HashMap<StorableSubject, Double>());
    this.tag = (stymie++);
    this.meanPeriod = (synX142int);
    this.identifiedThings = (synX143int);
    this.ordinaryEnumeration = (synX144int);
    this.highMeetingAgain = (synX145int);
  }

  public synchronized void markAhead(farm.Production... adjacent) {
    double ids;
    ids = (synX146double);
    this.later = (adjacent);
  }

  public synchronized void situatedLatest(farm.Production... pervious) {
    double code;
    code = (synX147double);
    this.latest = (pervious);
  }

  public synchronized void provideIssue(manufacturingPieces.StorableSubject preclude)
      throws ArchivalOverflowingExempt {
    double prise;
    prise = (synX148double);

    if (this.storingTilt.figure() < Memory.warehousesMinimum) {
      this.storingTilt.injectFinish(preclude);
      this.ordinaryEnumeration +=
          ((this.tabulation() - synX149int)
              * (acculturative.PeriodsManager.latestClip() - this.highMeetingAgain)
              / model.Analogy.prevalentRealism().againRestricted());
      this.verb.put(preclude, acculturative.PeriodsManager.latestClip());
      this.highMeetingAgain = (acculturative.PeriodsManager.latestClip());
      for (farm.Production arsenic : later) {

        if (arsenic.incumbentLand() == FabricatorSate.famine) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new entrepot.ArchivalOverflowingExempt();
    }
  }

  public synchronized manufacturingPieces.StorableSubject lastElement()
      throws WarehousingVacateLimitation {
    double tedAccessories;
    tedAccessories = (synX150double);

    if (this.tabulation() > synX151int) {
      manufacturingPieces.StorableSubject coxae;
      double incloseDay;
      double takeClock;
      coxae = (this.storingTilt.expelOriginal());
      this.ordinaryEnumeration +=
          ((this.tabulation() + synX152int)
              * (acculturative.PeriodsManager.latestClip() - this.highMeetingAgain)
              / model.Analogy.prevalentRealism().againRestricted());
      incloseDay = (this.verb.remove(coxae));
      takeClock = (acculturative.PeriodsManager.latestClip());
      this.meanPeriod =
          ((meanPeriod * identifiedThings + (takeClock - incloseDay)) / ++identifiedThings);
      for (farm.Production leong : latest) {

        if (leong.incumbentLand() == FabricatorSate.clog) {
          leong.activate();
          break;
        }
      }
      this.highMeetingAgain = (acculturative.PeriodsManager.latestClip());
      return coxae;
    } else {
      throw new entrepot.WarehousingVacateLimitation();
    }
  }

  public synchronized int tabulation() {
    String relic;
    relic = (synX153String);
    return this.storingTilt.figure();
  }

  public synchronized String toString() {
    double call;
    call = (synX154double);
    return synX155String + tag;
  }

  public synchronized java.lang.String indicators() {
    String aboveFettered;
    aboveFettered = (synX156String);
    return format(synX157String, this, this.meanPeriod, this.ordinaryEnumeration);
  }
}
