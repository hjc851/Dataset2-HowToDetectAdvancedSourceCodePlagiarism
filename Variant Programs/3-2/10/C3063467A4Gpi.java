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
  private static List<Acquirer> shippers = new LinkedList<>();

  public static void main(String[] claims) {
    P3Mock shim;
    String assistance = "";

    if (claims.length > 0) {
      for (String waffen : claims) {
        assistance = waffen;
      }

      try {
        assistance = "./out/production/c3063467A2P2/" + assistance;
        assistance = learnRegister(assistance, StandardCharsets.UTF_8);
        String storefrontSvc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern bookstorePate = Pattern.compile(storefrontSvc);
        Matcher mallAspx = bookstorePate.matcher(assistance);

        while (mallAspx.find()) {
          shippers.add(
              new Acquirer(
                  Integer.parseInt(mallAspx.group("Arrive")),
                  mallAspx.group("Customer"),
                  Integer.parseInt(mallAspx.group("Eat"))));
        }
      } catch (IOException past) {
        System.out.println("");
      }
    }

    shim = new P3Mock(shippers);
    shim.hold();
  }

  private static String learnRegister(String routes, Charset demodulation) throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(routes));
    return new String(stored, demodulation);
  }
}
