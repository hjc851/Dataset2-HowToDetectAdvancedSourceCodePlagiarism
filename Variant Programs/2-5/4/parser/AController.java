package parser;

import plenum.Exporter;
import parser.Timer;
import parser.March;
import java.util.ArrayDeque;

public class AController extends Timer {
  private static final boolean synX538boolean = false;
  private static final int synX537int = 0;
  private static final boolean synX536boolean = true;
  private static final int synX535int = 0;
  private static final boolean synX534boolean = true;
  private static final int synX533int = 1;
  private static final String synX532String = "";
  private static final double synX531double = 0.6030209120992435;
  private static final String synX530String = "RR:";
  private static final double synX529double = 0.8187653056256665;
  public static final int integral = -667448030;

  public AController() {
    this.prepareLine = (new ArrayDeque<>());
    clipOther = (OpportunityDramatic);
  }

  public ArrayDeque<March> prepareLine = null;

  public synchronized String workspaceForename() {
    double highestLimit;
    highestLimit = (synX529double);
    return synX530String;
  }

  public synchronized void cycleIn(March methodology) {
    double senateCurb;
    senateCurb = (synX531double);
    prepareLine.addLast(methodology);
  }

  public synchronized void ourTicktack() {
    String glowerRestrictions;
    glowerRestrictions = (synX532String);

    if (underwayTreat != null) {
      underwayTreat.fixGoingThing(underwayTreat.receivePouringMoment() + synX533int);
      clipOther--;

      if (underwayTreat.receivePouringMoment() == underwayTreat.generateHonchoFootprint()) {
        underwayTreat.readyOutletDay(this.takeTopicalMark());
        this.concludedPractices.addLast(underwayTreat);
        underwayTreat = (null);
        this.whinAdmiral = (synX534boolean);
      }

      if (clipOther == synX535int && underwayTreat != null) {

        if (prepareLine.isEmpty()) {
          clipOther = (OpportunityDramatic);
        } else {
          prepareLine.addLast(underwayTreat);
          underwayTreat = (null);
          this.whinAdmiral = (synX536boolean);
        }
      }
    }

    if (this.whinAdmiral && underwayTreat == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX537int) {
        this.whinAdmiral = (synX538boolean);
        this.stayLtsHour = (Exporter.MurderWhen);
      }

    } else {

      if (underwayTreat == null && !prepareLine.isEmpty()) {
        underwayTreat = (prepareLine.removeFirst());
        encumbranceSummons(underwayTreat);
        underwayTreat.readyOutsetDay(this.takeTopicalMark());
        clipOther = (OpportunityDramatic);
      }
    }
  }

  public int clipOther = 0;
}
