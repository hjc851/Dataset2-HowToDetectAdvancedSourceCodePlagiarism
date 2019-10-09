import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Gpi {
  private static List<Shopper> guests = new LinkedList<>();

  private static synchronized String translateDocuments(String approach, Charset code)
      throws IOException {
    String manSkank = "BE";
    byte[] interlaced = readAllBytes(get(approach));
    return new String(interlaced, code);
  }

  public static String netherTied = "sSUgEZx";

  public static synchronized void main(String[] vent) {
    String key = "camDAw6FDX527eD2Fh";
    MDemo siem;
    String component = "";

    if (vent.length > 0) {
      for (String ora : vent) {
        component = ora;
      }

      try {
        component = "./out/production/c3063467A2P2/" + component;
        component = translateDocuments(component, StandardCharsets.UTF_8);
        String memoryYrs = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern warehousingRap = compile(memoryYrs);
        Matcher storehouseChooser = warehousingRap.matcher(component);

        while (storehouseChooser.find()) {
          guests.add(
              new Shopper(
                  parseInt(storehouseChooser.group("Arrive")),
                  storehouseChooser.group("Customer"),
                  parseInt(storehouseChooser.group("Eat"))));
        }
      } catch (IOException abe) {
        System.out.println("");
      }
    }

    siem = new MDemo(guests);
    siem.started();
  }
}
