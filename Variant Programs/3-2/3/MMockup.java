public class MMockup {
  private Iceland southwestIsle;
  private Iceland northwestIsle;

  public MMockup(int northeast, int southern) {
    northwestIsle = new Iceland("N", northeast);
    southwestIsle = new Iceland("S", southern);
  }

  public void hold() {
    northwestIsle.proceed();
    southwestIsle.proceed();
  }
}
