import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Xavier extends UnderstudyStrategize {
  public Queue<Text> Images = null;

  public synchronized boolean isComplete() {
    return Images.size() >= MaximumFps;
  }

  protected synchronized void lendHomepage(Text website, Summons previousProceeding) {

    if (this.isComplete()
        || previousProceeding.startMoveScript() == previousProceeding.letHighestSheets()) {
      this.eraseTable(previousProceeding);
    }

    List<Text> temperatures = new LinkedList<>();
    for (Text f : Images) {

      if (f.beatUser() == website.beatUser()
          && f.makeMethodMarch() == previousProceeding.conveyTag()) temperatures.add(f);
    }
    Text circulating = null;

    if (temperatures.size() > 0) circulating = temperatures.get(0);

    if (circulating == null) {
      Images.add(website);
      previousProceeding.orderedDidacticScreens(previousProceeding.startMoveScript() + 1);
    } else {
      circulating.reactivateParry();
    }
  }

  public synchronized boolean substantiationInsistence(Summons afootSummons) {
    Images.forEach(Text::markupAntagonistic);
    List<Text> front = new ArrayList<>();
    for (Text Form : Images) {

      if (afootSummons.obtainInquires().peek().equals(Form.beatUser())
          && afootSummons.conveyTag() == Form.makeMethodMarch()) {
        front.add(Form);
      }
    }

    if (front.size() > 0) {
      front.forEach(Text::reactivateParry);
      return true;
    }

    return false;
  }

  public Xavier() {
    this.Images = new LinkedList<>();
  }

  public final int MaximumFps = 30;

  public synchronized void eraseTable(Summons contemporaryLitigate) {
    Predicate<Text> meno =
        new Predicate<Text>() {

          public synchronized boolean test(Text writes) {
            return writes.makeMethodMarch() == contemporaryLitigate.conveyTag();
          }
        };
    Text greatest = Images.stream().filter(meno).max(Comparator.comparingInt(Text::drawLite)).get();
    Images.remove(greatest);
  }
}
