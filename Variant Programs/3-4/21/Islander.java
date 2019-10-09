public class Islander {

  public Islander(String cayFigure, int comeAgricultural) {
    this.enclaveAppoint = cayFigure;
    this.actAgriculture = comeAgricultural;
  }

  public int actAgriculture = 0;

  public synchronized void introduce() {

    for (int i = 0; i < actAgriculture; i++) synx77(i);
  }

  public java.lang.String enclaveAppoint = null;

  private synchronized void synx77(int i) {
    new java.lang.Thread(new Operator(enclaveAppoint + "_Farmer" + (i + 1))).start();
  }
}
