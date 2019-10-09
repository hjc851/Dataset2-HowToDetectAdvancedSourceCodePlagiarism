package parser;

import plenum.Exporter;
import parser.Timer;
import parser.March;
import java.util.ArrayDeque;

public class BParser extends Timer {
  private static final boolean synX528boolean = true;
  private static final boolean synX527boolean = false;
  private static final int synX526int = 0;
  private static final int synX525int = 1687727002;
  private static final int synX524int = 0;
  private static final int synX523int = 0;
  private static final int synX522int = 6;
  private static final int synX521int = 0;
  private static final int synX520int = -1262445846;
  private static final boolean synX519boolean = false;
  private static final int synX518int = 0;
  private static final boolean synX517boolean = true;
  private static final int synX516int = 1;
  private static final int synX515int = 0;
  private static final boolean synX514boolean = true;
  private static final int synX513int = 1;
  private static final int synX512int = 1462782139;
  private static final int synX511int = 0;
  private static final String synX510String = "QCTjAYoFope58924";
  private static final String synX509String = "FB:";
  private static final String synX508String = "zL2bUu";

  public synchronized String workspaceForename() {
    String apexRestrictions;
    apexRestrictions = (synX508String);
    return synX509String;
  }

  public synchronized void cycleIn(March negotiations) {
    String quality;
    quality = (synX510String);
    gonnaCarpark[synX511int].addLast(negotiations);
  }

  public ArrayDeque<March>[] gonnaCarpark = null;
  static String maximum = "iLW2j";
  public int yearsAnother = 0;

  public synchronized void ourTicktack() {
    int minutes;
    minutes = (synX512int);

    if (underwayTreat != null) {
      underwayTreat.fixGoingThing(underwayTreat.receivePouringMoment() + synX513int);
      yearsAnother--;

      if (underwayTreat.receivePouringMoment() == underwayTreat.generateHonchoFootprint()) {
        underwayTreat.readyOutletDay(this.takeTopicalMark());
        this.concludedPractices.addLast(underwayTreat);
        underwayTreat = (null);
        this.whinAdmiral = (synX514boolean);
      }

      if (yearsAnother == synX515int && underwayTreat != null) {

        if (primedIsVacant()) {
          yearsAnother = (OpportunityDramatic);
        } else {
          gonnaCarpark[prevailingPrecedence + synX516int].addLast(underwayTreat);
          underwayTreat = (null);
          this.whinAdmiral = (synX517boolean);
        }
      }
    }

    if (this.whinAdmiral && underwayTreat == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX518int) {
        this.whinAdmiral = (synX519boolean);
        this.stayLtsHour = (Exporter.MurderWhen);
      }

    } else {

      if (underwayTreat == null && !primedIsVacant()) {
        underwayTreat = (comeFollowingOperation());
        encumbranceSummons(underwayTreat);
        underwayTreat.readyOutsetDay(this.takeTopicalMark());
        yearsAnother = (OpportunityDramatic);
      }
    }
  }

  public int prevailingPrecedence = 0;

  public synchronized March comeFollowingOperation() {
    int yumPoint;
    yumPoint = (synX520int);
    {
      int i = synX521int;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              prevailingPrecedence = (i);
              return gonnaCarpark[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public BParser() {
    this.gonnaCarpark = (new ArrayDeque[synX522int]);
    {
      int i = synX523int;

      while (i < gonnaCarpark.length) {
        {
          {
            gonnaCarpark[i] = (new ArrayDeque<>());
          }
        }
        i++;
      }
    }
    yearsAnother = (OpportunityDramatic);
    prevailingPrecedence = (synX524int);
  }

  public synchronized boolean primedIsVacant() {
    int gauge;
    gauge = (synX525int);
    {
      int i = synX526int;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              return synX527boolean;
            }
          }
        }
        i++;
      }
    }
    return synX528boolean;
  }
}
