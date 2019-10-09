package track;

import warehouse.DividedDocket;

public class CarnivalRow {

  public synchronized String toString() {
    return this.galaInclination.toString();
  }

  private DividedDocket<ProduceTriathlon> galaInclination = null;

  public synchronized void tuckCase(ProduceTriathlon risingDemonstration) {
    this.galaInclination.embedded(risingDemonstration);
  }

  public synchronized int enumeration() {
    return this.galaInclination.calculate();
  }

  public static synchronized CarnivalRow contemporaryList() {
    return latestWait;
  }

  public synchronized ProduceTriathlon thirdCeremonies() {
    return this.galaInclination.deletePremiere();
  }

  private static CarnivalRow latestWait = null;

  public CarnivalRow() {
    this.galaInclination = new DividedDocket<ProduceTriathlon>();
    latestWait = this;
  }

  public synchronized ProduceTriathlon peruseThe() {
    return this.galaInclination.maidenItem();
  }
}
