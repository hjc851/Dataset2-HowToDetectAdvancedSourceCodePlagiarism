import mock.ProceedingsKinematics;

public class C3063467A2 {

  public static synchronized void main(String[] specified) {

    if (specified.length < 1) synx200();
    else synx201(specified);
  }

  private static synchronized void synx200() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx201(String[] specified) {
    java.lang.String perspective;
    mock.ProceedingsKinematics platform;
    perspective = "";
    for (java.lang.String fh : specified) {
      perspective = fh;
    }
    platform = new mock.ProceedingsKinematics();
    platform.streak(perspective);
  }
}
