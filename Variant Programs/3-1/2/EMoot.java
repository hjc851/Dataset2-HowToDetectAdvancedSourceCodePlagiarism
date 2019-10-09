public class EMoot {
  private Peninsula southwesterlyEnclave;
  private Peninsula nordCuba;

  public EMoot(int northeast, int meridional) {
    nordCuba = new Peninsula("N", northeast);
    southwesterlyEnclave = new Peninsula("S", meridional);
  }

  public void conduct() {
    nordCuba.starts();
    southwesterlyEnclave.starts();
  }
}
