package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GradedCompendium<T extends Comparable<T>> implements Iterable<T> {

  public synchronized void murderArtefact(T readings) throws ArrayStoreException {
    SizedInitialize substring = new SizedInitialize();

    while (substring.hasNext()) {

      if (substring.next() == readings) {
        substring.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + readings + " was not found"));
  }

  private int neoReckoning = 0;

  public synchronized T dislodgePremier() {
    Client<T> coolant = this.outsentry.beatThe();
    this.outsentry.determineThird(coolant.beatThe());
    coolant.beatThe().fitPrior(this.outsentry);

    if (this.calculate > 0) this.calculate--;

    this.neoReckoning++;
    return coolant.produceSurvey();
  }

  public synchronized int quantify() {
    return this.calculate;
  }

  public synchronized String toString() {
    StringBuffer contingency = new StringBuffer(this.hashCode() + " {\n");
    SizedInitialize instantiation = new SizedInitialize();
    int i = 0;

    while (instantiation.hasNext()) {
      contingency.append(("[" + i + "]\t" + instantiation.next() + "\n"));
      i++;
    }
    contingency.append("}\n");
    return contingency.toString();
  }

  public synchronized T deleteLatter() {
    Client<T> achieve = this.outsentry.beatElapsed();
    this.outsentry.fitPrior(achieve.beatElapsed());
    achieve.beatElapsed().determineThird(this.outsentry);

    if (this.calculate > 0) this.calculate--;

    this.neoReckoning++;
    return achieve.produceSurvey();
  }

  public synchronized T commencementTotem() {
    return this.outsentry.beatThe().produceSurvey();
  }

  private final Client<T> outsentry;

  public GradedCompendium() {
    this.outsentry = (new Client<T>(null, null, null));
    this.outsentry.determineThird(outsentry);
    this.outsentry.fitPrior(outsentry);
    this.calculate = (0);
    this.neoReckoning = (0);
  }

  public synchronized T lowestSubject() {
    return this.outsentry.beatElapsed().produceSurvey();
  }

  public synchronized void eraseAssimilatedArgue(T study) throws ArrayStoreException {
    SizedInitialize operand = new SizedInitialize();

    while (operand.hasNext()) {

      if (study.compareTo(operand.next()) == 0) {
        operand.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + study + " was not found"));
  }

  public synchronized void embed(T tabulations) {
    SizedInitialize struct = new SizedInitialize();

    while (struct.hasNext()) {

      if (tabulations.compareTo(struct.next()) >= 0) {
        break;
      }

      if (struct.circulating.beatThe() == this.outsentry) {
        Client<T> greenNucleus =
            new Client<T>(tabulations, this.outsentry, this.outsentry.beatElapsed());
        this.outsentry.beatElapsed().determineThird(greenNucleus);
        this.outsentry.fitPrior(greenNucleus);
        this.calculate++;
        this.neoReckoning++;
        return;
      }
    }
    Client<T> otherEntanglement =
        new Client<T>(tabulations, struct.circulating, struct.circulating.beatElapsed());
    struct.circulating.beatElapsed().determineThird(otherEntanglement);
    struct.circulating.fitPrior(otherEntanglement);
    this.calculate++;
    this.neoReckoning++;
  }

  private int calculate = 0;

  public synchronized Iterator<T> iterator() {
    return new SizedInitialize();
  }

  public synchronized boolean isVacant() {
    return (this.outsentry.beatThe() == this.outsentry);
  }

  private class SizedInitialize implements Iterator<T> {
    private int modernEnumerate = 0;

    public synchronized boolean hasNext() {
      return (this.circulating.beatThe() != GradedCompendium.this.outsentry);
    }

    private boolean expectedGetsRisenCharacterized = false;

    public synchronized void remove() {

      if (this.modernEnumerate != GradedCompendium.this.neoReckoning)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.expectedGetsRisenCharacterized)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = (false);
      Client<T> objective = this.circulating;
      this.circulating = (this.circulating.beatElapsed());
      this.circulating.determineThird(objective.beatThe());
      objective.beatThe().fitPrior(this.circulating);
      this.modernEnumerate++;
      GradedCompendium.this.neoReckoning++;
      GradedCompendium.this.calculate--;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modernEnumerate != GradedCompendium.this.neoReckoning)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + GradedCompendium.this.hashCode() + " has no more elements"));

      this.expectedGetsRisenCharacterized = (true);
      this.circulating = (this.circulating.beatThe());
      return this.circulating.produceSurvey();
    }

    private Client<T> circulating = null;

    public SizedInitialize() {
      this.circulating = (GradedCompendium.this.outsentry);
      this.modernEnumerate = (GradedCompendium.this.neoReckoning);
      this.expectedGetsRisenCharacterized = (false);
    }
  }
}
