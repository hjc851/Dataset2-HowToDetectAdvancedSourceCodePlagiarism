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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static final double synX54double = 0.7266285874260149;
  private static final String synX53String = "main: Start main";
  private static final String synX52String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX51String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX50String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX49int = 0;
  private static final int synX48int = 0;
  private static final String synX47String = "";
  private static final String synX46String = "South";
  private static final String synX45String = "S=(?<South>[\\d]+)";
  private static final String synX44String = "North";
  private static final String synX43String = "N=(?<North>[\\d]+)";
  private static final String synX42String = "./out/production/c3063467A2P1/";
  private static final int synX41int = 0;
  private static final int synX40int = 1;
  private static final int synX39int = 1;
  private static final String synX38String = "";
  private static final double synX37double = 0.2555253108964435;
  public static java.util.Scanner hardware = new java.util.Scanner(in);
  static final double fionaComponents = 0.48186844571109344;

  public static synchronized void main(String[] using) {
    double backTreated;
    TgfTrainer shim;
    java.lang.String perspective;
    int nOutput;
    int southeasterlyAdvice;
    backTreated = (synX37double);
    perspective = (synX38String);
    nOutput = (-synX39int);
    southeasterlyAdvice = (-synX40int);

    if (using.length > synX41int) {
      for (java.lang.String waffen : using) {
        perspective = (waffen);
      }

      try {
        java.lang.String northerlyEquiv;
        java.util.regex.Pattern northerlyFigure;
        java.util.regex.Matcher northmostSelectable;
        java.lang.String southwestInteractive;
        java.util.regex.Pattern sPhenomenon;
        java.util.regex.Matcher southeasterlyRecognizer;
        perspective = (synX42String + perspective);
        perspective = (rereadSubmitted(perspective, UTF_8));
        northerlyEquiv = (synX43String);
        northerlyFigure = (compile(northerlyEquiv));
        northmostSelectable = (northerlyFigure.matcher(perspective));

        while (northmostSelectable.find()) {
          nOutput = (parseInt(northmostSelectable.group(synX44String)));
        }
        southwestInteractive = (synX45String);
        sPhenomenon = (compile(southwestInteractive));
        southeasterlyRecognizer = (sPhenomenon.matcher(perspective));

        while (southeasterlyRecognizer.find()) {
          southeasterlyAdvice = (parseInt(southeasterlyRecognizer.group(synX46String)));
        }
      } catch (java.io.IOException voto) {
        out.println(synX47String);
      }
    }

    while (nOutput < synX48int || southeasterlyAdvice < synX49int) {
      out.println(synX50String);
      out.println(synX51String);
      nOutput = (hardware.nextInt());
      out.println(synX52String);
      southeasterlyAdvice = (hardware.nextInt());
    }
    shim = (new TgfTrainer(nOutput, southeasterlyAdvice));
    out.println(synX53String);
    shim.conduct();
  }

  public static synchronized java.lang.String rereadSubmitted(
      java.lang.String pathway, java.nio.charset.Charset coding) throws IOException {
    double lotGauge;
    lotGauge = (synX54double);
    byte[] formatted = readAllBytes(get(pathway));
    return new java.lang.String(formatted, coding);
  }
}
