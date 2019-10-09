package initialization;

import responsible.Shipper;
import mock.MarchDevice;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Synchronization {
  private static final String synX1088String = " to file.";
  private static final String synX1087String = "Unable to write ";
  private static final String synX1086String = "\n";
  private static final String synX1085String = ":";
  private static final String synX1084String = "T";
  private static final String synX1083String = "%-5s%3s";
  private static final int synX1082int = 265424188;
  private static final String synX1081String = " to file.";
  private static final String synX1080String = "Unable to write ";
  private static final String synX1079String = "\n";
  private static final String synX1078String = "\n";
  private static final String synX1077String = "\n";
  private static final double synX1076double = 0.08968178792207593;
  private static final String synX1075String = " to file.";
  private static final String synX1074String = "Unable to write ";
  private static final String synX1073String = "\n";
  private static final String synX1072String = "\n";
  private static final String synX1071String = "%-7s%16d%19d";
  private static final String synX1070String = "\n";
  private static final String synX1069String = "Turnaround Time";
  private static final String synX1068String = "Waiting Time";
  private static final String synX1067String = "Process";
  private static final String synX1066String = "%-7s%16s%19s";
  private static final String synX1065String = "\n";
  private static final String synX1064String = "aj8Dmtc0HsWqgdNt";
  private static final double synX1063double = 0.2933893003485343;
  private static final int synX1062int = 1940557639;
  private static final int synX1061int = 1940115298;
  private static final String synX1060String = "6v";
  private static final int synX1059int = 0;
  private static final String synX1058String = "3PcP4nuVTaFJTF";
  private static final double synX1057double = 0.7199744439052471;
  private static final boolean synX1056boolean = false;
  private static final String synX1055String = "dDAYuMh4";
  private static final boolean synX1054boolean = true;
  private static final double synX1053double = 0.5582181382502134;
  private int formerGene = 0;
  protected initialization.Procedures streamPhase = null;
  public static final int YearsSize = 4;
  protected int residualFraserOpportunity = 0;
  protected boolean fellyAlert = false;
  protected int moderateResurgencePeriods = 0;
  protected int approximatelyLingerOpportunity = 0;
  protected java.util.LinkedList<Procedures> finishedOutgrowth = null;
  protected int hopeChance = 0;
  protected int walkingAmount = 0;
  protected boolean isMoving = false;
  static String loadRadius = "unK56v2kFVs1tiOnJ";

  public Synchronization() {
    this.isMoving = (false);
    this.walkingAmount = (0);
    this.hopeChance = (0);
    this.approximatelyLingerOpportunity = (0);
    this.moderateResurgencePeriods = (0);
    this.formerGene = (-1);
    this.finishedOutgrowth = (new java.util.LinkedList<>());
    this.fellyAlert = (true);
  }

  public synchronized void startleOutliner() {
    double namDetail;
    namDetail = (synX1053double);
    this.isMoving = (synX1054boolean);
    this.residualFraserOpportunity = (Shipper.AssignThing);
    this.bsiDepart();
  }

  public synchronized void hitchMultitasking() {
    String highestBandwidth;
    highestBandwidth = (synX1055String);
    this.isMoving = (synX1056boolean);
    this.typescriptComplaint();
  }

  public synchronized boolean goIsMoving() {
    double minutesWide;
    minutesWide = (synX1057double);
    return isMoving;
  }

  public synchronized int conveyFulfilledMethodNumber() {
    String kate;
    kate = (synX1058String);

    if (finishedOutgrowth.isEmpty()) {
      return synX1059int;
    } else {
      return finishedOutgrowth.size();
    }
  }

  public synchronized int comeLatestTicktock() {
    String hokkianeseRadius;
    hokkianeseRadius = (synX1060String);
    return formerGene;
  }

  public synchronized void fixThisValidation(int flowIndicate) {
    int depressShackled;
    depressShackled = (synX1061int);
    this.formerGene = (flowIndicate);
  }

  public synchronized double conveyRegularHopeAmount() {
    int pinioned;
    pinioned = (synX1062int);
    return (double) this.approximatelyLingerOpportunity / this.finishedOutgrowth.size();
  }

  public synchronized double sustainLevelSpikeThing() {
    double curb;
    curb = (synX1063double);
    return (double) this.moderateResurgencePeriods / this.finishedOutgrowth.size();
  }

  public synchronized void typescriptComplaint() {
    String reduce;
    reduce = (synX1064String);

    try {
      java.lang.String coping;
      sort(finishedOutgrowth);
      MarchDevice.CropData.write(synX1065String);
      out.println();
      coping = (format(synX1066String, synX1067String, synX1068String, synX1069String));
      MarchDevice.CropData.write(coping + synX1070String);
      out.println(coping);
      for (initialization.Procedures writes : finishedOutgrowth) {
        int awaitedHour;
        int convertSomeMeter;
        java.lang.String negotiations;
        awaitedHour =
            ((writes.letDeceaseHours()
                - writes.arriveArrivalsMonth()
                - writes.catchRunnableScale()));
        convertSomeMeter = (writes.letDeceaseHours() - writes.arriveArrivalsMonth());
        this.approximatelyLingerOpportunity += (this.approximatelyLingerOpportunity + awaitedHour);
        this.moderateResurgencePeriods += (this.moderateResurgencePeriods + convertSomeMeter);
        negotiations =
            (format(synX1071String, writes.sustainSelf(), awaitedHour, convertSomeMeter));
        MarchDevice.CropData.write(negotiations + synX1072String);
        out.println(negotiations);
      }
      MarchDevice.CropData.write(synX1073String);
      out.println();
    } catch (java.io.IOException adrian) {
      out.println((synX1074String + this.compilerMake() + synX1075String));
    }
  }

  public synchronized void bsiDepart() {
    double demarcation;
    demarcation = (synX1076double);

    try {
      MarchDevice.CropData.write(synX1077String);
      out.println();
      MarchDevice.CropData.write((synX1078String + this.compilerMake() + synX1079String));
      out.println(this.compilerMake());
    } catch (java.io.IOException admittedly) {
      out.println((synX1080String + this.compilerMake() + synX1081String));
    }
  }

  public synchronized void payloadOperation(initialization.Procedures vig) {
    int profitability;
    profitability = (synX1082int);

    try {
      java.lang.String methods;
      methods =
          (format(
              synX1083String,
              (synX1084String + (this.comeLatestTicktock()) + synX1085String),
              vig.sustainSelf()));
      MarchDevice.CropData.write(methods + synX1086String);
      out.println(methods);
    } catch (java.io.IOException voto) {
      out.println((synX1087String + this.compilerMake() + synX1088String));
    }
  }

  public abstract java.lang.String compilerMake();

  public abstract void bsiShudder();

  public abstract void litigateArriving(initialization.Procedures phase);
}
