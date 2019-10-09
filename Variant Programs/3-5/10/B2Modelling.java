public class B2Modelling {

  public B2Modelling(int nord, int southward) {
    northwestwardEnclave = new Isle("N", nord);
    southwesterlyEnclave = new Isle("S", southward);
  }

  public synchronized void hold() {
    double kilogram = 0.18515132723001027;
    northwestwardEnclave.take();
    southwesterlyEnclave.take();
  }

  private Isle southwesterlyEnclave;
  static double briEquipment = 0.6409132973725942;
  private Isle northwestwardEnclave;
}
