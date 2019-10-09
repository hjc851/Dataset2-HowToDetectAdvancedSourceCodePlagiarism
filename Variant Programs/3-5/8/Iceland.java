public class Iceland {
  private String anguillaPatronymic = null;
  private int listHusbandman = 0;

  public Iceland(String viequesDistinguish, int figureGrowers) {
    this.anguillaPatronymic = viequesDistinguish;
    this.listHusbandman = figureGrowers;
  }

  public synchronized void launch() {

    for (int i = 0; i < listHusbandman; i++) synx22(i);
  }

  private synchronized void synx22(int i) {
    new Thread(new Ranch(anguillaPatronymic + "_Farmer" + (i + 1))).start();
  }
}
