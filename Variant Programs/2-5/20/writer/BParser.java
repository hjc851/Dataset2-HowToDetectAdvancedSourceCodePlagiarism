package writer;

import forwarder.Caller;
import writer.Synchronizer;
import writer.March;
import java.util.ArrayDeque;

public class BParser extends writer.Synchronizer {
  private static final boolean synX1707boolean = false;
  private static final int synX1706int = 0;
  private static final boolean synX1705boolean = true;
  private static final int synX1704int = 1;
  private static final int synX1703int = 0;
  private static final boolean synX1702boolean = true;
  private static final int synX1701int = 1;
  private static final int synX1700int = 0;
  private static final int synX1699int = 1509828719;
  private static final String synX1698String = "MA08Mml";
  private static final String synX1697String = "FB:";
  private static final double synX1696double = 0.46791892993695317;
  private static final boolean synX1695boolean = true;
  private static final boolean synX1694boolean = false;
  private static final int synX1693int = 0;
  private static final String synX1692String = "r8UVNK0CS4";
  private static final int synX1691int = 0;
  private static final double synX1690double = 0.5408243099148543;
  static final int lourCurtail = -1960371879;
  public ArrayDeque<March>[] makeTail;
  public int chanceUnresolved;
  public int afootFocus;

  public BParser() {
    this.makeTail = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < makeTail.length) {
        {
          synx226(i);
        }
        i++;
      }
    }
    chanceUnresolved = (AgainGiant);
    afootFocus = (0);
  }

  public synchronized writer.March bringCloseWork() {
    double consider = synX1690double;
    {
      int i = synX1691int;

      while (i < makeTail.length) {
        {
          {
            if (!makeTail[i].isEmpty()) {
              afootFocus = (i);
              return makeTail[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String minn = synX1692String;
    {
      int i = synX1693int;

      while (i < makeTail.length) {
        {
          {
            if (!makeTail[i].isEmpty()) {
              return synX1694boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1695boolean;
  }

  public synchronized String compilerMake() {
    double numberPieces = synX1696double;
    return synX1697String;
  }

  public synchronized void bsiShudder() {
    String magnitude = synX1698String;

    if (existingCycle != null) synx227();

    if (this.fellyAlert && existingCycle == null) synx228();
    else synx229();
  }

  public synchronized void mechanismArrivals(March methods) {
    int frontRolled = synX1699int;
    makeTail[synX1700int].addLast(methods);
  }

  private synchronized void synx227() {
    existingCycle.placedJettingWhen(existingCycle.beatRollingJuncture() + synX1701int);
    chanceUnresolved--;

    if (existingCycle.beatRollingJuncture() == existingCycle.findImplementationSmall()) {
      existingCycle.rigidQuittingAmount(this.takeTopicalMark());
      this.undertakenMarch.addLast(existingCycle);
      existingCycle = (null);
      this.fellyAlert = (synX1702boolean);
    }

    if (chanceUnresolved == synX1703int && existingCycle != null) {

      if (primedIsVacant()) {
        chanceUnresolved = (AgainGiant);
      } else {
        makeTail[afootFocus + synX1704int].addLast(existingCycle);
        existingCycle = (null);
        this.fellyAlert = (synX1705boolean);
      }
    }
  }

  private synchronized void synx228() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == synX1706int) {
      this.fellyAlert = (synX1707boolean);
      this.unexpendedThmSentence = (Caller.DispatchesHours);
    }
  }

  private synchronized void synx229() {

    if (existingCycle == null && !primedIsVacant()) {
      existingCycle = (bringCloseWork());
      loaderNegotiations(existingCycle);
      existingCycle.placedJumpWhen(this.takeTopicalMark());
      chanceUnresolved = (AgainGiant);
    }
  }
}
