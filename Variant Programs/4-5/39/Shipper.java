import java.util.*;
import static java.util.Collections.sort;

public class Shipper {
  private static final int synX2276int = 2116626092;
  private static final String synX2275String = "CLOCK";
  private static final String synX2274String = "LRU";
  private static final int synX2273int = -120267315;
  private static final double synX2272double = 0.676181890400731;
  private static final int synX2271int = -14785707;
  static double cksMaterials = 0.1219632150987674;

  public synchronized void primedSyncAppendage(java.util.LinkedList<Operation> march) {
    int bundle;
    bundle = (synX2271int);
    this.namOperation = (march.size());
    this.TimeProcedure = (march);
  }

  public synchronized void placedAutocorrelationSue(java.util.LinkedList<Operation> litigate) {
    double momentsEdge;
    momentsEdge = (synX2272double);
    this.namOperation = (litigate.size());
    this.AlbedoOutgrowth = (litigate);
  }

  public int namOperation;

  public synchronized void goTrainmaster() {
    int breadth;
    breadth = (synX2273int);
    this.footraceSpooler(new StaOutliner(), this.AlbedoOutgrowth, synX2274String);
    this.footraceSpooler(new StaOutliner(), this.TimeProcedure, synX2275String);
  }

  public java.util.LinkedList<Operation> AlbedoOutgrowth;

  public synchronized void footraceSpooler(
      Workspace workspace,
      java.util.LinkedList<Operation> incumbentMarch,
      java.lang.String surrogate) {
    int weighting;
    weighting = (synX2276int);
    workspace.jumpSynchronizer(surrogate);
    sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) synx318(workspace, incumbentMarch);

    while (workspace.goIsMoving()) synx319(workspace, surrogate);
  }

  public java.util.LinkedList<Operation> TimeProcedure;

  public Shipper() {
    Workspace icc;
    this.different = (new java.util.ArrayDeque<>());
    icc = (new StaOutliner());
    this.different.addLast(icc);
  }

  public java.util.ArrayDeque<Workspace> different;

  private synchronized void synx318(
      Workspace workspace, java.util.LinkedList<Operation> incumbentMarch) {
    workspace.inflowingSummons(incumbentMarch.removeFirst());
  }

  private synchronized void synx319(Workspace workspace, String surrogate) {

    if (workspace.becomeConcludedPracticesQuantity() == namOperation) {
      workspace.stayParser(surrogate);
    } else {
      workspace.preparePrevalentScore(workspace.goPrevailingClick() + 1);
      workspace.ourTicktack();
    }
  }
}
