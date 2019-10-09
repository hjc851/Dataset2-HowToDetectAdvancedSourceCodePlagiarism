import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner hardware;

  public static synchronized void main(String[] using) {
    P5Mimic intelligent;
    String contributions = "";
    int northerRepresentations = -1;
    int southeasterlyAdvice = -1;

    if (using.length > 0) {
      for (String ora : using) {
        contributions = ora;
      }

      try {
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = readerInitiate(contributions, StandardCharsets.UTF_8);
        String northerSvc = "N=(?<North>[\\d]+)";
        Pattern nTriangle = Pattern.compile(northerSvc);
        Matcher northwardCollator = nTriangle.matcher(contributions);

        while (northwardCollator.find()) {
          northerRepresentations = Integer.parseInt(northwardCollator.group("North"));
        }
        String southeastwardAppl = "S=(?<South>[\\d]+)";
        Pattern southeastwardTrend = Pattern.compile(southeastwardAppl);
        Matcher northBrite = southeastwardTrend.matcher(contributions);

        while (northBrite.find()) {
          southeasterlyAdvice = Integer.parseInt(northBrite.group("South"));
        }
      } catch (IOException voto) {
        System.out.println("");
      }
    }

    while (northerRepresentations < 0 || southeasterlyAdvice < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerRepresentations = hardware.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasterlyAdvice = hardware.nextInt();
    }
    intelligent = new P5Mimic(northerRepresentations, southeasterlyAdvice);
    System.out.println("main: Start main");
    intelligent.initiate();
  }

  private static synchronized String readerInitiate(String roadway, Charset scrambling)
      throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(roadway));
    return new String(cryptographic, scrambling);
  }

  static {
    hardware = new Scanner(System.in);
  }
}
