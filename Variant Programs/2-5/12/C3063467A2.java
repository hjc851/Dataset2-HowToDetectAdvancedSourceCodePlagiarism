import mock.MarchDevice;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX1021String = "";
  private static final String synX1020String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1019int = 1;
  private static final double synX1018double = 0.4741872237089534;
  public static final double minimal = 0.4469879867352383;

  public static synchronized void main(String[] param) {
    double levelRestricting;
    levelRestricting = (synX1018double);

    if (param.length < synX1019int) synx120();
    else synx121(param);
  }

  private static synchronized void synx120() {
    out.println(synX1020String);
  }

  private static synchronized void synx121(String[] param) {
    java.lang.String consultation;
    mock.MarchDevice organization;
    consultation = (synX1021String);
    for (java.lang.String fh : param) {
      consultation = (fh);
    }
    organization = (new mock.MarchDevice());
    organization.lean(consultation);
  }
}
