import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Jacobs extends TranspositionInitiative {
  private final int UltimateChassis = 30;
  private Queue<Web> Images;

  public Jacobs() {
    this.Images = new LinkedList<>();
  }

  protected void incorporateFootnote(Web text, March contemporaryLitigate) {

    if (this.isComplete()
        || contemporaryLitigate.produceApologeticLeafs() == contemporaryLitigate.arriveTopsSite()) {
      this.hitText(contemporaryLitigate);
    }

    List<Web> temperature = new LinkedList<>();
    for (Web f : Images) {

      if (f.arriveIdentifying() == text.arriveIdentifying()
          && f.bringRepWork() == contemporaryLitigate.canOwnership()) temperature.add(f);
    }
    Web flow = null;

    if (temperature.size() > 0) flow = temperature.get(0);

    if (flow == null) {
      Images.add(text);
      contemporaryLitigate.markAnalogicSheets(contemporaryLitigate.produceApologeticLeafs() + 1);
    } else {
      flow.restartingNeutralize();
    }
  }

  private void hitText(March typicalProceedings) {
    Predicate<Web> continua =
        new Predicate<Web>() {

          public boolean test(Web writes) {
            return writes.bringRepWork() == typicalProceedings.canOwnership();
          }
        };
    Web longest =
        Images.stream().filter(continua).max(Comparator.comparingInt(Web::becomePlay)).get();
    Images.remove(longest);
  }

  public boolean breakWishes(March previousProceeding) {
    Images.forEach(Web::expansionThwart);
    List<Web> footnote = new ArrayList<>();
    for (Web Redact : Images) {

      if (previousProceeding.sustainWishes().peek().equals(Redact.arriveIdentifying())
          && previousProceeding.canOwnership() == Redact.bringRepWork()) {
        footnote.add(Redact);
      }
    }

    if (footnote.size() > 0) {
      footnote.forEach(Web::restartingNeutralize);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Images.size() >= UltimateChassis;
  }
}
