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
  private static final String synX270String = "";
  private static final String synX269String = "Eat";
  private static final String synX268String = "Customer";
  private static final String synX267String = "Arrive";
  private static final String synX266String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX265String = "./out/production/c3063467A2P2/";
  private static final int synX264int = 0;
  private static final String synX263String = "";
  private static java.util.List<Users> diners = new java.util.LinkedList<>();

  public static synchronized void main(String[] array) {
    EPrototype indeed;
    java.lang.String opinion = synX263String;

    if (array.length > synX264int) {
      for (java.lang.String fh : array) {
        opinion = fh;
      }

      try {
        opinion = synX265String + opinion;
        opinion = learnRegister(opinion, StandardCharsets.UTF_8);
        java.lang.String warehousingReq = synX266String;
        java.util.regex.Pattern shopChuck = compile(warehousingReq);
        java.util.regex.Matcher depotVariable = shopChuck.matcher(opinion);

        while (depotVariable.find()) {
          diners.add(
              new Users(
                  parseInt(depotVariable.group(synX267String)),
                  depotVariable.group(synX268String),
                  parseInt(depotVariable.group(synX269String))));
        }
      } catch (java.io.IOException post) {
        System.out.println(synX270String);
      }
    }

    indeed = new EPrototype(diners);
    indeed.resume();
  }

  private static synchronized java.lang.String learnRegister(
      java.lang.String progression, java.nio.charset.Charset demodulation) throws IOException {
    byte[] decrypt = readAllBytes(get(progression));
    return new java.lang.String(decrypt, demodulation);
  }
}
