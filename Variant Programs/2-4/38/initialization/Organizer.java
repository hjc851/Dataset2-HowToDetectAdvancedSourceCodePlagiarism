package initialization;

import device.Distributor;
import mockup.MarchDevice;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Organizer {
  public int contemporaryTicktack;
  public initialization.Act formerFormalities;
  public static final int HoursHuge = 4;
  public int latterSthMinutes;
  public boolean fellyAlert;
  public int percentageTransitionNow;
  public int halfNotJuncture;
  public java.util.LinkedList<Act> concludedPractices;
  public int expectedHours;
  public int scamperingDays;
  public boolean isMoving;

  public Organizer() {
    this.isMoving = false;
    this.scamperingDays = 0;
    this.expectedHours = 0;
    this.halfNotJuncture = 0;
    this.percentageTransitionNow = 0;
    this.contemporaryTicktack = -1;
    this.concludedPractices = new java.util.LinkedList<>();
    this.fellyAlert = true;
  }

  public synchronized void beginningOrganizer() {
    this.isMoving = true;
    this.latterSthMinutes = Distributor.DetachmentBeginning;
    this.snoBeginning();
  }

  public synchronized void closureServer() {
    this.isMoving = false;
    this.lithographRecommendations();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int findCompletionActSmall() {

    if (concludedPractices.isEmpty()) {
      return 0;
    } else {
      return concludedPractices.size();
    }
  }

  public synchronized int obtainLiveTic() {
    return contemporaryTicktack;
  }

  public synchronized void situatedPresentlyMarch(int typicalGenetic) {
    this.contemporaryTicktack = typicalGenetic;
  }

  public synchronized double startOverallLetMinutes() {
    return (double) this.halfNotJuncture / this.concludedPractices.size();
  }

  public synchronized double fixRatioReboundChance() {
    return (double) this.percentageTransitionNow / this.concludedPractices.size();
  }

  public synchronized void lithographRecommendations() {

    try {
      java.lang.String letterhead;
      java.util.Collections.sort(concludedPractices);
      MarchDevice.IntensityReadme.write("\n");
      System.out.println();
      letterhead =
          java.lang.String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      MarchDevice.IntensityReadme.write(letterhead + "\n");
      System.out.println(letterhead);
      for (initialization.Act postscript : concludedPractices) {
        int expectMeter;
        int convertSomeMeter;
        java.lang.String sue;
        expectMeter =
            postscript.canEgressYears()
                - postscript.driveAriseAgain()
                - postscript.beatProgrammerSeverity();
        convertSomeMeter = postscript.canEgressYears() - postscript.driveAriseAgain();
        this.halfNotJuncture += expectMeter;
        this.percentageTransitionNow += convertSomeMeter;
        sue =
            java.lang.String.format(
                "%-7s%16d%19d", postscript.comeMilad(), expectMeter, convertSomeMeter);
        MarchDevice.IntensityReadme.write(sue + "\n");
        System.out.println(sue);
      }
      MarchDevice.IntensityReadme.write("\n");
      System.out.println();
    } catch (java.io.IOException adrian) {
      System.out.println("Unable to write " + this.spoolerDistinguish() + " to file.");
    }
  }

  public synchronized void snoBeginning() {

    try {
      MarchDevice.IntensityReadme.write("\n");
      System.out.println();
      MarchDevice.IntensityReadme.write("\n" + this.spoolerDistinguish() + "\n");
      System.out.println(this.spoolerDistinguish());
    } catch (java.io.IOException voto) {
      System.out.println("Unable to write " + this.spoolerDistinguish() + " to file.");
    }
  }

  public synchronized void consignmentTreat(initialization.Act vig) {

    try {
      java.lang.String cycle;
      cycle =
          java.lang.String.format("%-5s%3s", "T" + (this.obtainLiveTic()) + ":", vig.comeMilad());
      MarchDevice.IntensityReadme.write(cycle + "\n");
      System.out.println(cycle);
    } catch (java.io.IOException afterwards) {
      System.out.println("Unable to write " + this.spoolerDistinguish() + " to file.");
    }
  }

  public abstract java.lang.String spoolerDistinguish();

  public abstract void bpsRetick();

  public abstract void workElect(initialization.Act system);
}
