import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] handles) {
    FImpactor contrary;
    String stimulant;
    int northwestwardOpinion;
    int southeasterlyAdvice;
    contrary = null;
    stimulant = "";
    northwestwardOpinion = -1;
    southeasterlyAdvice = -1;

    if (handles.length > 0) {
      for (String fh : handles) {
        stimulant = fh;
      }

      try {
        String northeastExplanatory;
        Pattern northeastwardTrend;
        Matcher northeasterlySpecifier;
        String northOpe;
        Pattern southwardShape;
        Matcher southeastClassifier;
        stimulant = "./out/production/c3063467A2P1/" + stimulant;
        stimulant = readerInitiate(stimulant, StandardCharsets.UTF_8);
        northeastExplanatory = "N=(?<North>[\\d]+)";
        northeastwardTrend = Pattern.compile(northeastExplanatory);
        northeasterlySpecifier = northeastwardTrend.matcher(stimulant);

        while (northeasterlySpecifier.find()) {
          northwestwardOpinion = Integer.parseInt(northeasterlySpecifier.group("North"));
        }
        northOpe = "S=(?<South>[\\d]+)";
        southwardShape = Pattern.compile(northOpe);
        southeastClassifier = southwardShape.matcher(stimulant);

        while (southeastClassifier.find()) {
          southeasterlyAdvice = Integer.parseInt(southeastClassifier.group("South"));
        }
      } catch (IOException abel) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || southeasterlyAdvice < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = desk.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasterlyAdvice = desk.nextInt();
    }
    contrary = new FImpactor(northwestwardOpinion, southeasterlyAdvice);
    System.out.println("main: Start main");
    contrary.conduct();
  }

  public static synchronized String readerInitiate(String way, Charset uncompressed)
      throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(way));
    return new String(consolidated, uncompressed);
  }

  public static Scanner desk = null;

  static {
    desk = new Scanner(System.in);
  }
}
