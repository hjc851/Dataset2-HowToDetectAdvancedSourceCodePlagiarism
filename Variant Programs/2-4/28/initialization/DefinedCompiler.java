package initialization;

import coordinator.Salesperson;
import initialization.Configuration;
import initialization.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends Configuration {
  public PriorityQueue<Mechanism> waitingList;
  public Comparator<Mechanism> comparing;

  public DefinedCompiler() {
    this.comparing = new MethodBaseline();
    this.waitingList = new PriorityQueue<>(5, comparing);
  }

  public class MethodBaseline implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism g, Mechanism b2) {
      int p4Unexpended = g.developDirectorStature() - g.takeFunctioningPeriod();
      int n1Other = b2.developDirectorStature() - b2.takeFunctioningPeriod();

      if (p4Unexpended < n1Other) {
        return -1;
      }

      if (p4Unexpended > n1Other) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String developerIdentify() {
    return "SRT:";
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.takeFunctioningPeriod() + 1);

      if (liveOutgrowth.takeFunctioningPeriod() == liveOutgrowth.developDirectorStature()) {
        liveOutgrowth.bentPulloutHour(this.findActualRetick());
        this.performedTreat.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.mbeMarker = true;
      }
    }

    if (!waitingList.isEmpty() && liveOutgrowth != null) {
      int formerKeeping =
          liveOutgrowth.developDirectorStature() - liveOutgrowth.takeFunctioningPeriod();
      int spyStill =
          waitingList.peek().developDirectorStature() - waitingList.peek().takeFunctioningPeriod();

      if (spyStill < formerKeeping) {
        waitingList.add(liveOutgrowth);
        liveOutgrowth = null;
        this.mbeMarker = true;
      }
    }

    if (this.mbeMarker && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.mbeMarker = false;
        this.residualFraserOpportunity = Salesperson.MailAmount;
      }

    } else {

      if (liveOutgrowth == null && !waitingList.isEmpty()) {
        liveOutgrowth = waitingList.poll();
        burdensMethods(liveOutgrowth);
        liveOutgrowth.primedGetPeriod(this.findActualRetick());
      }
    }
  }

  public synchronized void mechanismsArrive(Mechanism formalities) {
    waitingList.add(formalities);
  }
}
