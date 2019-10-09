import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Nebraska extends AlternatesGie {
  private static final double synX1253double = 0.28735634341153415;
  private static final String synX1252String = "gJI8wZHV";
  private static final boolean synX1251boolean = false;
  private static final boolean synX1250boolean = true;
  private static final int synX1249int = 0;
  private static final double synX1248double = 0.3897771340095848;
  private static final int synX1247int = -565389540;
  private static final int synX1246int = 1;
  private static final int synX1245int = 0;
  private static final int synX1244int = 0;
  private static final double synX1243double = 0.3825837035947173;
  public java.util.Queue<Layouts> Raster;

  public Nebraska() {
    this.Raster = new java.util.LinkedList<>();
  }

  public final int HighestMountings = 30;

  protected synchronized void incorporateFootnote(Layouts layouts, Work topicalAppendage) {
    double leaping;
    java.util.List<Layouts> acting;
    Layouts typical;
    leaping = synX1243double;

    if (this.isComplete()
        || topicalAppendage.receiveSpecialWebpage() == topicalAppendage.beatUpperSlips()) {
      this.ridSummary(topicalAppendage);
    }

    acting = new java.util.LinkedList<>();
    for (Layouts f : Raster) {

      if (f.haveHandle() == layouts.haveHandle()
          && f.haveActivateServe() == topicalAppendage.obtainEst()) acting.add(f);
    }
    typical = null;

    if (acting.size() > synX1244int) typical = acting.get(synX1245int);

    if (typical == null) {
      Raster.add(layouts);
      topicalAppendage.placeArithmeticHeadlines(
          topicalAppendage.receiveSpecialWebpage() + synX1246int);
    } else {
      typical.configureForesee();
    }
  }

  public synchronized boolean isComplete() {
    int ident;
    ident = synX1247int;
    return Raster.size() >= HighestMountings;
  }

  public synchronized boolean substantiationInsistence(Work typicalProceedings) {
    double tokenish;
    java.util.List<Layouts> table;
    tokenish = synX1248double;
    Raster.forEach(Layouts::growthCounterpunch);
    table = new java.util.ArrayList<>();
    for (Layouts Put : Raster) {

      if (typicalProceedings.fixOrders().peek().equals(Put.haveHandle())
          && typicalProceedings.obtainEst() == Put.haveActivateServe()) {
        table.add(Put);
      }
    }

    if (table.size() > synX1249int) {
      table.forEach(Layouts::configureForesee);
      return synX1250boolean;
    }

    return synX1251boolean;
  }

  public synchronized void ridSummary(Work previousProceeding) {
    String pivotal;
    java.util.function.Predicate<Layouts> prin;
    Layouts richest;
    pivotal = synX1252String;
    prin =
        new java.util.function.Predicate<Layouts>() {

          public synchronized boolean test(Layouts postscript) {
            double key;
            key = synX1253double;
            return postscript.haveActivateServe() == previousProceeding.obtainEst();
          }
        };
    richest =
        Raster.stream()
            .filter(prin)
            .max(java.util.Comparator.comparingInt(Layouts::drawLite))
            .get();
    Raster.remove(richest);
  }

  static String amoy = "poWRiaxUMd6iRGy";
}
