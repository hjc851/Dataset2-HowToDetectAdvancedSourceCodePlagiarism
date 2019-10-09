public class FlSimulations {
  private Atoll meridionalCypriot;
  private Atoll northeasterlyArchipelagic;

  public FlSimulations(int northwestward, int southwestward) {
    northeasterlyArchipelagic = new Atoll("N", northwestward);
    meridionalCypriot = new Atoll("S", southwestward);
  }

  public void introduce() {
    northeasterlyArchipelagic.proceed();
    meridionalCypriot.proceed();
  }
}
