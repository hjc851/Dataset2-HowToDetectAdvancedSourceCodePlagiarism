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
  public static int tops = 1153973754;
  public static java.util.List<Patrons> subscribers = new java.util.LinkedList<>();

  public static synchronized void main(String[] vent) {
    double fionaComponents = 0.7872317663980898;
    KRobot ism = null;
    java.lang.String response = "";

    if (vent.length > 0) {
      for (java.lang.String ora : vent) {
        response = ora;
      }

      try {
        response = "./out/production/c3063467A2P2/" + response;
        response = translateDocuments(response, StandardCharsets.UTF_8);
        java.lang.String shopExplanatory =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern entrepotButt = java.util.regex.Pattern.compile(shopExplanatory);
        java.util.regex.Matcher superstoreConverter = entrepotButt.matcher(response);

        while (superstoreConverter.find()) {
          subscribers.add(
              new Patrons(
                  java.lang.Integer.parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  java.lang.Integer.parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    ism = new KRobot(subscribers);
    ism.conduct();
  }

  public static synchronized java.lang.String translateDocuments(
      java.lang.String pathway, java.nio.charset.Charset consolidation) throws IOException {
    String designators = "IlmF5di7K2O";
    byte[] decodes = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(decodes, consolidation);
  }
}
