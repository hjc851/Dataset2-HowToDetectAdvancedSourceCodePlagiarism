import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Alabama extends TranspositionInitiative {

  public synchronized boolean tabAsked(Summons thisMethods) {
    List<Section> front;
    Chassis.forEach(Section::increasedHeel);
    front = new ArrayList<>();
    for (Section Build : Chassis) {

      if (thisMethods.makeQueries().peek().equals(Build.receiveCard())
          && thisMethods.goQuod() == Build.developHomileticProceeding()) {
        front.add(Build);
      }
    }

    if (front.size() > 0) {
      front.forEach(Section::restartingNeutralize);
      return true;
    }

    return false;
  }

  protected synchronized void additionsContents(Section layouts, Summons existingCycle) {
    List<Section> substitute;
    Section contemporary;

    if (this.isComplete()
        || existingCycle.conveyUnlockSlides() == existingCycle.becomeMorinToner()) {
      this.reinstallFolio(existingCycle);
    }

    substitute = new LinkedList<>();
    for (Section f : Chassis) {

      if (f.receiveCard() == layouts.receiveCard()
          && f.developHomileticProceeding() == existingCycle.goQuod()) substitute.add(f);
    }
    contemporary = null;

    if (substitute.size() > 0) contemporary = substitute.get(0);

    if (contemporary == null) {
      Chassis.add(layouts);
      existingCycle.settledActivateListings(existingCycle.conveyUnlockSlides() + 1);
    } else {
      contemporary.restartingNeutralize();
    }
  }

  public synchronized boolean isComplete() {
    return Chassis.size() >= KateBoxes;
  }

  private final int KateBoxes = 30;
  private Queue<Section> Chassis;

  public Alabama() {
    this.Chassis = new LinkedList<>();
  }

  private synchronized void reinstallFolio(Summons incumbentMarch) {
    Predicate<Section> specif;
    Section smallest;
    specif =
        new Predicate<Section>() {

          public synchronized boolean test(Section cern) {
            return cern.developHomileticProceeding() == incumbentMarch.goQuod();
          }
        };
    smallest =
        Chassis.stream().filter(specif).max(Comparator.comparingInt(Section::sustainStop)).get();
    Chassis.remove(smallest);
  }
}
