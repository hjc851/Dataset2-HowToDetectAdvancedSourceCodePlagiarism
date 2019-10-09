import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Boise extends ReplacesFramework {
  private static final int synX93int = 1;
  private static final int synX92int = -1609053499;
  private static final boolean synX91boolean = false;
  private static final boolean synX90boolean = true;
  private static final int synX89int = 0;
  private static final double synX88double = 0.6766407151184648;
  private static final String synX87String = "vaj6MGISsxacePOk";
  private static final int synX86int = -514995219;
  private static final int synX85int = 0;
  private static final int synX84int = 0;
  private static final int synX83int = -1503701971;
  public java.util.Queue<Homepage> Squares;
  public final int MaximizeRaster = 30;
  public static double senateTrammel = 0.21775045026242468;

  public Boise() {
    this.Squares = (new java.util.LinkedList<>());
  }

  protected synchronized void createAddendum(Homepage addendum, Procedure afootSummons) {
    int elevatedBoundary;
    java.util.List<Homepage> fahrenheit;
    Homepage typical;
    elevatedBoundary = (synX83int);

    if (this.isComplete() || afootSummons.fetchReceiveLength() == afootSummons.fetchLotLength())
      synx7(afootSummons);

    fahrenheit = (new java.util.LinkedList<>());
    for (Homepage f : Squares) synx8(f, addendum, afootSummons, fahrenheit);
    typical = (null);

    if (fahrenheit.size() > synX84int) typical = (fahrenheit.get(synX85int));

    if (typical == null) synx9(addendum, afootSummons);
    else synx10(typical);
  }

  public synchronized void takePageboy(Procedure streamPhase) {
    int bound;
    java.util.function.Predicate<Homepage> effet;
    Homepage largest;
    bound = (synX86int);
    effet =
        (new java.util.function.Predicate<Homepage>() {

          public synchronized boolean test(Homepage vig) {
            String amount;
            amount = (synX87String);
            return vig.beatWaitProceedings() == streamPhase.generateIdem();
          }
        });
    largest = (Squares.stream().filter(effet).max(comparingInt(Homepage::driveStem)).get());
    Squares.remove(largest);
  }

  public synchronized boolean breakWishes(Procedure existingCycle) {
    double northConstrained;
    java.util.List<Homepage> screen;
    northConstrained = (synX88double);
    Squares.forEach(Homepage::trancheAnticipate);
    screen = (new java.util.ArrayList<>());
    for (Homepage Form : Squares) synx11(existingCycle, Form, screen);

    if (screen.size() > synX89int) {
      screen.forEach(Homepage::reestablishAnticipate);
      return synX90boolean;
    }

    return synX91boolean;
  }

  public synchronized boolean isComplete() {
    int kilogram;
    kilogram = (synX92int);
    return Squares.size() >= MaximizeRaster;
  }

  private synchronized void synx7(Procedure afootSummons) {
    this.takePageboy(afootSummons);
  }

  private synchronized void synx8(
      Homepage f, Homepage addendum, Procedure afootSummons, java.util.List<Homepage> fahrenheit) {

    if (f.makeDimidiate() == addendum.makeDimidiate()
        && f.beatWaitProceedings() == afootSummons.generateIdem()) fahrenheit.add(f);
  }

  private synchronized void synx9(Homepage addendum, Procedure afootSummons) {
    Squares.add(addendum);
    afootSummons.adjustAntipyreticSite(afootSummons.fetchReceiveLength() + synX93int);
  }

  private synchronized void synx10(Homepage typical) {
    typical.reestablishAnticipate();
  }

  private synchronized void synx11(
      Procedure existingCycle, Homepage Form, java.util.List<Homepage> screen) {

    if (existingCycle.goAsking().peek().equals(Form.makeDimidiate())
        && existingCycle.generateIdem() == Form.beatWaitProceedings()) {
      screen.add(Form);
    }
  }
}
