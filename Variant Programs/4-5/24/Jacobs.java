import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Jacobs extends ReplaceAgenda {
  private static final boolean synX1396boolean = false;
  private static final boolean synX1395boolean = true;
  private static final int synX1394int = 0;
  private static final int synX1393int = 1;
  private static final int synX1392int = 0;
  private static final int synX1391int = 0;
  public java.util.Queue<Section> Cabinets;
  public final int LoadCabinets = 30;

  public Jacobs() {
    this.Cabinets = new java.util.LinkedList<>();
  }

  protected synchronized void incorporateFootnote(Section webpage, Proceedings newSystem) {
    java.util.List<Section> acting;
    Section underway;

    if (this.isComplete() || newSystem.canGetImpressions() == newSystem.comeLimitVarlet()) {
      this.takePageboy(newSystem);
    }

    acting = new java.util.LinkedList<>();
    for (Section f : Cabinets) {

      if (f.conveyTag() == webpage.conveyTag()
          && f.conveyUnlockFormalities() == newSystem.obtainEst()) acting.add(f);
    }
    underway = null;

    if (acting.size() > synX1391int) underway = acting.get(synX1392int);

    if (underway == null) {
      Cabinets.add(webpage);
      newSystem.rigidUnlockSlides(newSystem.canGetImpressions() + synX1393int);
    } else {
      underway.reestablishAnticipate();
    }
  }

  public synchronized void takePageboy(Proceedings theMethodology) {
    java.util.function.Predicate<Section> erat;
    Section largest;
    erat =
        new java.util.function.Predicate<Section>() {

          public synchronized boolean test(Section writes) {
            return writes.conveyUnlockFormalities() == theMethodology.obtainEst();
          }
        };
    largest = Cabinets.stream().filter(erat).max(comparingInt(Section::produceLine)).get();
    Cabinets.remove(largest);
  }

  public synchronized boolean checkoutInvitation(Proceedings liveOutgrowth) {
    java.util.List<Section> front;
    Cabinets.forEach(Section::increaseForestall);
    front = new java.util.ArrayList<>();
    for (Section Inning : Cabinets) {

      if (liveOutgrowth.generateComplaints().peek().equals(Inning.conveyTag())
          && liveOutgrowth.obtainEst() == Inning.conveyUnlockFormalities()) {
        front.add(Inning);
      }
    }

    if (front.size() > synX1394int) {
      front.forEach(Section::reestablishAnticipate);
      return synX1395boolean;
    }

    return synX1396boolean;
  }

  public synchronized boolean isComplete() {
    return Cabinets.size() >= LoadCabinets;
  }
}
