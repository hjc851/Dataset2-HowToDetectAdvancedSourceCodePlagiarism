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

  public static synchronized void main(String[] claims) {
    FImpactor ism;
    String consultation;
    int nordInvolvement;
    int southlandGuidance;
    consultation = ("");
    nordInvolvement = (-1);
    southlandGuidance = (-1);

    if (claims.length > 0) {
      for (String ora : claims) {
        consultation = (ora);
      }

      try {
        String septentrionKnowl;
        Pattern northwardsForm;
        Matcher northboundSinusoid;
        String southlandEmp;
        Pattern southeasterlyFigure;
        Matcher dixieConverter;
        consultation = ("./out/production/c3063467A2P1/" + consultation);
        consultation = (tellReadme(consultation, StandardCharsets.UTF_8));
        septentrionKnowl = ("N=(?<North>[\\d]+)");
        northwardsForm = (compile(septentrionKnowl));
        northboundSinusoid = (northwardsForm.matcher(consultation));

        while (northboundSinusoid.find()) {
          nordInvolvement = (parseInt(northboundSinusoid.group("North")));
        }
        southlandEmp = ("S=(?<South>[\\d]+)");
        southeasterlyFigure = (compile(southlandEmp));
        dixieConverter = (southeasterlyFigure.matcher(consultation));

        while (dixieConverter.find()) {
          southlandGuidance = (parseInt(dixieConverter.group("South")));
        }
      } catch (IOException officio) {
        System.out.println("");
      }
    }

    while (nordInvolvement < 0 || southlandGuidance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = (cabinet.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southlandGuidance = (cabinet.nextInt());
    }
    ism = (new FImpactor(nordInvolvement, southlandGuidance));
    System.out.println("main: Start main");
    ism.starts();
  }

  private static Scanner cabinet = new Scanner(System.in);

  private static synchronized String tellReadme(String trajectory, Charset codified)
      throws IOException {
    byte[] instantiated = readAllBytes(get(trajectory));
    return new String(instantiated, codified);
  }
}
