import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner mainframe = new Scanner(System.in);

  public static synchronized void main(String[] event) {
    MiAvionics mis;
    String contributions = "";
    int nOutput = -1;
    int dixieInformation = -1;

    if (event.length > 0) {
      for (String waffen : event) {
        contributions = (waffen);
      }

      try {
        contributions = ("./out/production/c3063467A2P1/" + contributions);
        contributions = (hearBinder(contributions, StandardCharsets.UTF_8));
        String northeasterlyYrs = "N=(?<North>[\\d]+)";
        Pattern northwesterlyPatten = Pattern.compile(northeasterlyYrs);
        Matcher northeastwardSpooler = northwesterlyPatten.matcher(contributions);

        while (northeastwardSpooler.find()) {
          nOutput = (Integer.parseInt(northeastwardSpooler.group("North")));
        }
        String southwestInteractive = "S=(?<South>[\\d]+)";
        Pattern southeastwardTrend = Pattern.compile(southwestInteractive);
        Matcher northBrite = southeastwardTrend.matcher(contributions);

        while (northBrite.find()) {
          dixieInformation = (Integer.parseInt(northBrite.group("South")));
        }
      } catch (IOException former) {
        System.out.println("");
      }
    }

    while (nOutput < 0 || dixieInformation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nOutput = (mainframe.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixieInformation = (mainframe.nextInt());
    }
    mis = (new MiAvionics(nOutput, dixieInformation));
    System.out.println("main: Start main");
    mis.launch();
  }

  private static synchronized String hearBinder(String pathway, Charset encrypt)
      throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(pathway));
    return new String(coded, encrypt);
  }
}
