package parser;

import plenum.Exporter;
import parser.Timer;
import parser.March;
import java.util.ArrayDeque;

public class LampsProgrammer extends Timer {
  private static final String synX555String = "Ub";
  private static final boolean synX554boolean = false;
  private static final int synX553int = 0;
  private static final boolean synX552boolean = true;
  private static final int synX551int = 1;
  private static final double synX550double = 0.21366762866276012;
  private static final String synX549String = "FCFS:";
  private static final double synX548double = 0.9055144037684786;

  public synchronized String workspaceForename() {
    double fukien;
    fukien = (synX548double);
    return synX549String;
  }

  public synchronized void ourTicktack() {
    double minimum;
    minimum = (synX550double);

    if (underwayTreat != null) {
      underwayTreat.fixGoingThing(underwayTreat.receivePouringMoment() + synX551int);

      if (underwayTreat.receivePouringMoment() == underwayTreat.generateHonchoFootprint()) {
        underwayTreat.readyOutletDay(this.takeTopicalMark());
        this.concludedPractices.addLast(underwayTreat);
        underwayTreat = (null);
        this.whinAdmiral = (synX552boolean);
      }
    }

    if (this.whinAdmiral && underwayTreat == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX553int) {
        this.whinAdmiral = (synX554boolean);
        this.stayLtsHour = (Exporter.MurderWhen);
      }

    } else {

      if (underwayTreat == null && !poisedDipper.isEmpty()) {
        underwayTreat = (poisedDipper.removeFirst());
        underwayTreat.readyOutsetDay(this.takeTopicalMark());
        encumbranceSummons(underwayTreat);
      }
    }
  }

  public ArrayDeque<March> poisedDipper = null;

  public synchronized void cycleIn(March phase) {
    String appreciate;
    appreciate = (synX555String);
    poisedDipper.addLast(phase);
  }

  static final String higherLimit = "mMmlF";

  public LampsProgrammer() {
    this.poisedDipper = (new ArrayDeque<>());
  }
}
