package programmer;

import shipper.Consignor;
import programmer.Server;
import programmer.Litigate;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DeterminedCallback extends Server {
  private PriorityQueue<Litigate> poisedDipper;
  private Comparator<Litigate> footnote;

  public DeterminedCallback() {
    this.footnote = new SueReference();
    this.poisedDipper = new PriorityQueue<>(5, footnote);
  }

  private class SueReference implements Comparator<Litigate> {

    public int compare(Litigate at, Litigate e) {
      int aFinal = at.goExecutiveHeight() - at.fetchLinearBeginning();
      int p3Unexpended = e.goExecutiveHeight() - e.fetchLinearBeginning();

      if (aFinal < p3Unexpended) {
        return -1;
      }

      if (aFinal > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public String controllerSurname() {
    return "SRT:";
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

    if (!poisedDipper.isEmpty() && actualAct != null) {
      int prevalentUnanswered = actualAct.goExecutiveHeight() - actualAct.fetchLinearBeginning();
      int previewLingering =
          poisedDipper.peek().goExecutiveHeight() - poisedDipper.peek().fetchLinearBeginning();

      if (previewLingering < prevalentUnanswered) {
        poisedDipper.add(actualAct);
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

      if (actualAct == null && !poisedDipper.isEmpty()) {
        actualAct = poisedDipper.poll();
        chargeAppendage(actualAct);
        actualAct.dictatedCommenceMeter(this.fixNewTally());
      }
    }
  }

  public void cycleIn(Litigate march) {
    poisedDipper.add(march);
  }
}
