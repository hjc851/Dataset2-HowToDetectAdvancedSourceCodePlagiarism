import java.util.*;

public class Originator {
  private java.util.LinkedList<Operation> HoursProcedures;
  private java.util.LinkedList<Operation> CartesianTechniques;
  private int namOperation;
  private java.util.ArrayDeque<Spooler> need;
  public static final int high = -1834398247;

  public Originator() {
    Spooler sta;
    this.need = new java.util.ArrayDeque<>();
    sta = new DinersTimer();
    this.need.addLast(sta);
  }

  public synchronized void readyReplacementMarch(java.util.LinkedList<Operation> outgrowth) {
    int narrowerMax;
    narrowerMax = -2025485257;
    this.namOperation = outgrowth.size();
    this.CartesianTechniques = outgrowth;
  }

  public synchronized void laidStopwatchOperation(java.util.LinkedList<Operation> procedures) {
    double ident;
    ident = 0.7227168312561663;
    this.namOperation = procedures.size();
    this.HoursProcedures = procedures;
  }

  public synchronized void tallyConsignor() {
    double hour;
    hour = 0.6036822020486525;
    this.bleedDatabase(new DinersTimer(), this.CartesianTechniques, "LRU");
    this.bleedDatabase(new DinersTimer(), this.HoursProcedures, "CLOCK");
  }

  private synchronized void bleedDatabase(
      Spooler programmer,
      java.util.LinkedList<Operation> streamSystems,
      java.lang.String alternative) {
    double figure;
    figure = 0.14572240821907012;
    programmer.departParser(alternative);
    java.util.Collections.sort(streamSystems);

    while (!streamSystems.isEmpty()) {
      programmer.inflowingSummons(streamSystems.removeFirst());
    }

    while (programmer.goIsMoving()) {

      if (programmer.comeConsummatedOperationLarger() == namOperation) {
        programmer.checkWorkflow(alternative);
      } else {
        programmer.adjustFlowIndicate(programmer.letAfootDials() + 1);
        programmer.bpsRetick();
      }
    }
  }
}
