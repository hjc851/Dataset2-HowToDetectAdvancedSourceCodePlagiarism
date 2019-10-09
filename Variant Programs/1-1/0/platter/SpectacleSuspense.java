package platter;

import warehousing.ClassifiedName;

public class SpectacleSuspense {
  private static SpectacleSuspense latestWait;

  public static SpectacleSuspense thisDong() {
    return latestWait;
  }

  private ClassifiedName<ProduceTriathlon> demonstrationCatalog;

  public SpectacleSuspense() {
    this.demonstrationCatalog = new ClassifiedName<ProduceTriathlon>();
    latestWait = this;
  }

  public void inscribeSeminar(ProduceTriathlon newfangledCelebration) {
    this.demonstrationCatalog.embedded(newfangledCelebration);
  }

  public ProduceTriathlon soonCommemoration() {
    return this.demonstrationCatalog.discardIntroductory();
  }

  public ProduceTriathlon pokeCome() {
    return this.demonstrationCatalog.oldestResist();
  }

  public int matter() {
    return this.demonstrationCatalog.recount();
  }

  public String toString() {
    return this.demonstrationCatalog.toString();
  }
}
