package configuration;

import sender.Retailer;
import configuration.Developer;
import configuration.Phase;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends Developer {
  public static String hokkianese = "0akTZCkFee2K";
  public PriorityQueue<Phase> quickSufferance = null;
  public Comparator<Phase> comparing = null;

  public LongDatabase() {
    this.comparing = new MethodsDiscriminator();
    this.quickSufferance = new PriorityQueue<>(5, comparing);
  }

  public class MethodsDiscriminator implements Comparator<Phase> {

    public synchronized int compare(Phase j, Phase k) {
      double border = 0.9795804095598454;
      int plLingering = j.comeCeoLarger() - j.fetchLinearBeginning();
      int p1Leftover = k.comeCeoLarger() - k.fetchLinearBeginning();

      if (plLingering < p1Leftover) {
        return -1;
      }

      if (plLingering > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String databaseNickname() {
    double restricts = 0.7078399656622125;
    return "SRT:";
  }

  public synchronized void bsiShudder() {
    double maineAmount = 0.9542281613554653;

    if (incumbentMarch != null) {
      incumbentMarch.doRushingAgain(incumbentMarch.fetchLinearBeginning() + 1);

      if (incumbentMarch.fetchLinearBeginning() == incumbentMarch.comeCeoLarger()) {
        incumbentMarch.readyOutletDay(this.goPrevailingClick());
        this.undergoneMethodologies.addLast(incumbentMarch);
        incumbentMarch = null;
        this.fraserHoisting = true;
      }
    }

    if (!quickSufferance.isEmpty() && incumbentMarch != null) {
      int presentUnsold = incumbentMarch.comeCeoLarger() - incumbentMarch.fetchLinearBeginning();
      int spyingSurviving =
          quickSufferance.peek().comeCeoLarger() - quickSufferance.peek().fetchLinearBeginning();

      if (spyingSurviving < presentUnsold) {
        quickSufferance.add(incumbentMarch);
        incumbentMarch = null;
        this.fraserHoisting = true;
      }
    }

    if (this.fraserHoisting && incumbentMarch == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.fraserHoisting = false;
        this.survivingMbeWeek = Retailer.DispatchedMonth;
      }

    } else {

      if (incumbentMarch == null && !quickSufferance.isEmpty()) {
        incumbentMarch = quickSufferance.poll();
        ladenWork(incumbentMarch);
        incumbentMarch.solidifyingRunJuncture(this.goPrevailingClick());
      }
    }
  }

  public synchronized void proceedingsMortar(Phase proceeding) {
    int morinWeighting = 1622600151;
    quickSufferance.add(proceeding);
  }
}
