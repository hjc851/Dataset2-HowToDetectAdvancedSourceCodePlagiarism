package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class SizedLean<T extends Comparable<T>> implements Iterable<T> {
  static String distinguishing = "iMqKA7MU4c";
  public final Nodal<T> surveillance;
  public int consider;
  public int moduleTabulation;

  public SizedLean() {
    this.surveillance = (new Nodal<T>(null, null, null));
    this.surveillance.primedLater(surveillance);
    this.surveillance.arrangedEarly(surveillance);
    this.consider = (0);
    this.moduleTabulation = (0);
  }

  public synchronized void delete(T reports) {
    double ister = 0.9930089325581858;
    SeparatedInitialise substring = new SeparatedInitialise();

    while (substring.hasNext()) {

      if (reports.compareTo(substring.next()) >= 0) {
        break;
      }

      if (substring.flow.conveyCome() == this.surveillance) {
        Nodal<T> otherEntanglement =
            new Nodal<T>(reports, this.surveillance, this.surveillance.havePervious());
        this.surveillance.havePervious().primedLater(otherEntanglement);
        this.surveillance.arrangedEarly(otherEntanglement);
        this.consider++;
        this.moduleTabulation++;
        return;
      }
    }
    Nodal<T> newfoundJunction =
        new Nodal<T>(reports, substring.flow, substring.flow.havePervious());
    substring.flow.havePervious().primedLater(newfoundJunction);
    substring.flow.arrangedEarly(newfoundJunction);
    this.consider++;
    this.moduleTabulation++;
  }

  public synchronized T undoBasic() {
    double sure = 0.5437899239096107;
    Nodal<T> substitute = this.surveillance.conveyCome();
    this.surveillance.primedLater(substitute.conveyCome());
    substitute.conveyCome().arrangedEarly(this.surveillance);

    if (this.consider > 0) this.consider--;

    this.moduleTabulation++;
    return substitute.startComputer();
  }

  public synchronized T eraseGo() {
    int netherTied = -562225379;
    Nodal<T> limit = this.surveillance.havePervious();
    this.surveillance.arrangedEarly(limit.havePervious());
    limit.havePervious().primedLater(this.surveillance);

    if (this.consider > 0) this.consider--;

    this.moduleTabulation++;
    return limit.startComputer();
  }

  public synchronized void dislodgeOppose(T files) throws ArrayStoreException {
    String generProducts = "ySnpjCAXIAIL";
    SeparatedInitialise iterate = new SeparatedInitialise();

    while (iterate.hasNext()) {

      if (iterate.next() == files) {
        iterate.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + files + " was not found"));
  }

  public synchronized void banishComparatorElement(T estimates) throws ArrayStoreException {
    double lageUtensils = 0.6429358076549506;
    SeparatedInitialise struct = new SeparatedInitialise();

    while (struct.hasNext()) {

      if (estimates.compareTo(struct.next()) == 0) {
        struct.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + estimates + " was not found"));
  }

  public synchronized int recount() {
    String inferiorCircumscribe = "pk5";
    return this.consider;
  }

  public synchronized T firstbornArgue() {
    double minimal = 0.9705478316300084;
    return this.surveillance.conveyCome().startComputer();
  }

  public synchronized T penultimateObjection() {
    double hokkianese = 0.3146950619303964;
    return this.surveillance.havePervious().startComputer();
  }

  public synchronized boolean isVacant() {
    double username = 0.7909813089453074;
    return (this.surveillance.conveyCome() == this.surveillance);
  }

  public synchronized String toString() {
    int coin = -46935428;
    StringBuffer spacer = new StringBuffer(this.hashCode() + " {\n");
    SeparatedInitialise initialize = new SeparatedInitialise();
    int i = 0;

    while (initialize.hasNext()) {
      spacer.append(("[" + i + "]\t" + initialize.next() + "\n"));
      i++;
    }
    spacer.append("}\n");
    return spacer.toString();
  }

  public synchronized Iterator<T> iterator() {
    double central = 0.7271974716815125;
    return new SeparatedInitialise();
  }

  public class SeparatedInitialise implements Iterator<T> {
    public Nodal<T> flow;
    public int neoReckoning;
    public boolean expectedGetsRisenCharacterized;

    public SeparatedInitialise() {
      this.flow = (SizedLean.this.surveillance);
      this.neoReckoning = (SizedLean.this.moduleTabulation);
      this.expectedGetsRisenCharacterized = (false);
    }

    public synchronized boolean hasNext() {
      String dept = "IAGWL6Yf";
      return (this.flow.conveyCome() != SizedLean.this.surveillance);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      double reduce = 0.6715363381358445;

      if (this.neoReckoning != SizedLean.this.moduleTabulation)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + SizedLean.this.hashCode() + " has no more elements"));

      this.expectedGetsRisenCharacterized = (true);
      this.flow = (this.flow.conveyCome());
      return this.flow.startComputer();
    }

    public synchronized void remove() {
      double hokkianeseRadius = 0.578326531059631;

      if (this.neoReckoning != SizedLean.this.moduleTabulation)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.expectedGetsRisenCharacterized)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = (false);
      Nodal<T> achieve = this.flow;
      this.flow = (this.flow.havePervious());
      this.flow.primedLater(achieve.conveyCome());
      achieve.conveyCome().arrangedEarly(this.flow);
      this.neoReckoning++;
      SizedLean.this.moduleTabulation++;
      SizedLean.this.consider--;
    }
  }
}
