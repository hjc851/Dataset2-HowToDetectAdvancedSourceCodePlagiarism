import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Organizer {
  protected boolean isMoving;
  protected int movingClock;
  protected int standbyOpportunity;
  protected LinkedList<Summons> accomplishedProcedure;
  protected int normLookSentence;
  protected int mediocreReversionMoment;
  protected TranspositionInitiative backupFocused;
  public static final int AmountMarkers = 3;
  protected Summons circulatingServe;
  private int newTally;

  public Organizer() {
    this.isMoving = false;
    this.movingClock = 0;
    this.standbyOpportunity = 0;
    this.normLookSentence = 0;
    this.mediocreReversionMoment = 0;
    this.newTally = -1;
    this.accomplishedProcedure = new LinkedList<>();
  }

  public void beganSpreadsheet(String replenishment) {
    this.isMoving = true;

    switch (replenishment) {
      case "LRU":
        this.backupFocused = new Oklahoma();
        break;
      case "CLOCK":
        this.backupFocused = new Back();
        break;
      default:
        break;
    }
    this.optiCommence();
  }

  public void haltProgrammer(String substitution) {
    this.isMoving = false;
    this.editionAnnouncement(substitution);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int arriveUndertookProceduresWingspan() {

    if (accomplishedProcedure.isEmpty()) {
      return 0;
    } else {
      return accomplishedProcedure.size();
    }
  }

  public int catchRifeCheck() {
    return newTally;
  }

  public void situatedPresentlyMarch(int presentlyMarch) {
    this.newTally = presentlyMarch;
  }

  public double makeOrdinaryHoldDay() {
    return (double) this.normLookSentence / this.accomplishedProcedure.size();
  }

  public double letMediumReorganizationHours() {
    return (double) this.mediocreReversionMoment / this.accomplishedProcedure.size();
  }

  public void editionAnnouncement(String refillingGambit) {

    try {
      Collections.sort(accomplishedProcedure);
      MethodologyEmulator.ProducePaperwork.write("\n");
      System.out.println();
      String titolo = refillingGambit + " - Fixed";
      MethodologyEmulator.ProducePaperwork.write(titolo + "\n");
      System.out.println(titolo);
      String coping =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodologyEmulator.ProducePaperwork.write(coping + "\n");
      System.out.println(coping);
      for (Summons writes : accomplishedProcedure) {
        String proceduresQuenched =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                writes.beatUser(),
                writes.makeIdentify(),
                writes.driveExodusAgain(),
                writes.becomeLapses().size(),
                writes.comeMistakeOccasions());
        MethodologyEmulator.ProducePaperwork.write(proceduresQuenched + "\n");
        System.out.println(proceduresQuenched);
      }
      MethodologyEmulator.ProducePaperwork.write("\n");
      System.out.println();
      String splitting = new String(new char[50]).replace("\0", "-");
      MethodologyEmulator.ProducePaperwork.write(splitting + "\n");
      System.out.println(splitting);
    } catch (IOException tipp) {
      System.out.println("Unable to write to file.");
    }
  }

  public void optiCommence() {}

  public abstract void nsoTic();

  public abstract void enteringAppendage(Summons operation);

  public abstract Summons fixProcedures();
}
