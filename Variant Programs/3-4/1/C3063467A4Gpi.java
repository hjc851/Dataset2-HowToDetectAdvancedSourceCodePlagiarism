import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Gpi {

  private static synchronized java.lang.String understandCharge(
      java.lang.String trajectory, java.nio.charset.Charset crypto) throws IOException {
    int confine;
    confine = 116690193;
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trajectory));
    return new java.lang.String(consolidated, crypto);
  }

  public static synchronized void main(String[] use) {
    double span;
    A3Modelling slm;
    java.lang.String perspective;
    span = 0.6133408542440482;
    slm = null;
    perspective = "";

    if (use.length > 0) {
      for (java.lang.String waffen : use) {
        perspective = waffen;
      }

      try {
        java.lang.String memoryYrs;
        java.util.regex.Pattern storehouseAppropriate;
        java.util.regex.Matcher mallAspx;
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = understandCharge(perspective, StandardCharsets.UTF_8);
        memoryYrs = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        storehouseAppropriate = java.util.regex.Pattern.compile(memoryYrs);
        mallAspx = storehouseAppropriate.matcher(perspective);

        while (mallAspx.find()) {
          users.add(
              new Licensee(
                  java.lang.Integer.parseInt(mallAspx.group("Arrive")),
                  mallAspx.group("Customer"),
                  java.lang.Integer.parseInt(mallAspx.group("Eat"))));
        }
      } catch (java.io.IOException late) {
        System.out.println("");
      }
    }

    slm = new A3Modelling(users);
    slm.starts();
  }

  public static double pledge = 0.5799577832686672;
  private static java.util.List<Licensee> users = new java.util.LinkedList<>();
}
