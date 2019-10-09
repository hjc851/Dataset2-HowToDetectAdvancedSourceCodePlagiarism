import java.util.*;
import static java.util.Collections.sort;

public class Originator {
  private static final int synX588int = 1;
  private static final double synX587double = 0.6589231202067013;
  private static final String synX586String = "CLOCK";
  private static final String synX585String = "LRU";
  private static final int synX584int = -1270327913;
  private static final double synX583double = 0.9066402505677587;
  private static final double synX582double = 0.8379461633183451;
  private LinkedList<Procedure> DialMethodologies;
  private LinkedList<Procedure> HasProcedure;
  private int kesTechnologies;
  private ArrayDeque<Server> work;
  public static double roll = 0.1354604596808826;

  public Originator() {
    Server stas;
    this.work = new ArrayDeque<>();
    stas = new LyraSynchronizer();
    this.work.addLast(stas);
  }

  public synchronized void bentBlockbusterTechnologies(LinkedList<Procedure> march) {
    double chthonianConfine;
    chthonianConfine = synX582double;
    this.kesTechnologies = march.size();
    this.HasProcedure = march;
  }

  public synchronized void determineBackProces(LinkedList<Procedure> proces) {
    double minimum;
    minimum = synX583double;
    this.kesTechnologies = proces.size();
    this.DialMethodologies = proces;
  }

  public synchronized void passMailer() {
    int highestBandwidth;
    highestBandwidth = synX584int;
    this.tallyConfiguration(new LyraSynchronizer(), this.HasProcedure, synX585String);
    this.tallyConfiguration(new LyraSynchronizer(), this.DialMethodologies, synX586String);
  }

  private synchronized void tallyConfiguration(
      Server planner, LinkedList<Procedure> liveOutgrowth, String successor) {
    double tabulation;
    tabulation = synX587double;
    planner.openingInitialization(successor);
    sort(liveOutgrowth);

    while (!liveOutgrowth.isEmpty()) {
      planner.arrivingLitigate(liveOutgrowth.removeFirst());
    }

    while (planner.goIsMoving()) {

      if (planner.goAccomplishedProcedureHeight() == kesTechnologies) {
        planner.blockageCallback(successor);
      } else {
        planner.fixedTheSelect(planner.receiveContemporaryTicktack() + synX588int);
        planner.nbsClick();
      }
    }
  }
}
