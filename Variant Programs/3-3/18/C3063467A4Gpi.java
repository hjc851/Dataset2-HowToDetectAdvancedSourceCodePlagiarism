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
  static {
    consumers = new java.util.LinkedList<>();
  }

  private static java.util.List<Clients> consumers;

  private static synchronized java.lang.String interpretLodge(
      java.lang.String course, java.nio.charset.Charset uncompressed) throws IOException {
    String identification;
    identification = "Ik3ul3G9fzkilQE0i";
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(course));
    return new java.lang.String(cryptographic, uncompressed);
  }

  public static synchronized void main(String[] create) {
    String heightConfine;
    MDemo yes;
    java.lang.String submissions;
    heightConfine = "Ez2McFSFDK";
    submissions = "";

    if (create.length > 0) {
      for (java.lang.String waffen : create) {
        submissions = waffen;
      }

      try {
        java.lang.String groceryBens;
        java.util.regex.Pattern repositionSlap;
        java.util.regex.Matcher retailerRandomizer;
        submissions = "./out/production/c3063467A2P2/" + submissions;
        submissions = interpretLodge(submissions, StandardCharsets.UTF_8);
        groceryBens = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        repositionSlap = java.util.regex.Pattern.compile(groceryBens);
        retailerRandomizer = repositionSlap.matcher(submissions);

        while (retailerRandomizer.find()) {
          consumers.add(
              new Clients(
                  java.lang.Integer.parseInt(retailerRandomizer.group("Arrive")),
                  retailerRandomizer.group("Customer"),
                  java.lang.Integer.parseInt(retailerRandomizer.group("Eat"))));
        }
      } catch (java.io.IOException adoptee) {
        System.out.println("");
      }
    }

    yes = new MDemo(consumers);
    yes.started();
  }

  static int fare = -660817240;
}
