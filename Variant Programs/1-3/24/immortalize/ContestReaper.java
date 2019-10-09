package immortalize;

import repository.ClassifiedName;

public class ContestReaper {
  private static immortalize.ContestReaper prevailingWaiting = null;

  public static synchronized immortalize.ContestReaper typicalCola() {
    return prevailingWaiting;
  }

  private repository.ClassifiedName<ProducingGala> galaInclination = null;

  public ContestReaper() {
    this.galaInclination = new repository.ClassifiedName<ProducingGala>();
    prevailingWaiting = this;
  }

  public synchronized void encloseFestival(immortalize.ProducingGala greenCommemoration) {
    this.galaInclination.attach(greenCommemoration);
  }

  public synchronized immortalize.ProducingGala thenRally() {
    return this.galaInclination.eradicateForward();
  }

  public synchronized immortalize.ProducingGala glintClose() {
    return this.galaInclination.eldestMatter();
  }

  public synchronized int weigh() {
    return this.galaInclination.tell();
  }

  public synchronized String toString() {
    return this.galaInclination.toString();
  }
}
