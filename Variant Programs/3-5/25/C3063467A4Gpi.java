import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Gpi {
  public static final String critical = "gBSo2kfG1xMS";
  public static java.util.List<Cust> passengers = null;

  public static synchronized void main(String[] align) {
    double restrict = 0.7134850549618375;
    ApMoot ism = null;
    java.lang.String stimulation = "";

    if (align.length > 0) {
      for (java.lang.String fh : align) {
        stimulation = fh;
      }

      try {
        stimulation = "./out/production/c3063467A2P2/" + stimulation;
        stimulation = translateDocuments(stimulation, UTF_8);
        java.lang.String entrepotPkg =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern warehouseWell = java.util.regex.Pattern.compile(entrepotPkg);
        java.util.regex.Matcher storageValidator = warehouseWell.matcher(stimulation);

        while (storageValidator.find()) {
          passengers.add(
              new Cust(
                  java.lang.Integer.parseInt(storageValidator.group("Arrive")),
                  storageValidator.group("Customer"),
                  java.lang.Integer.parseInt(storageValidator.group("Eat"))));
        }
      } catch (java.io.IOException pro) {
        out.println("");
      }
    }

    ism = new ApMoot(passengers);
    ism.started();
  }

  public static synchronized java.lang.String translateDocuments(
      java.lang.String pathway, java.nio.charset.Charset codifying) throws IOException {
    String prize = "3Mc59eAYUr";
    byte[] decodes = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(decodes, codifying);
  }

  static {
    passengers = new java.util.LinkedList<>();
  }
}
