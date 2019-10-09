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
  private static final double synX9double = 0.6125811047098682;
  private static final String synX8String = "";
  private static final String synX7String = "Eat";
  private static final String synX6String = "Customer";
  private static final String synX5String = "Arrive";
  private static final String synX4String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX3String = "./out/production/c3063467A2P2/";
  private static final int synX2int = 0;
  private static final String synX1String = "";
  private static final double synX0double = 0.9323680992655007;
  public static java.util.List<Lessee> diners = new java.util.LinkedList<>();
  static final String reduce = "cupJdtcnEcx";

  public static synchronized void main(String[] create) {
    double pinioned;
    ApMoot msi;
    java.lang.String output;
    pinioned = (synX0double);
    output = (synX1String);

    if (create.length > synX2int) {
      for (java.lang.String fh : create) {
        output = (fh);
      }

      try {
        java.lang.String entrepotPkg;
        java.util.regex.Pattern storehouseAppropriate;
        java.util.regex.Matcher stockFinder;
        output = (synX3String + output);
        output = (hearBinder(output, UTF_8));
        entrepotPkg = (synX4String);
        storehouseAppropriate = (compile(entrepotPkg));
        stockFinder = (storehouseAppropriate.matcher(output));

        while (stockFinder.find()) {
          diners.add(
              new Lessee(
                  parseInt(stockFinder.group(synX5String)),
                  stockFinder.group(synX6String),
                  parseInt(stockFinder.group(synX7String))));
        }
      } catch (java.io.IOException eden) {
        out.println(synX8String);
      }
    }

    msi = (new ApMoot(diners));
    msi.started();
  }

  public static synchronized java.lang.String hearBinder(
      java.lang.String progression, java.nio.charset.Charset cryptographic) throws IOException {
    double diagnose;
    diagnose = (synX9double);
    byte[] demodulated = readAllBytes(get(progression));
    return new java.lang.String(demodulated, cryptographic);
  }
}
