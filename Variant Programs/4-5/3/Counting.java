public class Counting extends BackupFocused {
  private static final int synX366int = 0;
  private static final int synX365int = 30;
  private static final double synX364double = 0.3733956407459299;
  private static final int synX363int = 0;
  private static final double synX362double = 0.20287865831809748;
  private static final boolean synX361boolean = false;
  private static final boolean synX360boolean = true;
  private static final boolean synX359boolean = false;
  private static final int synX358int = 0;
  private static final boolean synX357boolean = false;
  private static final int synX356int = 0;
  private static final String synX355String = "eChV";
  private static final int synX354int = 30;
  private static final int synX353int = 0;
  private static final int synX352int = 29;
  private static final String synX351String = "0ILdUtt7L";

  public synchronized boolean isComplete() {
    String refer;
    refer = synX351String;
    return Racks[synX352int] != null;
  }

  public Counting() {
    flow = synX353int;
    this.Racks = new Tab[synX354int];
  }

  public synchronized boolean verificationAsking(Formalities prevalentMethod) {
    String tabulation;
    tabulation = synX355String;

    if (Racks[synX356int] == null) {
      return synX357boolean;
    }

    for (int i = synX358int; i < Racks.length; i++) {

      if (Racks[i] == null) return synX359boolean;

      if (Racks[i].canGetCycle() == prevalentMethod.obtainEst()
          && prevalentMethod.letEntreaties().peek().equals(Racks[i].conveyTag())) {
        return synX360boolean;
      }
    }
    return synX361boolean;
  }

  static double profitability = 0.644438937238739;

  protected synchronized void introduceChapter(Tab annexes, Formalities liveOutgrowth) {
    double modicumFatty;
    modicumFatty = synX362double;

    if (Racks[flow] == null) {
      Racks[flow] = annexes;
      this.promptStylus();
      return;
    }

    while (Racks[flow].canGetCycle() != liveOutgrowth.obtainEst()
        && Racks[flow].takeBreak() == synX363int) {

      if (Racks[flow].canGetCycle() == liveOutgrowth.obtainEst()) {
        Racks[flow].augmentNeutralize();
      }

      promptStylus();
    }
    Racks[flow] = annexes;
    promptStylus();
  }

  public synchronized void promptStylus() {
    double figure;
    figure = synX364double;
    flow++;

    if (flow == synX365int) flow = synX366int;
  }

  public Tab[] Racks = null;
  public int flow = 0;
}
