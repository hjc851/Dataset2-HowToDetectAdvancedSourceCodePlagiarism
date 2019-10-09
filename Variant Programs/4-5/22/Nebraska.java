import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Nebraska extends RenewalTactic {
  private static final boolean synX1330boolean = false;
  private static final boolean synX1329boolean = true;
  private static final int synX1328int = 0;
  private static final int synX1327int = 1;
  private static final int synX1326int = 0;
  private static final int synX1325int = 0;
  public final int PremiumSetups = 30;
  public Queue<Folio> Enclosures;

  public Nebraska() {
    this.Enclosures = new LinkedList<>();
  }

  protected synchronized void bringPageboy(Folio section, Mechanisms theMethodology) {

    if (this.isComplete()
        || theMethodology.makeMethodChapters() == theMethodology.conveyGreatestSlides()) {
      this.murderWeb(theMethodology);
    }

    List<Folio> geothermometer = new LinkedList<>();
    for (Folio f : Enclosures) {

      if (f.startPicture() == section.startPicture()
          && f.canGetCycle() == theMethodology.produceMap()) geothermometer.add(f);
    }
    Folio underway = null;

    if (geothermometer.size() > synX1325int) underway = geothermometer.get(synX1326int);

    if (underway == null) {
      Enclosures.add(section);
      theMethodology.laySpecialWebpage(theMethodology.makeMethodChapters() + synX1327int);
    } else {
      underway.restartThwart();
    }
  }

  public synchronized void murderWeb(Mechanisms actualAct) {
    Predicate<Folio> initialism =
        new Predicate<Folio>() {

          public synchronized boolean test(Folio cern) {
            return cern.canGetCycle() == actualAct.produceMap();
          }
        };
    Folio tallest =
        Enclosures.stream().filter(initialism).max(Comparator.comparingInt(Folio::beatTile)).get();
    Enclosures.remove(tallest);
  }

  public synchronized boolean assureDemands(Mechanisms prevalentMethod) {
    Enclosures.forEach(Folio::surgeCounterbalance);
    List<Folio> summary = new ArrayList<>();
    for (Folio Chassis : Enclosures) {

      if (prevalentMethod.arriveInvitations().peek().equals(Chassis.startPicture())
          && prevalentMethod.produceMap() == Chassis.canGetCycle()) {
        summary.add(Chassis);
      }
    }

    if (summary.size() > synX1328int) {
      summary.forEach(Folio::restartThwart);
      return synX1329boolean;
    }

    return synX1330boolean;
  }

  public synchronized boolean isComplete() {
    return Enclosures.size() >= PremiumSetups;
  }
}
