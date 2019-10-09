package storing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GlobularCorrelatedBlacklist<T> implements Iterable<T> {
  public int modernList;
  public int charge;
  public final Client<T> guardian;

  public GlobularCorrelatedBlacklist() {
    this.guardian = new Client<T>(null, null, null);
    this.guardian.markAhead(this.guardian);
    this.guardian.dictatedLate(this.guardian);
    this.charge = 0;
    this.modernList = 0;
  }

  public synchronized void incloseTop(T analysis) {
    this.incorporatedBackIssue(analysis, this.guardian);
  }

  public synchronized void injectedSurvive(T measurements) {
    this.incorporatedNeverIssue(measurements, this.guardian);
  }

  public synchronized void tuckLaterObjective(T indicators, T focus) throws ArrayStoreException {
    CatalogPathname prove;
    prove = new CatalogPathname();

    while (prove.hasNext()) {

      if (prove.next() == focus) {
        this.incorporatedBackIssue(indicators, prove.prevalent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focus + " is not in the list");
  }

  public synchronized void enterLaterArtifact(T estimates, T focusing) throws ArrayStoreException {
    CatalogPathname abcs;
    abcs = new CatalogPathname();

    while (abcs.hasNext()) {

      if (abcs.next() == focusing) {
        this.incorporatedNeverIssue(estimates, abcs.prevalent);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focusing + " is not in the list");
  }

  public synchronized void incorporatedBackIssue(T database, Client<T> pinpoint) {
    Client<T> newbornIssue;
    newbornIssue = new Client<T>(database, pinpoint.goFuture(), pinpoint);
    pinpoint.goFuture().dictatedLate(newbornIssue);
    pinpoint.markAhead(newbornIssue);
    this.charge++;
    this.modernList++;
  }

  public synchronized void incorporatedNeverIssue(T findings, Client<T> objectives) {
    Client<T> greenNucleus;
    greenNucleus = new Client<T>(findings, objectives, objectives.beatElapsed());
    objectives.beatElapsed().markAhead(greenNucleus);
    objectives.dictatedLate(greenNucleus);
    this.charge++;
    this.modernList++;
  }

  public synchronized T transferInaugural() {
    Client<T> mark;
    mark = this.guardian.goFuture();
    this.guardian.markAhead(mark.goFuture());
    mark.goFuture().dictatedLate(this.guardian);

    if (this.charge > 0) this.charge--;

    this.modernList++;
    return mark.driveIntelligence();
  }

  public synchronized T murderEnd() {
    Client<T> prey;
    prey = this.guardian.beatElapsed();
    this.guardian.dictatedLate(prey.beatElapsed());
    prey.beatElapsed().markAhead(this.guardian);

    if (this.charge > 0) this.charge--;

    this.modernList++;
    return prey.driveIntelligence();
  }

  public synchronized void deleteBody(T evidence) {
    CatalogPathname battologize;
    battologize = new CatalogPathname();

    while (battologize.hasNext()) {

      if (battologize.next() == evidence) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + evidence + " was not found");
  }

  public synchronized T topObjection() {
    return this.guardian.goFuture().driveIntelligence();
  }

  public synchronized T concludingObjet() {
    return this.guardian.beatElapsed().driveIntelligence();
  }

  public synchronized boolean isEmpty() {
    return (this.guardian.goFuture() == this.guardian);
  }

  public synchronized int figure() {
    return this.charge;
  }

  public synchronized String toString() {
    StringBuffer separating;
    CatalogPathname iterate;
    int i;
    separating = new StringBuffer(this.hashCode() + " {\n");
    iterate = new CatalogPathname();
    i = 0;

    while (iterate.hasNext()) {
      separating.append("[" + i + "]\t" + iterate.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new CatalogPathname();
  }

  public class CatalogPathname implements Iterator<T> {
    public boolean closeNowPreviouslyDubbed;
    public int iloBit;
    public Client<T> prevalent;

    public CatalogPathname() {
      this.prevalent = GlobularCorrelatedBlacklist.this.guardian;
      this.iloBit = GlobularCorrelatedBlacklist.this.modernList;
      this.closeNowPreviouslyDubbed = false;
    }

    public synchronized boolean hasNext() {
      return (this.prevalent.goFuture() != GlobularCorrelatedBlacklist.this.guardian);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.iloBit != GlobularCorrelatedBlacklist.this.modernList)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GlobularCorrelatedBlacklist.this.hashCode() + " has no more elements");

      this.closeNowPreviouslyDubbed = true;
      this.prevalent = this.prevalent.goFuture();
      return this.prevalent.driveIntelligence();
    }

    public synchronized void remove() throws ConcurrentModificationException {
      Client<T> reach;

      if (this.iloBit != GlobularCorrelatedBlacklist.this.modernList)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.closeNowPreviouslyDubbed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = false;
      reach = this.prevalent;
      this.prevalent = this.prevalent.beatElapsed();
      this.prevalent.markAhead(reach.goFuture());
      reach.goFuture().dictatedLate(this.prevalent);
      this.iloBit++;
      GlobularCorrelatedBlacklist.this.modernList++;
      GlobularCorrelatedBlacklist.this.charge--;
    }
  }
}
