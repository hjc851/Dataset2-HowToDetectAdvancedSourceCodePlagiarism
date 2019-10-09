package parser;

import plenum.Exporter;
import parser.Timer;
import parser.March;
import java.util.ArrayDeque;

public class GrrProgrammer extends Timer {
  private static final int synX507int = -1013395641;
  private static final boolean synX506boolean = false;
  private static final int synX505int = 0;
  private static final boolean synX504boolean = true;
  private static final int synX503int = 1;
  private static final int synX502int = 2;
  private static final int synX501int = 0;
  private static final boolean synX500boolean = true;
  private static final int synX499int = 1;
  private static final double synX498double = 0.25004589996437243;
  private static final String synX497String = "NRR:";
  private static final int synX496int = -311095670;

  public synchronized String workspaceForename() {
    int kilogram;
    kilogram = (synX496int);
    return synX497String;
  }

  public GrrProcedure grrProcedure = null;
  public int amountKeeping = 0;

  public GrrProgrammer() {
    this.preparesSuspense = (new ArrayDeque<>());
    amountKeeping = (Timer.OpportunityDramatic);
  }

  public synchronized void ourTicktack() {
    double higherBound;
    higherBound = (synX498double);

    if (grrProcedure != null) {
      grrProcedure.fixGoingThing(grrProcedure.receivePouringMoment() + synX499int);
      amountKeeping--;

      if (grrProcedure.receivePouringMoment() == grrProcedure.generateHonchoFootprint()) {
        grrProcedure.readyOutletDay(this.takeTopicalMark());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = (null);
        this.whinAdmiral = (synX500boolean);
      }

      if (amountKeeping == synX501int && grrProcedure != null) {

        if (preparesSuspense.isEmpty()) {
          amountKeeping = (grrProcedure.drawWeekVolume());
        } else {

          if (grrProcedure.drawWeekVolume() > synX502int) {
            grrProcedure.laidClipQuantity(grrProcedure.drawWeekVolume() - synX503int);
          }

          preparesSuspense.addLast(grrProcedure);
          grrProcedure = (null);
          this.whinAdmiral = (synX504boolean);
        }
      }
    }

    if (this.whinAdmiral && underwayTreat == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX505int) {
        this.whinAdmiral = (synX506boolean);
        this.stayLtsHour = (Exporter.MurderWhen);
      }

    } else {

      if (grrProcedure == null && !preparesSuspense.isEmpty()) {
        grrProcedure = (preparesSuspense.removeFirst());
        encumbranceSummons(grrProcedure);
        grrProcedure.readyOutsetDay(this.takeTopicalMark());
        amountKeeping = (grrProcedure.drawWeekVolume());
      }
    }
  }

  public synchronized void cycleIn(March summons) {
    int lotGauge;
    lotGauge = (synX507int);
    preparesSuspense.add(new GrrProcedure(summons));
  }

  public ArrayDeque<GrrProcedure> preparesSuspense = null;
  public static final double topShackled = 0.9147990450452881;
}
