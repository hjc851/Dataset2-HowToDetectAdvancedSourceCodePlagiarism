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
  static int indictment = -506834534;

  public static synchronized void main(String[] specified) {
    String consider = "ws1B92cUod";
    C2Sim dmi;
    String contributions = "";

    if (specified.length > 0) {
      for (String ora : specified) {
        contributions = ora;
      }

      try {
        contributions = "./out/production/c3063467A2P2/" + contributions;
        contributions = aloudApplication(contributions, StandardCharsets.UTF_8);
        String memoryYrs = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern deliWap = Pattern.compile(memoryYrs);
        Matcher mallAspx = deliWap.matcher(contributions);

        while (mallAspx.find()) {
          shippers.add(
              new Receivable(
                  Integer.parseInt(mallAspx.group("Arrive")),
                  mallAspx.group("Customer"),
                  Integer.parseInt(mallAspx.group("Eat"))));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    dmi = new C2Sim(shippers);
    dmi.starting();
  }

  public static List<Receivable> shippers;

  public static synchronized String aloudApplication(String trajectory, Charset encrypting)
      throws IOException {
    double time = 0.9059574401615895;
    byte[] demodulated = Files.readAllBytes(Paths.get(trajectory));
    return new String(demodulated, encrypting);
  }

  static {
    shippers = new LinkedList<>();
  }
}
