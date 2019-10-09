package farm;

import java.util.Random;
import acculturative.PeriodsManager;
import manufacturingPieces.StorableSubject;
import entrepot.*;
import tape.*;
import static java.lang.String.format;

public abstract class Production {
  private static final double synX22double = 100.0;
  private static final double synX21double = 100.0;
  private static final double synX20double = 100.0;
  private static final String synX19String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX18String = "KYBwuyBMovc";
  private static final String synX17String = "Producer";
  private static final double synX16double = 0.6586717264519448;
  private static final String synX15String = "sWB56WA2ExPYo9xgC";
  private static final double synX14double = 0.7503516379449476;
  private static final double synX13double = 0.3187760208760214;
  private static final double synX12double = 0.5;
  private static final double synX11double = 0.6302892759562045;
  private static final int synX10int = 0;
  private static final int synX9int = 0;
  private static final int synX8int = 0;
  private static final double synX7double = 0.4132878635401882;
  public int baseQuod = producingParry++;
  public entrepot.Memory closeMemory, firstStowage;
  public manufacturingPieces.StorableSubject flowObjet;
  public double actualityStuntedMonth;
  public double evenDeniedBeginning;
  public double evenProductivityBeginning;
  public double manufacturedRank;
  public double cultivationHateful;
  public farm.FabricatorSate government;
  public static int producingParry = 0;
  public static final java.util.Random samplingOutput = new java.util.Random();
  public static final int pawn = -1511804464;

  public synchronized void concatenate(
      double skilled, double roam, entrepot.Memory first, entrepot.Memory preliminary) {
    double positionFoods;
    positionFoods = (synX7double);
    this.cultivationHateful = (skilled);
    this.manufacturedRank = (roam);
    this.closeMemory = (first);
    this.firstStowage = (preliminary);
    this.evenProductivityBeginning = (synX8int);
    this.actualityStuntedMonth = (synX9int);
    this.evenDeniedBeginning = (synX10int);
  }

  public synchronized void methodsThenArgue() {
    double marx;
    double postscript;
    marx = (synX11double);

    if (this.flowObjet != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (entrepot.ArchivalOverflowingExempt ye) {
        this.government = (FabricatorSate.clog);
        this.evenDeniedBeginning -= (acculturative.PeriodsManager.latestClip());
        return;
      }
    }

    try {
      this.obtainFutureObjective();
    } catch (entrepot.WarehousingVacateLimitation samad) {
      this.government = (FabricatorSate.famine);
      this.actualityStuntedMonth -= (acculturative.PeriodsManager.latestClip());
      return;
    }
    postscript =
        (cultivationHateful + manufacturedRank * (samplingOutput.nextDouble() - synX12double));
    this.evenProductivityBeginning += (postscript);
    tape.SeminarJumping.topicalSufferance()
        .deleteRace(
            new tape.FarmerSpectacle(
                acculturative.PeriodsManager.latestClip() + postscript,
                FarmerSpectacle.ComeEndingArgue,
                this));
  }

  protected abstract void obtainFutureObjective() throws WarehousingVacateLimitation;

  protected abstract void propelOngoingAimCoughMemory() throws ArchivalOverflowingExempt;

  public synchronized void activate() {
    double rate;
    rate = (synX13double);

    try {
      this.propelOngoingAimCoughMemory();
      this.evenDeniedBeginning += (acculturative.PeriodsManager.latestClip());
      this.government = (FabricatorSate.operative);
      tape.SeminarJumping.topicalSufferance()
          .deleteRace(
              new tape.FarmerSpectacle(
                  acculturative.PeriodsManager.latestClip(), FarmerSpectacle.JohnPart, this));
    } catch (entrepot.ArchivalOverflowingExempt salaam) {
      this.government = (FabricatorSate.clog);
      return;
    }
  }

  public synchronized void unstarve() {
    double ceiling;
    ceiling = (synX14double);
    this.government = (FabricatorSate.operative);
    this.actualityStuntedMonth += (acculturative.PeriodsManager.latestClip());
    tape.SeminarJumping.topicalSufferance()
        .deleteRace(
            new tape.FarmerSpectacle(
                acculturative.PeriodsManager.latestClip(), FarmerSpectacle.JohnPart, this));
  }

  public synchronized farm.FabricatorSate incumbentLand() {
    String netherTied;
    netherTied = (synX15String);
    return this.government;
  }

  public synchronized String toString() {
    double northernThrottle;
    northernThrottle = (synX16double);
    return synX17String + baseQuod;
  }

  public synchronized java.lang.String censuses() {
    String subordinateBounds;
    subordinateBounds = (synX18String);

    if (government == FabricatorSate.famine) synx0();
    else if (this.government == FabricatorSate.clog) synx1();
    else synx2();
    return format(
        synX19String,
        this,
        this.evenProductivityBeginning / acculturative.PeriodsManager.latestClip() * synX20double,
        this.actualityStuntedMonth / acculturative.PeriodsManager.latestClip() * synX21double,
        this.evenDeniedBeginning / acculturative.PeriodsManager.latestClip() * synX22double);
  }

  private synchronized void synx0() {
    this.actualityStuntedMonth += (acculturative.PeriodsManager.latestClip());
    this.government = (FabricatorSate.bedroom);
  }

  private synchronized void synx1() {
    this.evenDeniedBeginning += (acculturative.PeriodsManager.latestClip());
    this.government = (FabricatorSate.bedroom);
  }

  private synchronized void synx2() {
    this.government = (FabricatorSate.bedroom);
  }
}
