package immortalize;

import stored.ConsultedAgenda;

public class GalaLine {
  private static GalaLine incumbentBacklog;

  public static GalaLine afootFile() {
    return incumbentBacklog;
  }

  private ConsultedAgenda<ProduceTriathlon> ceremonyLitany;

  public GalaLine() {
    this.ceremonyLitany = new ConsultedAgenda<ProduceTriathlon>();
    incumbentBacklog = this;
  }

  public void embeddedExposition(ProduceTriathlon unusedGathering) {
    this.ceremonyLitany.embed(unusedGathering);
  }

  public ProduceTriathlon succeedingGala() {
    return this.ceremonyLitany.removalOldest();
  }

  public ProduceTriathlon spyComing() {
    return this.ceremonyLitany.commencementTotem();
  }

  public int census() {
    return this.ceremonyLitany.get();
  }

  public String toString() {
    return this.ceremonyLitany.toString();
  }
}
