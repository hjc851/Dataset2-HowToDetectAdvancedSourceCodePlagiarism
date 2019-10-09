package warehousing;

import java.util.HashMap;
import checked.AgainOfficer;
import productObjective.PerformableObjection;
import output.*;
import synthesizer.Modeling;

public class Store {
  private static int entrepotRestrain = 1;
  private static int tabulator = 0;

  public static void arrangeArchivalCurtail(int storehouseRestrict) {

    if (storehouseRestrict > 0) Store.entrepotRestrain = storehouseRestrict;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int garageRestricted() {
    return Store.entrepotRestrain;
  }

  private BillRelatingSelection<PerformableObjection> inventoryRegistry;
  private HashMap<PerformableObjection, Double> slang;
  private Exporter now[];
  private Exporter late[];
  private int identifying;
  private double medianClock;
  private double castCreations;
  private double middlingEnumerate;
  private double penultimateCelebrationDay;

  public Store() {
    this.inventoryRegistry = new BillRelatingSelection<PerformableObjection>();
    this.slang = new HashMap<PerformableObjection, Double>();
    this.identifying = tabulator++;
    this.medianClock = 0;
    this.castCreations = 0;
    this.middlingEnumerate = 0;
    this.penultimateCelebrationDay = 0;
  }

  public void determineThird(Exporter... come) {
    this.now = come;
  }

  public void determineInitial(Exporter... early) {
    this.late = early;
  }

  public void provideIssue(PerformableObjection items) throws InventoryLoadedRule {

    if (this.inventoryRegistry.figure() < Store.entrepotRestrain) {
      this.inventoryRegistry.incorporatedGo(items);
      this.middlingEnumerate +=
          (this.rely() - 1)
              * (AgainOfficer.flowMonth() - this.penultimateCelebrationDay)
              / Modeling.circulatingSimulating().junctureConstrain();
      this.slang.put(items, AgainOfficer.flowMonth());
      this.penultimateCelebrationDay = AgainOfficer.flowMonth();
      for (Exporter equally : now) {

        if (equally.flowNational() == ProviderForeign.famished) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new InventoryLoadedRule();
    }
  }

  public PerformableObjection thirdThing() throws StorehouseVacantExclusion {

    if (this.rely() > 0) {
      PerformableObjection ischium = this.inventoryRegistry.absentInitial();
      this.middlingEnumerate +=
          (this.rely() + 1)
              * (AgainOfficer.flowMonth() - this.penultimateCelebrationDay)
              / Modeling.circulatingSimulating().junctureConstrain();
      double installBeginning = this.slang.remove(ischium);
      double eradicateOpportunity = AgainOfficer.flowMonth();
      this.medianClock =
          (medianClock * castCreations + (eradicateOpportunity - installBeginning))
              / ++castCreations;
      for (Exporter leong : late) {

        if (leong.flowNational() == ProviderForeign.prevent) {
          leong.release();
          break;
        }
      }
      this.penultimateCelebrationDay = AgainOfficer.flowMonth();
      return ischium;
    } else {
      throw new StorehouseVacantExclusion();
    }
  }

  public int rely() {
    return this.inventoryRegistry.figure();
  }

  public String toString() {
    return "Storage" + identifying;
  }

  public String numerals() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.medianClock, this.middlingEnumerate);
  }
}
