import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner rras = new Scanner(System.in);

  public static void main(String[] create) {
    P4Mock shum;
    String participation = "";
    int northboundGuidance = -1;
    int southwesternSuggestions = -1;

    if (create.length > 0) {
      for (String ora : create) {
        participation = ora;
      }

      try {
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = interpretLodge(participation, StandardCharsets.UTF_8);
        String northmostSupp = "N=(?<North>[\\d]+)";
        Pattern northwestRule = Pattern.compile(northmostSupp);
        Matcher septentrionRadian = northwestRule.matcher(participation);

        while (septentrionRadian.find()) {
          northboundGuidance = Integer.parseInt(septentrionRadian.group("North"));
        }
        String southeasterlyEquiv = "S=(?<South>[\\d]+)";
        Pattern sPhenomenon = Pattern.compile(southeasterlyEquiv);
        Matcher southlandSinusoid = sPhenomenon.matcher(participation);

        while (southlandSinusoid.find()) {
          southwesternSuggestions = Integer.parseInt(southlandSinusoid.group("South"));
        }
      } catch (IOException pro) {
        System.out.println("");
      }
    }

    while (northboundGuidance < 0 || southwesternSuggestions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northboundGuidance = rras.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesternSuggestions = rras.nextInt();
    }
    shum = new P4Mock(northboundGuidance, southwesternSuggestions);
    System.out.println("main: Start main");
    shum.inaugurate();
  }

  private static String interpretLodge(String ride, Charset metadata) throws IOException {
    byte[] formatted = Files.readAllBytes(Paths.get(ride));
    return new String(formatted, metadata);
  }
}
