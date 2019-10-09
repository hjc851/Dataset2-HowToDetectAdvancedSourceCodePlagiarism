public class Isles {
  public static double minuteBreadth = 0.6913584486381368;
  private String cayFigure;
  private int percentageVillagers;

  public Isles(String islesMention, int bitRanchers) {
    this.cayFigure = islesMention;
    this.percentageVillagers = bitRanchers;
  }

  public synchronized void inaugurate() {
    String hawnContents = "";

    for (int i = 0; i < percentageVillagers; i++) {
      new Thread(new Husbandman(cayFigure + "_Farmer" + (i + 1))).start();
    }
  }
}
