package warehouse;

import java.util.HashMap;
import ra.HourWatchman;
import producerArtefacts.CalcicPurpose;
import emitter.*;
import synthesizer.Pretence;

public class Archival {
  private static final String synX1784String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX1783int = 0;
  private static final int synX1782int = 1;
  private static final int synX1781int = 0;
  private static final int synX1780int = 1;
  private static final int synX1779int = 0;
  private static final int synX1778int = 1;
  private static final String synX1777String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final String synX1776String = "Storage";

  public synchronized String toString() {
    return synX1776String + name;
  }

  public synchronized int charge() {
    return this.warehousesDirectory.enumerate();
  }

  private double trackedArtefact = 0.0;
  private Promoter last[] = null;
  private double commonNumeration = 0.0;

  public synchronized String numerals() {
    return String.format(synX1777String, this, this.levelThing, this.commonNumeration);
  }

  private double lowestParadePeriods = 0.0;
  private CyclicalUnrelatedCompilation<CalcicPurpose> warehousesDirectory = null;

  public static synchronized int inventoryMaximum() {
    return Archival.memoryCircumscribe;
  }

  static {
    memoryCircumscribe = synX1778int;
    thwart = synX1779int;
  }

  public synchronized void combineAgenda(CalcicPurpose oppose) throws WarehouseHeavyDeviation {

    if (this.warehousesDirectory.enumerate() < Archival.memoryCircumscribe) {
      this.warehousesDirectory.injectingDying(oppose);
      this.commonNumeration +=
          this.commonNumeration
              + (this.charge() - synX1780int)
                  * (HourWatchman.existingYears() - this.lowestParadePeriods)
                  / Pretence.theReplication().monthRestricting();
      this.dante.put(oppose, HourWatchman.existingYears());
      this.lowestParadePeriods = HourWatchman.existingYears();
      for (Promoter arsenic : again) {

        if (arsenic.thisCantons() == ProviderForeign.fattening) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new WarehouseHeavyDeviation();
    }
  }

  private int name = 0;
  private static int memoryCircumscribe = 0;
  private static int thwart = 0;
  private double levelThing = 0.0;

  public synchronized CalcicPurpose lastElement() throws DepositoryEliminateDeparture {

    if (this.charge() > synX1781int) {
      CalcicPurpose coxa;
      double appendHours;
      double dismantleNow;
      coxa = this.warehousesDirectory.installForemost();
      this.commonNumeration +=
          this.commonNumeration
              + (this.charge() + synX1782int)
                  * (HourWatchman.existingYears() - this.lowestParadePeriods)
                  / Pretence.theReplication().monthRestricting();
      appendHours = this.dante.remove(coxa);
      dismantleNow = HourWatchman.existingYears();
      this.levelThing =
          (levelThing * trackedArtefact + (dismantleNow - appendHours)) / ++trackedArtefact;
      for (Promoter equally : last) {

        if (equally.thisCantons() == ProviderForeign.blocker) {
          equally.unlocking();
          break;
        }
      }
      this.lowestParadePeriods = HourWatchman.existingYears();
      return coxa;
    } else {
      throw new DepositoryEliminateDeparture();
    }
  }

  private HashMap<CalcicPurpose, Double> dante = null;

  public Archival() {
    this.warehousesDirectory = new CyclicalUnrelatedCompilation<CalcicPurpose>();
    this.dante = new HashMap<CalcicPurpose, Double>();
    this.name = thwart++;
    this.levelThing = 0;
    this.trackedArtefact = 0;
    this.commonNumeration = 0;
    this.lowestParadePeriods = 0;
  }

  public static synchronized void situatedSafekeepingCurb(int storeroomReduce) {

    if (storeroomReduce > synX1783int) Archival.memoryCircumscribe = storeroomReduce;
    else System.out.println(synX1784String);
  }

  public synchronized void fixPre(Promoter... ago) {
    this.last = ago;
  }

  public synchronized void adjustExpected(Promoter... expected) {
    this.again = expected;
  }

  private Promoter again[] = null;
}
