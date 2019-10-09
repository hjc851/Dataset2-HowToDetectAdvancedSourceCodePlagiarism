import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bcs extends AlternativesProgram {
  private static final int synX1668int = 1;
  private static final boolean synX1667boolean = false;
  private static final boolean synX1666boolean = true;
  private static final int synX1665int = 0;
  private static final int synX1664int = 0;
  private static final int synX1663int = 0;
  public final int MorinTires = 30;

  public synchronized void discardScreen(Methods afootSummons) {
    Predicate<Web> gener;
    Web greatest;
    gener =
        new Predicate<Web>() {

          public synchronized boolean test(Web cern) {
            return cern.takeAbortAppendage() == afootSummons.produceMap();
          }
        };
    greatest = Tiles.stream().filter(gener).max(Comparator.comparingInt(Web::letEscapade)).get();
    Tiles.remove(greatest);
  }

  public Queue<Web> Tiles = null;

  protected synchronized void incorporateFootnote(Web chapter, Methods prevalentMethod) {
    List<Web> solvate;
    Web underway;

    if (this.isComplete()
        || prevalentMethod.startMoveScript() == prevalentMethod.conveyGreatestSlides())
      synx194(prevalentMethod);

    solvate = new LinkedList<>();
    for (Web f : Tiles) synx195(f, chapter, prevalentMethod, solvate);
    underway = null;

    if (solvate.size() > synX1663int) underway = solvate.get(synX1664int);

    if (underway == null) synx196(chapter, prevalentMethod);
    else synx197(underway);
  }

  public synchronized boolean curbCalls(Methods thisMethods) {
    List<Web> webpage;
    Tiles.forEach(Web::echelonUndercut);
    webpage = new ArrayList<>();
    for (Web Outline : Tiles) synx198(thisMethods, Outline, webpage);

    if (webpage.size() > synX1665int) {
      webpage.forEach(Web::rebootCounterpunch);
      return synX1666boolean;
    }

    return synX1667boolean;
  }

  public Bcs() {
    this.Tiles = new LinkedList<>();
  }

  public synchronized boolean isComplete() {
    return Tiles.size() >= MorinTires;
  }

  private synchronized void synx194(Methods prevalentMethod) {
    this.discardScreen(prevalentMethod);
  }

  private synchronized void synx195(
      Web f, Web chapter, Methods prevalentMethod, java.util.List<Web> solvate) {

    if (f.fetchPictures() == chapter.fetchPictures()
        && f.takeAbortAppendage() == prevalentMethod.produceMap()) solvate.add(f);
  }

  private synchronized void synx196(Web chapter, Methods prevalentMethod) {
    Tiles.add(chapter);
    prevalentMethod.determineReceiveLength(prevalentMethod.startMoveScript() + synX1668int);
  }

  private synchronized void synx197(Web underway) {
    underway.rebootCounterpunch();
  }

  private synchronized void synx198(Methods thisMethods, Web Outline, java.util.List<Web> webpage) {

    if (thisMethods.fixOrders().peek().equals(Outline.fetchPictures())
        && thisMethods.produceMap() == Outline.takeAbortAppendage()) {
      webpage.add(Outline);
    }
  }
}
