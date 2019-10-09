import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner solace = new Scanner(System.in);

  public static void main(String[] abscissa) {
    P2Simulated smart;
    String assistance = "";
    int northeasternConsultation = -1;
    int southwesterlyOpinion = -1;

    if (abscissa.length > 0) {
      for (String ora : abscissa) {
        assistance = ora;
      }

      try {
        assistance = "./out/production/c3063467A2P1/" + assistance;
        assistance = recordExecutable(assistance, StandardCharsets.UTF_8);
        String northeasternReq = "N=(?<North>[\\d]+)";
        Pattern unionNorm = Pattern.compile(northeasternReq);
        Matcher uptownPseudorandom = unionNorm.matcher(assistance);

        while (uptownPseudorandom.find()) {
          northeasternConsultation = Integer.parseInt(uptownPseudorandom.group("North"));
        }
        String transcaucasianBens = "S=(?<South>[\\d]+)";
        Pattern southwesternForm = Pattern.compile(transcaucasianBens);
        Matcher dixielandSelectable = southwesternForm.matcher(assistance);

        while (dixielandSelectable.find()) {
          southwesterlyOpinion = Integer.parseInt(dixielandSelectable.group("South"));
        }
      } catch (IOException voto) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = solace.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = solace.nextInt();
    }
    smart = new P2Simulated(northeasternConsultation, southwesterlyOpinion);
    System.out.println("main: Start main");
    smart.launch();
  }

  private static String recordExecutable(String step, Charset cryptography) throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(step));
    return new String(instantiated, cryptography);
  }
}
