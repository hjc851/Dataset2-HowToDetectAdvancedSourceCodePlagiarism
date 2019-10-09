public class Noon extends AlternativesProgram {
  private static final int synX1035int = 0;
  private static final boolean synX1034boolean = false;
  private static final boolean synX1033boolean = true;
  private static final boolean synX1032boolean = false;
  private static final int synX1031int = 0;
  private static final boolean synX1030boolean = false;
  private static final int synX1029int = 0;
  private static final int synX1028int = 29;
  private static final int synX1027int = 30;
  private static final int synX1026int = 0;
  private static final int synX1025int = 0;
  private static final int synX1024int = 30;

  public synchronized void runAimer() {
    underway++;

    if (underway == synX1024int) underway = synX1025int;
  }

  public Noon() {
    underway = synX1026int;
    this.Pictures = new Pagination[synX1027int];
  }

  public int underway = 0;
  public Pagination[] Pictures = null;

  public synchronized boolean isComplete() {
    return Pictures[synX1028int] != null;
  }

  public synchronized boolean breakWishes(Proceeding presentNegotiations) {

    if (Pictures[synX1029int] == null) {
      return synX1030boolean;
    }

    for (int i = synX1031int; i < Pictures.length; i++) {

      if (Pictures[i] == null) return synX1032boolean;

      if (Pictures[i].canGetCycle() == presentNegotiations.drawName()
          && presentNegotiations.fetchQuestions().peek().equals(Pictures[i].produceMap())) {
        return synX1033boolean;
      }
    }
    return synX1034boolean;
  }

  protected synchronized void expandPaper(Pagination pageboy, Proceeding ongoingWork) {

    if (Pictures[underway] == null) {
      Pictures[underway] = pageboy;
      this.runAimer();
      return;
    }

    while (Pictures[underway].canGetCycle() != ongoingWork.drawName()
        && Pictures[underway].catchChuck() == synX1035int) {

      if (Pictures[underway].canGetCycle() == ongoingWork.drawName()) {
        Pictures[underway].salarySideboard();
      }

      runAimer();
    }
    Pictures[underway] = pageboy;
    runAimer();
  }
}
