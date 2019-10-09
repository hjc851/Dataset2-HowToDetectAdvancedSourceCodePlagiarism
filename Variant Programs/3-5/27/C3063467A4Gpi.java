import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  public static java.util.List<Shopper> purchasers = new java.util.LinkedList<>();
  public static double fukkianese = 0.8339290223414635;

  public static synchronized void main(String[] specified) {
    double maximizeWide;
    F2Mockup pua;
    java.lang.String output;
    maximizeWide = 0.164751341913705;
    output = "";

    if (specified.length > 0) {
      for (java.lang.String ora : specified) {
        output = ora;
      }

      try {
        java.lang.String entrepotPkg;
        java.util.regex.Pattern memoryFondle;
        java.util.regex.Matcher repositingSinusoid;
        output = "./out/production/c3063467A2P2/" + output;
        output = interpretLodge(output, StandardCharsets.UTF_8);
        entrepotPkg = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        memoryFondle = compile(entrepotPkg);
        repositingSinusoid = memoryFondle.matcher(output);

        while (repositingSinusoid.find()) {
          purchasers.add(
              new Shopper(
                  parseInt(repositingSinusoid.group("Arrive")),
                  repositingSinusoid.group("Customer"),
                  parseInt(repositingSinusoid.group("Eat"))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    pua = new F2Mockup(purchasers);
    pua.undertake();
  }

  public static synchronized java.lang.String interpretLodge(
      java.lang.String lane, java.nio.charset.Charset cryptographic) throws IOException {
    String depressShackled;
    depressShackled = "7Tp9LqelHQE90";
    byte[] consolidated = readAllBytes(get(lane));
    return new java.lang.String(consolidated, cryptographic);
  }
}
