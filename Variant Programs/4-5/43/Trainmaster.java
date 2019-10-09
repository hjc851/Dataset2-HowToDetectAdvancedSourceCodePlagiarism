import java.util.*;

public class Trainmaster {
  private static final int synX2468int = 1;
  private static final double synX2467double = 0.7015243653902952;
  private static final String synX2466String = "CLOCK";
  private static final String synX2465String = "LRU";
  private static final double synX2464double = 0.8900977876428935;
  private static final int synX2463int = -49239058;
  private static final double synX2462double = 0.6814642970235644;
  public java.util.LinkedList<Formalities> SynchronizationMethods;
  public java.util.LinkedList<Formalities> ReplacementMarch;
  public int nameServe;
  public java.util.ArrayDeque<Spooler> use;
  static int weakerCurb = 393217352;

  public Trainmaster() {
    Spooler gpa;
    this.use = (new java.util.ArrayDeque<>());
    gpa = (new StasConfiguration());
    this.use.addLast(gpa);
  }

  public synchronized void laidUsingOperation(java.util.LinkedList<Formalities> litigate) {
    double appraise;
    appraise = (synX2462double);
    this.nameServe = (litigate.size());
    this.ReplacementMarch = (litigate);
  }

  public synchronized void adjustHoursProcedures(java.util.LinkedList<Formalities> summons) {
    int glowerRestrictions;
    glowerRestrictions = (synX2463int);
    this.nameServe = (summons.size());
    this.SynchronizationMethods = (summons);
  }

  public synchronized void campaignReseller() {
    double narrowerMax;
    narrowerMax = (synX2464double);
    this.meltWorkspace(new StasConfiguration(), this.ReplacementMarch, synX2465String);
    this.meltWorkspace(new StasConfiguration(), this.SynchronizationMethods, synX2466String);
  }

  public synchronized void meltWorkspace(
      Spooler initialization,
      java.util.LinkedList<Formalities> incumbentMarch,
      java.lang.String substitutes) {
    double best;
    best = (synX2467double);
    initialization.runDebugging(substitutes);
    java.util.Collections.sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) synx352(initialization, incumbentMarch);

    while (initialization.goIsMoving()) synx353(initialization, substitutes);
  }

  private synchronized void synx352(
      Spooler initialization, java.util.LinkedList<Formalities> incumbentMarch) {
    initialization.nextSue(incumbentMarch.removeFirst());
  }

  private synchronized void synx353(Spooler initialization, String substitutes) {

    if (initialization.catchFinalizeSueScale() == nameServe) {
      initialization.blockDeveloper(substitutes);
    } else {
      initialization.layContemporaryTicktack(initialization.goPrevailingClick() + synX2468int);
      initialization.nsoTic();
    }
  }
}
