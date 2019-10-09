import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lus extends SuccessorPlan {
  private final int MaximumFps = 30;
  private Queue<Sheet> Wheels;

  public Lus() {
    this.Wheels = new LinkedList<>();
  }

  protected void provideLayout(Sheet annexes, Mechanism actualAct) {

    if (this.isComplete() || actualAct.canGetImpressions() == actualAct.conveyGreatestSlides()) {
      this.banishTab(actualAct);
    }

    List<Sheet> geothermometer = new LinkedList<>();
    for (Sheet f : Wheels) {

      if (f.letIdentification() == annexes.letIdentification()
          && f.startMoveMechanism() == actualAct.findIdentifier()) geothermometer.add(f);
    }
    Sheet latest = null;

    if (geothermometer.size() > 0) latest = geothermometer.get(0);

    if (latest == null) {
      Wheels.add(annexes);
      actualAct.solidifyingWaitSlips(actualAct.canGetImpressions() + 1);
    } else {
      latest.adjustBuffet();
    }
  }

  private void banishTab(Mechanism underwayTreat) {
    Predicate<Sheet> amoxil =
        new Predicate<Sheet>() {

          public boolean test(Sheet cern) {
            return cern.startMoveMechanism() == underwayTreat.findIdentifier();
          }
        };
    Sheet smallest =
        Wheels.stream().filter(amoxil).max(Comparator.comparingInt(Sheet::receiveBarred)).get();
    Wheels.remove(smallest);
  }

  public boolean stayDecision(Mechanism latestOperation) {
    Wheels.forEach(Sheet::increasesBuffet);
    List<Sheet> front = new ArrayList<>();
    for (Sheet Flesh : Wheels) {

      if (latestOperation.startApplication().peek().equals(Flesh.letIdentification())
          && latestOperation.findIdentifier() == Flesh.startMoveMechanism()) {
        front.add(Flesh);
      }
    }

    if (front.size() > 0) {
      front.forEach(Sheet::adjustBuffet);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Wheels.size() >= MaximumFps;
  }
}
