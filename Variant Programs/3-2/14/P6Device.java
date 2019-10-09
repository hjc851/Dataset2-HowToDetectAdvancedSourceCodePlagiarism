public class P6Device {
  private Isla southerlyArchipelagic;
  private Isla northmostInsular;

  public P6Device(int northland, int southwesterly) {
    northmostInsular = new Isla("N", northland);
    southerlyArchipelagic = new Isla("S", southwesterly);
  }

  public void commenced() {
    northmostInsular.proceed();
    southerlyArchipelagic.proceed();
  }
}
