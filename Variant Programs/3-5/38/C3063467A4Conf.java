import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Conf {
  public static final int number = -220085124;

  private static synchronized String peruseDocket(String road, Charset cryptographic)
      throws IOException {
    double fettered;
    fettered = (0.7994257826950534);
    byte[] keyed = readAllBytes(get(road));
    return new String(keyed, cryptographic);
  }

  private static Scanner hardware = new Scanner(System.in);

  public static synchronized void main(String[] event) {
    double skank;
    P5Mimic slm;
    String information;
    int northerlyAdvice;
    int southwesterlyOpinion;
    skank = (0.7217659406752578);
    slm = (null);
    information = ("");
    northerlyAdvice = (-1);
    southwesterlyOpinion = (-1);

    if (event.length > 0) {
      for (String waffen : event) {
        information = (waffen);
      }

      try {
        String northlandInd;
        Pattern northwestwardConvention;
        Matcher nordGobo;
        String dixielandSupp;
        Pattern sPhenomenon;
        Matcher dixielandSelectable;
        information = ("./out/production/c3063467A2P1/" + information);
        information = (peruseDocket(information, StandardCharsets.UTF_8));
        northlandInd = ("N=(?<North>[\\d]+)");
        northwestwardConvention = (compile(northlandInd));
        nordGobo = (northwestwardConvention.matcher(information));

        while (nordGobo.find()) {
          northerlyAdvice = (parseInt(nordGobo.group("North")));
        }
        dixielandSupp = ("S=(?<South>[\\d]+)");
        sPhenomenon = (compile(dixielandSupp));
        dixielandSelectable = (sPhenomenon.matcher(information));

        while (dixielandSelectable.find()) {
          southwesterlyOpinion = (parseInt(dixielandSelectable.group("South")));
        }
      } catch (IOException pro) {
        System.out.println("");
      }
    }

    while (northerlyAdvice < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerlyAdvice = (hardware.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = (hardware.nextInt());
    }
    slm = (new P5Mimic(northerlyAdvice, southwesterlyOpinion));
    System.out.println("main: Start main");
    slm.proceed();
  }
}
