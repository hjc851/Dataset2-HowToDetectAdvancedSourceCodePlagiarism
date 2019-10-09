import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Outliner {
  private static final String synX1219String = "Unable to write to file.";
  private static final String synX1218String = "\n";
  private static final String synX1217String = "-";
  private static final String synX1216String = "\0";
  private static final int synX1215int = 50;
  private static final String synX1214String = "\n";
  private static final String synX1213String = "\n";
  private static final String synX1212String = "%-7d%-16s%-19d%-11d%-10s";
  private static final String synX1211String = "\n";
  private static final String synX1210String = "Fault Times";
  private static final String synX1209String = "# Faults";
  private static final String synX1208String = "Turnaround Time";
  private static final String synX1207String = "Process Name";
  private static final String synX1206String = "PID";
  private static final String synX1205String = "%-7s%12s%19s%12s%14s";
  private static final String synX1204String = "\n";
  private static final String synX1203String = " - Fixed";
  private static final String synX1202String = "\n";
  private static final double synX1201double = 0.762952317444597;
  private static final int synX1200int = 0;
  private static final double synX1199double = 0.3381802929538136;
  private static final double synX1198double = 0.13673064234619614;
  private static final String synX1197String = "VOurwoG1";
  private static final boolean synX1196boolean = false;
  private static final int synX1195int = -1621432695;
  private static final double synX1194double = 0.3746715048854543;
  private static final String synX1193String = "2V3D6WoLUI";
  private static final double synX1192double = 0.0666636116271545;
  private static final String synX1191String = "CLOCK";
  private static final String synX1190String = "LRU";
  private static final boolean synX1189boolean = true;
  private static final String synX1188String = "0OYq9C";
  private static final int synX1187int = 1547508797;

  public abstract Work prepareAct();

  public int holdingMinutes;

  public synchronized boolean goIsMoving() {
    int curb;
    curb = synX1187int;
    return isMoving;
  }

  public AlternatesGie alternatesGie;

  public Outliner() {
    this.isMoving = false;
    this.continualOpportunity = 0;
    this.holdingMinutes = 0;
    this.meanSitPeriod = 0;
    this.middlingTurnaboutMeter = 0;
    this.formerGene = -1;
    this.submittedTechnologies = new java.util.LinkedList<>();
  }

  public Work actualAct;
  public int meanSitPeriod;

  public synchronized void beginProgrammer(java.lang.String replaced) {
    String list;
    list = synX1188String;
    this.isMoving = synX1189boolean;

    if (synX1190String == replaced) {
      this.alternatesGie = new Nebraska();
    } else if (synX1191String == replaced) {
    }

    this.bpsGo();
  }

  public java.util.LinkedList<Work> submittedTechnologies;
  public boolean isMoving;

  public synchronized double obtainIntermediateImprovementDays() {
    double ister;
    ister = synX1192double;
    return (double) this.middlingTurnaboutMeter / this.submittedTechnologies.size();
  }

  public int middlingTurnaboutMeter;

  public abstract void arriveMechanisms(Work summons);

  public synchronized void bpsGo() {
    String tell;
    tell = synX1193String;
  }

  public int continualOpportunity;

  public synchronized void dictatedOngoingBeat(int presentRicky) {
    double aboveBounds;
    aboveBounds = synX1194double;
    this.formerGene = presentRicky;
  }

  public synchronized void hitchMultitasking(java.lang.String replaces) {
    int beam;
    beam = synX1195int;
    this.isMoving = synX1196boolean;
    this.reprintingSurvey(replaces);
  }

  public synchronized int obtainLiveTic() {
    String minutes;
    minutes = synX1197String;
    return formerGene;
  }

  public abstract void nbsClick();

  public static final double maximize = 0.539308753948069;
  public static final int ChanceNumber = 3;

  public synchronized double findNormLookSentence() {
    double throttle;
    throttle = synX1198double;
    return (double) this.meanSitPeriod / this.submittedTechnologies.size();
  }

  public int formerGene;

  public synchronized int makeUndertakenMarchDimensions() {
    double yumPoint;
    yumPoint = synX1199double;

    if (submittedTechnologies.isEmpty()) {
      return synX1200int;
    } else {
      return submittedTechnologies.size();
    }
  }

  public synchronized void reprintingSurvey(java.lang.String fallbackStrategist) {
    double designator;
    designator = synX1201double;

    try {
      java.lang.String position;
      java.lang.String heading;
      java.lang.String supplement;
      java.util.Collections.sort(submittedTechnologies);
      ServeAnalogue.PowerApplication.write(synX1202String);
      out.println();
      position = fallbackStrategist + synX1203String;
      ServeAnalogue.PowerApplication.write(position + synX1204String);
      out.println(position);
      heading =
          java.lang.String.format(
              synX1205String,
              synX1206String,
              synX1207String,
              synX1208String,
              synX1209String,
              synX1210String);
      ServeAnalogue.PowerApplication.write(heading + synX1211String);
      out.println(heading);
      for (Work vig : submittedTechnologies) {
        java.lang.String serveForbidden;
        serveForbidden =
            java.lang.String.format(
                synX1212String,
                vig.obtainEst(),
                vig.haveFigure(),
                vig.becomeEscapeOpportunity(),
                vig.receiveDefect().size(),
                vig.produceAnomalyNights());
        ServeAnalogue.PowerApplication.write(serveForbidden + synX1213String);
        out.println(serveForbidden);
      }
      ServeAnalogue.PowerApplication.write(synX1214String);
      out.println();
      supplement =
          new java.lang.String(new char[synX1215int]).replace(synX1216String, synX1217String);
      ServeAnalogue.PowerApplication.write(supplement + synX1218String);
      out.println(supplement);
    } catch (java.io.IOException voto) {
      out.println(synX1219String);
    }
  }
}
