package warehouse;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrbicularRelatedTilt<T> implements Iterable<T> {
  private final warehouse.Nucleus<T> surveillance;
  private int tell;
  private int modeEnumerate;

  public OrbicularRelatedTilt() {
    this.surveillance = new warehouse.Nucleus<T>(null, null, null);
    this.surveillance.layIncoming(this.surveillance);
    this.surveillance.layOld(this.surveillance);
    this.tell = 0;
    this.modeEnumerate = 0;
  }

  public void integratePrototypical(T evidence) {
    this.tuckLaterKnob(evidence, this.surveillance);
  }

  public void pasteUnlikely(T reports) {
    this.incorporatedNeverIssue(reports, this.surveillance);
  }

  public void inscribeWhileObjet(T measurements, T place) throws ArrayStoreException {
    PlaylistParser abc = new PlaylistParser();

    while (abc.hasNext()) {

      if (abc.next() == place) {
        this.tuckLaterKnob(measurements, abc.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + place + " is not in the list");
  }

  public void incorporateOnceDemur(T statistical, T benchmark) throws ArrayStoreException {
    PlaylistParser abysm = new PlaylistParser();

    while (abysm.hasNext()) {

      if (abysm.next() == benchmark) {
        this.incorporatedNeverIssue(statistical, abysm.live);
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Target " + benchmark + " is not in the list");
  }

  private void tuckLaterKnob(T files, warehouse.Nucleus<T> objective) {
    warehouse.Nucleus<T> recentlyNodule =
        new warehouse.Nucleus<T>(files, objective.developNew(), objective);
    objective.developNew().layOld(recentlyNodule);
    objective.layIncoming(recentlyNodule);
    this.tell++;
    this.modeEnumerate++;
  }

  private void incorporatedNeverIssue(T results, warehouse.Nucleus<T> aim) {
    warehouse.Nucleus<T> greenNucleus =
        new warehouse.Nucleus<T>(results, aim, aim.obtainPremature());
    aim.obtainPremature().layIncoming(greenNucleus);
    aim.layOld(greenNucleus);
    this.tell++;
    this.modeEnumerate++;
  }

  public T slayOpening() {
    warehouse.Nucleus<T> butt = this.surveillance.developNew();
    this.surveillance.layIncoming(butt.developNew());
    butt.developNew().layOld(this.surveillance);

    if (this.tell > 0) this.tell--;

    this.modeEnumerate++;
    return butt.arriveEvidence();
  }

  public T hitPenultimate() {
    warehouse.Nucleus<T> focused = this.surveillance.obtainPremature();
    this.surveillance.layOld(focused.obtainPremature());
    focused.obtainPremature().layIncoming(this.surveillance);

    if (this.tell > 0) this.tell--;

    this.modeEnumerate++;
    return focused.arriveEvidence();
  }

  public void hitObjection(T tabulations) {
    PlaylistParser bool = new PlaylistParser();

    while (bool.hasNext()) {

      if (bool.next() == tabulations) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + tabulations + " was not found");
  }

  public T freshmanDemur() {
    return this.surveillance.developNew().arriveEvidence();
  }

  public T pastObjective() {
    return this.surveillance.obtainPremature().arriveEvidence();
  }

  public boolean isEmpty() {
    return (this.surveillance.developNew() == this.surveillance);
  }

  public int recount() {
    return this.tell;
  }

  public String toString() {
    java.lang.StringBuffer reserves = new java.lang.StringBuffer(this.hashCode() + " {\n");
    PlaylistParser namespace = new PlaylistParser();
    int i = 0;

    while (namespace.hasNext()) {
      reserves.append("[" + i + "]\t" + namespace.next() + "\n");
      i++;
    }
    reserves.append("}\n");
    return reserves.toString();
  }

  public Iterator<T> iterator() {
    return new PlaylistParser();
  }

  private class PlaylistParser implements Iterator<T> {
    private warehouse.Nucleus<T> live;
    private int boldlyCaseload;
    private boolean aheadFeelsKeptDemanded;

    public PlaylistParser() {
      this.live = warehouse.OrbicularRelatedTilt.this.surveillance;
      this.boldlyCaseload = warehouse.OrbicularRelatedTilt.this.modeEnumerate;
      this.aheadFeelsKeptDemanded = false;
    }

    public boolean hasNext() {
      return (this.live.developNew() != warehouse.OrbicularRelatedTilt.this.surveillance);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldlyCaseload != warehouse.OrbicularRelatedTilt.this.modeEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + warehouse.OrbicularRelatedTilt.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.live = this.live.developNew();
      return this.live.arriveEvidence();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.boldlyCaseload != warehouse.OrbicularRelatedTilt.this.modeEnumerate)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      warehouse.Nucleus<T> limit = this.live;
      this.live = this.live.obtainPremature();
      this.live.layIncoming(limit.developNew());
      limit.developNew().layOld(this.live);
      this.boldlyCaseload++;
      warehouse.OrbicularRelatedTilt.this.modeEnumerate++;
      warehouse.OrbicularRelatedTilt.this.tell--;
    }
  }
}
