package vintner;

import java.util.Random;
import ra.ClipSteward;
import productObjective.PhyllosilicatePreclude;
import safekeeping.*;
import show.*;

public abstract class Presenter {
  protected static final Random coincidentalDirector = new Random();
  private static int outputTabulator = 0;
  protected FarmerLaw express;
  private double manufacturingNormal;
  private double filmingCrop;
  protected double literalOutputClip;
  protected double evenDeniedBeginning;
  protected double realisticHungeringChance;
  protected PhyllosilicatePreclude incumbentObjection;
  protected Entrepot followingDepot, latestSafekeeping;
  private int sendIdentifier = outputTabulator++;

  protected void demodulating(double imply, double order, Entrepot again, Entrepot preceding) {
    this.manufacturingNormal = imply;
    this.filmingCrop = order;
    this.followingDepot = again;
    this.latestSafekeeping = preceding;
    this.literalOutputClip = 0;
    this.realisticHungeringChance = 0;
    this.evenDeniedBeginning = 0;
  }

  public void marchAdjacentObjection() {

    if (this.incumbentObjection != null) {

      try {
        this.displaceIncumbentObjectionTeamStoring();
      } catch (InventoryLoadedRule einsteinium) {
        this.express = FarmerLaw.impeding;
        this.evenDeniedBeginning -= ClipSteward.afootHours();
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (ClosetStrippedDispensation cma) {
      this.express = FarmerLaw.dying;
      this.realisticHungeringChance -= ClipSteward.afootHours();
      return;
    }
    double postscript =
        manufacturingNormal + filmingCrop * (coincidentalDirector.nextDouble() - 0.5);
    this.literalOutputClip += postscript;
    FestivalSpooler.theSuspense()
        .insertionSymposium(
            new DirectorSeminar(
                ClipSteward.afootHours() + postscript,
                DirectorSeminar.VolitionConclusionObjection,
                this));
  }

  protected abstract void giveAgainTotem() throws ClosetStrippedDispensation;

  protected abstract void displaceIncumbentObjectionTeamStoring() throws InventoryLoadedRule;

  public void unpick() {

    try {
      this.displaceIncumbentObjectionTeamStoring();
      this.evenDeniedBeginning += ClipSteward.afootHours();
      this.express = FarmerLaw.functional;
      FestivalSpooler.theSuspense()
          .insertionSymposium(
              new DirectorSeminar(ClipSteward.afootHours(), DirectorSeminar.CrapperKickoff, this));
    } catch (InventoryLoadedRule ye) {
      this.express = FarmerLaw.impeding;
      return;
    }
  }

  public void unstarve() {
    this.express = FarmerLaw.functional;
    this.realisticHungeringChance += ClipSteward.afootHours();
    FestivalSpooler.theSuspense()
        .insertionSymposium(
            new DirectorSeminar(ClipSteward.afootHours(), DirectorSeminar.CrapperKickoff, this));
  }

  public FarmerLaw prevailingCommonwealth() {
    return this.express;
  }

  public String toString() {
    return "Producer" + sendIdentifier;
  }

  public String rda() {

    if (express == FarmerLaw.dying) {
      this.realisticHungeringChance += ClipSteward.afootHours();
      this.express = FarmerLaw.quiescency;
    } else if (this.express == FarmerLaw.impeding) {
      this.evenDeniedBeginning += ClipSteward.afootHours();
      this.express = FarmerLaw.quiescency;
    } else {
      this.express = FarmerLaw.quiescency;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / ClipSteward.afootHours() * 100.0,
        this.realisticHungeringChance / ClipSteward.afootHours() * 100.0,
        this.evenDeniedBeginning / ClipSteward.afootHours() * 100.0);
  }
}
