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
  private static List<Tenant> subscribers = new LinkedList<>();

  public static void main(String[] param) {
    GAvionics ism;
    String response = "";

    if (param.length > 0) {
      for (String ora : param) {
        response = ora;
      }

      try {
        response = "./out/production/c3063467A2P2/" + response;
        response = rereadSubmitted(response, StandardCharsets.UTF_8);
        String warehousingReq = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern stowTap = Pattern.compile(warehousingReq);
        Matcher warehousingAlgorithm = stowTap.matcher(response);

        while (warehousingAlgorithm.find()) {
          subscribers.add(
              new Tenant(
                  Integer.parseInt(warehousingAlgorithm.group("Arrive")),
                  warehousingAlgorithm.group("Customer"),
                  Integer.parseInt(warehousingAlgorithm.group("Eat"))));
        }
      } catch (IOException aba) {
        System.out.println("");
      }
    }

    ism = new GAvionics(subscribers);
    ism.initiate();
  }

  private static String rereadSubmitted(String road, Charset codified) throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(road));
    return new String(captioned, codified);
  }
}
