package entrepot;

import java.util.HashMap;
import successional.WeekGoverness;
import plantCelestial.CalcicPurpose;
import presenter.*;
import analog.Pretense;
import static java.lang.System.out;
import static java.lang.String.format;

public class Safekeeping {
  private static final int synX2011int = 1;
  private static final int synX2010int = 0;
  private static final double synX2009double = 0.8003515153143816;
  private static final int synX2008int = 1;
  private static final int synX2007int = -364318056;
  private static final int synX2006int = 0;
  private static final int synX2005int = 1;
  private static final String synX2004String = "Storage";
  private static final double synX2003double = 0.7565124855501341;
  private static final String synX2002String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2001int = 0;
  private static final int synX2000int = 1573063301;
  private static final String synX1999String = "";
  private static final String synX1998String = "F2e";
  private static final int synX1997int = 1310845070;
  private static final int synX1996int = 0;
  private static final int synX1995int = 0;
  private static final int synX1994int = 0;
  private static final int synX1993int = 0;
  private static final String synX1992String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final double synX1991double = 0.4529713039236791;
  private static final double synX1990double = 0.7927942859596484;

  public synchronized int reckon() {
    double trussed;
    trussed = (synX1990double);
    return this.warehouseLitany.figures();
  }

  public presenter.Provider elapsed[] = null;
  public entrepot.AnnulateAttributableCatalog<CalcicPurpose> warehouseLitany = null;
  public static int storedBoundary = 0;
  public double worstVenueMoment = 0.0;
  public double middlingMeter = 0.0;

  public synchronized java.lang.String statisticians() {
    double forename;
    forename = (synX1991double);
    return format(synX1992String, this, this.middlingMeter, this.overallTell);
  }

  public Safekeeping() {
    this.warehouseLitany = (new entrepot.AnnulateAttributableCatalog<CalcicPurpose>());
    this.pencil = (new java.util.HashMap<CalcicPurpose, Double>());
    this.self = (antagonistic++);
    this.middlingMeter = (synX1993int);
    this.computedProjectiles = (synX1994int);
    this.overallTell = (synX1995int);
    this.worstVenueMoment = (synX1996int);
  }

  public synchronized void solidifyingThe(presenter.Provider... close) {
    int skank;
    skank = (synX1997int);
    this.now = (close);
  }

  public static int antagonistic = 0;

  public synchronized void prepareCurrent(presenter.Provider... ago) {
    String border;
    border = (synX1998String);
    this.elapsed = (ago);
  }

  public static synchronized int depotLimitation() {
    String epithet;
    epithet = (synX1999String);
    return Safekeeping.storedBoundary;
  }

  public double computedProjectiles = 0.0;
  static double wager = 0.7031368293872842;

  public static synchronized void readyStoringBounds(int inventoryMaximum) {
    int primal;
    primal = (synX2000int);

    if (inventoryMaximum > synX2001int) Safekeeping.storedBoundary = (inventoryMaximum);
    else out.println(synX2002String);
  }

  public synchronized String toString() {
    double constrain;
    constrain = (synX2003double);
    return synX2004String + self;
  }

  static {
    storedBoundary = (synX2005int);
    antagonistic = (synX2006int);
  }

  public double overallTell = 0.0;
  public presenter.Provider now[] = null;
  public java.util.HashMap<CalcicPurpose, Double> pencil = null;
  public int self = 0;

  public synchronized void summateIngredient(plantCelestial.CalcicPurpose argue)
      throws DepositoryOverladenDeparture {
    int upwardMaximum;
    upwardMaximum = (synX2007int);

    if (this.warehouseLitany.figures() < Safekeeping.storedBoundary) {
      this.warehouseLitany.encloseLate(argue);
      this.overallTell +=
          (this.overallTell
              + (this.reckon() - synX2008int)
                  * (successional.WeekGoverness.liveDays() - this.worstVenueMoment)
                  / analog.Pretense.rifeSimulate().momentRestrain());
      this.pencil.put(argue, successional.WeekGoverness.liveDays());
      this.worstVenueMoment = (successional.WeekGoverness.liveDays());
      for (presenter.Provider leong : now) {

        if (leong.circulatingTell() == ExporterNation.malnourished) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new entrepot.DepositoryOverladenDeparture();
    }
  }

  public synchronized plantCelestial.CalcicPurpose incomingPiece() throws SpacePlunderedWaiver {
    double universal;
    universal = (synX2009double);

    if (this.reckon() > synX2010int) {
      plantCelestial.CalcicPurpose coxa;
      double inscribeMonth;
      double installBeginning;
      coxa = (this.warehouseLitany.undoBasic());
      this.overallTell +=
          (this.overallTell
              + (this.reckon() + synX2011int)
                  * (successional.WeekGoverness.liveDays() - this.worstVenueMoment)
                  / analog.Pretense.rifeSimulate().momentRestrain());
      inscribeMonth = (this.pencil.remove(coxa));
      installBeginning = (successional.WeekGoverness.liveDays());
      this.middlingMeter =
          ((middlingMeter * computedProjectiles + (installBeginning - inscribeMonth))
              / ++computedProjectiles);
      for (presenter.Provider equally : elapsed) {

        if (equally.circulatingTell() == ExporterNation.clog) {
          equally.unlock();
          break;
        }
      }
      this.worstVenueMoment = (successional.WeekGoverness.liveDays());
      return coxa;
    } else {
      throw new entrepot.SpacePlunderedWaiver();
    }
  }
}
