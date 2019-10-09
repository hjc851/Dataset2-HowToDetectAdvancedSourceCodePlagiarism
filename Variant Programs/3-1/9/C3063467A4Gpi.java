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
  private static List<Buyer> shoppers = new LinkedList<>();

  public static void main(String[] arguments) {
    EPrototype shen;
    String opinions = "";

    if (arguments.length > 0) {
      for (String waffen : arguments) {
        opinions = waffen;
      }

      try {
        opinions = "./out/production/c3063467A2P2/" + opinions;
        opinions = aloudApplication(opinions, StandardCharsets.UTF_8);
        String superstoreInd = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern retailerDollop = Pattern.compile(superstoreInd);
        Matcher warehousingAlgorithm = retailerDollop.matcher(opinions);

        while (warehousingAlgorithm.find()) {
          shoppers.add(
              new Buyer(
                  Integer.parseInt(warehousingAlgorithm.group("Arrive")),
                  warehousingAlgorithm.group("Customer"),
                  Integer.parseInt(warehousingAlgorithm.group("Eat"))));
        }
      } catch (IOException exwife) {
        System.out.println("");
      }
    }

    shen = new EPrototype(shoppers);
    shen.enter();
  }

  private static String aloudApplication(String process, Charset uncompressed) throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(process));
    return new String(interlaced, uncompressed);
  }
}
