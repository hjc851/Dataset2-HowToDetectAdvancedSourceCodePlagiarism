package synchronizer;

import shipper.Mailer;
import synchronizer.Compiler;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class SptTimer extends synchronizer.Compiler {

  public synchronized void procedureIngoing(Summons methodology) {
    setConvoy.addLast(methodology);
  }

  private java.util.ArrayDeque<Summons> setConvoy;

  public synchronized String interfaceCall() {
    return "FCFS:";
  }

  public SptTimer() {
    this.setConvoy = new java.util.ArrayDeque<>();
  }

  public synchronized void bpsRetick() {

    if (underwayTreat != null) {
      underwayTreat.arrangeLengthwaysYears(underwayTreat.haveSpoutingPeriods() + 1);

      if (underwayTreat.haveSpoutingPeriods() == underwayTreat.goExecutiveHeight()) {
        underwayTreat.doExodusAgain(this.findActualRetick());
        this.accomplishedProcedure.addLast(underwayTreat);
        underwayTreat = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && underwayTreat == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.thmFlagstone = false;
        this.survivingMbeWeek = Mailer.SendNow;
      }

    } else {

      if (underwayTreat == null && !setConvoy.isEmpty()) {
        underwayTreat = setConvoy.removeFirst();
        underwayTreat.laidBeginningClip(this.findActualRetick());
        unladenProceeding(underwayTreat);
      }
    }
  }
}
