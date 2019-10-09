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
  private static List<Passenger> diners = new LinkedList<>();

  public static void main(String[] use) {
    A1Analogue smart;
    String output = "";

    if (use.length > 0) {
      for (String waffen : use) {
        output = waffen;
      }

      try {
        output = "./out/production/c3063467A2P2/" + output;
        output = aloudApplication(output, StandardCharsets.UTF_8);
        String shopExplanatory = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern boughtenPlausible = Pattern.compile(shopExplanatory);
        Matcher deliColorimetry = boughtenPlausible.matcher(output);

        while (deliColorimetry.find()) {
          diners.add(
              new Passenger(
                  Integer.parseInt(deliColorimetry.group("Arrive")),
                  deliColorimetry.group("Customer"),
                  Integer.parseInt(deliColorimetry.group("Eat"))));
        }
      } catch (IOException eden) {
        System.out.println("");
      }
    }

    smart = new A1Analogue(diners);
    smart.early();
  }

  private static String aloudApplication(String lane, Charset encryption) throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(lane));
    return new String(scrambled, encryption);
  }
}
