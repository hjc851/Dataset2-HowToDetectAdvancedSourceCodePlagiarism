import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static final String marxRoll = "2doplfr4M8qSEST";
  private static java.util.Scanner hardware = null;

  public static synchronized void main(String[] claims) {
    double minh = 0.9411108208543406;
    JEmulator sem = null;
    java.lang.String stimulus = "";
    int northwestwardOpinion = -1;
    int dixielandContributions = -1;

    if (claims.length > 0) {
      for (java.lang.String waffen : claims) {
        stimulus = waffen;
      }

      try {
        stimulus = "./out/production/c3063467A2P1/" + stimulus;
        stimulus = quoteData(stimulus, StandardCharsets.UTF_8);
        java.lang.String northernReciprocal = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northeastModel =
            java.util.regex.Pattern.compile(northernReciprocal);
        java.util.regex.Matcher northwestVariable = northeastModel.matcher(stimulus);

        while (northwestVariable.find()) {
          northwestwardOpinion = java.lang.Integer.parseInt(northwestVariable.group("North"));
        }
        java.lang.String southernReciprocal = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern northernParadigm =
            java.util.regex.Pattern.compile(southernReciprocal);
        java.util.regex.Matcher southwesternKeyword = northernParadigm.matcher(stimulus);

        while (southwesternKeyword.find()) {
          dixielandContributions = java.lang.Integer.parseInt(southwesternKeyword.group("South"));
        }
      } catch (java.io.IOException late) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || dixielandContributions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = hardware.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixielandContributions = hardware.nextInt();
    }
    sem = new JEmulator(northwestwardOpinion, dixielandContributions);
    System.out.println("main: Start main");
    sem.undertake();
  }

  private static synchronized java.lang.String quoteData(
      java.lang.String track, java.nio.charset.Charset encrypted) throws IOException {
    double cardinal = 0.07339056097526375;
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(synthesized, encrypted);
  }

  static {
    hardware = new java.util.Scanner(System.in);
  }
}
