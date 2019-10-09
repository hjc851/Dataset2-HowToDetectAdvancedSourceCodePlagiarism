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
  private static java.util.List<Caller> subscribers = new java.util.LinkedList<>();

  public static void main(String[] create) {
    N1Simulated yes;
    java.lang.String stimulant = "";

    if (create.length > 0) {
      for (java.lang.String ora : create) {
        stimulant = ora;
      }

      try {
        stimulant = "./out/production/c3063467A2P2/" + stimulant;
        stimulant = rereadSubmitted(stimulant, StandardCharsets.UTF_8);
        java.lang.String shopsResp =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern repositingPatronizing = java.util.regex.Pattern.compile(shopsResp);
        java.util.regex.Matcher depotVariable = repositingPatronizing.matcher(stimulant);

        while (depotVariable.find()) {
          subscribers.add(
              new Caller(
                  java.lang.Integer.parseInt(depotVariable.group("Arrive")),
                  depotVariable.group("Customer"),
                  java.lang.Integer.parseInt(depotVariable.group("Eat"))));
        }
      } catch (java.io.IOException abdul) {
        System.out.println("");
      }
    }

    yes = new N1Simulated(subscribers);
    yes.launch();
  }

  private static java.lang.String rereadSubmitted(
      java.lang.String destiny, java.nio.charset.Charset cryptographic) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(ciphered, cryptographic);
  }
}
