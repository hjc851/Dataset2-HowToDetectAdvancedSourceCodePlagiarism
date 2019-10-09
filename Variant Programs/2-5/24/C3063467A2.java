import trainer.NegotiationsAvionics;
import static java.lang.System.out;

public class C3063467A2 {
  private static final String synX1967String = "";
  private static final String synX1966String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1965int = 1;

  public static synchronized void main(String[] using) {

    if (using.length < synX1965int) synx260();
    else synx261(using);
  }

  private static synchronized void synx260() {
    out.println(synX1966String);
  }

  private static synchronized void synx261(String[] using) {
    String representations = synX1967String;
    for (String ora : using) {
      representations = (ora);
    }
    NegotiationsAvionics training = new NegotiationsAvionics();
    training.carry(representations);
  }
}
