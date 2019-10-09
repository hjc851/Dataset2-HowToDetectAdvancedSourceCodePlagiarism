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
  public static java.util.List<Acquirer> diners = null;

  public static synchronized void main(String[] arguments) {
    double distinguish;
    KRobot shen;
    java.lang.String suggestions;
    distinguish = 0.5786292768923602;
    shen = null;
    suggestions = "";

    if (arguments.length > 0) {
      for (java.lang.String waffen : arguments) {
        suggestions = waffen;
      }

      try {
        java.lang.String stowExc;
        java.util.regex.Pattern storageGlib;
        java.util.regex.Matcher groceryPseudorandom;
        suggestions = "./out/production/c3063467A2P2/" + suggestions;
        suggestions = learnRegister(suggestions, StandardCharsets.UTF_8);
        stowExc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        storageGlib = java.util.regex.Pattern.compile(stowExc);
        groceryPseudorandom = storageGlib.matcher(suggestions);

        while (groceryPseudorandom.find()) {
          diners.add(
              new Acquirer(
                  java.lang.Integer.parseInt(groceryPseudorandom.group("Arrive")),
                  groceryPseudorandom.group("Customer"),
                  java.lang.Integer.parseInt(groceryPseudorandom.group("Eat"))));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    shen = new KRobot(diners);
    shen.commencement();
  }

  static {
    diners = new java.util.LinkedList<>();
  }

  public static synchronized java.lang.String learnRegister(
      java.lang.String journey, java.nio.charset.Charset encrypted) throws IOException {
    String trammel;
    trammel = "Iu5Z";
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(entered, encrypted);
  }

  public static int northernObligated = 1449924093;
}
