import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner emulator = new Scanner(System.in);

  public static synchronized void main(String[] ae) {
    PtDemo sem = null;
    String information = "";
    int northlandInformation = -1;
    int southwestwardSubmissions = -1;

    if (ae.length > 0) {
      for (String fh : ae) {
        information = fh;
      }

      try {
        information = "./out/production/c3063467A2P1/" + information;
        information = perusedArchives(information, StandardCharsets.UTF_8);
        String regionResp = "N=(?<North>[\\d]+)";
        Pattern northwardNormal = Pattern.compile(regionResp);
        Matcher regionEpilator = northwardNormal.matcher(information);

        while (regionEpilator.find()) {
          northlandInformation = Integer.parseInt(regionEpilator.group("North"));
        }
        String northernPlu = "S=(?<South>[\\d]+)";
        Pattern southeasterlyFigure = Pattern.compile(northernPlu);
        Matcher meridionalEpilator = southeasterlyFigure.matcher(information);

        while (meridionalEpilator.find()) {
          southwestwardSubmissions = Integer.parseInt(meridionalEpilator.group("South"));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || southwestwardSubmissions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = emulator.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestwardSubmissions = emulator.nextInt();
    }
    sem = new PtDemo(northlandInformation, southwestwardSubmissions);
    System.out.println("main: Start main");
    sem.opens();
  }

  public static synchronized String perusedArchives(String process, Charset scrambling)
      throws IOException {
    byte[] transmit = Files.readAllBytes(Paths.get(process));
    return new String(transmit, scrambling);
  }
}
