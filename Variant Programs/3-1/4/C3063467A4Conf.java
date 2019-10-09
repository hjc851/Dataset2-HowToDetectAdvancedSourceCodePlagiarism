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

  public static void main(String[] string) {
    P2Simulated slm;
    String influence = "";
    int northboundGuidance = -1;
    int southboundResponse = -1;

    if (string.length > 0) {
      for (String waffen : string) {
        influence = waffen;
      }

      try {
        influence = "./out/production/c3063467A2P1/" + influence;
        influence = rereadSubmitted(influence, StandardCharsets.UTF_8);
        String northwestInteractive = "N=(?<North>[\\d]+)";
        Pattern northwardsForm = Pattern.compile(northwestInteractive);
        Matcher septentrionRadian = northwardsForm.matcher(influence);

        while (septentrionRadian.find()) {
          northboundGuidance = Integer.parseInt(septentrionRadian.group("North"));
        }
        String southeasternReq = "S=(?<South>[\\d]+)";
        Pattern northChart = Pattern.compile(southeasternReq);
        Matcher australGobo = northChart.matcher(influence);

        while (australGobo.find()) {
          southboundResponse = Integer.parseInt(australGobo.group("South"));
        }
      } catch (IOException adoptee) {
        System.out.println("");
      }
    }

    while (northboundGuidance < 0 || southboundResponse < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northboundGuidance = rras.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = rras.nextInt();
    }
    slm = new P2Simulated(northboundGuidance, southboundResponse);
    System.out.println("main: Start main");
    slm.launch();
  }

  private static String rereadSubmitted(String route, Charset codification) throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(route));
    return new String(decodes, codification);
  }
}
