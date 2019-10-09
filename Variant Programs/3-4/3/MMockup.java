public class MMockup {
  public Islander southwesterlyEnclave = null;

  public synchronized void started() {
    northernmostIslander.introduce();
    southwesterlyEnclave.introduce();
  }

  public MMockup(int northwestward, int southeast) {
    northernmostIslander = new Islander("N", northwestward);
    southwesterlyEnclave = new Islander("S", southeast);
  }

  public Islander northernmostIslander = null;
}
