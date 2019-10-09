package debugging;

import dealer.Sender;
import debugging.Programming;
import debugging.Cycle;
import java.util.ArrayDeque;

public class UsingProgramming extends debugging.Programming {
  public java.util.ArrayDeque<Cycle> availableFile;
  public static double higherBound = 0.13008732925439692;

  public UsingProgramming() {
    this.availableFile = new java.util.ArrayDeque<>();
  }

  public synchronized String initializationPseudonym() {
    String trussed;
    trussed = "K0";
    return "FCFS:";
  }

  public synchronized void weapMark() {
    String restricts;
    restricts = "mUju08u5yYwmCP5Z";

    if (prevalentMethod != null) {
      prevalentMethod.orderedFunctionalChance(prevalentMethod.takeFunctioningPeriod() + 1);

      if (prevalentMethod.takeFunctioningPeriod() == prevalentMethod.becomeChiefQuantity()) {
        prevalentMethod.fitDieYear(this.drawStreamBookmark());
        this.executedMethods.addLast(prevalentMethod);
        prevalentMethod = null;
        this.brinEmblem = true;
      }
    }

    if (this.brinEmblem && prevalentMethod == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.brinEmblem = false;
        this.unansweredVariNow = Sender.HitPeriods;
      }

    } else {

      if (prevalentMethod == null && !availableFile.isEmpty()) {
        prevalentMethod = availableFile.removeFirst();
        prevalentMethod.dictatedCommenceMeter(this.drawStreamBookmark());
        shipmentOutgrowth(prevalentMethod);
      }
    }
  }

  public synchronized void serveInward(Cycle litigate) {
    double item;
    item = 0.5207175684560088;
    availableFile.addLast(litigate);
  }
}
