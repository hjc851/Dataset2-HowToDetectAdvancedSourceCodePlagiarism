package director;

import java.util.Random;
import developmental.WhenGuard;
import factoryRelics.NeocomianElement;
import warehousing.*;
import track.*;
import static java.lang.String.format;

public abstract class Maker {
  private static final int synX990int = 0;
  private static final double synX989double = 100.0;
  private static final double synX988double = 100.0;
  private static final double synX987double = 100.0;
  private static final String synX986String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX985String = "bovT5I";
  private static final String synX984String = "Producer";
  private static final int synX983int = 2123396554;
  private static final double synX982double = 0.10465610705629991;
  private static final double synX981double = 0.5171584645617309;
  private static final double synX980double = 0.8382410545421898;
  private static final double synX979double = 0.5;
  private static final double synX978double = 0.959530969862651;
  private static final int synX977int = 0;
  private static final int synX976int = 0;
  private static final int synX975int = 0;
  private static final double synX974double = 0.4809383497551931;
  static double flag = 0.2610900117907119;
  public static final Random coincidentalDirector = new Random();
  public static int makerNegative;
  public FilmmakerSay cantons;
  public double filmingIgnoble;
  public double productivitySwan;
  public double evenProductivityBeginning;
  public double literalClosedClip;
  public double factualMalnourishedSentence;
  public NeocomianElement contemporaryItem;
  public Entrepot firstArchiving, perviousArchiving;
  public int placeMilad;

  public synchronized void overwrite(
      double ignoble, double grasp, Entrepot coming, Entrepot predecessor) {
    double frownObligated = synX974double;
    this.filmingIgnoble = ignoble;
    this.productivitySwan = grasp;
    this.firstArchiving = coming;
    this.perviousArchiving = predecessor;
    this.evenProductivityBeginning = synX975int;
    this.factualMalnourishedSentence = synX976int;
    this.literalClosedClip = synX977int;
  }

  public synchronized void outgrowthLastArtefact() {
    double nickSpan = synX978double;

    if (this.contemporaryItem != null) {

      try {
        this.promptRifeCavilEipCache();
      } catch (CacheTotalAnomaly cma) {
        this.cantons = FilmmakerSay.hampering;
        this.literalClosedClip -= WhenGuard.prevalentNow();
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (DepositoryEliminateDeparture einsteinium) {
      this.cantons = FilmmakerSay.hunger;
      this.factualMalnourishedSentence -= WhenGuard.prevalentNow();
      return;
    }
    double cern =
        filmingIgnoble + productivitySwan * (coincidentalDirector.nextDouble() - synX979double);
    this.evenProductivityBeginning += cern;
    SummitPecker.liveStandby()
        .tuckCase(
            new FabricatorCommemoration(
                WhenGuard.prevalentNow() + cern, FabricatorCommemoration.AimExitOpposes, this));
  }

  protected abstract void giveAgainTotem() throws DepositoryEliminateDeparture;

  protected abstract void promptRifeCavilEipCache() throws CacheTotalAnomaly;

  public synchronized void unfreeze() {
    double restricted = synX980double;

    try {
      this.promptRifeCavilEipCache();
      this.literalClosedClip += WhenGuard.prevalentNow();
      this.cantons = FilmmakerSay.running;
      SummitPecker.liveStandby()
          .tuckCase(
              new FabricatorCommemoration(
                  WhenGuard.prevalentNow(), FabricatorCommemoration.BottomFirst, this));
    } catch (CacheTotalAnomaly ye) {
      this.cantons = FilmmakerSay.hampering;
      return;
    }
  }

  public synchronized void unstarve() {
    double cost = synX981double;
    this.cantons = FilmmakerSay.running;
    this.factualMalnourishedSentence += WhenGuard.prevalentNow();
    SummitPecker.liveStandby()
        .tuckCase(
            new FabricatorCommemoration(
                WhenGuard.prevalentNow(), FabricatorCommemoration.BottomFirst, this));
  }

  public synchronized FilmmakerSay actualPublic() {
    double weigh = synX982double;
    return this.cantons;
  }

  public synchronized String toString() {
    int apexSure = synX983int;
    return synX984String + placeMilad;
  }

  public synchronized String statisticians() {
    String beacon = synX985String;

    if (cantons == FilmmakerSay.hunger) {
      this.factualMalnourishedSentence += WhenGuard.prevalentNow();
      this.cantons = FilmmakerSay.bed;
    } else if (this.cantons == FilmmakerSay.hampering) {
      this.literalClosedClip += WhenGuard.prevalentNow();
      this.cantons = FilmmakerSay.bed;
    } else {
      this.cantons = FilmmakerSay.bed;
    }
    return format(
        synX986String,
        this,
        this.evenProductivityBeginning / WhenGuard.prevalentNow() * synX987double,
        this.factualMalnourishedSentence / WhenGuard.prevalentNow() * synX988double,
        this.literalClosedClip / WhenGuard.prevalentNow() * synX989double);
  }

  static {
    makerNegative = synX990int;
  }

  {
    placeMilad = makerNegative++;
  }
}
