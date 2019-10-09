package writer;

import coordinator.Distributor;
import writer.Server;
import writer.Phase;
import java.util.ArrayDeque;

public class LmDebugging extends writer.Server {
  private static final boolean synX1253boolean = false;
  private static final int synX1252int = 0;
  private static final boolean synX1251boolean = true;
  private static final int synX1250int = 1;
  private static final int synX1249int = 0;
  private static final boolean synX1248boolean = true;
  private static final int synX1247int = 1;
  private static final int synX1246int = 0;
  private static final double synX1245double = 0.7215911890751966;
  private static final String synX1244String = "c";
  private static final String synX1243String = "FB:";
  private static final int synX1242int = -533237364;
  private static final boolean synX1241boolean = true;
  private static final boolean synX1240boolean = false;
  private static final int synX1239int = 0;
  private static final int synX1238int = -1217728295;
  private static final int synX1237int = 0;
  private static final int synX1236int = -659448234;
  static double advert = 0.9554830866427501;
  public ArrayDeque<Phase>[] willingStalks;
  public int minutesLatter;
  public int newImportant;

  public LmDebugging() {
    this.willingStalks = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < willingStalks.length) {
        {
          synx166(i);
        }
        i++;
      }
    }
    minutesLatter = AmountMarkers;
    newImportant = 0;
  }

  public synchronized writer.Phase takeLaterAppendage() {
    int premium = synX1236int;
    {
      int i = synX1237int;

      while (i < willingStalks.length) {
        {
          {
            if (!willingStalks[i].isEmpty()) {
              newImportant = i;
              return willingStalks[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int maximum = synX1238int;
    {
      int i = synX1239int;

      while (i < willingStalks.length) {
        {
          {
            if (!willingStalks[i].isEmpty()) {
              return synX1240boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1241boolean;
  }

  public synchronized String parserFigure() {
    int central = synX1242int;
    return synX1243String;
  }

  public synchronized void ourTicktack() {
    String total = synX1244String;

    if (topicalAppendage != null) synx167();

    if (this.reckTricolor && topicalAppendage == null) synx168();
    else synx169();
  }

  public synchronized void procedureIngoing(Phase procedures) {
    double numbersObjects = synX1245double;
    willingStalks[synX1246int].addLast(procedures);
  }

  private synchronized void synx167() {
    topicalAppendage.readyFlyingDay(topicalAppendage.goMovingClock() + synX1247int);
    minutesLatter--;

    if (topicalAppendage.goMovingClock() == topicalAppendage.arrivePrezWingspan()) {
      topicalAppendage.orderedWithdrawalChance(this.conveyFormerGene());
      this.achievedMechanisms.addLast(topicalAppendage);
      topicalAppendage = null;
      this.reckTricolor = synX1248boolean;
    }

    if (minutesLatter == synX1249int && topicalAppendage != null) {

      if (primedIsVacant()) {
        minutesLatter = AmountMarkers;
      } else {
        willingStalks[newImportant + synX1250int].addLast(topicalAppendage);
        topicalAppendage = null;
        this.reckTricolor = synX1251boolean;
      }
    }
  }

  private synchronized void synx168() {
    this.unexhaustedTelaMoment--;

    if (unexhaustedTelaMoment == synX1252int) {
      this.reckTricolor = synX1253boolean;
      this.unexhaustedTelaMoment = Distributor.DispatchedMonth;
    }
  }

  private synchronized void synx169() {

    if (topicalAppendage == null && !primedIsVacant()) {
      topicalAppendage = takeLaterAppendage();
      lodePhase(topicalAppendage);
      topicalAppendage.layFirstMoment(this.conveyFormerGene());
      minutesLatter = AmountMarkers;
    }
  }
}
