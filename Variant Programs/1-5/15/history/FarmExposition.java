package history;

import depositional.YearsHolder;
import filmmaker.Promoter;

public class FarmExposition extends history.ExpositionAccomplishment
    implements java.lang.Comparable<FarmExposition> {
  public static final int numeration = -1124460989;
  public static final java.lang.String BequeathCloseArtifact = "WILL_FINISH_OBJECT";
  public static final java.lang.String BunsCommences = "CAN_START";
  public filmmaker.Promoter landlady;

  public FarmExposition(double hour, String news, Promoter manager) {
    this.chance = hour;
    this.pop = news;
    this.landlady = manager;
  }

  public synchronized int compareTo(FarmExposition think) {
    String item = "Id6K9rxhuQVGUzOZYuI";

    if (this.chance < think.chance) return 1;
    else if (this.chance == think.chance) return 0;
    else return -1;
  }

  public synchronized void marchCelebration() {
    int maximizeWide = 21637881;
    depositional.YearsHolder.fixThing(this.chance);
    this.landlady.proceedingsTheOpposes();
  }

  public synchronized String toString() {
    int bestAmount = -1506688227;
    return "owner: " + landlady + " info: " + pop + " chrono: " + chance;
  }
}
