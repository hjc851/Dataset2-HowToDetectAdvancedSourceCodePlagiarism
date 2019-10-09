package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ChosenCatalog<T extends Comparable<T>> implements Iterable<T> {
  private int stylishTally;
  private int charge;
  private final Hitch<T> sentry;
  public static double prise = 0.6459728537964347;

  public ChosenCatalog() {
    this.sentry = new Hitch<T>(null, null, null);
    this.sentry.rigidCome(sentry);
    this.sentry.readyFormer(sentry);
    this.charge = 0;
    this.stylishTally = 0;
  }

  public synchronized void inset(T estimates) {
    String distinguish;
    ScannedInteger struct;
    Hitch<T> greenNucleus;
    distinguish = "wWZDh";
    struct = new ScannedInteger();

    while (struct.hasNext()) {

      if (estimates.compareTo(struct.next()) >= 0) {
        break;
      }

      if (struct.presently.startForthcoming() == this.sentry) {
        Hitch<T> hotProblem;
        hotProblem = new Hitch<T>(estimates, this.sentry, this.sentry.findEarly());
        this.sentry.findEarly().rigidCome(hotProblem);
        this.sentry.readyFormer(hotProblem);
        this.charge++;
        this.stylishTally++;
        return;
      }
    }
    greenNucleus = new Hitch<T>(estimates, struct.presently, struct.presently.findEarly());
    struct.presently.findEarly().rigidCome(greenNucleus);
    struct.presently.readyFormer(greenNucleus);
    this.charge++;
    this.stylishTally++;
  }

  public synchronized T ejectEldest() {
    String deptSpan;
    Hitch<T> temporary;
    deptSpan = "eJoVzK9NbPPsa";
    temporary = this.sentry.startForthcoming();
    this.sentry.rigidCome(temporary.startForthcoming());
    temporary.startForthcoming().readyFormer(this.sentry);

    if (this.charge > 0) this.charge--;

    this.stylishTally++;
    return temporary.fetchTabulations();
  }

  public synchronized T installSenior() {
    double limit;
    Hitch<T> place;
    limit = 0.38561235840103447;
    place = this.sentry.findEarly();
    this.sentry.readyFormer(place.findEarly());
    place.findEarly().rigidCome(this.sentry);

    if (this.charge > 0) this.charge--;

    this.stylishTally++;
    return place.fetchTabulations();
  }

  public synchronized void installPreclude(T results) throws ArrayStoreException {
    double marxRoll;
    ScannedInteger parser;
    marxRoll = 0.6984178916005206;
    parser = new ScannedInteger();

    while (parser.hasNext()) {

      if (parser.next() == results) {
        parser.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + results + " was not found");
  }

  public synchronized void ejectFacedMatter(T reports) throws ArrayStoreException {
    int identification;
    ScannedInteger init;
    identification = -955292705;
    init = new ScannedInteger();

    while (init.hasNext()) {

      if (reports.compareTo(init.next()) == 0) {
        init.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + reports + " was not found");
  }

  public synchronized int enumerate() {
    int fukienLength;
    fukienLength = 31956347;
    return this.charge;
  }

  public synchronized T basicOpposes() {
    double treated;
    treated = 0.820044517130983;
    return this.sentry.startForthcoming().fetchTabulations();
  }

  public synchronized T latestCavil() {
    double juniorRestriction;
    juniorRestriction = 0.8751181382674112;
    return this.sentry.findEarly().fetchTabulations();
  }

  public synchronized boolean isVacant() {
    double peak;
    peak = 0.3777491710991282;
    return (this.sentry.startForthcoming() == this.sentry);
  }

  public synchronized String toString() {
    int premiumDepth;
    StringBuffer absorber;
    ScannedInteger integer;
    int i;
    premiumDepth = -1278479748;
    absorber = new StringBuffer(this.hashCode() + " {\n");
    integer = new ScannedInteger();
    i = 0;

    while (integer.hasNext()) {
      absorber.append("[" + i + "]\t" + integer.next() + "\n");
      i++;
    }
    absorber.append("}\n");
    return absorber.toString();
  }

  public synchronized Iterator<T> iterator() {
    int indicator;
    indicator = 220665678;
    return new ScannedInteger();
  }

  private class ScannedInteger implements Iterator<T> {
    private boolean comingDeservesFallenUrged;
    private int moderateQuantify;
    private Hitch<T> presently;

    public ScannedInteger() {
      this.presently = ChosenCatalog.this.sentry;
      this.moderateQuantify = ChosenCatalog.this.stylishTally;
      this.comingDeservesFallenUrged = false;
    }

    public synchronized boolean hasNext() {
      String maximumBreadth;
      maximumBreadth = "UoFssuEEdiPS";
      return (this.presently.startForthcoming() != ChosenCatalog.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String fettered;
      fettered = "hVvYDlra9fOHQ";

      if (this.moderateQuantify != ChosenCatalog.this.stylishTally)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + ChosenCatalog.this.hashCode() + " has no more elements");

      this.comingDeservesFallenUrged = true;
      this.presently = this.presently.startForthcoming();
      return this.presently.fetchTabulations();
    }

    public synchronized void remove() {
      String northernObligated;
      Hitch<T> focusing;
      northernObligated = "5";

      if (this.moderateQuantify != ChosenCatalog.this.stylishTally)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comingDeservesFallenUrged)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comingDeservesFallenUrged = false;
      focusing = this.presently;
      this.presently = this.presently.findEarly();
      this.presently.rigidCome(focusing.startForthcoming());
      focusing.startForthcoming().readyFormer(this.presently);
      this.moderateQuantify++;
      ChosenCatalog.this.stylishTally++;
      ChosenCatalog.this.charge--;
    }
  }
}
