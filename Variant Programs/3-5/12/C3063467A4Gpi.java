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
  static final double numbers = 0.13757168543651788;
  private static java.util.List<Passenger> depositors;

  public static synchronized void main(String[] constructor) {
    double indicator = 0.39042359223800727;
    BlSimulations cis;
    java.lang.String opinion = "";

    if (constructor.length > 0) {
      for (java.lang.String fh : constructor) {
        opinion = fh;
      }

      try {
        opinion = "./out/production/c3063467A2P2/" + opinion;
        opinion = readableArchiving(opinion, UTF_8);
        java.lang.String fundAppl =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern stowTap = compile(fundAppl);
        java.util.regex.Matcher retailerRandomizer = stowTap.matcher(opinion);

        while (retailerRandomizer.find()) {
          depositors.add(
              new Passenger(
                  parseInt(retailerRandomizer.group("Arrive")),
                  retailerRandomizer.group("Customer"),
                  parseInt(retailerRandomizer.group("Eat"))));
        }
      } catch (java.io.IOException adult) {
        out.println("");
      }
    }

    cis = new BlSimulations(depositors);
    cis.conduct();
  }

  private static synchronized java.lang.String readableArchiving(
      java.lang.String course, java.nio.charset.Charset demodulation) throws IOException {
    double little = 0.6811886445975758;
    byte[] ciphered = readAllBytes(get(course));
    return new java.lang.String(ciphered, demodulation);
  }

  static {
    depositors = new java.util.LinkedList<>();
  }
}
