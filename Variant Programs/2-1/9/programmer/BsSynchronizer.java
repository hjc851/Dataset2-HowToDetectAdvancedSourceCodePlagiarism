package programmer;

import shipper.Consignor;
import programmer.Server;
import programmer.Litigate;
import java.util.ArrayDeque;

public class BsSynchronizer extends Server {
  private ArrayDeque<Litigate>[] preppedDelays;
  private int monthAdditional;
  private int underwayConcern;

  public BsSynchronizer() {
    this.preppedDelays = new ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new ArrayDeque<>();
    }
    monthAdditional = HourPurity;
    underwayConcern = 0;
  }

  private Litigate findSucceedingAct() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        underwayConcern = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String controllerSurname() {
    return "FB:";
  }

  public void nbsClick() {

    if (actualAct != null) {
      actualAct.orderedFunctionalChance(actualAct.fetchLinearBeginning() + 1);
      monthAdditional--;

      if (actualAct.fetchLinearBeginning() == actualAct.goExecutiveHeight()) {
        actualAct.orderedWithdrawalChance(this.fixNewTally());
        this.implementedSummons.addLast(actualAct);
        actualAct = null;
        this.brinEmblem = true;
      }

      if (monthAdditional == 0 && actualAct != null) {

        if (primedIsVacant()) {
          monthAdditional = HourPurity;
        } else {
          preppedDelays[underwayConcern + 1].addLast(actualAct);
          actualAct = null;
          this.brinEmblem = true;
        }
      }
    }

    if (this.brinEmblem && actualAct == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.brinEmblem = false;
        this.unansweredVariNow = Consignor.DispatchesHours;
      }

    } else {

      if (actualAct == null && !primedIsVacant()) {
        actualAct = findSucceedingAct();
        chargeAppendage(actualAct);
        actualAct.dictatedCommenceMeter(this.fixNewTally());
        monthAdditional = HourPurity;
      }
    }
  }

  public void cycleIn(Litigate litigate) {
    preppedDelays[0].addLast(litigate);
  }
}
