package annals;

import stored.ArrangeRegistry;

public class GalaLine {
  private ArrangeRegistry<GrowerParade> celebrationTilt = null;
  private static GalaLine flowJumping = null;

  public static synchronized GalaLine topicalSufferance() {
    return flowJumping;
  }

  public GalaLine() {
    this.celebrationTilt = new ArrangeRegistry<GrowerParade>();
    flowJumping = this;
  }

  public synchronized void injectingSpectacle(GrowerParade earlyCeremonies) {
    this.celebrationTilt.embedded(earlyCeremonies);
  }

  public synchronized GrowerParade soonCommemoration() {
    return this.celebrationTilt.discardIntroductory();
  }

  public synchronized GrowerParade seeLater() {
    return this.celebrationTilt.primeElement();
  }

  public synchronized int total() {
    return this.celebrationTilt.reckon();
  }

  public synchronized String toString() {
    return this.celebrationTilt.toString();
  }
}
