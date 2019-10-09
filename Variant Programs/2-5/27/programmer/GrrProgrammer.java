package programmer;

import consignor.Distributor;
import programmer.Initialization;
import programmer.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends Initialization {
  private static final boolean synX2201boolean = false;
  private static final int synX2200int = 0;
  private static final boolean synX2199boolean = true;
  private static final int synX2198int = 1;
  private static final int synX2197int = 2;
  private static final int synX2196int = 0;
  private static final boolean synX2195boolean = true;
  private static final int synX2194int = 1;
  private static final String synX2193String = "NRR:";
  public GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.willingSpooler = (new ArrayDeque<>());
    periodsRest = (Initialization.WeekVolume);
  }

  public synchronized String compilerMake() {
    return synX2193String;
  }

  public ArrayDeque<GrrProcedure> willingSpooler;
  public int periodsRest;

  public synchronized void weapMark() {

    if (grrProcedure != null) synx303();

    if (this.dikTorch && latestOperation == null) synx304();
    else synx305();
  }

  public synchronized void systemInpouring(Operation operation) {
    willingSpooler.add(new GrrProcedure(operation));
  }

  private synchronized void synx303() {
    grrProcedure.doRushingAgain(grrProcedure.fixFunctionalChance() + synX2194int);
    periodsRest--;

    if (grrProcedure.fixFunctionalChance() == grrProcedure.goExecutiveHeight()) {
      grrProcedure.situatedMoveMinutes(this.driveContinuingVibrate());
      this.inauguratedOperations.addLast(grrProcedure);
      grrProcedure = (null);
      this.dikTorch = (synX2195boolean);
    }

    if (periodsRest == synX2196int && grrProcedure != null) {

      if (willingSpooler.isEmpty()) {
        periodsRest = (grrProcedure.letHoursHuge());
      } else {

        if (grrProcedure.letHoursHuge() > synX2197int) {
          grrProcedure.fixedOpportunityDramatic(grrProcedure.letHoursHuge() - synX2198int);
        }

        willingSpooler.addLast(grrProcedure);
        grrProcedure = (null);
        this.dikTorch = (synX2199boolean);
      }
    }
  }

  private synchronized void synx304() {
    this.remainderRemoDays--;

    if (remainderRemoDays == synX2200int) {
      this.dikTorch = (synX2201boolean);
      this.remainderRemoDays = (Distributor.DeployingOpportunity);
    }
  }

  private synchronized void synx305() {

    if (grrProcedure == null && !willingSpooler.isEmpty()) {
      grrProcedure = (willingSpooler.removeFirst());
      overloadingMechanisms(grrProcedure);
      grrProcedure.doRestartAgain(this.driveContinuingVibrate());
      periodsRest = (grrProcedure.letHoursHuge());
    }
  }
}
