import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner emulator = new Scanner(System.in);

  public static synchronized void main(String[] handles) {
    JEmulator intelligent = null;
    String consultation = "";
    int northwestStimulus = -1;
    int southwestwardSubmissions = -1;

    if (handles.length > 0) {
      for (String ora : handles) {
        consultation = ora;
      }

      try {
        consultation = "./out/production/c3063467A2P1/" + consultation;
        consultation = interpretLodge(consultation, StandardCharsets.UTF_8);
        String northeasterlyYrs = "N=(?<North>[\\d]+)";
        Pattern northernFormula = Pattern.compile(northeasterlyYrs);
        Matcher northeasternAlgorithm = northernFormula.matcher(consultation);

        while (northeasternAlgorithm.find()) {
          northwestStimulus = Integer.parseInt(northeasternAlgorithm.group("North"));
        }
        String dixieInd = "S=(?<South>[\\d]+)";
        Pattern sPhenomenon = Pattern.compile(dixieInd);
        Matcher dixielandSelectable = sPhenomenon.matcher(consultation);

        while (dixielandSelectable.find()) {
          southwestwardSubmissions = Integer.parseInt(dixielandSelectable.group("South"));
        }
      } catch (IOException abe) {
        System.out.println("");
      }
    }

    while (northwestStimulus < 0 || southwestwardSubmissions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestStimulus = emulator.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestwardSubmissions = emulator.nextInt();
    }
    intelligent = new JEmulator(northwestStimulus, southwestwardSubmissions);
    System.out.println("main: Start main");
    intelligent.undertake();
  }

  private static synchronized String interpretLodge(String way, Charset code) throws IOException {
    byte[] decrypt = Files.readAllBytes(Paths.get(way));
    return new String(decrypt, code);
  }
}
