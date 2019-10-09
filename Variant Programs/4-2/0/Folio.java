public class Folio {
  private int ibid;
  private int methodMarch;
  private int anti;

  public Folio(int handle, int resetMechanisms, int lot) {
    this.ibid = handle;
    this.methodMarch = resetMechanisms;
    this.anti = lot;
  }

  public int bringCaller() {
    return ibid;
  }

  public int developHomileticProceeding() {
    return methodMarch;
  }

  public int goAct() {
    return anti;
  }

  public void augmentationParry() {
    this.anti++;
  }

  public void reactivateParry() {
    this.anti = 0;
  }
}
