package space;

import java.util.HashMap;
import glanced.AgainOfficer;
import factoryRelics.ImmiscibleDisagree;
import maker.*;
import simulated.Experiment;
import static java.lang.System.out;
import static java.lang.String.format;

public class Inventory {
  public static int garageRestricted = 1;
  public static int stem = 0;

  public static synchronized void adjustStowageRestricting(int storingBounds) {

    if (storingBounds > 0) Inventory.garageRestricted = (storingBounds);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int archivingBound() {
    return Inventory.garageRestricted;
  }

  public AnnulatedAffiliatedPlaylist<ImmiscibleDisagree> memoryLean = null;
  public HashMap<ImmiscibleDisagree, Double> glossary = null;
  public Farmer after[] = null;
  public Farmer first[] = null;
  public int name = 0;
  public double normalClip = 0.0;
  public double castCreations = 0.0;
  public double ratesFigures = 0.0;
  public double surviveGatheringHour = 0.0;

  public Inventory() {
    this.memoryLean = (new AnnulatedAffiliatedPlaylist<ImmiscibleDisagree>());
    this.glossary = (new HashMap<ImmiscibleDisagree, Double>());
    this.name = (stem++);
    this.normalClip = (0);
    this.castCreations = (0);
    this.ratesFigures = (0);
    this.surviveGatheringHour = (0);
  }

  public synchronized void arrangeNow(Farmer... then) {
    this.after = (then);
  }

  public synchronized void fitPrior(Farmer... recent) {
    this.first = (recent);
  }

  public synchronized void enhanceParagraph(ImmiscibleDisagree artefact)
      throws WarehousesOverfullExempted {

    if (this.memoryLean.calculation() < Inventory.garageRestricted) {
      this.memoryLean.embeddedParting(artefact);
      this.ratesFigures +=
          (this.ratesFigures
              + (this.numeration() - 1)
                  * (AgainOfficer.presentlyMinutes() - this.surviveGatheringHour)
                  / Experiment.existingExperiment().hoursRestriction());
      this.glossary.put(artefact, AgainOfficer.presentlyMinutes());
      this.surviveGatheringHour = (AgainOfficer.presentlyMinutes());
      for (Farmer spain : after) {

        if (spain.streamSate() == VintnerStatehood.throwback) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new WarehousesOverfullExempted();
    }
  }

  public synchronized ImmiscibleDisagree secondComponent() throws ClosetStrippedDispensation {

    if (this.numeration() > 0) {
      ImmiscibleDisagree montes = this.memoryLean.discardIntroductory();
      this.ratesFigures +=
          (this.ratesFigures
              + (this.numeration() + 1)
                  * (AgainOfficer.presentlyMinutes() - this.surviveGatheringHour)
                  / Experiment.existingExperiment().hoursRestriction());
      double introduceClip = this.glossary.remove(montes);
      double discardYears = AgainOfficer.presentlyMinutes();
      this.normalClip =
          ((normalClip * castCreations + (discardYears - introduceClip)) / ++castCreations);
      for (Farmer electricity : first) {

        if (electricity.streamSate() == VintnerStatehood.hindering) {
          electricity.unlatch();
          break;
        }
      }
      this.surviveGatheringHour = (AgainOfficer.presentlyMinutes());
      return montes;
    } else {
      throw new ClosetStrippedDispensation();
    }
  }

  public synchronized int numeration() {
    return this.memoryLean.calculation();
  }

  public synchronized String toString() {
    return "Storage" + name;
  }

  public synchronized String stats() {
    return format("| %-14s | %-12.11s | %-12.11s  |", this, this.normalClip, this.ratesFigures);
  }
}
