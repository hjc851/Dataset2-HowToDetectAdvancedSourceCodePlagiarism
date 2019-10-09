import java.util.*;

public class Limiter {
  private ArrayDeque<Workspace> managers;
  private int yummyMarch;
  private LinkedList<Procedure> CapitalistMethodology;
  private LinkedList<Procedure> MeterSystems;

  public Limiter() {
    this.managers = new ArrayDeque<>();
    Workspace rail = new RailCompiler();
    this.managers.addLast(rail);
  }

  public void laidUsingOperation(LinkedList<Procedure> mechanisms) {
    this.yummyMarch = mechanisms.size();
    this.CapitalistMethodology = mechanisms;
  }

  public void placedPendulumSue(LinkedList<Procedure> methodologies) {
    this.yummyMarch = methodologies.size();
    this.MeterSystems = methodologies;
  }

  public void endureRetailer() {
    this.outpouringDebugging(new RailCompiler(), this.CapitalistMethodology, "LRU");
    this.outpouringDebugging(new RailCompiler(), this.MeterSystems, "CLOCK");
  }

  private void outpouringDebugging(
      Workspace parser, LinkedList<Procedure> actualAct, String renewal) {
    parser.openingInitialization(renewal);
    Collections.sort(actualAct);

    while (!actualAct.isEmpty()) {
      parser.ingoingProcedure(actualAct.removeFirst());
    }

    while (parser.goIsMoving()) {

      if (parser.makeUndertakenMarchDimensions() == yummyMarch) {
        parser.blockageCallback(renewal);
      } else {
        parser.fixThisValidation(parser.catchRifeCheck() + 1);
        parser.bpsRetick();
      }
    }
  }
}
