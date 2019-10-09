package programmer;

import shipper.Consignor;
import programmer.Server;
import programmer.Litigate;
import java.util.ArrayDeque;

public class StaOutliner extends Server {
  private ArrayDeque<Litigate> ablePecker;
  private int chanceUnresolved;

  public StaOutliner() {
    this.ablePecker = new ArrayDeque<>();
    chanceUnresolved = HourPurity;
  }

  public String controllerSurname() {
    return "RR:";
  }

  public void nbsClick() {

    if (actualAct != null) {
      actualAct.orderedFunctionalChance(actualAct.fetchLinearBeginning() + 1);
      chanceUnresolved--;

      if (actualAct.fetchLinearBeginning() == actualAct.goExecutiveHeight()) {
        actualAct.orderedWithdrawalChance(this.fixNewTally());
        this.implementedSummons.addLast(actualAct);
        actualAct = null;
        this.brinEmblem = true;
      }

      if (chanceUnresolved == 0 && actualAct != null) {

        if (ablePecker.isEmpty()) {
          chanceUnresolved = HourPurity;
        } else {
          ablePecker.addLast(actualAct);
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

      if (actualAct == null && !ablePecker.isEmpty()) {
        actualAct = ablePecker.removeFirst();
        chargeAppendage(actualAct);
        actualAct.dictatedCommenceMeter(this.fixNewTally());
        chanceUnresolved = HourPurity;
      }
    }
  }

  public void cycleIn(Litigate treat) {
    ablePecker.addLast(treat);
  }
}
