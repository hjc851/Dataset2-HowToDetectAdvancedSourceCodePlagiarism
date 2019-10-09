package spreadsheet;

import consignor.Dealer;
import spreadsheet.Database;
import spreadsheet.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends spreadsheet.Database {
  private static final boolean synX843boolean = false;
  private static final int synX842int = 0;
  private static final boolean synX841boolean = true;
  private static final int synX840int = 1;
  private static final int synX839int = 2;
  private static final int synX838int = 0;
  private static final boolean synX837boolean = true;
  private static final int synX836int = 1;
  private static final String synX835String = "NRR:";
  private java.util.ArrayDeque<GrrProcedure> wantGlue = null;
  private int thingLingering = 0;
  private spreadsheet.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.wantGlue = (new java.util.ArrayDeque<>());
    thingLingering = (Database.MinutesEnormous);
  }

  public synchronized String controllerSurname() {
    return synX835String;
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.fitSquirtingYear(grrProcedure.canLengthwaysYears() + synX836int);
      thingLingering--;

      if (grrProcedure.canLengthwaysYears() == grrProcedure.canChairmanAmount()) {
        grrProcedure.fitDieYear(this.arriveFlowIndicate());
        this.doneAppendage.addLast(grrProcedure);
        grrProcedure = (null);
        this.malcolmIris = (synX837boolean);
      }

      if (thingLingering == synX838int && grrProcedure != null) {

        if (wantGlue.isEmpty()) {
          thingLingering = (grrProcedure.fixChanceNumber());
        } else {

          if (grrProcedure.fixChanceNumber() > synX839int) {
            grrProcedure.situatedMinutesEnormous(grrProcedure.fixChanceNumber() - synX840int);
          }

          wantGlue.addLast(grrProcedure);
          grrProcedure = (null);
          this.malcolmIris = (synX841boolean);
        }
      }
    }

    if (this.malcolmIris && prevalentMethod == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == synX842int) {
        this.malcolmIris = (synX843boolean);
        this.additionalDikMonth = (Dealer.HitPeriods);
      }

    } else {

      if (grrProcedure == null && !wantGlue.isEmpty()) {
        grrProcedure = (wantGlue.removeFirst());
        ladeProcedures(grrProcedure);
        grrProcedure.markKickoffHours(this.arriveFlowIndicate());
        thingLingering = (grrProcedure.fixChanceNumber());
      }
    }
  }

  public synchronized void mechanismArrivals(Procedure phase) {
    wantGlue.add(new spreadsheet.GrrProcedure(phase));
  }
}
