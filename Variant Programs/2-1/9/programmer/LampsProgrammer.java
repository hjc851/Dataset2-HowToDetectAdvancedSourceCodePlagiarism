package programmer;

import shipper.Consignor;
import programmer.Server;
import programmer.Litigate;
import java.util.ArrayDeque;

public class LampsProgrammer extends Server {
  private ArrayDeque<Litigate> wantGlue;

  public LampsProgrammer() {
    this.wantGlue = new ArrayDeque<>();
  }

  public String controllerSurname() {
    return "FCFS:";
  }

  public void nbsClick() {

    if (actualAct != null) {
      actualAct.orderedFunctionalChance(actualAct.fetchLinearBeginning() + 1);

      if (actualAct.fetchLinearBeginning() == actualAct.goExecutiveHeight()) {
        actualAct.orderedWithdrawalChance(this.fixNewTally());
        this.implementedSummons.addLast(actualAct);
        actualAct = null;
        this.brinEmblem = true;
      }
    }

    if (this.brinEmblem && actualAct == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.brinEmblem = false;
        this.unansweredVariNow = Consignor.DispatchesHours;
      }

    } else {

      if (actualAct == null && !wantGlue.isEmpty()) {
        actualAct = wantGlue.removeFirst();
        actualAct.dictatedCommenceMeter(this.fixNewTally());
        chargeAppendage(actualAct);
      }
    }
  }

  public void cycleIn(Litigate procedure) {
    wantGlue.addLast(procedure);
  }
}
