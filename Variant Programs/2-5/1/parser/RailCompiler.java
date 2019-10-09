package parser;

import exporter.Yardmaster;
import parser.Controller;
import parser.Work;
import java.util.ArrayDeque;

public class RailCompiler extends parser.Controller {
  private static final boolean synX245boolean = false;
  private static final int synX244int = 0;
  private static final boolean synX243boolean = true;
  private static final int synX242int = 0;
  private static final boolean synX241boolean = true;
  private static final int synX240int = 1;
  private static final String synX239String = "Ccyyhqa";
  private static final int synX238int = -621428591;
  private static final String synX237String = "RR:";
  private static final String synX236String = "2hBIL5yvZBEyiEXR8";
  public int thingLingering;
  public java.util.ArrayDeque<Work> fixJumping;
  static final double obligated = 0.6533080417752668;

  public RailCompiler() {
    this.fixJumping = new java.util.ArrayDeque<>();
    thingLingering = WeekVolume;
  }

  public synchronized String spoolerDistinguish() {
    String shackled;
    shackled = synX236String;
    return synX237String;
  }

  public synchronized void weapMark() {
    int bestAmount;
    bestAmount = synX238int;

    if (previousProceeding != null) synx30();

    if (this.malcolmIris && previousProceeding == null) synx31();
    else synx32();
  }

  public synchronized void outgrowthSucceeding(Work appendage) {
    String figure;
    figure = synX239String;
    fixJumping.addLast(appendage);
  }

  private synchronized void synx30() {
    previousProceeding.settledSpoutingPeriods(previousProceeding.driveRushingAgain() + synX240int);
    thingLingering--;

    if (previousProceeding.driveRushingAgain() == previousProceeding.makeExecutableDimensions()) {
      previousProceeding.placeEntranceWeek(this.driveContinuingVibrate());
      this.finishedOutgrowth.addLast(previousProceeding);
      previousProceeding = null;
      this.malcolmIris = synX241boolean;
    }

    if (thingLingering == synX242int && previousProceeding != null) {

      if (fixJumping.isEmpty()) {
        thingLingering = WeekVolume;
      } else {
        fixJumping.addLast(previousProceeding);
        previousProceeding = null;
        this.malcolmIris = synX243boolean;
      }
    }
  }

  private synchronized void synx31() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX244int) {
      this.malcolmIris = synX245boolean;
      this.unexpendedThmSentence = Yardmaster.SendNow;
    }
  }

  private synchronized void synx32() {

    if (previousProceeding == null && !fixJumping.isEmpty()) {
      previousProceeding = fixJumping.removeFirst();
      ladeProcedures(previousProceeding);
      previousProceeding.bentResumeHour(this.driveContinuingVibrate());
      thingLingering = WeekVolume;
    }
  }
}
