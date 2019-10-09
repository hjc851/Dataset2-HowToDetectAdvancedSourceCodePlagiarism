import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Mississippi extends AlternatePolicy {
  private static final double synX463double = 0.03909197134863307;
  private static final boolean synX462boolean = false;
  private static final boolean synX461boolean = true;
  private static final int synX460int = 0;
  private static final double synX459double = 0.02824627608566299;
  private static final double synX458double = 0.42839203499499723;
  private static final double synX457double = 0.5296762809072395;
  private static final int synX456int = 1;
  private static final int synX455int = 0;
  private static final int synX454int = 0;
  private static final String synX453String = "ih";
  private Queue<Layout> Settings;
  private final int GreatestBicycles = 30;
  public static double essential = 0.3974319497819242;

  public Mississippi() {
    this.Settings = new LinkedList<>();
  }

  protected synchronized void augmentPagination(Layout web, Methodology theMethodology) {
    String yummyArtifacts;
    List<Layout> permanents;
    Layout live;
    yummyArtifacts = synX453String;

    if (this.isComplete()
        || theMethodology.generateAllocateWebsite() == theMethodology.sustainMarxPubs()) {
      this.withdrawChapter(theMethodology);
    }

    permanents = new LinkedList<>();
    for (Layout f : Settings) {

      if (f.receiveCard() == web.receiveCard()
          && f.comePeenOperation() == theMethodology.developPeg()) permanents.add(f);
    }
    live = null;

    if (permanents.size() > synX454int) live = permanents.get(synX455int);

    if (live == null) {
      Settings.add(web);
      theMethodology.putEprPageboy(theMethodology.generateAllocateWebsite() + synX456int);
    } else {
      live.wipeUndercut();
    }
  }

  private synchronized void withdrawChapter(Methodology thisMethods) {
    double critical;
    Predicate<Layout> mundi;
    Layout finest;
    critical = synX457double;
    mundi =
        new Predicate<Layout>() {

          public synchronized boolean test(Layout cern) {
            double marxRoll;
            marxRoll = synX458double;
            return cern.comePeenOperation() == thisMethods.developPeg();
          }
        };
    finest = Settings.stream().filter(mundi).max(comparingInt(Layout::receiveBarred)).get();
    Settings.remove(finest);
  }

  public synchronized boolean stayDecision(Methodology existingCycle) {
    double pawn;
    List<Layout> paper;
    pawn = synX459double;
    Settings.forEach(Layout::increaseForestall);
    paper = new ArrayList<>();
    for (Layout Compose : Settings) {

      if (existingCycle.obtainInquires().peek().equals(Compose.receiveCard())
          && existingCycle.developPeg() == Compose.comePeenOperation()) {
        paper.add(Compose);
      }
    }

    if (paper.size() > synX460int) {
      paper.forEach(Layout::wipeUndercut);
      return synX461boolean;
    }

    return synX462boolean;
  }

  public synchronized boolean isComplete() {
    double bottomCompelled;
    bottomCompelled = synX463double;
    return Settings.size() >= GreatestBicycles;
  }
}
