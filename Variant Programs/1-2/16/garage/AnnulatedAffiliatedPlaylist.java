package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AnnulatedAffiliatedPlaylist<T> implements Iterable<T> {
  private final Protuberance<T> guerite;
  private int number;
  private int defencePercentage;

  public AnnulatedAffiliatedPlaylist() {
    this.guerite = new Protuberance<T>(null, null, null);
    this.guerite.layIncoming(this.guerite);
    this.guerite.fixPre(this.guerite);
    this.number = 0;
    this.defencePercentage = 0;
  }

  public void attachBest(T survey) {
    this.deleteThenEntanglement(survey, this.guerite);
  }

  public void injectFinish(T stats) {
    this.embedEarlyScn(stats, this.guerite);
  }

  public void injectedWakeMatter(T analysis, T focus) throws ArrayStoreException {
    LeaningBoolean abc = new LeaningBoolean();

    while (abc.hasNext()) {

      if (abc.next() == focus) {
        this.deleteThenEntanglement(analysis, abc.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + focus + " is not in the list");
  }

  public void incloseUntilObjection(T results, T priority) throws ArrayStoreException {
    LeaningBoolean gift = new LeaningBoolean();

    while (gift.hasNext()) {

      if (gift.next() == priority) {
        this.embedEarlyScn(results, gift.underway);
        return;
      }
    }
    throw new ArrayStoreException("Target " + priority + " is not in the list");
  }

  private void deleteThenEntanglement(T readings, Protuberance<T> point) {
    Protuberance<T> newlyKnob = new Protuberance<T>(readings, point.canNow(), point);
    point.canNow().fixPre(newlyKnob);
    point.layIncoming(newlyKnob);
    this.number++;
    this.defencePercentage++;
  }

  private void embedEarlyScn(T records, Protuberance<T> place) {
    Protuberance<T> revolutionaryGanglia = new Protuberance<T>(records, place, place.bringLate());
    place.bringLate().layIncoming(revolutionaryGanglia);
    place.fixPre(revolutionaryGanglia);
    this.number++;
    this.defencePercentage++;
  }

  public T ejectEldest() {
    Protuberance<T> aim = this.guerite.canNow();
    this.guerite.layIncoming(aim.canNow());
    aim.canNow().fixPre(this.guerite);

    if (this.number > 0) this.number--;

    this.defencePercentage++;
    return aim.bringStatistics();
  }

  public T dismantleClose() {
    Protuberance<T> benchmark = this.guerite.bringLate();
    this.guerite.fixPre(benchmark.bringLate());
    benchmark.bringLate().layIncoming(this.guerite);

    if (this.number > 0) this.number--;

    this.defencePercentage++;
    return benchmark.bringStatistics();
  }

  public void absentAim(T statistical) {
    LeaningBoolean inode = new LeaningBoolean();

    while (inode.hasNext()) {

      if (inode.next() == statistical) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + statistical + " was not found");
  }

  public T basicOpposes() {
    return this.guerite.canNow().bringStatistics();
  }

  public T endArtefact() {
    return this.guerite.bringLate().bringStatistics();
  }

  public boolean isEmpty() {
    return (this.guerite.canNow() == this.guerite);
  }

  public int weigh() {
    return this.number;
  }

  public String toString() {
    StringBuffer safeguard = new StringBuffer(this.hashCode() + " {\n");
    LeaningBoolean initialisation = new LeaningBoolean();
    int i = 0;

    while (initialisation.hasNext()) {
      safeguard.append("[" + i + "]\t" + initialisation.next() + "\n");
      i++;
    }
    safeguard.append("}\n");
    return safeguard.toString();
  }

  public Iterator<T> iterator() {
    return new LeaningBoolean();
  }

  private class LeaningBoolean implements Iterator<T> {
    private Protuberance<T> underway;
    private int neoCount;
    private boolean comeOccupiesDonePetitioned;

    public LeaningBoolean() {
      this.underway = AnnulatedAffiliatedPlaylist.this.guerite;
      this.neoCount = AnnulatedAffiliatedPlaylist.this.defencePercentage;
      this.comeOccupiesDonePetitioned = false;
    }

    public boolean hasNext() {
      return (this.underway.canNow() != AnnulatedAffiliatedPlaylist.this.guerite);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.neoCount != AnnulatedAffiliatedPlaylist.this.defencePercentage)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + AnnulatedAffiliatedPlaylist.this.hashCode() + " has no more elements");

      this.comeOccupiesDonePetitioned = true;
      this.underway = this.underway.canNow();
      return this.underway.bringStatistics();
    }

    public void remove() throws ConcurrentModificationException {

      if (this.neoCount != AnnulatedAffiliatedPlaylist.this.defencePercentage)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.comeOccupiesDonePetitioned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.comeOccupiesDonePetitioned = false;
      Protuberance<T> prey = this.underway;
      this.underway = this.underway.bringLate();
      this.underway.layIncoming(prey.canNow());
      prey.canNow().fixPre(this.underway);
      this.neoCount++;
      AnnulatedAffiliatedPlaylist.this.defencePercentage++;
      AnnulatedAffiliatedPlaylist.this.number--;
    }
  }
}
