import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner cabinet = new java.util.Scanner(System.in);

  public static synchronized void main(String[] use) {
    InterferonPrototype ims;
    java.lang.String consultation;
    int northeastwardParticipation;
    int southwestStimulus;
    ims = null;
    consultation = "";
    northeastwardParticipation = -1;
    southwestStimulus = -1;

    if (use.length > 0) {
      for (java.lang.String fh : use) {
        consultation = fh;
      }

      try {
        java.lang.String northeasterlyYrs;
        java.util.regex.Pattern northeasterlyDesign;
        java.util.regex.Matcher septentrionRadian;
        java.lang.String southwestwardIndiv;
        java.util.regex.Pattern regionTemplate;
        java.util.regex.Matcher southernValidator;
        consultation = "./out/production/c3063467A2P1/" + consultation;
        consultation = registerSubmit(consultation, StandardCharsets.UTF_8);
        northeasterlyYrs = "N=(?<North>[\\d]+)";
        northeasterlyDesign = java.util.regex.Pattern.compile(northeasterlyYrs);
        septentrionRadian = northeasterlyDesign.matcher(consultation);

        while (septentrionRadian.find()) {
          northeastwardParticipation = java.lang.Integer.parseInt(septentrionRadian.group("North"));
        }
        southwestwardIndiv = "S=(?<South>[\\d]+)";
        regionTemplate = java.util.regex.Pattern.compile(southwestwardIndiv);
        southernValidator = regionTemplate.matcher(consultation);

        while (southernValidator.find()) {
          southwestStimulus = java.lang.Integer.parseInt(southernValidator.group("South"));
        }
      } catch (java.io.IOException late) {
        System.out.println("");
      }
    }

    while (northeastwardParticipation < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastwardParticipation = cabinet.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = cabinet.nextInt();
    }
    ims = new InterferonPrototype(northeastwardParticipation, southwestStimulus);
    System.out.println("main: Start main");
    ims.commence();
  }

  private static synchronized java.lang.String registerSubmit(
      java.lang.String track, java.nio.charset.Charset cryptographic) throws IOException {
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(demodulated, cryptographic);
  }
}
