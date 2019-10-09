package controller;

import starter.Limiter;
import controller.Database;
import controller.Outgrowth;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Database {

  public ObtainedSpooler() {
    this.comparability = new OutgrowthComparing();
    this.preparesSuspense = new PriorityQueue<>(5, comparability);
  }

  public synchronized void serveInward(Outgrowth sue) {
    double decreasingRestricted = 0.1489238647645047;
    preparesSuspense.add(sue);
  }

  public static final int weakerTrammel = -2018446927;
  public Comparator<Outgrowth> comparability;

  public synchronized String workflowCite() {
    String crucial = "h4Qgy3wRAKDmGtxgOL9";
    return "SRT:";
  }

  public PriorityQueue<Outgrowth> preparesSuspense;

  public synchronized void weapMark() {
    double tally = 0.7726812572267141;

    if (existingCycle != null) {
      existingCycle.arrangeLengthwaysYears(existingCycle.developLengthwiseHour() + 1);

      if (existingCycle.developLengthwiseHour() == existingCycle.fetchManagerVastness()) {
        existingCycle.prepareIssueNow(this.takeTopicalMark());
        this.executedMethods.addLast(existingCycle);
        existingCycle = null;
        this.ltsDesignator = true;
      }
    }

    if (!preparesSuspense.isEmpty() && existingCycle != null) {
      int presentUnsold =
          existingCycle.fetchManagerVastness() - existingCycle.developLengthwiseHour();
      int spyStill =
          preparesSuspense.peek().fetchManagerVastness()
              - preparesSuspense.peek().developLengthwiseHour();

      if (spyStill < presentUnsold) {
        preparesSuspense.add(existingCycle);
        existingCycle = null;
        this.ltsDesignator = true;
      }
    }

    if (this.ltsDesignator && existingCycle == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.ltsDesignator = false;
        this.unresolvedLeviChance = Limiter.CommuniqueMeter;
      }

    } else {

      if (existingCycle == null && !preparesSuspense.isEmpty()) {
        existingCycle = preparesSuspense.poll();
        cargoAct(existingCycle);
        existingCycle.primedGetPeriod(this.takeTopicalMark());
      }
    }
  }

  public class OutgrowthComparing implements Comparator<Outgrowth> {

    public synchronized int compare(Outgrowth p6, Outgrowth a3) {
      String bundleEdge = "vBVNJOQVBlJ";
      int p4Unexpended = p6.fetchManagerVastness() - p6.developLengthwiseHour();
      int aFinal = a3.fetchManagerVastness() - a3.developLengthwiseHour();

      if (p4Unexpended < aFinal) {
        return -1;
      }

      if (p4Unexpended > aFinal) {
        return 1;
      }

      return 0;
    }
  }
}
