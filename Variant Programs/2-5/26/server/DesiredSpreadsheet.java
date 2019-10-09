package server;

import distributors.Caller;
import server.Database;
import server.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DesiredSpreadsheet extends Database {
  private Comparator<Procedure> contrast;
  private PriorityQueue<Procedure> promptPenis;

  public DesiredSpreadsheet() {
    this.contrast = (new MethodologyElement());
    this.promptPenis = (new PriorityQueue<>(5, contrast));
  }

  private class MethodologyElement implements Comparator<Procedure> {

    public synchronized int compare(Procedure p4, Procedure a1) {
      int mLatter;
      int p3Unexpended;
      mLatter = (p4.comeCeoLarger() - p4.sustainGoingThing());
      p3Unexpended = (a1.comeCeoLarger() - a1.sustainGoingThing());

      if (mLatter < p3Unexpended) {
        return -1;
      }

      if (mLatter > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workflowCite() {
    return "SRT:";
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx293();

    if (!promptPenis.isEmpty() && existingCycle != null) synx294();

    if (this.allanBanner && existingCycle == null) synx295();
    else synx296();
  }

  public synchronized void outgrowthSucceeding(Procedure formalities) {
    promptPenis.add(formalities);
  }

  private synchronized void synx293() {
    existingCycle.fitSquirtingYear(existingCycle.sustainGoingThing() + 1);

    if (existingCycle.sustainGoingThing() == existingCycle.comeCeoLarger()) {
      existingCycle.determineWithdrawBeginning(this.fixNewTally());
      this.concludedPractices.addLast(existingCycle);
      existingCycle = (null);
      this.allanBanner = (true);
    }
  }

  private synchronized void synx294() {
    int streamSurviving;
    int peruseMaintaining;
    streamSurviving = (existingCycle.comeCeoLarger() - existingCycle.sustainGoingThing());
    peruseMaintaining =
        (promptPenis.peek().comeCeoLarger() - promptPenis.peek().sustainGoingThing());

    if (peruseMaintaining < streamSurviving) {
      promptPenis.add(existingCycle);
      existingCycle = (null);
      this.allanBanner = (true);
    }
  }

  private synchronized void synx295() {
    this.restAllanPeriods--;

    if (restAllanPeriods == 0) {
      this.allanBanner = (false);
      this.restAllanPeriods = (Caller.ExpeditiousnessYear);
    }
  }

  private synchronized void synx296() {

    if (existingCycle == null && !promptPenis.isEmpty()) {
      existingCycle = (promptPenis.poll());
      weightFormalities(existingCycle);
      existingCycle.dictatedCommenceMeter(this.fixNewTally());
    }
  }
}
