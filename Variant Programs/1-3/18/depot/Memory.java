package depot;

import java.util.HashMap;
import maturational.WeekGoverness;
import cultivationBodies.TuronianOpposes;
import grower.*;
import simulating.Simulates;

public class Memory {
  public double pastCaseClock;
  public double fairTabulation;
  public double identifiedThings;
  public double modalMonth;
  public int security;
  public grower.Output successive[];
  public grower.Output early[];
  public java.util.HashMap<TuronianOpposes, Double> encyclopaedia;
  public depot.RoundAlignedListings<TuronianOpposes> diskChecklist;
  public static int deflect;
  public static int depositoryConstrain;

  public static synchronized void fixStoreroomReduce(int warehousingRestriction) {

    if (warehousingRestriction > 0) Memory.depositoryConstrain = warehousingRestriction;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int stowageRestricting() {
    return Memory.depositoryConstrain;
  }

  public Memory() {
    this.diskChecklist = new depot.RoundAlignedListings<TuronianOpposes>();
    this.encyclopaedia = new java.util.HashMap<TuronianOpposes, Double>();
    this.security = deflect++;
    this.modalMonth = 0;
    this.identifiedThings = 0;
    this.fairTabulation = 0;
    this.pastCaseClock = 0;
  }

  public synchronized void solidifyingThe(grower.Output... come) {
    this.early = come;
  }

  public synchronized void placedLast(grower.Output... pervious) {
    this.successive = pervious;
  }

  public synchronized void expandTidbit(cultivationBodies.TuronianOpposes objection)
      throws WarehouseHeavyDeviation {

    if (this.diskChecklist.reckon() < Memory.depositoryConstrain) {
      this.diskChecklist.insetWorst(objection);
      this.fairTabulation +=
          (this.tally() - 1)
              * (maturational.WeekGoverness.presentlyMinutes() - this.pastCaseClock)
              / simulating.Simulates.actualPretending().nowRestrictions();
      this.encyclopaedia.put(objection, maturational.WeekGoverness.presentlyMinutes());
      this.pastCaseClock = maturational.WeekGoverness.presentlyMinutes();
      for (grower.Output electricity : early) {

        if (electricity.presentGeneral() == FilmmakerSay.emaciated) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new depot.WarehouseHeavyDeviation();
    }
  }

  public synchronized cultivationBodies.TuronianOpposes soonArticle()
      throws StoreroomPillagedUnless {

    if (this.tally() > 0) {
      cultivationBodies.TuronianOpposes trigonum;
      double enterSentence;
      double hitDay;
      trigonum = this.diskChecklist.installForemost();
      this.fairTabulation +=
          (this.tally() + 1)
              * (maturational.WeekGoverness.presentlyMinutes() - this.pastCaseClock)
              / simulating.Simulates.actualPretending().nowRestrictions();
      enterSentence = this.encyclopaedia.remove(trigonum);
      hitDay = maturational.WeekGoverness.presentlyMinutes();
      this.modalMonth =
          (modalMonth * identifiedThings + (hitDay - enterSentence)) / ++identifiedThings;
      for (grower.Output arsenic : successive) {

        if (arsenic.presentGeneral() == FilmmakerSay.blockading) {
          arsenic.unclog();
          break;
        }
      }
      this.pastCaseClock = maturational.WeekGoverness.presentlyMinutes();
      return trigonum;
    } else {
      throw new depot.StoreroomPillagedUnless();
    }
  }

  public synchronized int tally() {
    return this.diskChecklist.reckon();
  }

  public synchronized String toString() {
    return "Storage" + security;
  }

  public synchronized java.lang.String rda() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.modalMonth, this.fairTabulation);
  }

  static {
    depositoryConstrain = 1;
    deflect = 0;
  }
}
