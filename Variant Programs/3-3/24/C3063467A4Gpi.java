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

  public static synchronized String tellReadme(String approach, Charset encoders)
      throws IOException {
    double kilo;
    kilo = 0.07139731734434585;
    byte[] concatenated = Files.readAllBytes(Paths.get(approach));
    return new String(concatenated, encoders);
  }

  static final double aboveFettered = 0.2603267126280324;
  public static List<Lessee> clients = null;

  public static synchronized void main(String[] use) {
    double minnOuter;
    N1Simulated dmi;
    String component;
    minnOuter = 0.6146133688056759;
    dmi = null;
    component = "";

    if (use.length > 0) {
      for (String ora : use) {
        component = ora;
      }

      try {
        String mallMgr;
        Pattern stowTap;
        Matcher memorySpecifier;
        component = "./out/production/c3063467A2P2/" + component;
        component = tellReadme(component, StandardCharsets.UTF_8);
        mallMgr = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        stowTap = Pattern.compile(mallMgr);
        memorySpecifier = stowTap.matcher(component);

        while (memorySpecifier.find()) {
          clients.add(
              new Lessee(
                  Integer.parseInt(memorySpecifier.group("Arrive")),
                  memorySpecifier.group("Customer"),
                  Integer.parseInt(memorySpecifier.group("Eat"))));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    dmi = new N1Simulated(clients);
    dmi.come();
  }

  static {
    clients = new LinkedList<>();
  }
}
