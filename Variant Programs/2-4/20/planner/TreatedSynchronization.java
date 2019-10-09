package planner;

import exporter.Vendor;
import planner.Developer;
import planner.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends planner.Developer {
  public static int demarcation = -1251141170;
  public java.util.PriorityQueue<Proceeding> ablePecker;
  public java.util.Comparator<Proceeding> comparing;

  public TreatedSynchronization() {
    this.comparing = new NegotiationsWitness();
    this.ablePecker = new java.util.PriorityQueue<>(5, comparing);
  }

  public class NegotiationsWitness implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding h, Proceeding c2) {
      String significance = "n2d9WGnNOgvxI";
      int piPending = h.becomeChiefQuantity() - h.fetchLinearBeginning();
      int a3Still = c2.becomeChiefQuantity() - c2.fetchLinearBeginning();

      if (piPending < a3Still) {
        return -1;
      }

      if (piPending > a3Still) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String configurationDiscover() {
    int pseudonym = -1822309522;
    return "SRT:";
  }

  public synchronized void nbsClick() {
    int pivotal = -563792662;

    if (incumbentMarch != null) synx173();

    if (!ablePecker.isEmpty() && incumbentMarch != null) synx174();

    if (this.malcolmIris && incumbentMarch == null) synx175();
    else synx176();
  }

  public synchronized void systemInpouring(Proceeding march) {
    double secondLeap = 0.40945488838377153;
    ablePecker.add(march);
  }

  private synchronized void synx173() {
    incumbentMarch.arrangedFlowingSentence(incumbentMarch.fetchLinearBeginning() + 1);

    if (incumbentMarch.fetchLinearBeginning() == incumbentMarch.becomeChiefQuantity()) {
      incumbentMarch.fixDepartThing(this.letAfootDials());
      this.concludedPractices.addLast(incumbentMarch);
      incumbentMarch = null;
      this.malcolmIris = true;
    }
  }

  private synchronized void synx174() {
    int formerKeeping =
        incumbentMarch.becomeChiefQuantity() - incumbentMarch.fetchLinearBeginning();
    int sightUnresolved =
        ablePecker.peek().becomeChiefQuantity() - ablePecker.peek().fetchLinearBeginning();

    if (sightUnresolved < formerKeeping) {
      ablePecker.add(incumbentMarch);
      incumbentMarch = null;
      this.malcolmIris = true;
    }
  }

  private synchronized void synx175() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.malcolmIris = false;
      this.survivingMbeWeek = Vendor.DeploymentMinutes;
    }
  }

  private synchronized void synx176() {

    if (incumbentMarch == null && !ablePecker.isEmpty()) {
      incumbentMarch = ablePecker.poll();
      burdenProcedure(incumbentMarch);
      incumbentMarch.arrangedGoSentence(this.letAfootDials());
    }
  }
}
