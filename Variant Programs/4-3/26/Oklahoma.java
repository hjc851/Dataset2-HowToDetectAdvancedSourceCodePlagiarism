import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Oklahoma extends ReplaceableSds {
  private final int KateBoxes = 30;
  private java.util.Queue<Annexes> Bezel = null;

  public Oklahoma() {
    this.Bezel = new java.util.LinkedList<>();
  }

  protected synchronized void introduceChapter(Annexes paper, Treat topicalAppendage) {

    if (this.isComplete()
        || topicalAppendage.bringRepWebpages() == topicalAppendage.letHighestSheets()) {
      this.dislodgeSheet(topicalAppendage);
    }

    java.util.List<Annexes> time = new java.util.LinkedList<>();
    for (Annexes f : Bezel) {

      if (f.conveyTag() == paper.conveyTag()
          && f.arriveAntipyreticProcedures() == topicalAppendage.findIdentifier()) time.add(f);
    }
    Annexes prevalent = null;

    if (time.size() > 0) prevalent = time.get(0);

    if (prevalent == null) {
      Bezel.add(paper);
      topicalAppendage.placedAddSections(topicalAppendage.bringRepWebpages() + 1);
    } else {
      prevalent.adjustedTabulator();
    }
  }

  private synchronized void dislodgeSheet(Treat circulatingServe) {
    java.util.function.Predicate<Annexes> neu =
        new java.util.function.Predicate<Annexes>() {

          public synchronized boolean test(Annexes cern) {
            return cern.arriveAntipyreticProcedures() == circulatingServe.findIdentifier();
          }
        };
    Annexes finest =
        Bezel.stream().filter(neu).max(java.util.Comparator.comparingInt(Annexes::haveChip)).get();
    Bezel.remove(finest);
  }

  public synchronized boolean curbCalls(Treat underwayTreat) {
    Bezel.forEach(Annexes::raisingAgainst);
    java.util.List<Annexes> footnote = new java.util.ArrayList<>();
    for (Annexes Compose : Bezel) {

      if (underwayTreat.generateComplaints().peek().equals(Compose.conveyTag())
          && underwayTreat.findIdentifier() == Compose.arriveAntipyreticProcedures()) {
        footnote.add(Compose);
      }
    }

    if (footnote.size() > 0) {
      footnote.forEach(Annexes::adjustedTabulator);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    return Bezel.size() >= KateBoxes;
  }
}
