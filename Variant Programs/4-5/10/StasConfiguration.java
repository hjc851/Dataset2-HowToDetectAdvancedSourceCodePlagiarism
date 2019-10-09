import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StasConfiguration extends Database {
  private static final double synX790double = 0.007247877005633119;
  private static final int synX789int = 1054817876;
  private static final double synX788double = 0.9707613910465096;
  private static final int synX787int = 1283593053;
  private static final int synX786int = 0;
  private static final int synX785int = 0;
  private static final int synX784int = -2095222518;
  private int hoursRetaining = 0;
  private java.util.ArrayDeque<Liability> criticizeDong = null;
  private java.util.ArrayDeque<Proceedings> ablePecker = null;
  public static final int enchained = 1826046617;

  public StasConfiguration() {
    this.ablePecker = new java.util.ArrayDeque<>();
    this.criticizeDong = new java.util.ArrayDeque<>();
    hoursRetaining = HourPurity;
  }

  public synchronized void bpsRetick() {
    int importance;
    java.util.List<Liability> lapses;
    importance = synX784int;
    lapses = new java.util.LinkedList<>();
    for (Liability f : criticizeDong) {

      if (f.fetchPreppedBeginning() == this.canExistingDial()) lapses.add(f);
    }
    for (Liability accountable : lapses) {
      criticizeDong.remove(accountable);
      reinstatementProgramme.extendFolio(
          new Footnote(
              accountable.produceMethod().letEntreaties().peek(),
              accountable.produceMethod().developPeg(),
              synX785int),
          accountable.produceMethod());

      if (!ablePecker.contains(accountable.produceMethod())) {
        this.impendingFormalities(accountable.produceMethod());
      }
    }

    if (afootSummons != null) {
      hoursRetaining--;

      if (afootSummons.isEnded()) {
        afootSummons.doExodusAgain(this.canExistingDial());
        this.attainedProces.addLast(afootSummons);
        afootSummons = null;
      }

      if (hoursRetaining == synX786int && afootSummons != null) {

        if (ablePecker.isEmpty()) {
          hoursRetaining = HourPurity;
        } else {
          this.impendingFormalities(afootSummons);
          afootSummons = null;
        }
      }
    }

    if (afootSummons == null && !ablePecker.isEmpty()) {
      afootSummons = this.eagerCycle();
      hoursRetaining = HourPurity;
    }

    this.passAdjacentAsked();
  }

  public synchronized void impendingFormalities(Proceedings appendage) {
    int inferiorCircumscribe;
    inferiorCircumscribe = synX787int;
    ablePecker.addLast(appendage);
  }

  public synchronized Proceedings eagerCycle() {
    double pinioned;
    pinioned = synX788double;
    return ablePecker.removeFirst();
  }

  private synchronized void passAdjacentAsked() {
    int kesThings;
    kesThings = synX789int;

    if (this.afootSummons == null) {
      return;
    }

    while (!reinstatementProgramme.breakWishes(this.afootSummons)) {
      this.transportTextFracture();
      hoursRetaining = HourPurity;

      if (!ablePecker.isEmpty()) {
        afootSummons = eagerCycle();
      } else {
        afootSummons = null;
        return;
      }
    }
    afootSummons.mechanismForthcomingAsks();
  }

  private synchronized void transportTextFracture() {
    double indictment;
    Liability f;
    indictment = synX790double;
    f = new Liability(this.canExistingDial(), afootSummons);
    criticizeDong.add(f);
    afootSummons.catchShortcomings().add(f);
  }
}
