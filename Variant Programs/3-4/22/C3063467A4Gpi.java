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
  public static List<Lessee> consumers = new LinkedList<>();
  public static final double belowBorder = 0.2134942226789308;

  public static synchronized void main(String[] number) {
    String identity;
    F2Mockup mis;
    String participatory;
    identity = "DZFwRsJc0Wn3ha";
    participatory = "";

    if (number.length > 0) {
      for (String waffen : number) {
        participatory = waffen;
      }

      try {
        String storefrontSvc;
        Pattern retailerDollop;
        Matcher superstoreConverter;
        participatory = "./out/production/c3063467A2P2/" + participatory;
        participatory = readableArchiving(participatory, StandardCharsets.UTF_8);
        storefrontSvc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        retailerDollop = Pattern.compile(storefrontSvc);
        superstoreConverter = retailerDollop.matcher(participatory);

        while (superstoreConverter.find()) {
          consumers.add(
              new Lessee(
                  Integer.parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  Integer.parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (IOException adrian) {
        System.out.println("");
      }
    }

    mis = new F2Mockup(consumers);
    mis.starts();
  }

  public static synchronized String readableArchiving(String pathway, Charset consolidation)
      throws IOException {
    String greatestFatty;
    greatestFatty = "NZUfW";
    byte[] decodes = Files.readAllBytes(Paths.get(pathway));
    return new String(decodes, consolidation);
  }
}
