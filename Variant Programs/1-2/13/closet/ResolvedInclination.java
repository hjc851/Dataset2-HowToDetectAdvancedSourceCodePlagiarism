package closet;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {
  private final closet.Carrefour<T> guerite;
  private int number;
  private int moderateQuantify;

  public ResolvedInclination() {
    this.guerite = new closet.Carrefour<T>(null, null, null);
    this.guerite.rigidCome(guerite);
    this.guerite.bentOriginal(guerite);
    this.number = 0;
    this.moderateQuantify = 0;
  }

  public void enter(T analysis) {
    ClassedBool iterate = new ClassedBool();

    while (iterate.hasNext()) {

      if (analysis.compareTo(iterate.next()) >= 0) {
        break;
      }

      if (iterate.prevailing.makeAdjacent() == this.guerite) {
        closet.Carrefour<T> refreshingRibbon =
            new closet.Carrefour<T>(analysis, this.guerite, this.guerite.becomePredecessor());
        this.guerite.becomePredecessor().rigidCome(refreshingRibbon);
        this.guerite.bentOriginal(refreshingRibbon);
        this.number++;
        this.moderateQuantify++;
        return;
      }
    }
    closet.Carrefour<T> recentPoint =
        new closet.Carrefour<T>(
            analysis, iterate.prevailing, iterate.prevailing.becomePredecessor());
    iterate.prevailing.becomePredecessor().rigidCome(recentPoint);
    iterate.prevailing.bentOriginal(recentPoint);
    this.number++;
    this.moderateQuantify++;
  }

  public T takeBeginning() {
    closet.Carrefour<T> fahrenheit = this.guerite.makeAdjacent();
    this.guerite.rigidCome(fahrenheit.makeAdjacent());
    fahrenheit.makeAdjacent().bentOriginal(this.guerite);

    if (this.number > 0) this.number--;

    this.moderateQuantify++;
    return fahrenheit.catchFigures();
  }

  public T removalFinally() {
    closet.Carrefour<T> reach = this.guerite.becomePredecessor();
    this.guerite.bentOriginal(reach.becomePredecessor());
    reach.becomePredecessor().rigidCome(this.guerite);

    if (this.number > 0) this.number--;

    this.moderateQuantify++;
    return reach.catchFigures();
  }

  public void banishElement(T files) throws ArrayStoreException {
    ClassedBool initialize = new ClassedBool();

    while (initialize.hasNext()) {

      if (initialize.next() == files) {
        initialize.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + files + " was not found");
  }

  public void absentContrastedAim(T computer) throws ArrayStoreException {
    ClassedBool namespace = new ClassedBool();

    while (namespace.hasNext()) {

      if (computer.compareTo(namespace.next()) == 0) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException("Object " + computer + " was not found");
  }

  public int charge() {
    return this.number;
  }

  public T forwardVictim() {
    return this.guerite.makeAdjacent().catchFigures();
  }

  public T pastObjective() {
    return this.guerite.becomePredecessor().catchFigures();
  }

  public boolean isVacant() {
    return (this.guerite.makeAdjacent() == this.guerite);
  }

  public String toString() {
    java.lang.StringBuffer protection = new java.lang.StringBuffer(this.hashCode() + " {\n");
    ClassedBool battologize = new ClassedBool();
    int i = 0;

    while (battologize.hasNext()) {
      protection.append("[" + i + "]\t" + battologize.next() + "\n");
      i++;
    }
    protection.append("}\n");
    return protection.toString();
  }

  public Iterator<T> iterator() {
    return new ClassedBool();
  }

  private class ClassedBool implements Iterator<T> {
    private closet.Carrefour<T> prevailing;
    private int residueFigure;
    private boolean expectedGetsRisenCharacterized;

    public ClassedBool() {
      this.prevailing = closet.ResolvedInclination.this.guerite;
      this.residueFigure = closet.ResolvedInclination.this.moderateQuantify;
      this.expectedGetsRisenCharacterized = false;
    }

    public boolean hasNext() {
      return (this.prevailing.makeAdjacent() != closet.ResolvedInclination.this.guerite);
    }

    public T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.residueFigure != closet.ResolvedInclination.this.moderateQuantify)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + closet.ResolvedInclination.this.hashCode() + " has no more elements");

      this.expectedGetsRisenCharacterized = true;
      this.prevailing = this.prevailing.makeAdjacent();
      return this.prevailing.catchFigures();
    }

    public void remove() {

      if (this.residueFigure != closet.ResolvedInclination.this.moderateQuantify)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.expectedGetsRisenCharacterized)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.expectedGetsRisenCharacterized = false;
      closet.Carrefour<T> goal = this.prevailing;
      this.prevailing = this.prevailing.becomePredecessor();
      this.prevailing.rigidCome(goal.makeAdjacent());
      goal.makeAdjacent().bentOriginal(this.prevailing);
      this.residueFigure++;
      closet.ResolvedInclination.this.moderateQuantify++;
      closet.ResolvedInclination.this.number--;
    }
  }
}
