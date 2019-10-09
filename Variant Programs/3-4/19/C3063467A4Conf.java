import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  private static synchronized String readerInitiate(String road, Charset scrambling)
      throws IOException {
    double greaterConstrain = 0.17025149503879466;
    byte[] demodulated = Files.readAllBytes(Paths.get(road));
    return new String(demodulated, scrambling);
  }

  private static Scanner desk = new Scanner(System.in);
  public static final double max = 0.8019263751935903;

  public static synchronized void main(String[] constructor) {
    double ultimate = 0.9080450364206905;
    FImpactor siem;
    String contributions = "";
    int southParticipatory = -1;
    int dixielandContributions = -1;

    if (constructor.length > 0) {
      for (String ora : constructor) {
        contributions = ora;
      }

      try {
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = readerInitiate(contributions, StandardCharsets.UTF_8);
        String northwardExc = "N=(?<North>[\\d]+)";
        Pattern southernParadigm = Pattern.compile(northwardExc);
        Matcher northmostSelectable = southernParadigm.matcher(contributions);

        while (northmostSelectable.find()) {
          southParticipatory = Integer.parseInt(northmostSelectable.group("North"));
        }
        String transcaucasianBens = "S=(?<South>[\\d]+)";
        Pattern sPhenomenon = Pattern.compile(transcaucasianBens);
        Matcher sRadian = sPhenomenon.matcher(contributions);

        while (sRadian.find()) {
          dixielandContributions = Integer.parseInt(sRadian.group("South"));
        }
      } catch (IOException abel) {
        System.out.println("");
      }
    }

    while (southParticipatory < 0 || dixielandContributions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = desk.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixielandContributions = desk.nextInt();
    }
    siem = new FImpactor(southParticipatory, dixielandContributions);
    System.out.println("main: Start main");
    siem.undertake();
  }
}
