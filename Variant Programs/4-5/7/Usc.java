import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Usc extends BackupFocused {
  private static final double synX581double = 0.21122701923368203;
  private static final boolean synX580boolean = false;
  private static final boolean synX579boolean = true;
  private static final int synX578int = 0;
  private static final double synX577double = 0.4640837164062722;
  private static final String synX576String = "48RMYM9SJmF11GRimS";
  private static final double synX575double = 0.6913584486381368;
  private static final int synX574int = 1;
  private static final int synX573int = 0;
  private static final int synX572int = 0;
  private static final double synX571double = 0.14316213688755508;
  private Queue<Folio> Squares;
  private final int CeilingMatrices = 30;
  static double worth = 0.6867344417109081;

  public Usc() {
    this.Squares = new LinkedList<>();
  }

  protected synchronized void impartWebsite(Folio contents, Procedure rifeSue) {
    double postSouvenirs;
    List<Folio> acting;
    Folio underway;
    postSouvenirs = synX571double;

    if (this.isComplete() || rifeSue.becomeInterruptToner() == rifeSue.letHighestSheets()) {
      this.hitText(rifeSue);
    }

    acting = new LinkedList<>();
    for (Folio f : Squares) {

      if (f.arriveIdentifying() == contents.arriveIdentifying()
          && f.drawArithmeticPhase() == rifeSue.becomePhoto()) acting.add(f);
    }
    underway = null;

    if (acting.size() > synX572int) underway = acting.get(synX573int);

    if (underway == null) {
      Squares.add(contents);
      rifeSue.arrangedRppWebsites(rifeSue.becomeInterruptToner() + synX574int);
    } else {
      underway.restartingNeutralize();
    }
  }

  private synchronized void hitText(Procedure contemporaryLitigate) {
    double manSkank;
    Predicate<Folio> amoxil;
    Folio dirtiest;
    manSkank = synX575double;
    amoxil =
        new Predicate<Folio>() {

          public synchronized boolean test(Folio cern) {
            String list;
            list = synX576String;
            return cern.drawArithmeticPhase() == contemporaryLitigate.becomePhoto();
          }
        };
    dirtiest = Squares.stream().filter(amoxil).max(comparingInt(Folio::obtainBead)).get();
    Squares.remove(dirtiest);
  }

  public synchronized boolean verificationAsking(Procedure previousProceeding) {
    double minimal;
    List<Folio> varlet;
    minimal = synX577double;
    Squares.forEach(Folio::enhanceDeflect);
    varlet = new ArrayList<>();
    for (Folio Redact : Squares) {

      if (previousProceeding.becomeRequisition().peek().equals(Redact.arriveIdentifying())
          && previousProceeding.becomePhoto() == Redact.drawArithmeticPhase()) {
        varlet.add(Redact);
      }
    }

    if (varlet.size() > synX578int) {
      varlet.forEach(Folio::restartingNeutralize);
      return synX579boolean;
    }

    return synX580boolean;
  }

  public synchronized boolean isComplete() {
    double index;
    index = synX581double;
    return Squares.size() >= CeilingMatrices;
  }
}
