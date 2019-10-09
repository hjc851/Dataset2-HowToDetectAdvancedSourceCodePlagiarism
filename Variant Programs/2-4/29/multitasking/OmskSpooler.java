package multitasking;

import yardmaster.Reseller;
import multitasking.Organizer;
import multitasking.Mechanism;
import java.util.ArrayDeque;

public class OmskSpooler extends multitasking.Organizer {
  public java.util.ArrayDeque<Mechanism> ablePecker;
  static double limit = 0.250377460035351;

  public synchronized void weapMark() {
    double extent = 0.33265393701360235;

    if (flowProcedures != null) synx270();

    if (this.dblPin && flowProcedures == null) synx271();
    else synx272();
  }

  public synchronized String outlinerGens() {
    String enchained = "OnrG1";
    return "RR:";
  }

  public int periodFinal;

  public synchronized void systemInpouring(Mechanism procedures) {
    double subalternPinioned = 0.3167779066171914;
    ablePecker.addLast(procedures);
  }

  public OmskSpooler() {
    this.ablePecker = new java.util.ArrayDeque<>();
    periodFinal = ChanceNumber;
  }

  private synchronized void synx270() {
    flowProcedures.solidifyingRollingJuncture(flowProcedures.produceGushingNow() + 1);
    periodFinal--;

    if (flowProcedures.produceGushingNow() == flowProcedures.letBigwigSmallness()) {
      flowProcedures.primedExpirationPeriod(this.conveyFormerGene());
      this.attainedProces.addLast(flowProcedures);
      flowProcedures = null;
      this.dblPin = true;
    }

    if (periodFinal == 0 && flowProcedures != null) {

      if (ablePecker.isEmpty()) {
        periodFinal = ChanceNumber;
      } else {
        ablePecker.addLast(flowProcedures);
        flowProcedures = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx271() {
    this.unansweredVariNow--;

    if (unansweredVariNow == 0) {
      this.dblPin = false;
      this.unansweredVariNow = Reseller.DetachmentBeginning;
    }
  }

  private synchronized void synx272() {

    if (flowProcedures == null && !ablePecker.isEmpty()) {
      flowProcedures = ablePecker.removeFirst();
      cargoAct(flowProcedures);
      flowProcedures.markKickoffHours(this.conveyFormerGene());
      periodFinal = ChanceNumber;
    }
  }
}
