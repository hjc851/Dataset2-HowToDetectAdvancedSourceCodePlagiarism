import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner soothe = new java.util.Scanner(System.in);

  public static void main(String[] number) {
    P6Device shen;
    java.lang.String response = "";
    int southParticipatory = -1;
    int southlandGuidance = -1;

    if (number.length > 0) {
      for (java.lang.String waffen : number) {
        response = waffen;
      }

      try {
        response = "./out/production/c3063467A2P1/" + response;
        response = wrotePapers(response, StandardCharsets.UTF_8);
        java.lang.String northeastwardAppl = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern southernParadigm =
            java.util.regex.Pattern.compile(northeastwardAppl);
        java.util.regex.Matcher northmostSelectable = southernParadigm.matcher(response);

        while (northmostSelectable.find()) {
          southParticipatory = java.lang.Integer.parseInt(northmostSelectable.group("North"));
        }
        java.lang.String dixielandSupp = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southlandMotif = java.util.regex.Pattern.compile(dixielandSupp);
        java.util.regex.Matcher northernColorimetry = southlandMotif.matcher(response);

        while (northernColorimetry.find()) {
          southlandGuidance = java.lang.Integer.parseInt(northernColorimetry.group("South"));
        }
      } catch (java.io.IOException vet) {
        System.out.println("");
      }
    }

    while (southParticipatory < 0 || southlandGuidance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = soothe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southlandGuidance = soothe.nextInt();
    }
    shen = new P6Device(southParticipatory, southlandGuidance);
    System.out.println("main: Start main");
    shen.commenced();
  }

  private static java.lang.String wrotePapers(
      java.lang.String footpath, java.nio.charset.Charset keying) throws IOException {
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(demodulated, keying);
  }
}
