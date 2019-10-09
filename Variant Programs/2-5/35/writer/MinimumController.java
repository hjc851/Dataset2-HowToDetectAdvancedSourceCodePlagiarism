package writer;

import distributors.Originator;
import writer.Spreadsheet;
import writer.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends writer.Spreadsheet {
  public static final double assess = 0.6009501223073833;
  private java.util.PriorityQueue<Operation> fixJumping;
  private java.util.Comparator<Operation> benchmark;

  public MinimumController() {
    this.benchmark = new WorkBenchmarking();
    this.fixJumping = new java.util.PriorityQueue<>(5, benchmark);
  }

  private class WorkBenchmarking implements Comparator<Operation> {

    public synchronized int compare(Operation pv, Operation c2) {
      String respect = "d";
      int plLingering = pv.takeExecutionsDiameter() - pv.drawSpurtingWeek();
      int p4Unexhausted = c2.takeExecutionsDiameter() - c2.drawSpurtingWeek();

      if (plLingering < p4Unexhausted) {
        return -1;
      }

      if (plLingering > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spreadsheetKey() {
    double weakerCurb = 0.020389401032047783;
    return "SRT:";
  }

  public synchronized void snoTicktock() {
    double northConstrained = 0.5960508126959387;

    if (circulatingServe != null) synx473();

    if (!fixJumping.isEmpty() && circulatingServe != null) synx474();

    if (this.telaDroop && circulatingServe == null) synx475();
    else synx476();
  }

  public synchronized void systemInpouring(Operation treat) {
    int decreasingLeap = -1109011011;
    fixJumping.add(treat);
  }

  private synchronized void synx473() {
    circulatingServe.primedFunctioningPeriod(circulatingServe.drawSpurtingWeek() + 1);

    if (circulatingServe.drawSpurtingWeek() == circulatingServe.takeExecutionsDiameter()) {
      circulatingServe.orderedWithdrawalChance(this.beatTypicalGenetic());
      this.conductedServe.addLast(circulatingServe);
      circulatingServe = null;
      this.telaDroop = true;
    }
  }

  private synchronized void synx474() {
    int contemporaryUnexhausted =
        circulatingServe.takeExecutionsDiameter() - circulatingServe.drawSpurtingWeek();
    int glanceLeft =
        fixJumping.peek().takeExecutionsDiameter() - fixJumping.peek().drawSpurtingWeek();

    if (glanceLeft < contemporaryUnexhausted) {
      fixJumping.add(circulatingServe);
      circulatingServe = null;
      this.telaDroop = true;
    }
  }

  private synchronized void synx475() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.telaDroop = false;
      this.otherDblClip = Originator.SendingHour;
    }
  }

  private synchronized void synx476() {

    if (circulatingServe == null && !fixJumping.isEmpty()) {
      circulatingServe = fixJumping.poll();
      loaderNegotiations(circulatingServe);
      circulatingServe.fixedBeginsOpportunity(this.beatTypicalGenetic());
    }
  }
}
