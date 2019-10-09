package depository;

import java.util.HashMap;
import indiscernible.MomentSitter;
import producedItems.MinableOppose;
import fabricator.*;
import experiment.Analog;
import static java.lang.String.format;

public class Warehousing {
  private static int safekeepingCurb = 0;
  private static int foil = 0;

  public static synchronized void layEntrepotRestrain(int storedBoundary) {

    if (storedBoundary > 0) Warehousing.safekeepingCurb = storedBoundary;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int storehouseRestrict() {
    return Warehousing.safekeepingCurb;
  }

  private depository.OrbicularRelatedTilt<MinableOppose> memoryLean = null;
  private java.util.HashMap<MinableOppose, Double> diccionario = null;
  private fabricator.Grower then[] = null;
  private fabricator.Grower preliminary[] = null;
  private int handle = 0;
  private double ordinaryDay = 0.0;
  private double accountedArtifacts = 0.0;
  private double normWeigh = 0.0;
  private double goRallyThing = 0.0;

  public Warehousing() {
    this.memoryLean = new depository.OrbicularRelatedTilt<MinableOppose>();
    this.diccionario = new java.util.HashMap<MinableOppose, Double>();
    this.handle = foil++;
    this.ordinaryDay = 0;
    this.accountedArtifacts = 0;
    this.normWeigh = 0;
    this.goRallyThing = 0;
  }

  public synchronized void doEarly(fabricator.Grower... future) {
    this.then = future;
  }

  public synchronized void fixPre(fabricator.Grower... recent) {
    this.preliminary = recent;
  }

  public synchronized void extendSubject(producedItems.MinableOppose objection)
      throws SpaceChockfulWaiver {

    if (this.memoryLean.reckon() < Warehousing.safekeepingCurb) {
      this.memoryLean.attachLowest(objection);
      this.normWeigh +=
          this.normWeigh
              + (this.charge() - 1)
                  * (indiscernible.MomentSitter.presentBeginning() - this.goRallyThing)
                  / experiment.Analog.ongoingPretence().sentenceConfine();
      this.diccionario.put(objection, indiscernible.MomentSitter.presentBeginning());
      this.goRallyThing = indiscernible.MomentSitter.presentBeginning();
      for (fabricator.Grower arsenic : then) {

        if (arsenic.presentGeneral() == FilmmakerSay.famished) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new depository.SpaceChockfulWaiver();
    }
  }

  public synchronized producedItems.MinableOppose adjacentArtifact() throws WarehouseOpenDeviation {

    if (this.charge() > 0) {
      producedItems.MinableOppose coccyx = this.memoryLean.hitTop();
      this.normWeigh +=
          this.normWeigh
              + (this.charge() + 1)
                  * (indiscernible.MomentSitter.presentBeginning() - this.goRallyThing)
                  / experiment.Analog.ongoingPretence().sentenceConfine();
      double tuckClock = this.diccionario.remove(coccyx);
      double murderDays = indiscernible.MomentSitter.presentBeginning();
      this.ordinaryDay =
          (ordinaryDay * accountedArtifacts + (murderDays - tuckClock)) / ++accountedArtifacts;
      for (fabricator.Grower leong : preliminary) {

        if (leong.presentGeneral() == FilmmakerSay.stopping) {
          leong.unclog();
          break;
        }
      }
      this.goRallyThing = indiscernible.MomentSitter.presentBeginning();
      return coccyx;
    } else {
      throw new depository.WarehouseOpenDeviation();
    }
  }

  public synchronized int charge() {
    return this.memoryLean.reckon();
  }

  public synchronized String toString() {
    return "Storage" + handle;
  }

  public synchronized java.lang.String stats() {
    return format("| %-14s | %-12.11s | %-12.11s  |", this, this.ordinaryDay, this.normWeigh);
  }

  static {
    safekeepingCurb = 1;
    foil = 0;
  }
}
