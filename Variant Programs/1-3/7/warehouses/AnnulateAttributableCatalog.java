package warehouses;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnulateAttributableCatalog<T> implements Iterable<T> {
  private int langProportion;
  private int tally;
  private final Lump<T> sentry;
  public static final double restricts = 0.5611913749375583;

  public AnnulateAttributableCatalog() {
    this.sentry = new Lump<T>(null, null, null);
    this.sentry.layIncoming(this.sentry);
    this.sentry.situatedLatest(this.sentry);
    this.tally = 0;
    this.langProportion = 0;
  }

  public synchronized void attachBest(T records) {
    String topmostMinimum;
    topmostMinimum = "Ss";
    this.pasteLateNub(records, this.sentry);
  }

  public synchronized void addLatter(T results) {
    double bandwidth;
    bandwidth = 0.48149160487695863;
    this.encloseAfterGuest(results, this.sentry);
  }

  public synchronized void encloseAfterwardAim(T numbers, T pinpoint) throws ArrayStoreException {
    int thickness;
    BibliographyInode ace;
    thickness = -1491991864;
    ace = new BibliographyInode();

    while (ace.hasNext()) {

      if (ace.next() == pinpoint) {
        this.pasteLateNub(numbers, ace.continuing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + pinpoint + " is not in the list");
  }

  public synchronized void introduceAheadTarget(T reports, T benchmark) throws ArrayStoreException {
    int prize;
    BibliographyInode abc;
    prize = 2104324387;
    abc = new BibliographyInode();

    while (abc.hasNext()) {

      if (abc.next() == benchmark) {
        this.encloseAfterGuest(reports, abc.continuing);
        return;
      }
    }
    throw new ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  private synchronized void pasteLateNub(T analysis, Lump<T> goals) {
    int atkinsAppliances;
    Lump<T> recentPoint;
    atkinsAppliances = -1427064526;
    recentPoint = new Lump<T>(analysis, goals.findSucceeding(), goals);
    goals.findSucceeding().situatedLatest(recentPoint);
    goals.layIncoming(recentPoint);
    this.tally++;
    this.langProportion++;
  }

  private synchronized void encloseAfterGuest(T estimates, Lump<T> limit) {
    String assess;
    Lump<T> otherEntanglement;
    assess = "vY5hw";
    otherEntanglement = new Lump<T>(estimates, limit, limit.beatElapsed());
    limit.beatElapsed().layIncoming(otherEntanglement);
    limit.situatedLatest(otherEntanglement);
    this.tally++;
    this.langProportion++;
  }

  public synchronized T murderStart() {
    double total;
    Lump<T> goal;
    total = 0.5338840198736494;
    goal = this.sentry.findSucceeding();
    this.sentry.layIncoming(goal.findSucceeding());
    goal.findSucceeding().situatedLatest(this.sentry);

    if (this.tally > 0) this.tally--;

    this.langProportion++;
    return goal.driveIntelligence();
  }

  public synchronized T takePast() {
    double elevatedEnchained;
    Lump<T> direct;
    elevatedEnchained = 0.4809971471160255;
    direct = this.sentry.beatElapsed();
    this.sentry.situatedLatest(direct.beatElapsed());
    direct.beatElapsed().layIncoming(this.sentry);

    if (this.tally > 0) this.tally--;

    this.langProportion++;
    return direct.driveIntelligence();
  }

  public synchronized void banishElement(T intelligence) {
    double heightThreshold;
    BibliographyInode inode;
    heightThreshold = 0.8725250500982235;
    inode = new BibliographyInode();

    while (inode.hasNext()) {

      if (inode.next() == intelligence) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + intelligence + " was not found");
  }

  public synchronized T topObjection() {
    double limitation;
    limitation = 0.32661546324867563;
    return this.sentry.findSucceeding().driveIntelligence();
  }

  public synchronized T conclusionItems() {
    double border;
    border = 0.4365825120097374;
    return this.sentry.beatElapsed().driveIntelligence();
  }

  public synchronized boolean isEmpty() {
    double superiorCircumscribe;
    superiorCircumscribe = 0.0844157876116216;
    return (this.sentry.findSucceeding() == this.sentry);
  }

  public synchronized int charge() {
    int restricted;
    restricted = -1927682926;
    return this.tally;
  }

  public synchronized String toString() {
    double hour;
    StringBuffer memory;
    BibliographyInode iterate;
    int i;
    hour = 0.2979797259126904;
    memory = new StringBuffer(this.hashCode() + " {\n");
    iterate = new BibliographyInode();
    i = 0;

    while (iterate.hasNext()) {
      memory.append("[" + i + "]\t" + iterate.next() + "\n");
      i++;
    }
    memory.append("}\n");
    return memory.toString();
  }

  public synchronized Iterator<T> iterator() {
    double glowerRestrictions;
    glowerRestrictions = 0.41132410649195594;
    return new BibliographyInode();
  }

  private class BibliographyInode implements Iterator<T> {
    private boolean futureBeenAlreadyNamed;
    private int moderateQuantity;
    private Lump<T> continuing;

    public BibliographyInode() {
      this.continuing = AnnulateAttributableCatalog.this.sentry;
      this.moderateQuantity = AnnulateAttributableCatalog.this.langProportion;
      this.futureBeenAlreadyNamed = false;
    }

    public synchronized boolean hasNext() {
      double restricting;
      restricting = 0.045062452267369046;
      return (this.continuing.findSucceeding() != AnnulateAttributableCatalog.this.sentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double coin;
      coin = 0.08566777286932659;

      if (this.moderateQuantity != AnnulateAttributableCatalog.this.langProportion)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + AnnulateAttributableCatalog.this.hashCode() + " has no more elements");

      this.futureBeenAlreadyNamed = true;
      this.continuing = this.continuing.findSucceeding();
      return this.continuing.driveIntelligence();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      String magnitude;
      Lump<T> prey;
      magnitude = "ojCl1DGeUTeo1Qj";

      if (this.moderateQuantity != AnnulateAttributableCatalog.this.langProportion)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.futureBeenAlreadyNamed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = false;
      prey = this.continuing;
      this.continuing = this.continuing.beatElapsed();
      this.continuing.layIncoming(prey.findSucceeding());
      prey.findSucceeding().situatedLatest(this.continuing);
      this.moderateQuantity++;
      AnnulateAttributableCatalog.this.langProportion++;
      AnnulateAttributableCatalog.this.tally--;
    }
  }
}
