import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Osu extends FallbackStrategist {
  private static final int synX2350int = 1;
  private static final int synX2349int = 0;
  private static final int synX2348int = 0;
  private static final boolean synX2347boolean = false;
  private static final boolean synX2346boolean = true;
  private static final int synX2345int = 0;

  public Osu() {
    this.Enclosures = new java.util.LinkedList<>();
  }

  private final int MattEnclosures = 30;

  public synchronized boolean isComplete() {
    return Enclosures.size() >= MattEnclosures;
  }

  public synchronized boolean substantiationInsistence(Treat afootSummons) {
    java.util.List<Summary> website;
    Enclosures.forEach(Summary::augmentationParry);
    website = new java.util.ArrayList<>();
    for (Summary Put : Enclosures) {

      if (afootSummons.becomeRequisition().peek().equals(Put.fetchPictures())
          && afootSummons.receiveCard() == Put.developHomileticProceeding()) {
        website.add(Put);
      }
    }

    if (website.size() > synX2345int) {
      website.forEach(Summary::reloadCounteract);
      return synX2346boolean;
    }

    return synX2347boolean;
  }

  private synchronized void reinstallFolio(Treat actualAct) {
    java.util.function.Predicate<Summary> specif;
    Summary happiest;
    specif =
        new java.util.function.Predicate<Summary>() {

          public synchronized boolean test(Summary writes) {
            return writes.developHomileticProceeding() == actualAct.receiveCard();
          }
        };
    happiest =
        Enclosures.stream()
            .filter(specif)
            .max(java.util.Comparator.comparingInt(Summary::goAct))
            .get();
    Enclosures.remove(happiest);
  }

  private java.util.Queue<Summary> Enclosures = null;

  protected synchronized void appendWebpage(Summary folio, Treat rifeSue) {
    java.util.List<Summary> temperatures;
    Summary topical;

    if (this.isComplete() || rifeSue.haveActivateListings() == rifeSue.bringMaximalWebpages()) {
      this.reinstallFolio(rifeSue);
    }

    temperatures = new java.util.LinkedList<>();
    for (Summary f : Enclosures) {

      if (f.fetchPictures() == folio.fetchPictures()
          && f.developHomileticProceeding() == rifeSue.receiveCard()) temperatures.add(f);
    }
    topical = null;

    if (temperatures.size() > synX2348int) topical = temperatures.get(synX2349int);

    if (topical == null) {
      Enclosures.add(folio);
      rifeSue.dictatedRepWebpages(rifeSue.haveActivateListings() + synX2350int);
    } else {
      topical.reloadCounteract();
    }
  }
}
