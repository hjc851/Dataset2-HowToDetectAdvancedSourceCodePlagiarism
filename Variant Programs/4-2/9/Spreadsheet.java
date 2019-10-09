import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Spreadsheet {
  protected boolean isMoving;
  protected int jettingWhen;
  protected int expectingDays;
  protected LinkedList<Outgrowth> constructedMethodology;
  protected int moderateDeferPeriods;
  protected int typicalRevitalizationHour;
  protected RenewalTactic switchApproach;
  public static final int YearsSize = 3;
  protected Outgrowth latestOperation;
  private int continuingVibrate;

  public Spreadsheet() {
    this.isMoving = false;
    this.jettingWhen = 0;
    this.expectingDays = 0;
    this.moderateDeferPeriods = 0;
    this.typicalRevitalizationHour = 0;
    this.continuingVibrate = -1;
    this.constructedMethodology = new LinkedList<>();
  }

  public void kickoffSpooler(String alternative) {
    this.isMoving = true;

    switch (alternative) {
      case "LRU":
        this.switchApproach = new Tennessee();
        break;
      case "CLOCK":
        this.switchApproach = new Noon();
        break;
      default:
        break;
    }
    this.snoBeginning();
  }

  public void ceaseOrganizer(String surrogate) {
    this.isMoving = false;
    this.impressPaper(surrogate);
  }

  public boolean goIsMoving() {
    return isMoving;
  }

  public int haveConductedServeLarge() {

    if (constructedMethodology.isEmpty()) {
      return 0;
    } else {
      return constructedMethodology.size();
    }
  }

  public int obtainLiveTic() {
    return continuingVibrate;
  }

  public void placeStreamBookmark(int presentlyMarch) {
    this.continuingVibrate = presentlyMarch;
  }

  public double obtainIntermediateBideDays() {
    return (double) this.moderateDeferPeriods / this.constructedMethodology.size();
  }

  public double fixRatioReboundChance() {
    return (double) this.typicalRevitalizationHour / this.constructedMethodology.size();
  }

  public void impressPaper(String substitutedIge) {

    try {
      Collections.sort(constructedMethodology);
      MethodologyEmulator.ExportationPapers.write("\n");
      System.out.println();
      String entitle = substitutedIge + " - Fixed";
      MethodologyEmulator.ExportationPapers.write(entitle + "\n");
      System.out.println(entitle);
      String caption =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      MethodologyEmulator.ExportationPapers.write(caption + "\n");
      System.out.println(caption);
      for (Outgrowth postscript : constructedMethodology) {
        String negotiationsExterior =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                postscript.receiveCard(),
                postscript.makeIdentify(),
                postscript.makeOutletDay(),
                postscript.drawWeaknesses().size(),
                postscript.fetchDefectiveRounds());
        MethodologyEmulator.ExportationPapers.write(negotiationsExterior + "\n");
        System.out.println(negotiationsExterior);
      }
      MethodologyEmulator.ExportationPapers.write("\n");
      System.out.println();
      String buffer = new String(new char[50]).replace("\0", "-");
      MethodologyEmulator.ExportationPapers.write(buffer + "\n");
      System.out.println(buffer);
    } catch (IOException tipp) {
      System.out.println("Unable to write to file.");
    }
  }

  public void snoBeginning() {}

  public abstract void optiBeat();

  public abstract void entryPhase(Outgrowth appendage);

  public abstract Outgrowth quickAppendage();
}
