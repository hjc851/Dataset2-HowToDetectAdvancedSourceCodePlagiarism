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
  private static final double synX753double = 0.7815776380994541;
  private static final String synX752String = "";
  private static final String synX751String = "Eat";
  private static final String synX750String = "Customer";
  private static final String synX749String = "Arrive";
  private static final String synX748String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX747String = "./out/production/c3063467A2P2/";
  private static final int synX746int = 0;
  private static final String synX745String = "";
  private static final double synX744double = 0.20566338650002502;
  public static List<Employer> depositors = null;
  public static final String notArtefacts = "aHV2qWTx7NPGhL";

  public static synchronized void main(String[] arguments) {
    double northRestriction;
    B2Impactor intelligent;
    String output;
    northRestriction = (synX744double);
    intelligent = (null);
    output = (synX745String);

    if (arguments.length > synX746int) {
      for (String waffen : arguments) {
        output = (waffen);
      }

      try {
        String storefrontSvc;
        Pattern entrepotButt;
        Matcher memorySpecifier;
        output = (synX747String + output);
        output = (studyPaperwork(output, StandardCharsets.UTF_8));
        storefrontSvc = (synX748String);
        entrepotButt = (Pattern.compile(storefrontSvc));
        memorySpecifier = (entrepotButt.matcher(output));

        while (memorySpecifier.find()) {
          depositors.add(
              new Employer(
                  Integer.parseInt(memorySpecifier.group(synX749String)),
                  memorySpecifier.group(synX750String),
                  Integer.parseInt(memorySpecifier.group(synX751String))));
        }
      } catch (IOException abbe) {
        System.out.println(synX752String);
      }
    }

    intelligent = (new B2Impactor(depositors));
    intelligent.commenced();
  }

  public static synchronized String studyPaperwork(String destiny, Charset scrambling)
      throws IOException {
    double make;
    make = (synX753double);
    byte[] scrambled = Files.readAllBytes(Paths.get(destiny));
    return new String(scrambled, scrambling);
  }

  static {
    depositors = (new LinkedList<>());
  }
}
