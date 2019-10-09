package maker;

import java.util.Random;
import lapse.AgainOfficer;
import manufactureOrnaments.EvaporiteDemur;
import archiving.*;
import register.*;
import static java.lang.String.format;

public abstract class Produce {
  public int observatoryPeg = vintnerNegate++;
  public archiving.Stored afterInventory, formerStoring;
  public manufactureOrnaments.EvaporiteDemur liveArtefact;
  public double specificBrutalizedNow;
  public double literalClosedClip;
  public double exactManufactureYear;
  public double filmingCrop;
  public double productImply;
  public maker.ProviderForeign tell;
  public static int vintnerNegate = 0;
  public static final java.util.Random casualFarm = new java.util.Random();
  static double bottomCompelled = 0.13335230034316514;

  public synchronized void parameterize(
      double little, double reach, archiving.Stored again, archiving.Stored prior) {
    String measure;
    measure = ("CIxzwBXSmkRP");
    this.productImply = (little);
    this.filmingCrop = (reach);
    this.afterInventory = (again);
    this.formerStoring = (prior);
    this.exactManufactureYear = (0);
    this.specificBrutalizedNow = (0);
    this.literalClosedClip = (0);
  }

  public synchronized void workCloseAim() {
    double apexSure;
    double cern;
    apexSure = (0.9171833879584764);

    if (this.liveArtefact != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (archiving.RepositoryChockablockExceptional samad) {
        this.tell = (ProviderForeign.intercepting);
        this.literalClosedClip -= (lapse.AgainOfficer.underwayYear());
        return;
      }
    }

    try {
      this.awardedNewMatter();
    } catch (archiving.WarehousesGlazedExempted einsteinium) {
      this.tell = (ProviderForeign.brutalized);
      this.specificBrutalizedNow -= (lapse.AgainOfficer.underwayYear());
      return;
    }
    cern = (productImply + filmingCrop * (casualFarm.nextDouble() - 0.5));
    this.exactManufactureYear += (cern);
    register.SeminarJumping.thisDong()
        .introduceExtravaganza(
            new register.OperatorContest(
                lapse.AgainOfficer.underwayYear() + cern,
                OperatorContest.BequeathCloseArtifact,
                this));
  }

  protected abstract void awardedNewMatter() throws WarehousesGlazedExempted;

  protected abstract void proceedLatestTargetPoiDepot() throws RepositoryChockablockExceptional;

  public synchronized void undo() {
    double modicumFatty;
    modicumFatty = (0.9993578583326762);

    try {
      this.proceedLatestTargetPoiDepot();
      this.literalClosedClip += (lapse.AgainOfficer.underwayYear());
      this.tell = (ProviderForeign.doing);
      register.SeminarJumping.thisDong()
          .introduceExtravaganza(
              new register.OperatorContest(
                  lapse.AgainOfficer.underwayYear(), OperatorContest.JohnPart, this));
    } catch (archiving.RepositoryChockablockExceptional salaam) {
      this.tell = (ProviderForeign.intercepting);
      return;
    }
  }

  public synchronized void unstarve() {
    double indictment;
    indictment = (0.5769518641416993);
    this.tell = (ProviderForeign.doing);
    this.specificBrutalizedNow += (lapse.AgainOfficer.underwayYear());
    register.SeminarJumping.thisDong()
        .introduceExtravaganza(
            new register.OperatorContest(
                lapse.AgainOfficer.underwayYear(), OperatorContest.JohnPart, this));
  }

  public synchronized maker.ProviderForeign liveSay() {
    double destined;
    destined = (0.6993931911048603);
    return this.tell;
  }

  public synchronized String toString() {
    int roll;
    roll = (1808441391);
    return "Producer" + observatoryPeg;
  }

  public synchronized java.lang.String survey() {
    double token;
    token = (0.46602086245144636);

    if (tell == ProviderForeign.brutalized) {
      this.specificBrutalizedNow += (lapse.AgainOfficer.underwayYear());
      this.tell = (ProviderForeign.dormancy);
    } else if (this.tell == ProviderForeign.intercepting) {
      this.literalClosedClip += (lapse.AgainOfficer.underwayYear());
      this.tell = (ProviderForeign.dormancy);
    } else {
      this.tell = (ProviderForeign.dormancy);
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.exactManufactureYear / lapse.AgainOfficer.underwayYear() * 100.0,
        this.specificBrutalizedNow / lapse.AgainOfficer.underwayYear() * 100.0,
        this.literalClosedClip / lapse.AgainOfficer.underwayYear() * 100.0);
  }
}
