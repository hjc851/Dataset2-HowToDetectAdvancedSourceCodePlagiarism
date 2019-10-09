package depot;

import java.util.HashMap;
import glanced.JunctureJailer;
import supplyArtefact.TuronianOpposes;
import produce.*;
import simulated.Simulator;

public class Garage {
  private static int cachingRestrictions = 1;
  private static int against = 0;

  public static void laidDepotLimitation(int stowageRestricting) {

    if (stowageRestricting > 0) Garage.cachingRestrictions = stowageRestricting;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int storingBounds() {
    return Garage.cachingRestrictions;
  }

  private FlierAttributedShortlist<TuronianOpposes> closetCatalog;
  private HashMap<TuronianOpposes, Double> dante;
  private Manufacturers expected[];
  private Manufacturers initial[];
  private int handle;
  private double proportionBeginning;
  private double registeredTarget;
  private double normalNumber;
  private double concludingSeminarMonth;

  public Garage() {
    this.closetCatalog = new FlierAttributedShortlist<TuronianOpposes>();
    this.dante = new HashMap<TuronianOpposes, Double>();
    this.handle = against++;
    this.proportionBeginning = 0;
    this.registeredTarget = 0;
    this.normalNumber = 0;
    this.concludingSeminarMonth = 0;
  }

  public void laidFollowing(Manufacturers... soon) {
    this.expected = soon;
  }

  public void orderedRecord(Manufacturers... earlier) {
    this.initial = earlier;
  }

  public void extendSubject(TuronianOpposes oppose) throws SafekeepingGoodDerogate {

    if (this.closetCatalog.matter() < Garage.cachingRestrictions) {
      this.closetCatalog.addLatter(oppose);
      this.normalNumber +=
          (this.recount() - 1)
              * (JunctureJailer.theOpportunity() - this.concludingSeminarMonth)
              / Simulator.prevailingModel().whenThrottle();
      this.dante.put(oppose, JunctureJailer.theOpportunity());
      this.concludingSeminarMonth = JunctureJailer.theOpportunity();
      for (Manufacturers leong : expected) {

        if (leong.existingSovereign() == OutputFederal.underfed) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new SafekeepingGoodDerogate();
    }
  }

  public TuronianOpposes laterGoods() throws StoredVacuousExemption {

    if (this.recount() > 0) {
      TuronianOpposes trapezium = this.closetCatalog.undoBasic();
      this.normalNumber +=
          (this.recount() + 1)
              * (JunctureJailer.theOpportunity() - this.concludingSeminarMonth)
              / Simulator.prevailingModel().whenThrottle();
      double injectingOpportunity = this.dante.remove(trapezium);
      double takeClock = JunctureJailer.theOpportunity();
      this.proportionBeginning =
          (proportionBeginning * registeredTarget + (takeClock - injectingOpportunity))
              / ++registeredTarget;
      for (Manufacturers equally : initial) {

        if (equally.existingSovereign() == OutputFederal.disrupting) {
          equally.reactivate();
          break;
        }
      }
      this.concludingSeminarMonth = JunctureJailer.theOpportunity();
      return trapezium;
    } else {
      throw new StoredVacuousExemption();
    }
  }

  public int recount() {
    return this.closetCatalog.matter();
  }

  public String toString() {
    return "Storage" + handle;
  }

  public String numerals() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.proportionBeginning, this.normalNumber);
  }
}
