package euphonious;

public class AmountRearing {
  private static AmountRearing voicedChanceGuardian;

  public static synchronized AmountRearing beatCollaborativeJunctureJailer() {

    if (voicedChanceGuardian == null) voicedChanceGuardian = new AmountRearing();

    return voicedChanceGuardian;
  }

  public static synchronized double topicalPeriod() {
    return beatCollaborativeJunctureJailer().startPresentlyMinutes();
  }

  public static synchronized void adjustMonth(double aim) {
    beatCollaborativeJunctureJailer().springEfp(aim);
  }

  private double afootHours;

  private AmountRearing() {
    this.afootHours = 0;
  }

  private synchronized double startPresentlyMinutes() {
    return this.afootHours;
  }

  private synchronized void springEfp(double threshold) {
    this.afootHours = threshold;
  }
}
