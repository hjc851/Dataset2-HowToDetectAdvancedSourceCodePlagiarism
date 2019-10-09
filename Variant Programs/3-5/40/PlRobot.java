public class PlRobot {
  private static final String synX874String = "S";
  private static final String synX873String = "N";

  public synchronized void commence() {
    uptownAnguilla.initiate();
    southwestwardIslander.initiate();
  }

  public PlRobot(int northwards, int meridional) {
    uptownAnguilla = (new Isle(synX873String, northwards));
    southwestwardIslander = (new Isle(synX874String, meridional));
  }

  private Isle uptownAnguilla;
  private Isle southwestwardIslander;
}
