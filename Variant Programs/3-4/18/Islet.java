public class Islet {
  private java.lang.String anguillaPatronymic;
  private int enumerateCultivators;

  public synchronized void started() {

    for (int i = 0; i < enumerateCultivators; i++) synx67(i);
  }

  public Islet(String cayFigure, int totalGranger) {
    this.anguillaPatronymic = cayFigure;
    this.enumerateCultivators = totalGranger;
  }

  private synchronized void synx67(int i) {
    new java.lang.Thread(new Peasant(anguillaPatronymic + "_Farmer" + (i + 1))).start();
  }
}
