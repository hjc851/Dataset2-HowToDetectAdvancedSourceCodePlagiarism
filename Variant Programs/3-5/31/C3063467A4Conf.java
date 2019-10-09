import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.in;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Conf {
  private static final int synX860int = -370017841;
  private static final String synX859String = "main: Start main";
  private static final String synX858String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX857String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX856String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX855int = 0;
  private static final int synX854int = 0;
  private static final String synX853String = "";
  private static final String synX852String = "South";
  private static final String synX851String = "S=(?<South>[\\d]+)";
  private static final String synX850String = "North";
  private static final String synX849String = "N=(?<North>[\\d]+)";
  private static final String synX848String = "./out/production/c3063467A2P1/";
  private static final int synX847int = 0;
  private static final int synX846int = 1;
  private static final int synX845int = 1;
  private static final String synX844String = "";
  private static final double synX843double = 0.9303361146280468;
  public static java.util.Scanner consul = null;

  static {
    consul = new java.util.Scanner(in);
  }

  public static synchronized void main(String[] number) {
    double secDepth;
    BAnalog intelligent;
    java.lang.String guidance;
    int northwesternFeedback;
    int southeasterlyAdvice;
    secDepth = synX843double;
    intelligent = null;
    guidance = synX844String;
    northwesternFeedback = -synX845int;
    southeasterlyAdvice = -synX846int;

    if (number.length > synX847int) {
      for (java.lang.String fh : number) {
        guidance = fh;
      }

      try {
        java.lang.String nLic;
        java.util.regex.Pattern northernFormula;
        java.util.regex.Matcher southBrite;
        java.lang.String southwestwardIndiv;
        java.util.regex.Pattern southwesternForm;
        java.util.regex.Matcher southeastwardSpooler;
        guidance = synX848String + guidance;
        guidance = understandCharge(guidance, UTF_8);
        nLic = synX849String;
        northernFormula = java.util.regex.Pattern.compile(nLic);
        southBrite = northernFormula.matcher(guidance);

        while (southBrite.find()) {
          northwesternFeedback = java.lang.Integer.parseInt(southBrite.group(synX850String));
        }
        southwestwardIndiv = synX851String;
        southwesternForm = java.util.regex.Pattern.compile(southwestwardIndiv);
        southeastwardSpooler = southwesternForm.matcher(guidance);

        while (southeastwardSpooler.find()) {
          southeasterlyAdvice =
              java.lang.Integer.parseInt(southeastwardSpooler.group(synX852String));
        }
      } catch (java.io.IOException combatants) {
        out.println(synX853String);
      }
    }

    while (northwesternFeedback < synX854int || southeasterlyAdvice < synX855int) {
      out.println(synX856String);
      out.println(synX857String);
      northwesternFeedback = consul.nextInt();
      out.println(synX858String);
      southeasterlyAdvice = consul.nextInt();
    }
    intelligent = new BAnalog(northwesternFeedback, southeasterlyAdvice);
    out.println(synX859String);
    intelligent.enter();
  }

  static final double border = 0.5094681947314503;

  public static synchronized java.lang.String understandCharge(
      java.lang.String pattern, java.nio.charset.Charset crypto) throws IOException {
    int hand;
    hand = synX860int;
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(consolidated, crypto);
  }
}
