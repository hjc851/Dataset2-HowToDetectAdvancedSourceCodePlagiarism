import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner consul = new Scanner(System.in);

  public static synchronized void main(String[] param) {
    P2Simulated dmi;
    String component;
    int northmostContributions;
    int confederacyPerspective;
    component = "";
    northmostContributions = -1;
    confederacyPerspective = -1;

    if (param.length > 0) {
      for (String ora : param) {
        component = ora;
      }

      try {
        String northwesternExperiment;
        Pattern northwardNormal;
        Matcher regionEpilator;
        String southerlyYrs;
        Pattern sPhenomenon;
        Matcher confederacyAspx;
        component = "./out/production/c3063467A2P1/" + component;
        component = aloudApplication(component, StandardCharsets.UTF_8);
        northwesternExperiment = "N=(?<North>[\\d]+)";
        northwardNormal = Pattern.compile(northwesternExperiment);
        regionEpilator = northwardNormal.matcher(component);

        while (regionEpilator.find()) {
          northmostContributions = Integer.parseInt(regionEpilator.group("North"));
        }
        southerlyYrs = "S=(?<South>[\\d]+)";
        sPhenomenon = Pattern.compile(southerlyYrs);
        confederacyAspx = sPhenomenon.matcher(component);

        while (confederacyAspx.find()) {
          confederacyPerspective = Integer.parseInt(confederacyAspx.group("South"));
        }
      } catch (IOException afterwards) {
        System.out.println("");
      }
    }

    while (northmostContributions < 0 || confederacyPerspective < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northmostContributions = consul.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      confederacyPerspective = consul.nextInt();
    }
    dmi = new P2Simulated(northmostContributions, confederacyPerspective);
    System.out.println("main: Start main");
    dmi.embark();
  }

  private static synchronized String aloudApplication(String track, Charset encrypting)
      throws IOException {
    byte[] decrypt = Files.readAllBytes(Paths.get(track));
    return new String(decrypt, encrypting);
  }
}
