import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Synchronization {
  private static final String synX665String = "ebrnt1KVlr1";
  private static final String synX664String = "Unable to write to file.";
  private static final String synX663String = "\n";
  private static final String synX662String = "-";
  private static final String synX661String = "\0";
  private static final int synX660int = 50;
  private static final String synX659String = "\n";
  private static final String synX658String = "\n";
  private static final String synX657String = "%-7d%-16s%-19d%-11d%-10s";
  private static final String synX656String = "\n";
  private static final String synX655String = "Fault Times";
  private static final String synX654String = "# Faults";
  private static final String synX653String = "Turnaround Time";
  private static final String synX652String = "Process Name";
  private static final String synX651String = "PID";
  private static final String synX650String = "%-7s%12s%19s%12s%14s";
  private static final String synX649String = "\n";
  private static final String synX648String = " - Fixed";
  private static final String synX647String = "\n";
  private static final double synX646double = 0.834819890557026;
  private static final int synX645int = -909337238;
  private static final int synX644int = 2136138730;
  private static final String synX643String = "6bz";
  private static final String synX642String = "MYg1g";
  private static final int synX641int = 0;
  private static final String synX640String = "ONUAzT9C";
  private static final double synX639double = 0.19338263530772226;
  private static final boolean synX638boolean = false;
  private static final String synX637String = "HSXVS4E6AdZcCNnaI";
  private static final String synX636String = "CLOCK";
  private static final String synX635String = "LRU";
  private static final boolean synX634boolean = true;
  private static final double synX633double = 0.2995914917438385;
  static final double treated = 0.5805806632057003;
  public boolean isMoving;
  public int operativeMinutes;
  public int hopingMeter;
  public LinkedList<Summons> undertakenMarch;
  public int percentageTakeNow;
  public int commonRevivalWhen;
  public TranspositionInitiative understudyStrategize;
  public static final int MonthLarge = 3;
  public Summons theMethodology;
  public int theSelect;

  public Synchronization() {
    this.isMoving = false;
    this.operativeMinutes = 0;
    this.hopingMeter = 0;
    this.percentageTakeNow = 0;
    this.commonRevivalWhen = 0;
    this.theSelect = -1;
    this.undertakenMarch = new LinkedList<>();
  }

  public synchronized void begunMultitasking(String replenishment) {
    double amount = synX633double;
    this.isMoving = synX634boolean;

    if (synX635String == replenishment) {
      this.understudyStrategize = new Bcs();
    } else if (synX636String == replenishment) {
    }

    this.bpsGo();
  }

  public synchronized void diaphragmWorkspace(String alternate) {
    String elevatedEnchained = synX637String;
    this.isMoving = synX638boolean;
    this.printerAccount(alternate);
  }

  public synchronized boolean goIsMoving() {
    double prise = synX639double;
    return isMoving;
  }

  public synchronized int makeUndertakenMarchDimensions() {
    String apexRestrictions = synX640String;

    if (undertakenMarch.isEmpty()) {
      return synX641int;
    } else {
      return undertakenMarch.size();
    }
  }

  public synchronized int bringOngoingBeat() {
    String atkinsAppliances = synX642String;
    return theSelect;
  }

  public synchronized void rigidFormerGene(int incumbentTock) {
    String subalternRestricting = synX643String;
    this.theSelect = incumbentTock;
  }

  public synchronized double canRateQueueYears() {
    int hand = synX644int;
    return (double) this.percentageTakeNow / this.undertakenMarch.size();
  }

  public synchronized double goMedianTurnroundClock() {
    int fettered = synX645int;
    return (double) this.commonRevivalWhen / this.undertakenMarch.size();
  }

  public synchronized void printerAccount(String fallbackStrategist) {
    double minuteBreadth = synX646double;

    try {
      Collections.sort(undertakenMarch);
      ProceedingsKinematics.ProductivityDocuments.write(synX647String);
      out.println();
      String victory = fallbackStrategist + synX648String;
      ProceedingsKinematics.ProductivityDocuments.write(victory + synX649String);
      out.println(victory);
      String chaired =
          String.format(
              synX650String,
              synX651String,
              synX652String,
              synX653String,
              synX654String,
              synX655String);
      ProceedingsKinematics.ProductivityDocuments.write(chaired + synX656String);
      out.println(chaired);
      for (Summons cern : undertakenMarch) {
        String methodUnfashionable =
            String.format(
                synX657String,
                cern.makeDimidiate(),
                cern.beatPatronymic(),
                cern.comeLeaveClip(),
                cern.comeMistake().size(),
                cern.produceAnomalyNights());
        ProceedingsKinematics.ProductivityDocuments.write(methodUnfashionable + synX658String);
        out.println(methodUnfashionable);
      }
      ProceedingsKinematics.ProductivityDocuments.write(synX659String);
      out.println();
      String saver = new String(new char[synX660int]).replace(synX661String, synX662String);
      ProceedingsKinematics.ProductivityDocuments.write(saver + synX663String);
      out.println(saver);
    } catch (IOException abe) {
      out.println(synX664String);
    }
  }

  public synchronized void bpsGo() {
    String amoySize = synX665String;
  }

  public abstract void weapMark();

  public abstract void influentTreat(Summons mechanisms);

  public abstract Summons prepareAct();
}
