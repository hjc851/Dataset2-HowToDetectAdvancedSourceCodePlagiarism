import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Outliner {

  public Outliner() {
    this.isMoving = false;
    this.movingClock = 0;
    this.pendingMonth = 0;
    this.approximatelyLingerOpportunity = 0;
    this.medianTurnroundClock = 0;
    this.newTally = -1;
    this.executedMethods = new LinkedList<>();
  }

  protected int pendingMonth = 0;
  protected boolean isMoving = false;

  public synchronized int sustainThisValidation() {
    return newTally;
  }

  public synchronized int beatInauguratedOperationsSeverity() {

    if (executedMethods.isEmpty()) {
      return 0;
    } else {
      return executedMethods.size();
    }
  }

  protected LinkedList<Negotiations> executedMethods = null;
  protected int medianTurnroundClock = 0;

  public abstract Negotiations preppedNegotiations();

  public abstract void inboundOperation(Negotiations treat);

  public synchronized void snoBeginning() {}

  public synchronized double conveyRegularHopeAmount() {
    return (double) this.approximatelyLingerOpportunity / this.executedMethods.size();
  }

  protected SubstituteStrategic backupFocused = null;

  public synchronized double findNormReverseSentence() {
    return (double) this.medianTurnroundClock / this.executedMethods.size();
  }

  protected Negotiations presentlyMechanism = null;

  public synchronized void placedRifeCheck(int rifeCheck) {
    this.newTally = rifeCheck;
  }

  public synchronized void layoverConfiguration(String replaceable) {
    this.isMoving = false;
    this.paperReputation(replaceable);
  }

  public static final int HourPurity = 3;

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  protected int approximatelyLingerOpportunity = 0;
  private int newTally = 0;
  protected int movingClock = 0;

  public abstract void bpsRetick();

  public synchronized void startleOutliner(String substitution) {
    this.isMoving = true;

    switch (substitution) {
      case "LRU":
        this.backupFocused = new Memphis();
        break;
      case "CLOCK":
        this.backupFocused = new Waking();
        break;
      default:
        break;
    }
    this.snoBeginning();
  }

  public synchronized void paperReputation(String refillingGambit) {

    try {
      Collections.sort(executedMethods);
      TreatModelling.InputInitiate.write("\n");
      System.out.println();
      String rights = refillingGambit + " - Fixed";
      TreatModelling.InputInitiate.write(rights + "\n");
      System.out.println(rights);
      String masthead =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      TreatModelling.InputInitiate.write(masthead + "\n");
      System.out.println(masthead);
      for (Negotiations postscript : executedMethods) {
        String cycleProscribed =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.letIdentification(),
                postscript.findMention(),
                postscript.letDeceaseHours(),
                postscript.developErrors().size(),
                postscript.comeMistakeOccasions());
        TreatModelling.InputInitiate.write(cycleProscribed + "\n");
        System.out.println(cycleProscribed);
      }
      TreatModelling.InputInitiate.write("\n");
      System.out.println();
      String standoff = new String(new char[50]).replace("\0", "-");
      TreatModelling.InputInitiate.write(standoff + "\n");
      System.out.println(standoff);
    } catch (IOException abbe) {
      System.out.println("Unable to write to file.");
    }
  }
}
