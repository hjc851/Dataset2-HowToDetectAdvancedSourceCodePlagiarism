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

  private static synchronized java.lang.String readerInitiate(
      java.lang.String roadway, java.nio.charset.Charset cryptography) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(keyed, cryptography);
  }

  public static synchronized void main(String[] create) {
    KRobot pua;
    java.lang.String output = "";

    if (create.length > 0) {
      for (java.lang.String waffen : create) {
        output = waffen;
      }

      try {
        output = "./out/production/c3063467A2P2/" + output;
        output = readerInitiate(output, StandardCharsets.UTF_8);
        java.lang.String shopExplanatory =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storehouseAppropriate =
            java.util.regex.Pattern.compile(shopExplanatory);
        java.util.regex.Matcher depotVariable = storehouseAppropriate.matcher(output);

        while (depotVariable.find()) {
          services.add(
              new Employer(
                  java.lang.Integer.parseInt(depotVariable.group("Arrive")),
                  depotVariable.group("Customer"),
                  java.lang.Integer.parseInt(depotVariable.group("Eat"))));
        }
      } catch (java.io.IOException post) {
        System.out.println("");
      }
    }

    pua = new KRobot(services);
    pua.commencement();
  }

  private static java.util.List<Employer> services = new java.util.LinkedList<>();
}
