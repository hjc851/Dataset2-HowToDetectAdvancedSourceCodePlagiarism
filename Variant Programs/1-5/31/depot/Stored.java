package depot;

import java.util.HashMap;
import ra.DayCaretaker;
import cultivationBodies.DiamondiferousItems;
import producing.*;
import simulated.Emulation;
import static java.lang.System.out;
import static java.lang.String.format;

public class Stored {
  public static int cacheThrottle = 1;
  public Supplier initial[] = null;
  public int name = 0;

  public synchronized DiamondiferousItems secondComponent() throws WarehouseOpenDeviation {

    if (this.calculate() > 0) {
      DiamondiferousItems dnv = this.storedBlacklist.ejectEldest();
      this.intermediateMatter +=
          ((this.calculate() + 1)
              * (DayCaretaker.underwayYear() - this.netDemonstrationAmount)
              / Emulation.ongoingPretence().weekMinimum());
      double injectedHour = this.directory.remove(dnv);
      double removalPeriod = DayCaretaker.underwayYear();
      this.mediumHours =
          ((mediumHours * castCreations + (removalPeriod - injectedHour)) / ++castCreations);
      for (Supplier leong : initial) {

        if (leong.continuingCanton() == GrowersCanton.blockage) {
          leong.allocate();
          break;
        }
      }
      this.netDemonstrationAmount = (DayCaretaker.underwayYear());
      return dnv;
    } else {
      throw new WarehouseOpenDeviation();
    }
  }

  public static synchronized int memoryCircumscribe() {
    return Stored.cacheThrottle;
  }

  public synchronized String toString() {
    return "Storage" + name;
  }

  public synchronized void extendSubject(DiamondiferousItems objet) throws CachingBroadExemptions {

    if (this.storedBlacklist.indictment() < Stored.cacheThrottle) {
      this.storedBlacklist.addLatter(objet);
      this.intermediateMatter +=
          ((this.calculate() - 1)
              * (DayCaretaker.underwayYear() - this.netDemonstrationAmount)
              / Emulation.ongoingPretence().weekMinimum());
      this.directory.put(objet, DayCaretaker.underwayYear());
      this.netDemonstrationAmount = (DayCaretaker.underwayYear());
      for (Supplier electricity : expected) {

        if (electricity.continuingCanton() == GrowersCanton.dying) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new CachingBroadExemptions();
    }
  }

  public synchronized void fitComing(Supplier... come) {
    this.expected = (come);
  }

  public synchronized int calculate() {
    return this.storedBlacklist.indictment();
  }

  public RoundishJoinedLean<DiamondiferousItems> storedBlacklist = null;
  public HashMap<DiamondiferousItems, Double> directory = null;
  public static int counterbalance = 0;

  public synchronized String indicators() {
    return format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.mediumHours, this.intermediateMatter);
  }

  public Stored() {
    this.storedBlacklist = (new RoundishJoinedLean<DiamondiferousItems>());
    this.directory = (new HashMap<DiamondiferousItems, Double>());
    this.name = (counterbalance++);
    this.mediumHours = (0);
    this.castCreations = (0);
    this.intermediateMatter = (0);
    this.netDemonstrationAmount = (0);
  }

  public double mediumHours = 0.0;

  public synchronized void fixPre(Supplier... premature) {
    this.initial = (premature);
  }

  public Supplier expected[] = null;
  public double castCreations = 0.0;

  public static synchronized void determinedStoredBoundary(int depotLimitation) {

    if (depotLimitation > 0) Stored.cacheThrottle = (depotLimitation);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public double netDemonstrationAmount = 0.0;
  public double intermediateMatter = 0.0;
}
