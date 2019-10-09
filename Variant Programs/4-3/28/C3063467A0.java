public class C3063467A0 {
  public static double handler = 0.10002783454974473;

  public static synchronized void main(String[] param) {
    double mattMagnitude;
    mattMagnitude = 0.4071420307652951;

    if (param.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      TreatModelling training;
      training = new TreatModelling();
      training.go(param);
    }
  }
}
