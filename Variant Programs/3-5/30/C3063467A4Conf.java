import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static final double synX803double = 0.6615145475218954;
  private static final String synX802String = "main: Start main";
  private static final String synX801String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX800String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX799String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX798int = 0;
  private static final int synX797int = 0;
  private static final String synX796String = "";
  private static final String synX795String = "South";
  private static final String synX794String = "S=(?<South>[\\d]+)";
  private static final String synX793String = "North";
  private static final String synX792String = "N=(?<North>[\\d]+)";
  private static final String synX791String = "./out/production/c3063467A2P1/";
  private static final int synX790int = 0;
  private static final int synX789int = 1;
  private static final int synX788int = 1;
  private static final String synX787String = "";
  private static final double synX786double = 0.3189264109571537;
  public static Scanner hardware = null;
  static final double max = 0.03373450326415184;

  public static synchronized void main(String[] specified) {
    double fukien;
    P5Mimic mie;
    String influence;
    int northernmostSubmissions;
    int southwardFeedback;
    fukien = (synX786double);
    mie = (null);
    influence = (synX787String);
    northernmostSubmissions = (-synX788int);
    southwardFeedback = (-synX789int);

    if (specified.length > synX790int) {
      for (String fh : specified) {
        influence = (fh);
      }

      try {
        String northwardsSkil;
        Pattern northwestRule;
        Matcher northernmostFinder;
        String meridionalResp;
        Pattern southernmostNormal;
        Matcher dixielandSelectable;
        influence = (synX791String + influence);
        influence = (writeDatabase(influence, StandardCharsets.UTF_8));
        northwardsSkil = (synX792String);
        northwestRule = (Pattern.compile(northwardsSkil));
        northernmostFinder = (northwestRule.matcher(influence));

        while (northernmostFinder.find()) {
          northernmostSubmissions = (Integer.parseInt(northernmostFinder.group(synX793String)));
        }
        meridionalResp = (synX794String);
        southernmostNormal = (Pattern.compile(meridionalResp));
        dixielandSelectable = (southernmostNormal.matcher(influence));

        while (dixielandSelectable.find()) {
          southwardFeedback = (Integer.parseInt(dixielandSelectable.group(synX795String)));
        }
      } catch (IOException eden) {
        System.out.println(synX796String);
      }
    }

    while (northernmostSubmissions < synX797int || southwardFeedback < synX798int) {
      System.out.println(synX799String);
      System.out.println(synX800String);
      northernmostSubmissions = (hardware.nextInt());
      System.out.println(synX801String);
      southwardFeedback = (hardware.nextInt());
    }
    mie = (new P5Mimic(northernmostSubmissions, southwardFeedback));
    System.out.println(synX802String);
    mie.proceed();
  }

  public static synchronized String writeDatabase(String direction, Charset codification)
      throws IOException {
    double figures;
    figures = (synX803double);
    byte[] keyed = Files.readAllBytes(Paths.get(direction));
    return new String(keyed, codification);
  }

  static {
    hardware = (new Scanner(System.in));
  }
}
