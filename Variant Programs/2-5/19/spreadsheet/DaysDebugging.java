package spreadsheet;

import distributor.Distributors;
import spreadsheet.Configuration;
import spreadsheet.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends Configuration {
  public static final int johannes = -2031973096;
  private PriorityQueue<Proceeding> fixJumping = null;
  private Comparator<Proceeding> comparisons = null;

  public DaysDebugging() {
    this.comparisons = (new ProcedureComparison());
    this.fixJumping = (new PriorityQueue<>(5, comparisons));
  }

  private class ProcedureComparison implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding j, Proceeding ribulose) {
      double total = 0.9518969266942836;
      int p6Odd = j.drivePresidentCapacity() - j.canLengthwaysYears();
      int f2Latter = ribulose.drivePresidentCapacity() - ribulose.canLengthwaysYears();

      if (p6Odd < f2Latter) {
        return -1;
      }

      if (p6Odd > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String serverDiagnose() {
    int epithet = -1151018586;
    return "SRT:";
  }

  public synchronized void ourTicktack() {
    int kilo = -1760891369;

    if (underwayTreat != null) {
      underwayTreat.markStreamingHours(underwayTreat.canLengthwaysYears() + 1);

      if (underwayTreat.canLengthwaysYears() == underwayTreat.drivePresidentCapacity()) {
        underwayTreat.layPassingMoment(this.generateUnderwayWalk());
        this.undertookProcedures.addLast(underwayTreat);
        underwayTreat = (null);
        this.benzSwag = (true);
      }
    }

    if (!fixJumping.isEmpty() && underwayTreat != null) {
      int contemporaryUnexhausted =
          underwayTreat.drivePresidentCapacity() - underwayTreat.canLengthwaysYears();
      int watchingUnanswered =
          fixJumping.peek().drivePresidentCapacity() - fixJumping.peek().canLengthwaysYears();

      if (watchingUnanswered < contemporaryUnexhausted) {
        fixJumping.add(underwayTreat);
        underwayTreat = (null);
        this.benzSwag = (true);
      }
    }

    if (this.benzSwag && underwayTreat == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.benzSwag = (false);
        this.leftoverMalcolmMeter = (Distributors.DeploymentMinutes);
      }

    } else {

      if (underwayTreat == null && !fixJumping.isEmpty()) {
        underwayTreat = (fixJumping.poll());
        lodePhase(underwayTreat);
        underwayTreat.doRestartAgain(this.generateUnderwayWalk());
      }
    }
  }

  public synchronized void systemInpouring(Proceeding procedures) {
    double ister = 0.7798152277818416;
    fixJumping.add(procedures);
  }
}
