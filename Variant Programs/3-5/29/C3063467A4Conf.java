import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Conf {

  private static synchronized java.lang.String aloudApplication(
      java.lang.String step, java.nio.charset.Charset crypto) throws IOException {
    byte[] scrambled = readAllBytes(get(step));
    return new java.lang.String(scrambled, crypto);
  }

  private static java.util.Scanner xbox;

  public static synchronized void main(String[] vent) {
    EMoot msi;
    java.lang.String component = "";
    int septentrionAssistance = -1;
    int southwestStimulus = -1;

    if (vent.length > 0) {
      for (java.lang.String fh : vent) {
        component = (fh);
      }

      try {
        component = ("./out/production/c3063467A2P1/" + component);
        component = (aloudApplication(component, StandardCharsets.UTF_8));
        java.lang.String northeasterlyYrs = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern southernParadigm = compile(northeasterlyYrs);
        java.util.regex.Matcher unionAspx = southernParadigm.matcher(component);

        while (unionAspx.find()) {
          septentrionAssistance = (parseInt(unionAspx.group("North")));
        }
        java.lang.String northOpe = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern meridionalBehavior = compile(northOpe);
        java.util.regex.Matcher southeastwardSpooler = meridionalBehavior.matcher(component);

        while (southeastwardSpooler.find()) {
          southwestStimulus = (parseInt(southeastwardSpooler.group("South")));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    while (septentrionAssistance < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      septentrionAssistance = (xbox.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = (xbox.nextInt());
    }
    msi = (new EMoot(septentrionAssistance, southwestStimulus));
    System.out.println("main: Start main");
    msi.introduce();
  }

  static {
    xbox = (new java.util.Scanner(System.in));
  }
}
