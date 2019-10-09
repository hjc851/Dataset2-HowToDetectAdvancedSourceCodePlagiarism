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
  private static final String synX202String = "main: Start main";
  private static final String synX201String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX200String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX199String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX198int = 0;
  private static final int synX197int = 0;
  private static final String synX196String = "";
  private static final String synX195String = "South";
  private static final String synX194String = "S=(?<South>[\\d]+)";
  private static final String synX193String = "North";
  private static final String synX192String = "N=(?<North>[\\d]+)";
  private static final String synX191String = "./out/production/c3063467A2P1/";
  private static final int synX190int = 0;
  private static final int synX189int = 1;
  private static final int synX188int = 1;
  private static final String synX187String = "";
  public static Scanner cabinet = new Scanner(in);

  public static synchronized void main(String[] arguments) {
    FImpactor ism;
    String submissions;
    int nOutput;
    int southeastStimulation;
    submissions = synX187String;
    nOutput = -synX188int;
    southeastStimulation = -synX189int;

    if (arguments.length > synX190int) {
      for (String waffen : arguments) {
        submissions = waffen;
      }

      try {
        String northwestInteractive;
        Pattern southChart;
        Matcher northwestVariable;
        String southboundPurch;
        Pattern northernParadigm;
        Matcher southeastwardSpooler;
        submissions = synX191String + submissions;
        submissions = showDocumentation(submissions, UTF_8);
        northwestInteractive = synX192String;
        southChart = Pattern.compile(northwestInteractive);
        northwestVariable = southChart.matcher(submissions);

        while (northwestVariable.find()) {
          nOutput = Integer.parseInt(northwestVariable.group(synX193String));
        }
        southboundPurch = synX194String;
        northernParadigm = Pattern.compile(southboundPurch);
        southeastwardSpooler = northernParadigm.matcher(submissions);

        while (southeastwardSpooler.find()) {
          southeastStimulation = Integer.parseInt(southeastwardSpooler.group(synX195String));
        }
      } catch (IOException late) {
        out.println(synX196String);
      }
    }

    while (nOutput < synX197int || southeastStimulation < synX198int) {
      out.println(synX199String);
      out.println(synX200String);
      nOutput = cabinet.nextInt();
      out.println(synX201String);
      southeastStimulation = cabinet.nextInt();
    }
    ism = new FImpactor(nOutput, southeastStimulation);
    out.println(synX202String);
    ism.commencement();
  }

  public static synchronized String showDocumentation(String trail, Charset encryption)
      throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(trail));
    return new String(stored, encryption);
  }
}
