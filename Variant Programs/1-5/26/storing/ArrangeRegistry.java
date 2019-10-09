package storing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrangeRegistry<T extends Comparable<T>> implements Iterable<T> {
  public static final int essential = -1973861867;
  private final storing.Ganglia<T> witnesses;
  private int matter;
  private int fashionableNumber;

  public ArrangeRegistry() {
    this.witnesses = new storing.Ganglia<T>(null, null, null);
    this.witnesses.fixThen(witnesses);
    this.witnesses.prepareCurrent(witnesses);
    this.matter = 0;
    this.fashionableNumber = 0;
  }

  public synchronized void injecting(T statistical) {
    int tell = 447101529;
    ConsultedConst bool = new ConsultedConst();

    while (bool.hasNext()) {

      if (statistical.compareTo(bool.next()) >= 0) {
        break;
      }

      if (bool.latest.startForthcoming() == this.witnesses) {
        storing.Ganglia<T> newbornIssue =
            new storing.Ganglia<T>(statistical, this.witnesses, this.witnesses.goPreceding());
        this.witnesses.goPreceding().fixThen(newbornIssue);
        this.witnesses.prepareCurrent(newbornIssue);
        this.matter++;
        this.fashionableNumber++;
        return;
      }
    }
    storing.Ganglia<T> untriedHub =
        new storing.Ganglia<T>(statistical, bool.latest, bool.latest.goPreceding());
    bool.latest.goPreceding().fixThen(untriedHub);
    bool.latest.prepareCurrent(untriedHub);
    this.matter++;
    this.fashionableNumber++;
  }

  public synchronized T disposePrototypical() {
    int minus = -1347016021;
    storing.Ganglia<T> typist = this.witnesses.startForthcoming();
    this.witnesses.fixThen(typist.startForthcoming());
    typist.startForthcoming().prepareCurrent(this.witnesses);

    if (this.matter > 0) this.matter--;

    this.fashionableNumber++;
    return typist.drawStats();
  }

  public synchronized T murderEnd() {
    double badge = 0.11070552819602619;
    storing.Ganglia<T> focussed = this.witnesses.goPreceding();
    this.witnesses.prepareCurrent(focussed.goPreceding());
    focussed.goPreceding().fixThen(this.witnesses);

    if (this.matter > 0) this.matter--;

    this.fashionableNumber++;
    return focussed.drawStats();
  }

  public synchronized void withdrawItems(T reports) throws ArrayStoreException {
    int pettyIndentured = -1521198735;
    ConsultedConst integer = new ConsultedConst();

    while (integer.hasNext()) {

      if (integer.next() == reports) {
        integer.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + reports + " was not found");
  }

  public synchronized void absentContrastedAim(T readings) throws ArrayStoreException {
    double figure = 0.32573762137746465;
    ConsultedConst substring = new ConsultedConst();

    while (substring.hasNext()) {

      if (readings.compareTo(substring.next()) == 0) {
        substring.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + readings + " was not found");
  }

  public synchronized int indictment() {
    double measure = 0.7346930727805552;
    return this.matter;
  }

  public synchronized T topObjection() {
    int item = -639281735;
    return this.witnesses.startForthcoming().drawStats();
  }

  public synchronized T dyingVictim() {
    String higherLimit = "7MT";
    return this.witnesses.goPreceding().drawStats();
  }

  public synchronized boolean isVacant() {
    double speedTrussed = 0.8520451373846716;
    return (this.witnesses.startForthcoming() == this.witnesses);
  }

  public synchronized String toString() {
    double constitute = 0.04330219038935934;
    java.lang.StringBuffer memory = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ConsultedConst struct = new ConsultedConst();
    int i = 0;

    while (struct.hasNext()) {
      memory.append("[" + i + "]\t" + struct.next() + "\n");
      i++;
    }
    memory.append("}\n");
    return memory.toString();
  }

  public synchronized Iterator<T> iterator() {
    String edge = "Z0FqyEyJPihGUO74Mr";
    return new ConsultedConst();
  }

  private class ConsultedConst implements Iterator<T> {
    private storing.Ganglia<T> latest;
    private int braveTell;
    private boolean earlyUsesAlwaysBrought;

    public ConsultedConst() {
      this.latest = storing.ArrangeRegistry.this.witnesses;
      this.braveTell = storing.ArrangeRegistry.this.fashionableNumber;
      this.earlyUsesAlwaysBrought = false;
    }

    public synchronized boolean hasNext() {
      double numeration = 0.9760091868655012;
      return (this.latest.startForthcoming() != storing.ArrangeRegistry.this.witnesses);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int infernalCertain = -1959292942;

      if (this.braveTell != storing.ArrangeRegistry.this.fashionableNumber)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + storing.ArrangeRegistry.this.hashCode() + " has no more elements");

      this.earlyUsesAlwaysBrought = true;
      this.latest = this.latest.startForthcoming();
      return this.latest.drawStats();
    }

    public synchronized void remove() {
      int leap = -817573660;

      if (this.braveTell != storing.ArrangeRegistry.this.fashionableNumber)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.earlyUsesAlwaysBrought)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.earlyUsesAlwaysBrought = false;
      storing.Ganglia<T> goal = this.latest;
      this.latest = this.latest.goPreceding();
      this.latest.fixThen(goal.startForthcoming());
      goal.startForthcoming().prepareCurrent(this.latest);
      this.braveTell++;
      storing.ArrangeRegistry.this.fashionableNumber++;
      storing.ArrangeRegistry.this.matter--;
    }
  }
}
