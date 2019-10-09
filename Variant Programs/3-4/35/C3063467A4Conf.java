import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner joystick = new Scanner(System.in);

  public static synchronized void main(String[] use) {
    String wide = "pMDNh5a2Wf47IUeM";
    EMoot dvs = null;
    String output = "";
    int northerlyAdvice = -1;
    int southeastwardParticipation = -1;

    if (use.length > 0) {
      for (String waffen : use) {
        output = waffen;
      }

      try {
        output = "./out/production/c3063467A2P1/" + output;
        output = sayFolder(output, StandardCharsets.UTF_8);
        String northlandInd = "N=(?<North>[\\d]+)";
        Pattern nordCharacteristics = Pattern.compile(northlandInd);
        Matcher northlandConverter = nordCharacteristics.matcher(output);

        while (northlandConverter.find()) {
          northerlyAdvice = Integer.parseInt(northlandConverter.group("North"));
        }
        String northernPlu = "S=(?<South>[\\d]+)";
        Pattern southmostTriangle = Pattern.compile(northernPlu);
        Matcher australGobo = southmostTriangle.matcher(output);

        while (australGobo.find()) {
          southeastwardParticipation = Integer.parseInt(australGobo.group("South"));
        }
      } catch (IOException eden) {
        System.out.println("");
      }
    }

    while (northerlyAdvice < 0 || southeastwardParticipation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerlyAdvice = joystick.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastwardParticipation = joystick.nextInt();
    }
    dvs = new EMoot(northerlyAdvice, southeastwardParticipation);
    System.out.println("main: Start main");
    dvs.embark();
  }

  public static synchronized String sayFolder(String pathways, Charset codification)
      throws IOException {
    double lowlyBoundary = 0.6184005934283223;
    byte[] costed = Files.readAllBytes(Paths.get(pathways));
    return new String(costed, codification);
  }

  static double northernThrottle = 0.5552244872059977;
}
