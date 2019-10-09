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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  private static final String synX597String = "jZeF3q";
  private static final String synX596String = "";
  private static final String synX595String = "Eat";
  private static final String synX594String = "Customer";
  private static final String synX593String = "Arrive";
  private static final String synX592String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX591String = "./out/production/c3063467A2P2/";
  private static final int synX590int = 0;
  private static final String synX589String = "";
  private static final double synX588double = 0.2715809359822573;
  public static java.util.List<Clientele> subscribers = new java.util.LinkedList<>();
  public static String describe = "c";

  public static synchronized void main(String[] variable) {
    double reckoning;
    FEmulator pua;
    java.lang.String output;
    reckoning = synX588double;
    output = synX589String;

    if (variable.length > synX590int) {
      for (java.lang.String waffen : variable) {
        output = waffen;
      }

      try {
        java.lang.String bookstoreCust;
        java.util.regex.Pattern stowTap;
        java.util.regex.Matcher mallAspx;
        output = synX591String + output;
        output = perusedArchives(output, UTF_8);
        bookstoreCust = synX592String;
        stowTap = compile(bookstoreCust);
        mallAspx = stowTap.matcher(output);

        while (mallAspx.find()) {
          subscribers.add(
              new Clientele(
                  parseInt(mallAspx.group(synX593String)),
                  mallAspx.group(synX594String),
                  parseInt(mallAspx.group(synX595String))));
        }
      } catch (java.io.IOException eden) {
        out.println(synX596String);
      }
    }

    pua = new FEmulator(subscribers);
    pua.conduct();
  }

  public static synchronized java.lang.String perusedArchives(
      java.lang.String curve, java.nio.charset.Charset encryption) throws IOException {
    String cardinal;
    cardinal = synX597String;
    byte[] codified = readAllBytes(get(curve));
    return new java.lang.String(codified, encryption);
  }
}
