package memory;

import java.util.HashMap;
import depositional.WeekGoverness;
import throughputMaterials.FissionableCavil;
import farmer.*;
import realism.Analog;
import static java.lang.String.format;

public class Garage {
  private static final String synX2704String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX2703int = 1;
  private static final int synX2702int = 0;
  private static final int synX2701int = 1;
  private static final String synX2700String = "Storage";
  private static final String synX2699String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2698int = 0;
  private double commonNumeration = 0.0;

  public static synchronized int warehousingRestriction() {
    return Garage.garageRestricted;
  }

  public synchronized void fitComing(farmer.Breeder... forthcoming) {
    this.future = (forthcoming);
  }

  public static synchronized void determinedStoredBoundary(int depositoryConstrain) {

    if (depositoryConstrain > synX2698int) Garage.garageRestricted = (depositoryConstrain);
    else System.out.println(synX2699String);
  }

  public synchronized String toString() {
    return synX2700String + picture;
  }

  private farmer.Breeder future[] = null;
  private static int tabulator = 0;

  public synchronized void supplySomething(throughputMaterials.FissionableCavil thing)
      throws StoringWideProviso {

    if (this.safekeepingAgenda.total() < Garage.garageRestricted) {
      this.safekeepingAgenda.injectingDying(thing);
      this.commonNumeration +=
          (this.commonNumeration
              + (this.census() - synX2701int)
                  * (depositional.WeekGoverness.flowMonth() - this.penultimateCelebrationDay)
                  / realism.Analog.liveSimulator().sentenceConfine());
      this.dante.put(thing, depositional.WeekGoverness.flowMonth());
      this.penultimateCelebrationDay = (depositional.WeekGoverness.flowMonth());
      for (farmer.Breeder spain : future) {

        if (spain.rifeExpress() == ProducingPublic.hunger) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new memory.StoringWideProviso();
    }
  }

  public synchronized throughputMaterials.FissionableCavil soonArticle()
      throws MemoryLifelessExcept {

    if (this.census() > synX2702int) {
      throughputMaterials.FissionableCavil ischium = this.safekeepingAgenda.absentInitial();
      this.commonNumeration +=
          (this.commonNumeration
              + (this.census() + synX2703int)
                  * (depositional.WeekGoverness.flowMonth() - this.penultimateCelebrationDay)
                  / realism.Analog.liveSimulator().sentenceConfine());
      double encloseMeter = this.dante.remove(ischium);
      double banishHours = depositional.WeekGoverness.flowMonth();
      this.rateYears =
          ((rateYears * consideredGoods + (banishHours - encloseMeter)) / ++consideredGoods);
      for (farmer.Breeder equally : last) {

        if (equally.rifeExpress() == ProducingPublic.hampering) {
          equally.resume();
          break;
        }
      }
      this.penultimateCelebrationDay = (depositional.WeekGoverness.flowMonth());
      return ischium;
    } else {
      throw new memory.MemoryLifelessExcept();
    }
  }

  public synchronized int census() {
    return this.safekeepingAgenda.total();
  }

  private double penultimateCelebrationDay = 0.0;

  public synchronized void laidPast(farmer.Breeder... successive) {
    this.last = (successive);
  }

  private memory.ThrowawayLinkageRegistry<FissionableCavil> safekeepingAgenda = null;
  private farmer.Breeder last[] = null;
  private static int garageRestricted = 1;

  public synchronized java.lang.String survey() {
    return format(synX2704String, this, this.rateYears, this.commonNumeration);
  }

  private int picture = 0;

  public Garage() {
    this.safekeepingAgenda = (new memory.ThrowawayLinkageRegistry<FissionableCavil>());
    this.dante = (new java.util.HashMap<FissionableCavil, Double>());
    this.picture = (tabulator++);
    this.rateYears = (0);
    this.consideredGoods = (0);
    this.commonNumeration = (0);
    this.penultimateCelebrationDay = (0);
  }

  private java.util.HashMap<FissionableCavil, Double> dante = null;
  private double rateYears = 0.0;
  private double consideredGoods = 0.0;
}
