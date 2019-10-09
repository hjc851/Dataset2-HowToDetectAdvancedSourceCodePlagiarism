import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner desk = null;

  public static synchronized void main(String[] specified) {
    ABrake siem;
    String component;
    int southernComments;
    int southerlySupport;
    siem = null;
    component = "";
    southernComments = -1;
    southerlySupport = -1;

    if (specified.length > 0) {
      for (String fh : specified) {
        component = fh;
      }

      try {
        String northmostSupp;
        Pattern uptownMethod;
        Matcher southBrite;
        String transcaucasianBens;
        Pattern southeasterlyFigure;
        Matcher southwesterlyVerifier;
        component = "./out/production/c3063467A2P1/" + component;
        component = rereadSubmitted(component, StandardCharsets.UTF_8);
        northmostSupp = "N=(?<North>[\\d]+)";
        uptownMethod = Pattern.compile(northmostSupp);
        southBrite = uptownMethod.matcher(component);

        while (southBrite.find()) {
          southernComments = Integer.parseInt(southBrite.group("North"));
        }
        transcaucasianBens = "S=(?<South>[\\d]+)";
        southeasterlyFigure = Pattern.compile(transcaucasianBens);
        southwesterlyVerifier = southeasterlyFigure.matcher(component);

        while (southwesterlyVerifier.find()) {
          southerlySupport = Integer.parseInt(southwesterlyVerifier.group("South"));
        }
      } catch (IOException officio) {
        System.out.println("");
      }
    }

    while (southernComments < 0 || southerlySupport < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southernComments = desk.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southerlySupport = desk.nextInt();
    }
    siem = new ABrake(southernComments, southerlySupport);
    System.out.println("main: Start main");
    siem.launch();
  }

  private static synchronized String rereadSubmitted(String course, Charset decoding)
      throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(course));
    return new String(decodes, decoding);
  }

  static {
    desk = new Scanner(System.in);
  }
}
