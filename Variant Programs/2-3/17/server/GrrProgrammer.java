package server;

import dealer.Sender;
import server.Callback;
import server.Sue;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {

  public GrrProgrammer() {
    this.eagerJunk = new ArrayDeque<>();
    periodsRest = Callback.SentenceTeleportation;
  }

  public ArrayDeque<GrrProcedure> eagerJunk;

  public synchronized void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.determineLinearBeginning(grrProcedure.haveSpoutingPeriods() + 1);
      periodsRest--;

      if (grrProcedure.haveSpoutingPeriods() == grrProcedure.beatProgrammerSeverity()) {
        grrProcedure.orderedWithdrawalChance(this.letAfootDials());
        this.undertookProcedures.addLast(grrProcedure);
        grrProcedure = null;
        this.ordeBeacon = true;
      }

      if (periodsRest == 0 && grrProcedure != null) {

        if (eagerJunk.isEmpty()) {
          periodsRest = grrProcedure.conveyAmountMarkers();
        } else {

          if (grrProcedure.conveyAmountMarkers() > 2) {
            grrProcedure.putClockAmount(grrProcedure.conveyAmountMarkers() - 1);
          }

          eagerJunk.addLast(grrProcedure);
          grrProcedure = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && actualAct == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.ordeBeacon = false;
        this.unexhaustedTelaMoment = Sender.CompleteSentence;
      }

    } else {

      if (grrProcedure == null && !eagerJunk.isEmpty()) {
        grrProcedure = eagerJunk.removeFirst();
        payloadOperation(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.letAfootDials());
        periodsRest = grrProcedure.conveyAmountMarkers();
      }
    }
  }

  public GrrProcedure grrProcedure;

  public synchronized String initializationPseudonym() {
    return "NRR:";
  }

  public int periodsRest;

  public synchronized void methodologyArrival(Sue serve) {
    eagerJunk.add(new GrrProcedure(serve));
  }
}
