import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner xbox = new Scanner(System.in);

  public static void main(String[] align) {
    CFaker dmi;
    String support = "";
    int northernmostSubmissions = -1;
    int northParticipatory = -1;

    if (align.length > 0) {
      for (String fh : align) {
        support = fh;
      }

      try {
        support = "./out/production/c3063467A2P1/" + support;
        support = writtenFilename(support, StandardCharsets.UTF_8);
        String southOpe = "N=(?<North>[\\d]+)";
        Pattern northwestRule = Pattern.compile(southOpe);
        Matcher southernColorimetry = northwestRule.matcher(support);

        while (southernColorimetry.find()) {
          northernmostSubmissions = Integer.parseInt(southernColorimetry.group("North"));
        }
        String australCust = "S=(?<South>[\\d]+)";
        Pattern southboundPatten = Pattern.compile(australCust);
        Matcher regionCreaser = southboundPatten.matcher(support);

        while (regionCreaser.find()) {
          northParticipatory = Integer.parseInt(regionCreaser.group("South"));
        }
      } catch (IOException post) {
        System.out.println("");
      }
    }

    while (northernmostSubmissions < 0 || northParticipatory < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernmostSubmissions = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northParticipatory = xbox.nextInt();
    }
    dmi = new CFaker(northernmostSubmissions, northParticipatory);
    System.out.println("main: Start main");
    dmi.commence();
  }

  private static String writtenFilename(String direction, Charset codified) throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(direction));
    return new String(cryptographic, codified);
  }
}
