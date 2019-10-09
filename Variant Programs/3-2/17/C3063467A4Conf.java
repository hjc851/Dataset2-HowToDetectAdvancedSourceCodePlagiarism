import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner emulator = new java.util.Scanner(System.in);

  public static void main(String[] using) {
    TgfTrainer slm;
    java.lang.String component = "";
    int northlandInformation = -1;
    int southeasterlyAdvice = -1;

    if (using.length > 0) {
      for (java.lang.String fh : using) {
        component = fh;
      }

      try {
        component = "./out/production/c3063467A2P1/" + component;
        component = hearBinder(component, StandardCharsets.UTF_8);
        java.lang.String nordCust = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwardsForm = java.util.regex.Pattern.compile(nordCust);
        java.util.regex.Matcher northeastwardSpooler = northwardsForm.matcher(component);

        while (northeastwardSpooler.find()) {
          northlandInformation = java.lang.Integer.parseInt(northeastwardSpooler.group("North"));
        }
        java.lang.String southwesternSkil = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern northChart = java.util.regex.Pattern.compile(southwesternSkil);
        java.util.regex.Matcher southeasterlyRecognizer = northChart.matcher(component);

        while (southeasterlyRecognizer.find()) {
          southeasterlyAdvice = java.lang.Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (java.io.IOException past) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || southeasterlyAdvice < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = emulator.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasterlyAdvice = emulator.nextInt();
    }
    slm = new TgfTrainer(northlandInformation, southeasterlyAdvice);
    System.out.println("main: Start main");
    slm.initiate();
  }

  private static java.lang.String hearBinder(
      java.lang.String pattern, java.nio.charset.Charset coded) throws IOException {
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(initiated, coded);
  }
}
