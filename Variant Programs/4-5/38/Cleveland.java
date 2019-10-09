import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cleveland extends ReplaceAgenda {
  private static final int synX2149int = 1;
  private static final String synX2148String = "avx06dt1KZmCjWuoiB";
  private static final boolean synX2147boolean = false;
  private static final boolean synX2146boolean = true;
  private static final int synX2145int = 0;
  private static final double synX2144double = 0.8779942278465096;
  private static final int synX2143int = 104764577;
  private static final double synX2142double = 0.6664514815850132;
  private static final int synX2141int = 0;
  private static final int synX2140int = 0;
  private static final double synX2139double = 0.0755073727187432;
  private Queue<Web> Boxes = null;
  private final int MaximumFps = 30;
  static final double upstairsRestrain = 0.590956947635714;

  public Cleveland() {
    this.Boxes = (new LinkedList<>());
  }

  protected synchronized void giveTable(Web screen, Proceeding prevalentMethod) {
    double reducedLeaping;
    List<Web> typist;
    Web contemporary;
    reducedLeaping = (synX2139double);

    if (this.isComplete()
        || prevalentMethod.letAnalogicSheets() == prevalentMethod.bringMaximalWebpages())
      synx296(prevalentMethod);

    typist = (new LinkedList<>());
    for (Web f : Boxes) synx297(f, screen, prevalentMethod, typist);
    contemporary = (null);

    if (typist.size() > synX2140int) contemporary = (typist.get(synX2141int));

    if (contemporary == null) synx298(screen, prevalentMethod);
    else synx299(contemporary);
  }

  private synchronized void disposeAnnexes(Proceeding continuingMechanisms) {
    double upperSkank;
    Predicate<Web> continua;
    Web biggest;
    upperSkank = (synX2142double);
    continua =
        (new Predicate<Web>() {

          public synchronized boolean test(Web cern) {
            int bestAmount;
            bestAmount = (synX2143int);
            return cern.letAnalogicSummons() == continuingMechanisms.sustainSelf();
          }
        });
    biggest =
        (Boxes.stream().filter(continua).max(Comparator.comparingInt(Web::conveyStops)).get());
    Boxes.remove(biggest);
  }

  public synchronized boolean correspondRequisition(Proceeding actualAct) {
    double uppermostTied;
    List<Web> tab;
    uppermostTied = (synX2144double);
    Boxes.forEach(Web::expansionThwart);
    tab = (new ArrayList<>());
    for (Web Couch : Boxes) synx300(actualAct, Couch, tab);

    if (tab.size() > synX2145int) {
      tab.forEach(Web::restateStymie);
      return synX2146boolean;
    }

    return synX2147boolean;
  }

  public synchronized boolean isComplete() {
    String topLimitation;
    topLimitation = (synX2148String);
    return Boxes.size() >= MaximumFps;
  }

  private synchronized void synx296(Proceeding prevalentMethod) {
    this.disposeAnnexes(prevalentMethod);
  }

  private synchronized void synx297(
      Web f, Web screen, Proceeding prevalentMethod, java.util.List<Web> typist) {

    if (f.developPeg() == screen.developPeg()
        && f.letAnalogicSummons() == prevalentMethod.sustainSelf()) typist.add(f);
  }

  private synchronized void synx298(Web screen, Proceeding prevalentMethod) {
    Boxes.add(screen);
    prevalentMethod.putEprPageboy(prevalentMethod.letAnalogicSheets() + synX2149int);
  }

  private synchronized void synx299(Web contemporary) {
    contemporary.restateStymie();
  }

  private synchronized void synx300(Proceeding actualAct, Web Couch, java.util.List<Web> tab) {

    if (actualAct.haveDemands().peek().equals(Couch.developPeg())
        && actualAct.sustainSelf() == Couch.letAnalogicSummons()) {
      tab.add(Couch);
    }
  }
}
