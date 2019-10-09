import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Multitasking {
  protected int spoutingPeriods = 0;
  protected BackupFocused replacingScheme = null;

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized void nbsBegin() {}

  protected int normLookSentence = 0;

  public synchronized void stayParser(java.lang.String replaceable) {
    this.isMoving = false;
    this.printableDocument(replaceable);
  }

  public synchronized void printableDocument(java.lang.String alternativesProgram) {

    try {
      java.lang.String designation;
      java.lang.String overhead;
      java.lang.String supplement;
      java.util.Collections.sort(achievedMechanisms);
      LitigateMimic.QuantityBinder.write("\n");
      System.out.println();
      designation = alternativesProgram + " - Fixed";
      LitigateMimic.QuantityBinder.write(designation + "\n");
      System.out.println(designation);
      overhead =
          java.lang.String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      LitigateMimic.QuantityBinder.write(overhead + "\n");
      System.out.println(overhead);
      for (Serve postscript : achievedMechanisms) {
        java.lang.String treatRetired;
        treatRetired =
            java.lang.String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.becomePhoto(),
                postscript.bringRefer(),
                postscript.fixWithdrawalChance(),
                postscript.canAnomalies().size(),
                postscript.arriveWrongSeasons());
        LitigateMimic.QuantityBinder.write(treatRetired + "\n");
        System.out.println(treatRetired);
      }
      LitigateMimic.QuantityBinder.write("\n");
      System.out.println();
      supplement = new java.lang.String(new char[50]).replace("\0", "-");
      LitigateMimic.QuantityBinder.write(supplement + "\n");
      System.out.println(supplement);
    } catch (java.io.IOException adoptee) {
      System.out.println("Unable to write to file.");
    }
  }

  private int afootDials = 0;

  public synchronized double takeMeanUpturnPeriod() {
    return (double) this.moderateResurgencePeriods / this.achievedMechanisms.size();
  }

  public synchronized void fitUnderwayWalk(int actualRetick) {
    this.afootDials = actualRetick;
  }

  protected int moderateResurgencePeriods = 0;

  public synchronized int becomeConcludedPracticesQuantity() {

    if (achievedMechanisms.isEmpty()) {
      return 0;
    } else {
      return achievedMechanisms.size();
    }
  }

  protected java.util.LinkedList<Serve> achievedMechanisms = null;

  public synchronized int takeTopicalMark() {
    return afootDials;
  }

  public synchronized void outsetDeveloper(java.lang.String understudy) {
    this.isMoving = true;

    switch (understudy) {
      case "LRU":
        this.replacingScheme = new Texas();
        break;
      case "CLOCK":
        this.replacingScheme = new Hour();
        break;
      default:
        break;
    }
    this.nbsBegin();
  }

  public Multitasking() {
    this.isMoving = false;
    this.spoutingPeriods = 0;
    this.delayHour = 0;
    this.normLookSentence = 0;
    this.moderateResurgencePeriods = 0;
    this.afootDials = -1;
    this.achievedMechanisms = new java.util.LinkedList<>();
  }

  protected boolean isMoving = false;
  protected Serve theMethodology = null;

  public abstract void addTock();

  public static final int MeterMeasure = 3;

  public synchronized double conveyRegularHopeAmount() {
    return (double) this.normLookSentence / this.achievedMechanisms.size();
  }

  public abstract void mortarProceedings(Serve litigate);

  public abstract Serve willingWork();

  protected int delayHour = 0;
}
