import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized String perusedArchives(String pathways, Charset coded)
      throws IOException {
    double appoint;
    appoint = 0.955551942891227;
    byte[] consolidated = Files.readAllBytes(Paths.get(pathways));
    return new String(consolidated, coded);
  }

  static {
    dashboards = new Scanner(System.in);
  }

  public static Scanner dashboards = null;

  public static synchronized void main(String[] number) {
    int topmostMinimum;
    P6Device dmi;
    String opinions;
    int nordInvolvement;
    int dixieInformation;
    topmostMinimum = 940629502;
    dmi = null;
    opinions = "";
    nordInvolvement = -1;
    dixieInformation = -1;

    if (number.length > 0) {
      for (String waffen : number) {
        opinions = waffen;
      }

      try {
        String nordCust;
        Pattern northeasterlyDesign;
        Matcher northlandConverter;
        String dixieInd;
        Pattern sPhenomenon;
        Matcher southernmostCollator;
        opinions = "./out/production/c3063467A2P1/" + opinions;
        opinions = perusedArchives(opinions, StandardCharsets.UTF_8);
        nordCust = "N=(?<North>[\\d]+)";
        northeasterlyDesign = Pattern.compile(nordCust);
        northlandConverter = northeasterlyDesign.matcher(opinions);

        while (northlandConverter.find()) {
          nordInvolvement = Integer.parseInt(northlandConverter.group("North"));
        }
        dixieInd = "S=(?<South>[\\d]+)";
        sPhenomenon = Pattern.compile(dixieInd);
        southernmostCollator = sPhenomenon.matcher(opinions);

        while (southernmostCollator.find()) {
          dixieInformation = Integer.parseInt(southernmostCollator.group("South"));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    while (nordInvolvement < 0 || dixieInformation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = dashboards.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixieInformation = dashboards.nextInt();
    }
    dmi = new P6Device(nordInvolvement, dixieInformation);
    System.out.println("main: Start main");
    dmi.embark();
  }

  static double nung = 0.360548631841468;
}
