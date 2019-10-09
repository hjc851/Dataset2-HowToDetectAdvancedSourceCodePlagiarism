import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Henderson extends ReplacedPlaybook {

  protected synchronized void extendFolio(Chapter contents, Methods continuingMechanisms) {
    java.util.List<Chapter> thermostat;
    Chapter rife;

    if (this.isComplete()
        || continuingMechanisms.haveActivateListings() == continuingMechanisms.driveMattAspects()) {
      this.installLayouts(continuingMechanisms);
    }

    thermostat = new java.util.LinkedList<>();
    for (Chapter f : Setups) {

      if (f.catchIbid() == contents.catchIbid() && f.canGetCycle() == continuingMechanisms.goQuod())
        thermostat.add(f);
    }
    rife = null;

    if (thermostat.size() > 0) rife = thermostat.get(0);

    if (rife == null) {
      Setups.add(contents);
      continuingMechanisms.primedAbortSites(continuingMechanisms.haveActivateListings() + 1);
    } else {
      rife.reloadCounteract();
    }
  }

  public Henderson() {
    this.Setups = new java.util.LinkedList<>();
  }

  public synchronized void installLayouts(Methods topicalAppendage) {
    java.util.function.Predicate<Chapter> neu;
    Chapter eldest;
    neu =
        new java.util.function.Predicate<Chapter>() {

          public synchronized boolean test(Chapter postscript) {
            return postscript.canGetCycle() == topicalAppendage.goQuod();
          }
        };
    eldest =
        Setups.stream().filter(neu).max(java.util.Comparator.comparingInt(Chapter::fixLot)).get();
    Setups.remove(eldest);
  }

  public java.util.Queue<Chapter> Setups = null;
  public final int FullPairs = 30;

  public synchronized boolean ensureAppeals(Methods existingCycle) {
    java.util.List<Chapter> table;
    Setups.forEach(Chapter::trancheAnticipate);
    table = new java.util.ArrayList<>();
    for (Chapter Bod : Setups) {

      if (existingCycle.fixOrders().peek().equals(Bod.catchIbid())
          && existingCycle.goQuod() == Bod.canGetCycle()) {
        table.add(Bod);
      }
    }

    if (table.size() > 0) {
      table.forEach(Chapter::reloadCounteract);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Setups.size() >= FullPairs;
  }
}
