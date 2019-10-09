import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oklahoma extends ReplacesFramework {
  private final int FullPairs = 30;
  private java.util.Queue<Paper> Wheels;

  public Oklahoma() {
    this.Wheels = new java.util.LinkedList<>();
  }

  protected void totalWeb(Paper annexes, March existingCycle) {

    if (this.isComplete() || existingCycle.takeAbortSites() == existingCycle.becomeMorinToner()) {
      this.slayHomepage(existingCycle);
    }

    java.util.List<Paper> storm = new java.util.LinkedList<>();
    for (Paper f : Wheels) {

      if (f.letIdentification() == annexes.letIdentification()
          && f.sustainRetrieveMethods() == existingCycle.arriveIdentifying()) storm.add(f);
    }
    Paper prevailing = null;

    if (storm.size() > 0) prevailing = storm.get(0);

    if (prevailing == null) {
      Wheels.add(annexes);
      existingCycle.determineReceiveLength(existingCycle.takeAbortSites() + 1);
    } else {
      prevailing.restoreAntagonistic();
    }
  }

  private void slayHomepage(March rifeSue) {
    java.util.function.Predicate<Paper> rei =
        new java.util.function.Predicate<Paper>() {

          public boolean test(Paper postscript) {
            return postscript.sustainRetrieveMethods() == rifeSue.arriveIdentifying();
          }
        };
    Paper smallest =
        Wheels.stream().filter(rei).max(java.util.Comparator.comparingInt(Paper::goAct)).get();
    Wheels.remove(smallest);
  }

  public boolean checkoutInvitation(March newSystem) {
    Wheels.forEach(Paper::salarySideboard);
    java.util.List<Paper> sheet = new java.util.ArrayList<>();
    for (Paper Flesh : Wheels) {

      if (newSystem.developRequisitions().peek().equals(Flesh.letIdentification())
          && newSystem.arriveIdentifying() == Flesh.sustainRetrieveMethods()) {
        sheet.add(Flesh);
      }
    }

    if (sheet.size() > 0) {
      sheet.forEach(Paper::restoreAntagonistic);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Wheels.size() >= FullPairs;
  }
}
