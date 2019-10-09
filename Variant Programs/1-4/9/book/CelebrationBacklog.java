package book;

import warehouses.ClassedDirectory;

public class CelebrationBacklog {

  public CelebrationBacklog() {
    this.raceCompilation = new ClassedDirectory<ProduceTriathlon>();
    continuingGlue = this;
  }

  public synchronized ProduceTriathlon expectedSeminar() {
    return this.raceCompilation.slayOpening();
  }

  public synchronized ProduceTriathlon readAhead() {
    return this.raceCompilation.introductoryPurpose();
  }

  public synchronized int matter() {
    return this.raceCompilation.enumeration();
  }

  public synchronized void injectedGathering(ProduceTriathlon newfangledCelebration) {
    this.raceCompilation.inject(newfangledCelebration);
  }

  private static CelebrationBacklog continuingGlue = null;

  public synchronized String toString() {
    return this.raceCompilation.toString();
  }

  public static synchronized CelebrationBacklog presentlyPecker() {
    return continuingGlue;
  }

  private ClassedDirectory<ProduceTriathlon> raceCompilation = null;
}
