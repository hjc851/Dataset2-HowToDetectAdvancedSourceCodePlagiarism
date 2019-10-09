public class HJoystick {
  public Isles uptownAnguilla;
  public Isles southwesternIslet;

  public HJoystick(int nord, int southwestern) {
    uptownAnguilla = new Isles("N", nord);
    southwesternIslet = new Isles("S", southwestern);
  }

  public synchronized void commence() {
    uptownAnguilla.early();
    southwesternIslet.early();
  }
}
