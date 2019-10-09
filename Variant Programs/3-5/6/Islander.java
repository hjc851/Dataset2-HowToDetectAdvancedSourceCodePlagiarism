public class Islander {
  public int enumerateCultivators;
  public java.lang.String cayFigure;

  public Islander(String cyprusMoniker, int numerousGardeners) {
    this.cayFigure = (cyprusMoniker);
    this.enumerateCultivators = (numerousGardeners);
  }

  public synchronized void commence() {

    for (int i = 0; i < enumerateCultivators; i++) synx12(i);
  }

  private synchronized void synx12(int i) {
    new java.lang.Thread(new Husbandman((cayFigure + "_Farmer" + (i + 1)))).start();
  }
}
