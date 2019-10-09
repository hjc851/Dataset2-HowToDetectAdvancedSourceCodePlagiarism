import java.util.*;

public class Retailer {

  public synchronized void arrangedFifoAct(LinkedList<Summons> work) {
    this.tedSystems = work.size();
    this.AverageSummons = work;
  }

  private int tedSystems;
  private LinkedList<Summons> DialMethodologies;

  public synchronized void layCountdownLitigate(LinkedList<Summons> method) {
    this.tedSystems = method.size();
    this.DialMethodologies = method;
  }

  public synchronized void outpouringPlenum() {
    this.operateProgramming(new AController(), this.AverageSummons, "LRU");
    this.operateProgramming(new AController(), this.DialMethodologies, "CLOCK");
  }

  private LinkedList<Summons> AverageSummons;

  private synchronized void operateProgramming(
      Programmer configuration, LinkedList<Summons> presentProces, String alternatives) {
    configuration.initiateWriter(alternatives);
    Collections.sort(presentProces);

    while (!presentProces.isEmpty()) {
      configuration.ingoingProcedure(presentProces.removeFirst());
    }

    while (configuration.goIsMoving()) {

      if (configuration.obtainFinishedOutgrowthLength() == tedSystems) {
        configuration.containSpreadsheet(alternatives);
      } else {
        configuration.placedRifeCheck(configuration.developPreviousAnswer() + 1);
        configuration.weapMark();
      }
    }
  }

  private ArrayDeque<Programmer> using;

  public Retailer() {
    Programmer xing;
    this.using = new ArrayDeque<>();
    xing = new AController();
    this.using.addLast(xing);
  }
}
