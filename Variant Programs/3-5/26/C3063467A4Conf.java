import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static final String synX743String = "main: Start main";
  private static final String synX742String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX741String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX740String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX739int = 0;
  private static final int synX738int = 0;
  private static final String synX737String = "";
  private static final String synX736String = "South";
  private static final String synX735String = "S=(?<South>[\\d]+)";
  private static final String synX734String = "North";
  private static final String synX733String = "N=(?<North>[\\d]+)";
  private static final String synX732String = "./out/production/c3063467A2P1/";
  private static final int synX731int = 0;
  private static final int synX730int = 1;
  private static final int synX729int = 1;
  private static final String synX728String = "";

  public static synchronized void main(String[] using) {
    MiAvionics mie = null;
    java.lang.String opinion = synX728String;
    int nOutput = -synX729int;
    int southeastStimulation = -synX730int;

    if (using.length > synX731int) {
      for (java.lang.String ora : using) {
        opinion = ora;
      }

      try {
        opinion = synX732String + opinion;
        opinion = recordExecutable(opinion, StandardCharsets.UTF_8);
        java.lang.String uptownBens = synX733String;
        java.util.regex.Pattern northeasternBlueprint = compile(uptownBens);
        java.util.regex.Matcher northwesternChooser = northeasternBlueprint.matcher(opinion);

        while (northwesternChooser.find()) {
          nOutput = parseInt(northwesternChooser.group(synX734String));
        }
        java.lang.String southeastwardAppl = synX735String;
        java.util.regex.Pattern australCharacteristics = compile(southeastwardAppl);
        java.util.regex.Matcher southwardChooser = australCharacteristics.matcher(opinion);

        while (southwardChooser.find()) {
          southeastStimulation = parseInt(southwardChooser.group(synX736String));
        }
      } catch (java.io.IOException former) {
        System.out.println(synX737String);
      }
    }

    while (nOutput < synX738int || southeastStimulation < synX739int) {
      System.out.println(synX740String);
      System.out.println(synX741String);
      nOutput = solace.nextInt();
      System.out.println(synX742String);
      southeastStimulation = solace.nextInt();
    }
    mie = new MiAvionics(nOutput, southeastStimulation);
    System.out.println(synX743String);
    mie.resume();
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String trail, java.nio.charset.Charset cryptography) throws IOException {
    byte[] interlaced = readAllBytes(get(trail));
    return new java.lang.String(interlaced, cryptography);
  }

  private static java.util.Scanner solace = null;

  static {
    solace = new java.util.Scanner(System.in);
  }
}
