import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static {
    comfort = new Scanner(System.in);
  }

  public static synchronized void main(String[] align) {
    P3Simulating siem;
    String participation;
    int nordInvolvement;
    int southwestwardSubmissions;
    participation = "";
    nordInvolvement = -1;
    southwestwardSubmissions = -1;

    if (align.length > 0) {
      for (String waffen : align) {
        participation = waffen;
      }

      try {
        String nordCust;
        Pattern southernParadigm;
        Matcher regionEpilator;
        String southernReciprocal;
        Pattern southwardShape;
        Matcher southernValidator;
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = takeDocument(participation, StandardCharsets.UTF_8);
        nordCust = "N=(?<North>[\\d]+)";
        southernParadigm = Pattern.compile(nordCust);
        regionEpilator = southernParadigm.matcher(participation);

        while (regionEpilator.find()) {
          nordInvolvement = Integer.parseInt(regionEpilator.group("North"));
        }
        southernReciprocal = "S=(?<South>[\\d]+)";
        southwardShape = Pattern.compile(southernReciprocal);
        southernValidator = southwardShape.matcher(participation);

        while (southernValidator.find()) {
          southwestwardSubmissions = Integer.parseInt(southernValidator.group("South"));
        }
      } catch (IOException pro) {
        System.out.println("");
      }
    }

    while (nordInvolvement < 0 || southwestwardSubmissions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = comfort.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestwardSubmissions = comfort.nextInt();
    }
    siem = new P3Simulating(nordInvolvement, southwestwardSubmissions);
    System.out.println("main: Start main");
    siem.hold();
  }

  public static Scanner comfort;

  public static synchronized String takeDocument(String progression, Charset encrypt)
      throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(progression));
    return new String(captioned, encrypt);
  }
}
