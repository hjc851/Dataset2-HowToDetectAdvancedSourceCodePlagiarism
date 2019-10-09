import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static {
    soothe = new Scanner(System.in);
  }

  public static synchronized String registerSubmit(String roadway, Charset encrypted)
      throws IOException {
    String nominate;
    nominate = "6QeGJeq6vZbW";
    byte[] codified = Files.readAllBytes(Paths.get(roadway));
    return new String(codified, encrypted);
  }

  public static Scanner soothe;

  public static synchronized void main(String[] create) {
    String tedAccessories;
    PiManikin dvs;
    String suggestions;
    int northernStimulant;
    int southeasternConsultation;
    tedAccessories = "X4KXLgZ9rkrAa";
    suggestions = "";
    northernStimulant = -1;
    southeasternConsultation = -1;

    if (create.length > 0) {
      for (String ora : create) {
        suggestions = ora;
      }

      try {
        String northlandInd;
        Pattern northwesternShape;
        Matcher northernValidator;
        String southeastwardAppl;
        Pattern northernParadigm;
        Matcher southwesterlyVerifier;
        suggestions = "./out/production/c3063467A2P1/" + suggestions;
        suggestions = registerSubmit(suggestions, StandardCharsets.UTF_8);
        northlandInd = "N=(?<North>[\\d]+)";
        northwesternShape = Pattern.compile(northlandInd);
        northernValidator = northwesternShape.matcher(suggestions);

        while (northernValidator.find()) {
          northernStimulant = Integer.parseInt(northernValidator.group("North"));
        }
        southeastwardAppl = "S=(?<South>[\\d]+)";
        northernParadigm = Pattern.compile(southeastwardAppl);
        southwesterlyVerifier = northernParadigm.matcher(suggestions);

        while (southwesterlyVerifier.find()) {
          southeasternConsultation = Integer.parseInt(southwesterlyVerifier.group("South"));
        }
      } catch (IOException abel) {
        System.out.println("");
      }
    }

    while (northernStimulant < 0 || southeasternConsultation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernStimulant = soothe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasternConsultation = soothe.nextInt();
    }
    dvs = new PiManikin(northernStimulant, southeasternConsultation);
    System.out.println("main: Start main");
    dvs.come();
  }

  public static double distinguish = 0.10338958027110001;
}
