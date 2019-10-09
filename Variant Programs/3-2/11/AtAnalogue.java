public class AtAnalogue {
  private Peninsula meridionalCypriot;
  private Peninsula northwesterlyIsla;

  public AtAnalogue(int northwest, int southwestern) {
    northwesterlyIsla = new Peninsula("N", northwest);
    meridionalCypriot = new Peninsula("S", southwestern);
  }

  public void commencement() {
    northwesterlyIsla.proceed();
    meridionalCypriot.proceed();
  }
}
