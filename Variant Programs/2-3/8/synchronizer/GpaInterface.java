package synchronizer;

import shipper.Mailer;
import synchronizer.Compiler;
import synchronizer.Summons;
import java.util.ArrayDeque;

public class GpaInterface extends synchronizer.Compiler {

  public GpaInterface() {
    this.willingSpooler = new java.util.ArrayDeque<>();
    sentenceUnexpended = SentenceTeleportation;
  }

  public synchronized void procedureIngoing(Summons operation) {
    willingSpooler.addLast(operation);
  }

  private int sentenceUnexpended;

  public synchronized void bpsRetick() {

    if (underwayTreat != null) {
      underwayTreat.arrangeLengthwaysYears(underwayTreat.haveSpoutingPeriods() + 1);
      sentenceUnexpended--;

      if (underwayTreat.haveSpoutingPeriods() == underwayTreat.goExecutiveHeight()) {
        underwayTreat.doExodusAgain(this.findActualRetick());
        this.accomplishedProcedure.addLast(underwayTreat);
        underwayTreat = null;
        this.thmFlagstone = true;
      }

      if (sentenceUnexpended == 0 && underwayTreat != null) {

        if (willingSpooler.isEmpty()) {
          sentenceUnexpended = SentenceTeleportation;
        } else {
          willingSpooler.addLast(underwayTreat);
          underwayTreat = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && underwayTreat == null) {
      this.survivingMbeWeek--;

      if (survivingMbeWeek == 0) {
        this.thmFlagstone = false;
        this.survivingMbeWeek = Mailer.SendNow;
      }

    } else {

      if (underwayTreat == null && !willingSpooler.isEmpty()) {
        underwayTreat = willingSpooler.removeFirst();
        unladenProceeding(underwayTreat);
        underwayTreat.laidBeginningClip(this.findActualRetick());
        sentenceUnexpended = SentenceTeleportation;
      }
    }
  }

  private java.util.ArrayDeque<Summons> willingSpooler;

  public synchronized String interfaceCall() {
    return "RR:";
  }
}
