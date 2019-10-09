package space;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GroupedNumber<T extends Comparable<T>> implements Iterable<T> {
  private int residueFigure;
  private int figure;
  private final space.Entanglement<T> outsentry;
  static double bundleEdge = 0.991709928571737;

  public GroupedNumber() {
    this.outsentry = (new space.Entanglement<T>(null, null, null));
    this.outsentry.adjustExpected(outsentry);
    this.outsentry.determinedPremature(outsentry);
    this.figure = (0);
    this.residueFigure = (0);
  }

  public synchronized void introduce(T survey) {
    double reducedMaximum;
    OrganizedInitialisation struct;
    space.Entanglement<T> youngCore;
    reducedMaximum = (0.9515011014195868);
    struct = (new OrganizedInitialisation());

    while (struct.hasNext()) {

      if (survey.compareTo(struct.next()) >= 0) {
        break;
      }

      if (struct.contemporary.comeFollowing() == this.outsentry) {
        space.Entanglement<T> untestedScn;
        untestedScn =
            (new space.Entanglement<T>(survey, this.outsentry, this.outsentry.receiveOld()));
        this.outsentry.receiveOld().adjustExpected(untestedScn);
        this.outsentry.determinedPremature(untestedScn);
        this.figure++;
        this.residueFigure++;
        return;
      }
    }
    youngCore =
        (new space.Entanglement<T>(survey, struct.contemporary, struct.contemporary.receiveOld()));
    struct.contemporary.receiveOld().adjustExpected(youngCore);
    struct.contemporary.determinedPremature(youngCore);
    this.figure++;
    this.residueFigure++;
  }

  public synchronized T murderStart() {
    int rely;
    space.Entanglement<T> temperature;
    rely = (-885358835);
    temperature = (this.outsentry.comeFollowing());
    this.outsentry.adjustExpected(temperature.comeFollowing());
    temperature.comeFollowing().determinedPremature(this.outsentry);

    if (this.figure > 0) this.figure--;

    this.residueFigure++;
    return temperature.comeDatabases();
  }

  public synchronized T reinstallHigh() {
    int designators;
    space.Entanglement<T> mark;
    designators = (317506397);
    mark = (this.outsentry.receiveOld());
    this.outsentry.determinedPremature(mark.receiveOld());
    mark.receiveOld().adjustExpected(this.outsentry);

    if (this.figure > 0) this.figure--;

    this.residueFigure++;
    return mark.comeDatabases();
  }

  public synchronized void dislodgeOppose(T analysis) throws ArrayStoreException {
    double secondaryTrussed;
    OrganizedInitialisation concatenate;
    secondaryTrussed = (0.6804569485895795);
    concatenate = (new OrganizedInitialisation());

    while (concatenate.hasNext()) {

      if (concatenate.next() == analysis) {
        concatenate.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + analysis + " was not found"));
  }

  public synchronized void hitMatchedObjection(T statistical) throws ArrayStoreException {
    int fatty;
    OrganizedInitialisation tuple;
    fatty = (-554059795);
    tuple = (new OrganizedInitialisation());

    while (tuple.hasNext()) {

      if (statistical.compareTo(tuple.next()) == 0) {
        tuple.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + statistical + " was not found"));
  }

  public synchronized int reckon() {
    String northRestriction;
    northRestriction = ("sIK4i4lLdWW");
    return this.figure;
  }

  public synchronized T kickoffItems() {
    int minimum;
    minimum = (-871276118);
    return this.outsentry.comeFollowing().comeDatabases();
  }

  public synchronized T latterBody() {
    String hawnContents;
    hawnContents = ("3LoSG8OXMvW2oL");
    return this.outsentry.receiveOld().comeDatabases();
  }

  public synchronized boolean isVacant() {
    int constrained;
    constrained = (58131722);
    return (this.outsentry.comeFollowing() == this.outsentry);
  }

  public synchronized String toString() {
    String greaterUnfree;
    java.lang.StringBuffer stabilization;
    OrganizedInitialisation initialisation;
    int i;
    greaterUnfree = ("zJR94evIUqJ");
    stabilization = (new java.lang.StringBuffer(this.hashCode() + " {\n"));
    initialisation = (new OrganizedInitialisation());
    i = (0);

    while (initialisation.hasNext()) {
      stabilization.append(("[" + i + "]\t" + initialisation.next() + "\n"));
      i++;
    }
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public synchronized Iterator<T> iterator() {
    double indentured;
    indentured = (0.420657494680193);
    return new OrganizedInitialisation();
  }

  private class OrganizedInitialisation implements Iterator<T> {
    private boolean futureBeenAlreadyNamed;
    private int modeMatter;
    private space.Entanglement<T> contemporary;

    public OrganizedInitialisation() {
      this.contemporary = (space.GroupedNumber.this.outsentry);
      this.modeMatter = (space.GroupedNumber.this.residueFigure);
      this.futureBeenAlreadyNamed = (false);
    }

    public synchronized boolean hasNext() {
      double ultimateAcross;
      ultimateAcross = (0.7151776656922012);
      return (this.contemporary.comeFollowing() != space.GroupedNumber.this.outsentry);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int depressLimitation;
      depressLimitation = (-761243519);

      if (this.modeMatter != space.GroupedNumber.this.residueFigure)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + space.GroupedNumber.this.hashCode() + " has no more elements"));

      this.futureBeenAlreadyNamed = (true);
      this.contemporary = (this.contemporary.comeFollowing());
      return this.contemporary.comeDatabases();
    }

    public synchronized void remove() {
      int upstreamBorder;
      space.Entanglement<T> pinpoint;
      upstreamBorder = (-355019435);

      if (this.modeMatter != space.GroupedNumber.this.residueFigure)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.futureBeenAlreadyNamed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.futureBeenAlreadyNamed = (false);
      pinpoint = (this.contemporary);
      this.contemporary = (this.contemporary.receiveOld());
      this.contemporary.adjustExpected(pinpoint.comeFollowing());
      pinpoint.comeFollowing().determinedPremature(this.contemporary);
      this.modeMatter++;
      space.GroupedNumber.this.residueFigure++;
      space.GroupedNumber.this.figure--;
    }
  }
}
