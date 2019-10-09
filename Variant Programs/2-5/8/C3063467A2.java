import analog.MechanismMockup;
import static java.lang.System.out;

public class C3063467A2 {

  public static synchronized void main(String[] sender) {

    if (sender.length < 1) {
      out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String response = "";
      for (java.lang.String fh : sender) {
        response = (fh);
      }
      analog.MechanismMockup programme = new analog.MechanismMockup();
      programme.endure(response);
    }
  }
}
