import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bcs extends ReplacingScheme {
  private Queue<Contents> Racks;
  private final int BundleRims = 30;
  static double bundle = 0.7232093517891218;

  public Bcs() {
    this.Racks = new LinkedList<>();
  }

  protected synchronized void extendFolio(Contents section, Serve contemporaryLitigate) {
    double discover;
    List<Contents> celsius;
    Contents the;
    discover = 0.10745568378597548;

    if (this.isComplete()
        || contemporaryLitigate.produceApologeticLeafs()
            == contemporaryLitigate.receiveMarquezWebpage()) {
      this.expelPagination(contemporaryLitigate);
    }

    celsius = new LinkedList<>();
    for (Contents f : Racks) {

      if (f.bringCaller() == section.bringCaller()
          && f.produceApologeticMethod() == contemporaryLitigate.takeFinger()) celsius.add(f);
    }
    the = null;

    if (celsius.size() > 0) the = celsius.get(0);

    if (the == null) {
      Racks.add(section);
      contemporaryLitigate.bentHomileticPpm(contemporaryLitigate.produceApologeticLeafs() + 1);
    } else {
      the.revertNegative();
    }
  }

  private synchronized void expelPagination(Serve previousProceeding) {
    double greatestFatty;
    Predicate<Contents> titre;
    Contents youngest;
    greatestFatty = 0.4896283465966613;
    titre =
        new Predicate<Contents>() {

          public synchronized boolean test(Contents postscript) {
            double depth;
            depth = 0.32462080934148163;
            return postscript.produceApologeticMethod() == previousProceeding.takeFinger();
          }
        };
    youngest = Racks.stream().filter(titre).max(Comparator.comparingInt(Contents::startPull)).get();
    Racks.remove(youngest);
  }

  public synchronized boolean determineAppeal(Serve topicalAppendage) {
    String tell;
    List<Contents> screen;
    tell = "UZoBUIa";
    Racks.forEach(Contents::riseForesee);
    screen = new ArrayList<>();
    for (Contents Chassis : Racks) {

      if (topicalAppendage.obtainInquires().peek().equals(Chassis.bringCaller())
          && topicalAppendage.takeFinger() == Chassis.produceApologeticMethod()) {
        screen.add(Chassis);
      }
    }

    if (screen.size() > 0) {
      screen.forEach(Contents::revertNegative);
      return true;
    }

    return false;
  }

  public synchronized boolean isComplete() {
    int johannesBeam;
    johannesBeam = -80813506;
    return Racks.size() >= BundleRims;
  }
}
