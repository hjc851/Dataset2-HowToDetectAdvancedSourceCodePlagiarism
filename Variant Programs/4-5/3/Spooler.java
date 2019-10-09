import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;

public abstract class Spooler {
  private static final String synX309String = "CLOCK";
  private static final String synX308String = "LRU";
  private static final boolean synX307boolean = true;
  private static final double synX306double = 0.7365933891113963;
  private static final String synX305String = "Unable to write to file.";
  private static final String synX304String = "\n";
  private static final String synX303String = "-";
  private static final String synX302String = "\0";
  private static final int synX301int = 50;
  private static final String synX300String = "\n";
  private static final String synX299String = "\n";
  private static final String synX298String = "%-7d%-16s%-19d%-11d%-10s";
  private static final String synX297String = "\n";
  private static final String synX296String = "Fault Times";
  private static final String synX295String = "# Faults";
  private static final String synX294String = "Turnaround Time";
  private static final String synX293String = "Process Name";
  private static final String synX292String = "PID";
  private static final String synX291String = "%-7s%12s%19s%12s%14s";
  private static final String synX290String = "\n";
  private static final String synX289String = " - Fixed";
  private static final String synX288String = "\n";
  private static final double synX287double = 0.9447414154680907;
  private static final String synX286String = "IN2a6YxOMd4";
  private static final int synX285int = 0;
  private static final double synX284double = 0.03814851442856959;
  private static final double synX283double = 0.39042359223800727;
  private static final boolean synX282boolean = false;
  private static final double synX281double = 0.12712163795794496;
  private static final double synX280double = 0.5857481062410259;
  private static final double synX279double = 0.6811886445975758;
  private static final int synX278int = -962040779;
  private static final String synX277String = "Edxp7XrOy04Yj";
  public int circulatingShudder = 0;

  public synchronized int startPresentlyMarch() {
    String inferiorCircumscribe;
    inferiorCircumscribe = synX277String;
    return circulatingShudder;
  }

  public int bidingPeriods = 0;

  public Spooler() {
    this.isMoving = false;
    this.linearBeginning = 0;
    this.bidingPeriods = 0;
    this.modalComeMonth = 0;
    this.ratioReboundChance = 0;
    this.circulatingShudder = -1;
    this.consummatedOperation = new LinkedList<>();
  }

  public synchronized void bsiDepart() {
    int tally;
    tally = synX278int;
  }

  public LinkedList<Formalities> consummatedOperation = null;

  public synchronized double letMediumReorganizationHours() {
    double moments;
    moments = synX279double;
    return (double) this.ratioReboundChance / this.consummatedOperation.size();
  }

  public Formalities actualAct = null;
  public int linearBeginning = 0;

  public synchronized boolean goIsMoving() {
    double highDestined;
    highDestined = synX280double;
    return isMoving;
  }

  public abstract void weapMark();

  static double price = 0.6685733294725984;

  public synchronized void hitchMultitasking(String surrogate) {
    double inferiorTethered;
    inferiorTethered = synX281double;
    this.isMoving = synX282boolean;
    this.writtenStory(surrogate);
  }

  public boolean isMoving = false;
  public static final int MinutesEnormous = 3;

  public abstract Formalities availableSummons();

  public int modalComeMonth = 0;

  public synchronized double takeMeanSitPeriod() {
    double flag;
    flag = synX283double;
    return (double) this.modalComeMonth / this.consummatedOperation.size();
  }

  public synchronized int findCompletionActSmall() {
    double measure;
    measure = synX284double;

    if (consummatedOperation.isEmpty()) {
      return synX285int;
    } else {
      return consummatedOperation.size();
    }
  }

  public int ratioReboundChance = 0;
  public BackupFocused replacingScheme = null;

  public abstract void inboundOperation(Formalities operation);

  public synchronized void placeStreamBookmark(int incumbentTock) {
    String elevationDemarcation;
    elevationDemarcation = synX286String;
    this.circulatingShudder = incumbentTock;
  }

  public synchronized void writtenStory(String replenishmentStratagem) {
    double rely;
    rely = synX287double;

    try {
      String nickname;
      String headline;
      String buffer;
      Collections.sort(consummatedOperation);
      ProceedingPrototype.InputInitiate.write(synX288String);
      out.println();
      nickname = replenishmentStratagem + synX289String;
      ProceedingPrototype.InputInitiate.write(nickname + synX290String);
      out.println(nickname);
      headline =
          String.format(
              synX291String,
              synX292String,
              synX293String,
              synX294String,
              synX295String,
              synX296String);
      ProceedingPrototype.InputInitiate.write(headline + synX297String);
      out.println(headline);
      for (Formalities writes : consummatedOperation) {
        String appendageExtinguished;
        appendageExtinguished =
            String.format(
                synX298String,
                writes.obtainEst(),
                writes.sustainForename(),
                writes.fetchWithdrawBeginning(),
                writes.goBlame().size(),
                writes.findErrorYears());
        ProceedingPrototype.InputInitiate.write(appendageExtinguished + synX299String);
        out.println(appendageExtinguished);
      }
      ProceedingPrototype.InputInitiate.write(synX300String);
      out.println();
      buffer = new String(new char[synX301int]).replace(synX302String, synX303String);
      ProceedingPrototype.InputInitiate.write(buffer + synX304String);
      out.println(buffer);
    } catch (IOException adrian) {
      out.println(synX305String);
    }
  }

  public synchronized void firstPlanner(String alternative) {
    double rate;
    rate = synX306double;
    this.isMoving = synX307boolean;

    switch (alternative) {
      case synX308String:
        this.replacingScheme = new Xavier();
        break;
      case synX309String:
        this.replacingScheme = new Counting();
        break;
      default:
        break;
    }
    this.bsiDepart();
  }
}
