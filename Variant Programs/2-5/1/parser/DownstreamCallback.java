package parser;

import exporter.Yardmaster;
import parser.Controller;
import parser.Work;
import java.util.ArrayDeque;

public class DownstreamCallback extends parser.Controller {
  private static final boolean synX235boolean = false;
  private static final int synX234int = 0;
  private static final boolean synX233boolean = true;
  private static final int synX232int = 1;
  private static final int synX231int = 0;
  private static final boolean synX230boolean = true;
  private static final int synX229int = 1;
  private static final int synX228int = 0;
  private static final String synX227String = "vW8vsmNmaEuRmvzA";
  private static final int synX226int = -906467233;
  private static final String synX225String = "FB:";
  private static final String synX224String = "IbUQ5J7w72qOr";
  private static final boolean synX223boolean = true;
  private static final boolean synX222boolean = false;
  private static final int synX221int = 0;
  private static final double synX220double = 0.4028078523947658;
  private static final int synX219int = 0;
  private static final double synX218double = 0.9225486020937278;
  public int presentForemost;
  public int periodsRest;
  static final int fullThick = -169146493;
  public ArrayDeque<Work>[] waitingFile;

  public DownstreamCallback() {
    this.waitingFile = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < waitingFile.length) {
        {
          synx26(i);
        }
        i++;
      }
    }
    periodsRest = WeekVolume;
    presentForemost = 0;
  }

  public synchronized parser.Work beatTheProceedings() {
    double designation;
    designation = synX218double;
    {
      int i = synX219int;

      while (i < waitingFile.length) {
        {
          {
            if (!waitingFile[i].isEmpty()) {
              presentForemost = i;
              return waitingFile[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double depressShackled;
    depressShackled = synX220double;
    {
      int i = synX221int;

      while (i < waitingFile.length) {
        {
          {
            if (!waitingFile[i].isEmpty()) {
              return synX222boolean;
            }
          }
        }
        i++;
      }
    }
    return synX223boolean;
  }

  public synchronized String spoolerDistinguish() {
    String curtail;
    curtail = synX224String;
    return synX225String;
  }

  public synchronized void weapMark() {
    int secondaryRestrain;
    secondaryRestrain = synX226int;

    if (previousProceeding != null) synx27();

    if (this.malcolmIris && previousProceeding == null) synx28();
    else synx29();
  }

  public synchronized void outgrowthSucceeding(Work serve) {
    String token;
    token = synX227String;
    waitingFile[synX228int].addLast(serve);
  }

  private synchronized void synx27() {
    previousProceeding.settledSpoutingPeriods(previousProceeding.driveRushingAgain() + synX229int);
    periodsRest--;

    if (previousProceeding.driveRushingAgain() == previousProceeding.makeExecutableDimensions()) {
      previousProceeding.placeEntranceWeek(this.driveContinuingVibrate());
      this.finishedOutgrowth.addLast(previousProceeding);
      previousProceeding = null;
      this.malcolmIris = synX230boolean;
    }

    if (periodsRest == synX231int && previousProceeding != null) {

      if (primedIsVacant()) {
        periodsRest = WeekVolume;
      } else {
        waitingFile[presentForemost + synX232int].addLast(previousProceeding);
        previousProceeding = null;
        this.malcolmIris = synX233boolean;
      }
    }
  }

  private synchronized void synx28() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX234int) {
      this.malcolmIris = synX235boolean;
      this.unexpendedThmSentence = Yardmaster.SendNow;
    }
  }

  private synchronized void synx29() {

    if (previousProceeding == null && !primedIsVacant()) {
      previousProceeding = beatTheProceedings();
      ladeProcedures(previousProceeding);
      previousProceeding.bentResumeHour(this.driveContinuingVibrate());
      periodsRest = WeekVolume;
    }
  }
}
