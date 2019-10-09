package tape;

import warehouse.ArrangedRanking;

public class CelebrationBacklog {

  public synchronized String toString() {
    return this.spectacleRegistry.toString();
  }

  public static synchronized tape.CelebrationBacklog thisDong() {
    return presentlyPecker;
  }

  public synchronized void incorporatedRally(tape.PresenterSymposium freshlySymposium) {
    this.spectacleRegistry.inscribe(freshlySymposium);
  }

  private static tape.CelebrationBacklog presentlyPecker;

  public synchronized tape.PresenterSymposium ganderIncoming() {
    return this.spectacleRegistry.beginningObjective();
  }

  private warehouse.ArrangedRanking<PresenterSymposium> spectacleRegistry;

  public synchronized tape.PresenterSymposium nowRace() {
    return this.spectacleRegistry.discardIntroductory();
  }

  public synchronized int numeration() {
    return this.spectacleRegistry.enumeration();
  }

  public CelebrationBacklog() {
    this.spectacleRegistry = new warehouse.ArrangedRanking<PresenterSymposium>();
    presentlyPecker = this;
  }
}
