import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner cantilever = new java.util.Scanner(System.in);

  public static synchronized void main(String[] ae) {
    GSim mie;
    java.lang.String support = "";
    int northwardsSuggestions = -1;
    int northParticipatory = -1;

    if (ae.length > 0) {
      for (java.lang.String ora : ae) {
        support = ora;
      }

      try {
        support = "./out/production/c3063467A2P1/" + support;
        support = peruseDocket(support, StandardCharsets.UTF_8);
        java.lang.String southOpe = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern regionBehavior = java.util.regex.Pattern.compile(southOpe);
        java.util.regex.Matcher nRandomizer = regionBehavior.matcher(support);

        while (nRandomizer.find()) {
          northwardsSuggestions = java.lang.Integer.parseInt(nRandomizer.group("North"));
        }
        java.lang.String southeasternReq = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern confederacyNorm = java.util.regex.Pattern.compile(southeasternReq);
        java.util.regex.Matcher southeastwardSpooler = confederacyNorm.matcher(support);

        while (southeastwardSpooler.find()) {
          northParticipatory = java.lang.Integer.parseInt(southeastwardSpooler.group("South"));
        }
      } catch (java.io.IOException late) {
        System.out.println("");
      }
    }

    while (northwardsSuggestions < 0 || northParticipatory < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwardsSuggestions = cantilever.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northParticipatory = cantilever.nextInt();
    }
    mie = new GSim(northwardsSuggestions, northParticipatory);
    System.out.println("main: Start main");
    mie.initiating();
  }

  private static synchronized java.lang.String peruseDocket(
      java.lang.String course, java.nio.charset.Charset metadata) throws IOException {
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(course));
    return new java.lang.String(formatted, metadata);
  }
}
