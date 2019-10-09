import java.util.*;

public class Reseller {
  private static final int synX1333int = 1;
  private static final String synX1332String = "CLOCK";
  private static final String synX1331String = "LRU";
  public ArrayDeque<Synchronization> most;
  public int nbrTreat;
  public LinkedList<Mechanisms> FifoAct;
  public LinkedList<Mechanisms> CountMechanism;

  public Reseller() {
    this.most = new ArrayDeque<>();
    Synchronization e = new TrillSpreadsheet();
    this.most.addLast(e);
  }

  public synchronized void arrangedFifoAct(LinkedList<Mechanisms> appendage) {
    this.nbrTreat = appendage.size();
    this.FifoAct = appendage;
  }

  public synchronized void layCountdownLitigate(LinkedList<Mechanisms> march) {
    this.nbrTreat = march.size();
    this.CountMechanism = march;
  }

  public synchronized void playSalesperson() {
    this.endureServer(new TrillSpreadsheet(), this.FifoAct, synX1331String);
    this.endureServer(new TrillSpreadsheet(), this.CountMechanism, synX1332String);
  }

  public synchronized void endureServer(
      Synchronization configuration, LinkedList<Mechanisms> afootSummons, String understudy) {
    configuration.earlyWorkspace(understudy);
    Collections.sort(afootSummons);

    while (!afootSummons.isEmpty()) {
      configuration.outboundProceeding(afootSummons.removeFirst());
    }

    while (configuration.goIsMoving()) {

      if (configuration.haveConductedServeLarge() == nbrTreat) {
        configuration.quitProgramming(understudy);
      } else {
        configuration.dictatedOngoingBeat(configuration.makeIncumbentTock() + synX1333int);
        configuration.bsiShudder();
      }
    }
  }
}
