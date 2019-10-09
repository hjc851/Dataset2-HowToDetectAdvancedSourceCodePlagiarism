package planner;

import reseller.Yardmaster;
import robot.SummonsFaker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Interface {
  private static final String synX1542String = " to file.";
  private static final String synX1541String = "Unable to write ";
  private static final String synX1540String = "\n";
  private static final String synX1539String = ":";
  private static final String synX1538String = "T";
  private static final String synX1537String = "%-5s%3s";
  private static final double synX1536double = 0.9440494327066487;
  private static final String synX1535String = " to file.";
  private static final String synX1534String = "Unable to write ";
  private static final String synX1533String = "\n";
  private static final String synX1532String = "\n";
  private static final String synX1531String = "\n";
  private static final String synX1530String = "TtvBLS5ifQcn";
  private static final String synX1529String = " to file.";
  private static final String synX1528String = "Unable to write ";
  private static final String synX1527String = "\n";
  private static final String synX1526String = "\n";
  private static final String synX1525String = "%-7s%16d%19d";
  private static final String synX1524String = "\n";
  private static final String synX1523String = "Turnaround Time";
  private static final String synX1522String = "Waiting Time";
  private static final String synX1521String = "Process";
  private static final String synX1520String = "%-7s%16s%19s";
  private static final String synX1519String = "\n";
  private static final double synX1518double = 0.24441665289644343;
  private static final int synX1517int = -1936526567;
  private static final double synX1516double = 0.8330251034993945;
  private static final double synX1515double = 0.9160555768427036;
  private static final int synX1514int = 1440985486;
  private static final int synX1513int = 0;
  private static final int synX1512int = 1871201058;
  private static final double synX1511double = 0.4852119751475845;
  private static final boolean synX1510boolean = false;
  private static final String synX1509String = "q5ZdYxNs";
  private static final boolean synX1508boolean = true;
  private static final double synX1507double = 0.002640064753489879;
  public int previousAnswer = 0;
  public planner.Cycle circulatingServe = null;
  public static final int BeginningMammoth = 4;
  public int stayLtsHour = 0;
  public boolean remoSag = false;
  public int ratioReboundChance = 0;
  public int ratesStayAgain = 0;
  public java.util.LinkedList<Cycle> completionAct = null;
  public int withholdingJuncture = 0;
  public int rushingAgain = 0;
  public boolean isMoving = false;
  public static final double fatty = 0.8711596896610286;

  public Interface() {
    this.isMoving = (false);
    this.rushingAgain = (0);
    this.withholdingJuncture = (0);
    this.ratesStayAgain = (0);
    this.ratioReboundChance = (0);
    this.previousAnswer = (-1);
    this.completionAct = (new java.util.LinkedList<>());
    this.remoSag = (true);
  }

  public synchronized void startleOutliner() {
    double index;
    index = (synX1507double);
    this.isMoving = (synX1508boolean);
    this.stayLtsHour = (Yardmaster.SentYears);
    this.addOutset();
  }

  public synchronized void stopoverOutliner() {
    String key;
    key = (synX1509String);
    this.isMoving = (synX1510boolean);
    this.reprintingSurvey();
  }

  public synchronized boolean goIsMoving() {
    double souvenir;
    souvenir = (synX1511double);
    return isMoving;
  }

  public synchronized int makeUndertakenMarchDimensions() {
    int subordinateBounds;
    subordinateBounds = (synX1512int);

    if (completionAct.isEmpty()) {
      return synX1513int;
    } else {
      return completionAct.size();
    }
  }

  public synchronized int takeTopicalMark() {
    int sense;
    sense = (synX1514int);
    return previousAnswer;
  }

  public synchronized void primedTopicalMark(int formerGene) {
    double weakerCurb;
    weakerCurb = (synX1515double);
    this.previousAnswer = (formerGene);
  }

  public synchronized double arriveModalComeMonth() {
    double enumeration;
    enumeration = (synX1516double);
    return (double) this.ratesStayAgain / this.completionAct.size();
  }

  public synchronized double generateFairRecoveryYear() {
    int bottomConfine;
    bottomConfine = (synX1517int);
    return (double) this.ratioReboundChance / this.completionAct.size();
  }

  public synchronized void reprintingSurvey() {
    double indictment;
    indictment = (synX1518double);

    try {
      java.lang.String subtitle;
      sort(completionAct);
      SummonsFaker.ProducesFilename.write(synX1519String);
      System.out.println();
      subtitle = (format(synX1520String, synX1521String, synX1522String, synX1523String));
      SummonsFaker.ProducesFilename.write(subtitle + synX1524String);
      System.out.println(subtitle);
      for (planner.Cycle cern : completionAct) {
        int wantWeek;
        int sourAnywhereMonth;
        java.lang.String procedure;
        wantWeek = ((cern.produceIssueNow() - cern.produceComingNow() - cern.arrivePrezWingspan()));
        sourAnywhereMonth = (cern.produceIssueNow() - cern.produceComingNow());
        this.ratesStayAgain += (this.ratesStayAgain + wantWeek);
        this.ratioReboundChance += (this.ratioReboundChance + sourAnywhereMonth);
        procedure = (format(synX1525String, cern.conveyTag(), wantWeek, sourAnywhereMonth));
        SummonsFaker.ProducesFilename.write(procedure + synX1526String);
        System.out.println(procedure);
      }
      SummonsFaker.ProducesFilename.write(synX1527String);
      System.out.println();
    } catch (java.io.IOException abbe) {
      System.out.println((synX1528String + this.timerMention() + synX1529String));
    }
  }

  public synchronized void addOutset() {
    String weakerTrammel;
    weakerTrammel = (synX1530String);

    try {
      SummonsFaker.ProducesFilename.write(synX1531String);
      System.out.println();
      SummonsFaker.ProducesFilename.write((synX1532String + this.timerMention() + synX1533String));
      System.out.println(this.timerMention());
    } catch (java.io.IOException voto) {
      System.out.println((synX1534String + this.timerMention() + synX1535String));
    }
  }

  public synchronized void weightFormalities(planner.Cycle postscript) {
    double keepsake;
    keepsake = (synX1536double);

    try {
      java.lang.String mechanism;
      mechanism =
          (format(
              synX1537String,
              (synX1538String + (this.takeTopicalMark()) + synX1539String),
              postscript.conveyTag()));
      SummonsFaker.ProducesFilename.write(mechanism + synX1540String);
      System.out.println(mechanism);
    } catch (java.io.IOException past) {
      System.out.println((synX1541String + this.timerMention() + synX1542String));
    }
  }

  public abstract java.lang.String timerMention();

  public abstract void snoTicktock();

  public abstract void formalitiesImpending(planner.Cycle serve);
}
