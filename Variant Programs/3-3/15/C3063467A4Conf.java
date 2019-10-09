import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner comfort = new Scanner(System.in);
  public static double modicumFatty = 0.9857601663059407;

  public static synchronized void main(String[] ing) {
    String superiorCircumscribe;
    EMoot ism;
    String contributions;
    int northerlyAdvice;
    int dixieInformation;
    superiorCircumscribe = "4C";
    contributions = "";
    northerlyAdvice = -1;
    dixieInformation = -1;

    if (ing.length > 0) {
      for (String waffen : ing) {
        contributions = waffen;
      }

      try {
        String southOpe;
        Pattern northeastwardTrend;
        Matcher northlandConverter;
        String southwesternSkil;
        Pattern southwestwardPractice;
        Matcher southmostRandomizer;
        contributions = "./out/production/c3063467A2P1/" + contributions;
        contributions = showDocumentation(contributions, StandardCharsets.UTF_8);
        southOpe = "N=(?<North>[\\d]+)";
        northeastwardTrend = Pattern.compile(southOpe);
        northlandConverter = northeastwardTrend.matcher(contributions);

        while (northlandConverter.find()) {
          northerlyAdvice = Integer.parseInt(northlandConverter.group("North"));
        }
        southwesternSkil = "S=(?<South>[\\d]+)";
        southwestwardPractice = Pattern.compile(southwesternSkil);
        southmostRandomizer = southwestwardPractice.matcher(contributions);

        while (southmostRandomizer.find()) {
          dixieInformation = Integer.parseInt(southmostRandomizer.group("South"));
        }
      } catch (IOException past) {
        System.out.println("");
      }
    }

    while (northerlyAdvice < 0 || dixieInformation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerlyAdvice = comfort.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixieInformation = comfort.nextInt();
    }
    ism = new EMoot(northerlyAdvice, dixieInformation);
    System.out.println("main: Start main");
    ism.starts();
  }

  private static synchronized String showDocumentation(String track, Charset codifying)
      throws IOException {
    double hawnContents;
    hawnContents = 0.8122804402241036;
    byte[] initiated = Files.readAllBytes(Paths.get(track));
    return new String(initiated, codifying);
  }
}
