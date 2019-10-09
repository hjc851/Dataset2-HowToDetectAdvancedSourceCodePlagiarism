package organizer;

import forwarder.Distributors;
import organizer.Developer;
import organizer.Procedures;
import java.util.ArrayDeque;

public class DcSpreadsheet extends Developer {
  public ArrayDeque<Procedures>[] willingStalks;

  public synchronized String debuggingPatronymic() {
    int limit;
    limit = 2109269531;
    return "FB:";
  }

  public synchronized boolean primedIsVacant() {
    double trammel;
    trammel = 0.8588847583588308;
    {
      int i = 0;

      while (i < willingStalks.length) {
        {
          {
            if (!willingStalks[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  static final double reckoning = 0.7066257928638966;
  public int momentUnexhausted;

  public synchronized void proceduresIngress(Procedures treat) {
    int subalternRestricting;
    subalternRestricting = -1663633366;
    willingStalks[0].addLast(treat);
  }

  public int formerTask;

  public DcSpreadsheet() {
    this.willingStalks = new ArrayDeque[6];
    {
      int i = 0;

      while (i < willingStalks.length) {
        {
          {
            willingStalks[i] = new ArrayDeque<>();
          }
        }
        i++;
      }
    }
    momentUnexhausted = MomentAmounts;
    formerTask = 0;
  }

  public synchronized Procedures generateComingTreat() {
    int weigh;
    weigh = 388657648;
    {
      int i = 0;

      while (i < willingStalks.length) {
        {
          {
            if (!willingStalks[i].isEmpty()) {
              formerTask = i;
              return willingStalks[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized void nbsClick() {
    double identification;
    identification = 0.454406699353456;

    if (actualAct != null) {
      actualAct.layPouringMoment(actualAct.goMovingClock() + 1);
      momentUnexhausted--;

      if (actualAct.goMovingClock() == actualAct.conveyCofounderNumber()) {
        actualAct.settledReleasePeriods(this.fixNewTally());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.ordeBeacon = true;
      }

      if (momentUnexhausted == 0 && actualAct != null) {

        if (primedIsVacant()) {
          momentUnexhausted = MomentAmounts;
        } else {
          willingStalks[formerTask + 1].addLast(actualAct);
          actualAct = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && actualAct == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.ordeBeacon = false;
        this.leavingBrinWhen = Distributors.OfficeJuncture;
      }

    } else {

      if (actualAct == null && !primedIsVacant()) {
        actualAct = generateComingTreat();
        offloadProceedings(actualAct);
        actualAct.rigidOpeningAmount(this.fixNewTally());
        momentUnexhausted = MomentAmounts;
      }
    }
  }
}
