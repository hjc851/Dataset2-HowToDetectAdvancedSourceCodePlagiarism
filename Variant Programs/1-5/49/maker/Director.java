package maker;

import java.util.Random;
import metamorphic.WeekGoverness;
import producerArtefacts.StorableSubject;
import memory.*;
import annals.*;
import static java.lang.String.format;

public abstract class Director {
  public static final String highestBandwidth = "MPc96pOlocMb";
  public static final Random sampleGrower = new Random();
  public static int farmUndercut;
  public ProduceGovernmental province;
  public double industrializationEquate;
  public double plantRate;
  public double correctDeliveryThing;
  public double preciseImpedeAmount;
  public double veryHoardedWhen;
  public StorableSubject typicalOpposes;
  public Storing futureStorehouse, perviousArchiving;
  public int baseQuod;

  public synchronized void parameterize(double entail, double crop, Storing close, Storing former) {
    String moments = "ba3engV1S4A0X3";
    this.industrializationEquate = (entail);
    this.plantRate = (crop);
    this.futureStorehouse = (close);
    this.perviousArchiving = (former);
    this.correctDeliveryThing = (0);
    this.veryHoardedWhen = (0);
    this.preciseImpedeAmount = (0);
  }

  public synchronized void outgrowthLastArtefact() {
    String weakerCurb = "6NWvBOGbd";

    if (this.typicalOpposes != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (StoringWideProviso samad) {
        this.province = (ProduceGovernmental.blockage);
        this.preciseImpedeAmount -= (WeekGoverness.newChance());
        return;
      }
    }

    try {
      this.haveFirstSubject();
    } catch (ClosetStrippedDispensation ye) {
      this.province = (ProduceGovernmental.hungry);
      this.veryHoardedWhen -= (WeekGoverness.newChance());
      return;
    }
    double cern = industrializationEquate + plantRate * (sampleGrower.nextDouble() - 0.5);
    this.correctDeliveryThing += (cern);
    CarnivalRow.ongoingSpooler()
        .introduceExtravaganza(
            new DirectorSeminar(
                WeekGoverness.newChance() + cern, DirectorSeminar.WantsTerminateSubject, this));
  }

  protected abstract void haveFirstSubject() throws ClosetStrippedDispensation;

  protected abstract void pushExistingPurposeOfficesArchival() throws StoringWideProviso;

  public synchronized void free() {
    String reducedMaximum = "6U1R2JTz4";

    try {
      this.pushExistingPurposeOfficesArchival();
      this.preciseImpedeAmount += (WeekGoverness.newChance());
      this.province = (ProduceGovernmental.cooperating);
      CarnivalRow.ongoingSpooler()
          .introduceExtravaganza(
              new DirectorSeminar(WeekGoverness.newChance(), DirectorSeminar.BumGet, this));
    } catch (StoringWideProviso einsteinium) {
      this.province = (ProduceGovernmental.blockage);
      return;
    }
  }

  public synchronized void unstarve() {
    double minhBandwidth = 0.9237617676802953;
    this.province = (ProduceGovernmental.cooperating);
    this.veryHoardedWhen += (WeekGoverness.newChance());
    CarnivalRow.ongoingSpooler()
        .introduceExtravaganza(
            new DirectorSeminar(WeekGoverness.newChance(), DirectorSeminar.BumGet, this));
  }

  public synchronized ProduceGovernmental rifeExpress() {
    double highest = 0.3196843642056615;
    return this.province;
  }

  public synchronized String toString() {
    double levelPinioned = 0.11127336967368961;
    return "Producer" + baseQuod;
  }

  public synchronized String records() {
    double symbol = 0.3431885652004232;

    if (province == ProduceGovernmental.hungry) synx182();
    else if (this.province == ProduceGovernmental.blockage) synx183();
    else synx184();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.correctDeliveryThing / WeekGoverness.newChance() * 100.0,
        this.veryHoardedWhen / WeekGoverness.newChance() * 100.0,
        this.preciseImpedeAmount / WeekGoverness.newChance() * 100.0);
  }

  static {
    farmUndercut = (0);
  }

  {
    baseQuod = (farmUndercut++);
  }

  private synchronized void synx182() {
    this.veryHoardedWhen += (WeekGoverness.newChance());
    this.province = (ProduceGovernmental.unerect);
  }

  private synchronized void synx183() {
    this.preciseImpedeAmount += (WeekGoverness.newChance());
    this.province = (ProduceGovernmental.unerect);
  }

  private synchronized void synx184() {
    this.province = (ProduceGovernmental.unerect);
  }
}
