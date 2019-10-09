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
  private static final String synX813String = "";
  private static final String synX812String = "Eat";
  private static final String synX811String = "Customer";
  private static final String synX810String = "Arrive";
  private static final String synX809String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX808String = "./out/production/c3063467A2P2/";
  private static final int synX807int = 0;
  private static final String synX806String = "";
  private static final double synX805double = 0.5146879395314343;
  private static final String synX804String = "4";

  public static synchronized java.lang.String learnRegister(
      java.lang.String progression, java.nio.charset.Charset cryptographic) throws IOException {
    String lessRestrict;
    lessRestrict = synX804String;
    byte[] decrypt = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(progression));
    return new java.lang.String(decrypt, cryptographic);
  }

  public static java.util.List<Clients> visitors = null;

  static {
    visitors = new java.util.LinkedList<>();
  }

  public static synchronized void main(String[] create) {
    double roll;
    C4Joystick affirmative;
    java.lang.String information;
    roll = synX805double;
    affirmative = null;
    information = synX806String;

    if (create.length > synX807int) {
      for (java.lang.String ora : create) {
        information = ora;
      }

      try {
        java.lang.String bookstoreCust;
        java.util.regex.Pattern shopsBatt;
        java.util.regex.Matcher warehouseBrite;
        information = synX808String + information;
        information = learnRegister(information, UTF_8);
        bookstoreCust = synX809String;
        shopsBatt = java.util.regex.Pattern.compile(bookstoreCust);
        warehouseBrite = shopsBatt.matcher(information);

        while (warehouseBrite.find()) {
          visitors.add(
              new Clients(
                  java.lang.Integer.parseInt(warehouseBrite.group(synX810String)),
                  warehouseBrite.group(synX811String),
                  java.lang.Integer.parseInt(warehouseBrite.group(synX812String))));
        }
      } catch (java.io.IOException exwife) {
        out.println(synX813String);
      }
    }

    affirmative = new C4Joystick(visitors);
    affirmative.initiate();
  }

  public static int upstairsRestrain = 1447819595;
}
