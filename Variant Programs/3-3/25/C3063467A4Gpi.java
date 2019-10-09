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
  private static java.util.List<Person> consumers;
  public static final String highWidening = "I8hbCyAl44t";

  public static synchronized void main(String[] create) {
    String narrowerMax;
    P1Simulating indeed;
    java.lang.String participatory;
    narrowerMax = "h5WiGeu0zv6hbcfP";
    participatory = "";

    if (create.length > 0) {
      for (java.lang.String ora : create) {
        participatory = ora;
      }

      try {
        java.lang.String deliPlu;
        java.util.regex.Pattern deliWap;
        java.util.regex.Matcher mallAspx;
        participatory = "./out/production/c3063467A2P2/" + participatory;
        participatory = studyPaperwork(participatory, StandardCharsets.UTF_8);
        deliPlu = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        deliWap = java.util.regex.Pattern.compile(deliPlu);
        mallAspx = deliWap.matcher(participatory);

        while (mallAspx.find()) {
          consumers.add(
              new Person(
                  java.lang.Integer.parseInt(mallAspx.group("Arrive")),
                  mallAspx.group("Customer"),
                  java.lang.Integer.parseInt(mallAspx.group("Eat"))));
        }
      } catch (java.io.IOException tipp) {
        System.out.println("");
      }
    }

    indeed = new P1Simulating(consumers);
    indeed.commence();
  }

  private static synchronized java.lang.String studyPaperwork(
      java.lang.String direction, java.nio.charset.Charset cryptographic) throws IOException {
    double circumscribe;
    circumscribe = 0.08550804398404976;
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(direction));
    return new java.lang.String(costed, cryptographic);
  }

  static {
    consumers = new java.util.LinkedList<>();
  }
}
