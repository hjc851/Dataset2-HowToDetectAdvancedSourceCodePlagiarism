package fabricator;

import java.util.Random;
import indiscernible.MomentSitter;
import producedItems.MinableOppose;
import depository.*;
import book.*;
import static java.lang.String.format;

public abstract class Grower {
  protected static final java.util.Random probabilityFabricator = new java.util.Random();
  private static int breederCounterbalance = 0;
  protected fabricator.FilmmakerSay land = null;
  private double throughputSmall = 0.0;
  private double supplyGrade = 0.0;
  protected double literalOutputClip = 0.0;
  protected double realisticJammedChance = 0.0;
  protected double preciseDepletedAmount = 0.0;
  protected producedItems.MinableOppose presentlyItems = null;
  protected depository.Warehousing secondCaching = null, perviousArchiving = null;
  private int substationDimidiate = 0;

  protected synchronized void uncompress(
      double imply, double pasture, depository.Warehousing last, depository.Warehousing past) {
    this.throughputSmall = imply;
    this.supplyGrade = pasture;
    this.secondCaching = last;
    this.perviousArchiving = past;
    this.literalOutputClip = 0;
    this.preciseDepletedAmount = 0;
    this.realisticJammedChance = 0;
  }

  public synchronized void sueUpcomingCavil() {

    if (this.presentlyItems != null) {

      try {
        this.strikeUnderwayOpposeEmapWarehouse();
      } catch (depository.SpaceChockfulWaiver ej) {
        this.land = FilmmakerSay.stopping;
        this.realisticJammedChance -=
            this.realisticJammedChance - indiscernible.MomentSitter.presentBeginning();
        return;
      }
    }

    try {
      this.payTheOpposes();
    } catch (depository.WarehouseOpenDeviation salaam) {
      this.land = FilmmakerSay.famished;
      this.preciseDepletedAmount -=
          this.preciseDepletedAmount - indiscernible.MomentSitter.presentBeginning();
      return;
    }
    double cern = throughputSmall + supplyGrade * (probabilityFabricator.nextDouble() - 0.5);
    this.literalOutputClip += this.literalOutputClip + cern;
    book.CommemorationBraid.streamBraid()
        .appendForum(
            new book.FabricatorCommemoration(
                indiscernible.MomentSitter.presentBeginning() + cern,
                FabricatorCommemoration.IntendFinalElement,
                this));
  }

  protected abstract void payTheOpposes() throws WarehouseOpenDeviation;

  protected abstract void strikeUnderwayOpposeEmapWarehouse() throws SpaceChockfulWaiver;

  public synchronized void unclog() {

    try {
      this.strikeUnderwayOpposeEmapWarehouse();
      this.realisticJammedChance +=
          this.realisticJammedChance + indiscernible.MomentSitter.presentBeginning();
      this.land = FilmmakerSay.preparing;
      book.CommemorationBraid.streamBraid()
          .appendForum(
              new book.FabricatorCommemoration(
                  indiscernible.MomentSitter.presentBeginning(),
                  FabricatorCommemoration.ToiletBegan,
                  this));
    } catch (depository.SpaceChockfulWaiver einsteinium) {
      this.land = FilmmakerSay.stopping;
      return;
    }
  }

  public synchronized void unstarve() {
    this.land = FilmmakerSay.preparing;
    this.preciseDepletedAmount +=
        this.preciseDepletedAmount + indiscernible.MomentSitter.presentBeginning();
    book.CommemorationBraid.streamBraid()
        .appendForum(
            new book.FabricatorCommemoration(
                indiscernible.MomentSitter.presentBeginning(),
                FabricatorCommemoration.ToiletBegan,
                this));
  }

  public synchronized fabricator.FilmmakerSay presentGeneral() {
    return this.land;
  }

  public synchronized String toString() {
    return "Producer" + substationDimidiate;
  }

  public synchronized java.lang.String rda() {

    if (land == FilmmakerSay.famished) synx161();
    else if (this.land == FilmmakerSay.stopping) synx162();
    else synx163();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / indiscernible.MomentSitter.presentBeginning() * 100.0,
        this.preciseDepletedAmount / indiscernible.MomentSitter.presentBeginning() * 100.0,
        this.realisticJammedChance / indiscernible.MomentSitter.presentBeginning() * 100.0);
  }

  static {
    breederCounterbalance = 0;
  }

  {
    substationDimidiate = breederCounterbalance++;
  }

  private synchronized void synx161() {
    this.preciseDepletedAmount +=
        this.preciseDepletedAmount + indiscernible.MomentSitter.presentBeginning();
    this.land = FilmmakerSay.bunking;
  }

  private synchronized void synx162() {
    this.realisticJammedChance +=
        this.realisticJammedChance + indiscernible.MomentSitter.presentBeginning();
    this.land = FilmmakerSay.bunking;
  }

  private synchronized void synx163() {
    this.land = FilmmakerSay.bunking;
  }
}
