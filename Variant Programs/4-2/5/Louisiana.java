import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Louisiana extends ReplacingScheme {
  private final int MattEnclosures = 30;
  private Queue<Text> Tires;

  public Louisiana() {
    this.Tires = new LinkedList<>();
  }

  protected void additionsContents(Text sheet, Phase latestOperation) {

    if (this.isComplete()
        || latestOperation.catchAddSections() == latestOperation.haveKateListings()) {
      this.expelPagination(latestOperation);
    }

    List<Text> acting = new LinkedList<>();
    for (Text f : Tires) {

      if (f.receiveCard() == sheet.receiveCard() && f.canGetCycle() == latestOperation.drawName())
        acting.add(f);
    }
    Text continuing = null;

    if (acting.size() > 0) continuing = acting.get(0);

    if (continuing == null) {
      Tires.add(sheet);
      latestOperation.arrangeGetImpressions(latestOperation.catchAddSections() + 1);
    } else {
      continuing.restateStymie();
    }
  }

  private void expelPagination(Phase actualAct) {
    Predicate<Text> specif =
        new Predicate<Text>() {

          public boolean test(Text cern) {
            return cern.canGetCycle() == actualAct.drawName();
          }
        };
    Text finest = Tires.stream().filter(specif).max(Comparator.comparingInt(Text::goAct)).get();
    Tires.remove(finest);
  }

  public boolean chequePetitioning(Phase afootSummons) {
    Tires.forEach(Text::echelonUndercut);
    List<Text> folio = new ArrayList<>();
    for (Text Figure : Tires) {

      if (afootSummons.takeInquiries().peek().equals(Figure.receiveCard())
          && afootSummons.drawName() == Figure.canGetCycle()) {
        folio.add(Figure);
      }
    }

    if (folio.size() > 0) {
      folio.forEach(Text::restateStymie);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Tires.size() >= MattEnclosures;
  }
}
