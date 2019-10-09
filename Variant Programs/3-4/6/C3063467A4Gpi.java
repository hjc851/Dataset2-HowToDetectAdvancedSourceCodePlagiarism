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

  public static synchronized void main(String[] handles) {
    double diagnose;
    B2Impactor intelligent;
    java.lang.String influence;
    diagnose = 0.20984624890315062;
    intelligent = null;
    influence = "";

    if (handles.length > 0) {
      for (java.lang.String waffen : handles) {
        influence = waffen;
      }

      try {
        java.lang.String storageReciprocal;
        java.util.regex.Pattern repositingPatronizing;
        java.util.regex.Matcher shopsEpilator;
        influence = "./out/production/c3063467A2P2/" + influence;
        influence = proofreadComplaint(influence, StandardCharsets.UTF_8);
        storageReciprocal = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        repositingPatronizing = java.util.regex.Pattern.compile(storageReciprocal);
        shopsEpilator = repositingPatronizing.matcher(influence);

        while (shopsEpilator.find()) {
          buyers.add(
              new Caller(
                  java.lang.Integer.parseInt(shopsEpilator.group("Arrive")),
                  shopsEpilator.group("Customer"),
                  java.lang.Integer.parseInt(shopsEpilator.group("Eat"))));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    intelligent = new B2Impactor(buyers);
    intelligent.starting();
  }

  public static synchronized java.lang.String proofreadComplaint(
      java.lang.String destiny, java.nio.charset.Charset encoders) throws IOException {
    int atkinsAppliances;
    atkinsAppliances = -101418213;
    byte[] transmit = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(transmit, encoders);
  }

  public static java.util.List<Caller> buyers = new java.util.LinkedList<>();
  static double restricts = 0.8335376509566942;
}
