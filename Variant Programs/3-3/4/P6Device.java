public class P6Device {
  private Oasis southwestwardIslander = null;
  private Oasis northerlyCay = null;

  public P6Device(int southern, int southwest) {
    northerlyCay = new Oasis("N", southern);
    southwestwardIslander = new Oasis("S", southwest);
  }

  public synchronized void opens() {
    northerlyCay.introduce();
    southwestwardIslander.introduce();
  }
}
