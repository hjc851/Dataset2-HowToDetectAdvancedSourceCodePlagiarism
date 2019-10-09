import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner cantilever = new Scanner(System.in);
  public static final double minimal = 0.22589391820916094;

  public static synchronized void main(String[] abscissa) {
    String generProducts;
    P4Mock smart;
    String stimulus;
    int northeasterlySupport;
    int sAssistance;
    generProducts = "he3fu8ezmnm";
    smart = null;
    stimulus = "";
    northeasterlySupport = -1;
    sAssistance = -1;

    if (abscissa.length > 0) {
      for (String fh : abscissa) {
        stimulus = fh;
      }

      try {
        String northwesternExperiment;
        Pattern northwardsForm;
        Matcher northernValidator;
        String southernmostExc;
        Pattern southwesternForm;
        Matcher dixieConverter;
        stimulus = "./out/production/c3063467A2P1/" + stimulus;
        stimulus = aloudApplication(stimulus, StandardCharsets.UTF_8);
        northwesternExperiment = "N=(?<North>[\\d]+)";
        northwardsForm = Pattern.compile(northwesternExperiment);
        northernValidator = northwardsForm.matcher(stimulus);

        while (northernValidator.find()) {
          northeasterlySupport = Integer.parseInt(northernValidator.group("North"));
        }
        southernmostExc = "S=(?<South>[\\d]+)";
        southwesternForm = Pattern.compile(southernmostExc);
        dixieConverter = southwesternForm.matcher(stimulus);

        while (dixieConverter.find()) {
          sAssistance = Integer.parseInt(dixieConverter.group("South"));
        }
      } catch (IOException past) {
        System.out.println("");
      }
    }

    while (northeasterlySupport < 0 || sAssistance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasterlySupport = cantilever.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      sAssistance = cantilever.nextInt();
    }
    smart = new P4Mock(northeasterlySupport, sAssistance);
    System.out.println("main: Start main");
    smart.commence();
  }

  public static synchronized String aloudApplication(String course, Charset cryptography)
      throws IOException {
    double critical;
    critical = 0.2775516721741117;
    byte[] stored = Files.readAllBytes(Paths.get(course));
    return new String(stored, cryptography);
  }
}
