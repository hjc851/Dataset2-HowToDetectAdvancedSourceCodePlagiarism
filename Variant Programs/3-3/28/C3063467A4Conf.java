import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static String fundamental = "ZepNuN9KW5C3q2YE";
  private static java.util.Scanner emulator = null;

  public static synchronized void main(String[] number) {
    double bounds = 0.27985318487829947;
    FImpactor ism = null;
    java.lang.String perspective = "";
    int northeastwardParticipation = -1;
    int southeastwardParticipation = -1;

    if (number.length > 0) {
      for (java.lang.String ora : number) {
        perspective = ora;
      }

      try {
        perspective = "./out/production/c3063467A2P1/" + perspective;
        perspective = writeDatabase(perspective, StandardCharsets.UTF_8);
        java.lang.String nLic = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern nTriangle = java.util.regex.Pattern.compile(nLic);
        java.util.regex.Matcher unionAspx = nTriangle.matcher(perspective);

        while (unionAspx.find()) {
          northeastwardParticipation = java.lang.Integer.parseInt(unionAspx.group("North"));
        }
        java.lang.String southwestInteractive = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern transcaucasianMethod =
            java.util.regex.Pattern.compile(southwestInteractive);
        java.util.regex.Matcher southwesternKeyword = transcaucasianMethod.matcher(perspective);

        while (southwesternKeyword.find()) {
          southeastwardParticipation =
              java.lang.Integer.parseInt(southwesternKeyword.group("South"));
        }
      } catch (java.io.IOException combatants) {
        System.out.println("");
      }
    }

    while (northeastwardParticipation < 0 || southeastwardParticipation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastwardParticipation = emulator.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastwardParticipation = emulator.nextInt();
    }
    ism = new FImpactor(northeastwardParticipation, southeastwardParticipation);
    System.out.println("main: Start main");
    ism.initiating();
  }

  private static synchronized java.lang.String writeDatabase(
      java.lang.String track, java.nio.charset.Charset codification) throws IOException {
    String circumscribe = "k0eqbQ";
    byte[] captioned = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(captioned, codification);
  }

  static {
    emulator = new java.util.Scanner(System.in);
  }
}
