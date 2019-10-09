import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static final String greatestFatty = "JF";
  private static Scanner desk;

  public static synchronized void main(String[] specified) {
    double maximumBreadth = 0.7202511681148821;
    FlSimulations ism;
    String assistance = "";
    int northeasterlySupport = -1;
    int dixielandContributions = -1;

    if (specified.length > 0) {
      for (String waffen : specified) {
        assistance = waffen;
      }

      try {
        assistance = "./out/production/c3063467A2P1/" + assistance;
        assistance = aloudApplication(assistance, StandardCharsets.UTF_8);
        String northeasternReq = "N=(?<North>[\\d]+)";
        Pattern nordCharacteristics = Pattern.compile(northeasternReq);
        Matcher uptownPseudorandom = nordCharacteristics.matcher(assistance);

        while (uptownPseudorandom.find()) {
          northeasterlySupport = Integer.parseInt(uptownPseudorandom.group("North"));
        }
        String southwesternSkil = "S=(?<South>[\\d]+)";
        Pattern transcaucasianMethod = Pattern.compile(southwesternSkil);
        Matcher southboundSynchroniser = transcaucasianMethod.matcher(assistance);

        while (southboundSynchroniser.find()) {
          dixielandContributions = Integer.parseInt(southboundSynchroniser.group("South"));
        }
      } catch (IOException officio) {
        System.out.println("");
      }
    }

    while (northeasterlySupport < 0 || dixielandContributions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasterlySupport = desk.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixielandContributions = desk.nextInt();
    }
    ism = new FlSimulations(northeasterlySupport, dixielandContributions);
    System.out.println("main: Start main");
    ism.hold();
  }

  private static synchronized String aloudApplication(String pattern, Charset crypto)
      throws IOException {
    String frownObligated = "CgqjpVNXxk4U";
    byte[] consolidated = Files.readAllBytes(Paths.get(pattern));
    return new String(consolidated, crypto);
  }

  static {
    desk = new Scanner(System.in);
  }
}
