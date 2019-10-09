package presenter;

import java.util.Random;
import ra.NowDoorman;
import producersArtifacts.EvaporiteDemur;
import stored.*;
import immortalize.*;

public abstract class Production {
  protected static final Random capriciousVintner = new Random();
  private static int vintnerNegate = 0;
  protected GrowerTell central;
  private double cultivationHateful;
  private double producesPasture;
  protected double definitiveDevelopmentYears;
  protected double substantialParalyzedAgain;
  protected double substantialShriveledAgain;
  protected EvaporiteDemur liveArtefact;
  protected Shelving earlyGarage, predecessorInventory;
  private int radioEst = vintnerNegate++;

  protected void inputted(double skilled, double wander, Shelving then, Shelving past) {
    this.cultivationHateful = skilled;
    this.producesPasture = wander;
    this.earlyGarage = then;
    this.predecessorInventory = past;
    this.definitiveDevelopmentYears = 0;
    this.substantialShriveledAgain = 0;
    this.substantialParalyzedAgain = 0;
  }

  public void operationFollowingTarget() {

    if (this.liveArtefact != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (WarehousingHighLimitation ej) {
        this.central = GrowerTell.blockades;
        this.substantialParalyzedAgain -= NowDoorman.existingYears();
        return;
      }
    }

    try {
      this.encounterUpcomingCavil();
    } catch (DiskRansackedObjection einsteinium) {
      this.central = GrowerTell.orphaned;
      this.substantialShriveledAgain -= NowDoorman.existingYears();
      return;
    }
    double writes = cultivationHateful + producesPasture * (capriciousVintner.nextDouble() - 0.5);
    this.definitiveDevelopmentYears += writes;
    GalaLine.afootFile()
        .embeddedExposition(
            new ProduceTriathlon(
                NowDoorman.existingYears() + writes, ProduceTriathlon.TestamentLastItem, this));
  }

  protected abstract void encounterUpcomingCavil() throws DiskRansackedObjection;

  protected abstract void pushExistingPurposeOfficesArchival() throws WarehousingHighLimitation;

  public void unstick() {

    try {
      this.pushExistingPurposeOfficesArchival();
      this.substantialParalyzedAgain += NowDoorman.existingYears();
      this.central = GrowerTell.collaborate;
      GalaLine.afootFile()
          .embeddedExposition(
              new ProduceTriathlon(NowDoorman.existingYears(), ProduceTriathlon.ArseJump, this));
    } catch (WarehousingHighLimitation ye) {
      this.central = GrowerTell.blockades;
      return;
    }
  }

  public void unstarve() {
    this.central = GrowerTell.collaborate;
    this.substantialShriveledAgain += NowDoorman.existingYears();
    GalaLine.afootFile()
        .embeddedExposition(
            new ProduceTriathlon(NowDoorman.existingYears(), ProduceTriathlon.ArseJump, this));
  }

  public GrowerTell liveSay() {
    return this.central;
  }

  public String toString() {
    return "Producer" + radioEst;
  }

  public String agency() {

    if (central == GrowerTell.orphaned) {
      this.substantialShriveledAgain += NowDoorman.existingYears();
      this.central = GrowerTell.diaper;
    } else if (this.central == GrowerTell.blockades) {
      this.substantialParalyzedAgain += NowDoorman.existingYears();
      this.central = GrowerTell.diaper;
    } else {
      this.central = GrowerTell.diaper;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.definitiveDevelopmentYears / NowDoorman.existingYears() * 100.0,
        this.substantialShriveledAgain / NowDoorman.existingYears() * 100.0,
        this.substantialParalyzedAgain / NowDoorman.existingYears() * 100.0);
  }
}
