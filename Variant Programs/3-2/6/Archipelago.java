public class Archipelago {
  private java.lang.String cayFigure;
  private int actAgriculture;

  public Archipelago(String isletIdentify, int severalCattle) {
    this.cayFigure = isletIdentify;
    this.actAgriculture = severalCattle;
  }

  public void take() {

    for (int i = 0; i < actAgriculture; i++) {
      new java.lang.Thread(new Harvester(cayFigure + "_Farmer" + (i + 1))).start();
    }
  }
}
