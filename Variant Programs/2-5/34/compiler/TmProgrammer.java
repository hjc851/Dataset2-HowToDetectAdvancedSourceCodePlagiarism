package compiler;

import salesperson.Dealer;
import compiler.Synchronizer;
import compiler.Proceeding;
import java.util.ArrayDeque;

public class TmProgrammer extends compiler.Synchronizer {
  private static final boolean synX2520boolean = false;
  private static final int synX2519int = 0;
  private static final boolean synX2518boolean = true;
  private static final int synX2517int = 1;
  private static final int synX2516int = 0;
  private static final boolean synX2515boolean = true;
  private static final int synX2514int = 1;
  private static final int synX2513int = 0;
  private static final int synX2512int = 0;
  private static final int synX2511int = 0;
  private static final int synX2510int = 6;
  private static final boolean synX2509boolean = true;
  private static final boolean synX2508boolean = false;
  private static final int synX2507int = 0;
  private static final int synX2506int = 0;
  private static final String synX2505String = "FB:";

  public synchronized String serverDiagnose() {
    return synX2505String;
  }

  public synchronized void methodEntrance(Proceeding outgrowth) {
    reluctantGridlock[synX2506int].addLast(outgrowth);
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = synX2507int;

      while (i < reluctantGridlock.length) {
        {
          {
            if (!reluctantGridlock[i].isEmpty()) {
              return synX2508boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2509boolean;
  }

  public synchronized void weapMark() {

    if (continuingMechanisms != null) synx446();

    if (this.whinAdmiral && continuingMechanisms == null) synx447();
    else synx448();
  }

  public TmProgrammer() {
    this.reluctantGridlock = new java.util.ArrayDeque[synX2510int];
    {
      int i = synX2511int;

      while (i < reluctantGridlock.length) {
        {
          synx449(i);
        }
        i++;
      }
    }
    minutesLatter = WeekVolume;
    actualAnteriority = synX2512int;
  }

  private ArrayDeque<Proceeding>[] reluctantGridlock;
  private int minutesLatter;
  private int actualAnteriority;

  private synchronized compiler.Proceeding letAheadSummons() {
    {
      int i = synX2513int;

      while (i < reluctantGridlock.length) {
        {
          {
            if (!reluctantGridlock[i].isEmpty()) {
              actualAnteriority = i;
              return reluctantGridlock[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized void synx446() {
    continuingMechanisms.arrangedFlowingSentence(
        continuingMechanisms.drawSpurtingWeek() + synX2514int);
    minutesLatter--;

    if (continuingMechanisms.drawSpurtingWeek()
        == continuingMechanisms.makeExecutableDimensions()) {
      continuingMechanisms.dictatedLossMeter(this.letAfootDials());
      this.undertookProcedures.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.whinAdmiral = synX2515boolean;
    }

    if (minutesLatter == synX2516int && continuingMechanisms != null) {

      if (primedIsVacant()) {
        minutesLatter = WeekVolume;
      } else {
        reluctantGridlock[actualAnteriority + synX2517int].addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.whinAdmiral = synX2518boolean;
      }
    }
  }

  private synchronized void synx447() {
    this.restAllanPeriods--;

    if (restAllanPeriods == synX2519int) {
      this.whinAdmiral = synX2520boolean;
      this.restAllanPeriods = Dealer.ShipmentClip;
    }
  }

  private synchronized void synx448() {

    if (continuingMechanisms == null && !primedIsVacant()) {
      continuingMechanisms = letAheadSummons();
      payloadOperation(continuingMechanisms);
      continuingMechanisms.laidBeginningClip(this.letAfootDials());
      minutesLatter = WeekVolume;
    }
  }

  private synchronized void synx449(int i) {
    reluctantGridlock[i] = new java.util.ArrayDeque<>();
  }
}
