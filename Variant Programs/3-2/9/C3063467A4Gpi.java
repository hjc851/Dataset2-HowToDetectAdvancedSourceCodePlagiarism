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
  private static java.util.List<Patrons> subscriptions = new java.util.LinkedList<>();

  public static void main(String[] sender) {
    AjFaker dmi;
    java.lang.String consultation = "";

    if (sender.length > 0) {
      for (java.lang.String ora : sender) {
        consultation = ora;
      }

      try {
        consultation = "./out/production/c3063467A2P2/" + consultation;
        consultation = readerInitiate(consultation, StandardCharsets.UTF_8);
        java.lang.String bookstoreCust =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storehouseAppropriate =
            java.util.regex.Pattern.compile(bookstoreCust);
        java.util.regex.Matcher storehouseChooser = storehouseAppropriate.matcher(consultation);

        while (storehouseChooser.find()) {
          subscriptions.add(
              new Patrons(
                  java.lang.Integer.parseInt(storehouseChooser.group("Arrive")),
                  storehouseChooser.group("Customer"),
                  java.lang.Integer.parseInt(storehouseChooser.group("Eat"))));
        }
      } catch (java.io.IOException adoptee) {
        System.out.println("");
      }
    }

    dmi = new AjFaker(subscriptions);
    dmi.initiate();
  }

  private static java.lang.String readerInitiate(
      java.lang.String footpath, java.nio.charset.Charset codify) throws IOException {
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(cryptographic, codify);
  }
}
