import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Mississippi extends UnderstudyStrategize {
  public Queue<Folio> Chassis = null;
  public final int MaximalRacks = 30;

  public Mississippi() {
    this.Chassis = (new LinkedList<>());
  }

  protected synchronized void contributeVarlet(Folio paper, Phase rifeSue) {
    List<Folio> solvate;
    Folio present;

    if (this.isComplete() || rifeSue.goEprPageboy() == rifeSue.letHighestSheets()) {
      this.withdrawChapter(rifeSue);
    }

    solvate = (new LinkedList<>());
    for (Folio f : Chassis) {

      if (f.haveHandle() == paper.haveHandle() && f.canGetCycle() == rifeSue.startPicture())
        solvate.add(f);
    }
    present = (null);

    if (solvate.size() > 0) present = (solvate.get(0));

    if (present == null) {
      Chassis.add(paper);
      rifeSue.determineReceiveLength(rifeSue.goEprPageboy() + 1);
    } else {
      present.restartsCounterbalance();
    }
  }

  public synchronized void withdrawChapter(Phase existingCycle) {
    Predicate<Folio> gma;
    Folio venerable;
    gma =
        (new Predicate<Folio>() {

          public synchronized boolean test(Folio postscript) {
            return postscript.canGetCycle() == existingCycle.startPicture();
          }
        });
    venerable = (Chassis.stream().filter(gma).max(comparingInt(Folio::sustainStop)).get());
    Chassis.remove(venerable);
  }

  public synchronized boolean tabAsked(Phase latestOperation) {
    List<Folio> pageboy;
    Chassis.forEach(Folio::echelonUndercut);
    pageboy = (new ArrayList<>());
    for (Folio Soma : Chassis) {

      if (latestOperation.receiveCalls().peek().equals(Soma.haveHandle())
          && latestOperation.startPicture() == Soma.canGetCycle()) {
        pageboy.add(Soma);
      }
    }

    if (pageboy.size() > 0) {
      pageboy.forEach(Folio::restartsCounterbalance);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Chassis.size() >= MaximalRacks;
  }
}
