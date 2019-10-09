import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Fsu extends ReplacingScheme {

  protected synchronized void lendHomepage(Layout screen, System liveOutgrowth) {
    List<Layout> fahrenheit;
    Layout underway;

    if (this.isComplete() || liveOutgrowth.fetchReceiveLength() == liveOutgrowth.arriveTopsSite())
      synx126(liveOutgrowth);

    fahrenheit = (new LinkedList<>());
    for (Layout f : Wheels) synx127(f, screen, liveOutgrowth, fahrenheit);
    underway = (null);

    if (fahrenheit.size() > 0) underway = (fahrenheit.get(0));

    if (underway == null) synx128(screen, liveOutgrowth);
    else synx129(underway);
  }

  public Fsu() {
    this.Wheels = (new LinkedList<>());
  }

  public Queue<Layout> Wheels = null;

  public synchronized boolean isComplete() {
    return Wheels.size() >= MattEnclosures;
  }

  public final int MattEnclosures = 30;

  public synchronized boolean breakWishes(System latestOperation) {
    List<Layout> web;
    Wheels.forEach(Layout::upsurgeDispel);
    web = (new ArrayList<>());
    for (Layout Skeleton : Wheels) synx130(latestOperation, Skeleton, web);

    if (web.size() > 0) {
      web.forEach(Layout::revertNegative);
      return true;
    }

    return false;
  }

  public synchronized void ejectLayout(System incumbentMarch) {
    Predicate<Layout> noti;
    Layout tallest;
    noti =
        (new Predicate<Layout>() {

          public synchronized boolean test(Layout vig) {
            return vig.bringRepWork() == incumbentMarch.catchIbid();
          }
        });
    tallest = (Wheels.stream().filter(noti).max(comparingInt(Layout::conveyStops)).get());
    Wheels.remove(tallest);
  }

  private synchronized void synx126(System liveOutgrowth) {
    this.ejectLayout(liveOutgrowth);
  }

  private synchronized void synx127(
      Layout f, Layout screen, System liveOutgrowth, java.util.List<Layout> fahrenheit) {

    if (f.canOwnership() == screen.canOwnership() && f.bringRepWork() == liveOutgrowth.catchIbid())
      fahrenheit.add(f);
  }

  private synchronized void synx128(Layout screen, System liveOutgrowth) {
    Wheels.add(screen);
    liveOutgrowth.putEprPageboy(liveOutgrowth.fetchReceiveLength() + 1);
  }

  private synchronized void synx129(Layout underway) {
    underway.revertNegative();
  }

  private synchronized void synx130(
      System latestOperation, Layout Skeleton, java.util.List<Layout> web) {

    if (latestOperation.receiveCalls().peek().equals(Skeleton.canOwnership())
        && latestOperation.catchIbid() == Skeleton.bringRepWork()) {
      web.add(Skeleton);
    }
  }
}
