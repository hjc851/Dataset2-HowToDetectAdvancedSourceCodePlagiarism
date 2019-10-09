package probable;

public class OpportunityCarer {
  private static probable.OpportunityCarer exchangedDayCaretaker;

  public static probable.OpportunityCarer catchExpressedWhenGuard() {

    if (exchangedDayCaretaker == null) exchangedDayCaretaker = new probable.OpportunityCarer();

    return exchangedDayCaretaker;
  }

  public static double latestClip() {
    return catchExpressedWhenGuard().canExistingYears();
  }

  public static void determineBeginning(double quarry) {
    catchExpressedWhenGuard().risePoi(quarry);
  }

  private double presentBeginning;

  private OpportunityCarer() {
    this.presentBeginning = 0;
  }

  private double canExistingYears() {
    return this.presentBeginning;
  }

  private void risePoi(double reach) {
    this.presentBeginning = reach;
  }
}
