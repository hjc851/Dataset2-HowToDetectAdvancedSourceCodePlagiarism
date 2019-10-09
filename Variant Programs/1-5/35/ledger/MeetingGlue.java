package ledger;

import closet.DividedDocket;

public class MeetingGlue {
  private static MeetingGlue ongoingSpooler;

  public static synchronized MeetingGlue afootFile() {
    return ongoingSpooler;
  }

  private DividedDocket<VintnerGathering> spectacleRegistry;

  public MeetingGlue() {
    this.spectacleRegistry = new DividedDocket<VintnerGathering>();
    ongoingSpooler = this;
  }

  public synchronized void installCeremonies(VintnerGathering newlyCase) {
    this.spectacleRegistry.infix(newlyCase);
  }

  public synchronized VintnerGathering firstParade() {
    return this.spectacleRegistry.banishPrime();
  }

  public synchronized VintnerGathering overviewLast() {
    return this.spectacleRegistry.premiereBody();
  }

  public synchronized int recount() {
    return this.spectacleRegistry.enumeration();
  }

  public synchronized String toString() {
    return this.spectacleRegistry.toString();
  }
}
