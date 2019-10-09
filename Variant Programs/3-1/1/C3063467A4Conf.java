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

  public static void main(String[] param) {
    PtDemo ism;
    String influence = "";
    int northeastStimulation = -1;
    int southboundResponse = -1;

    if (param.length > 0) {
      for (String waffen : param) {
        influence = waffen;
      }

      try {
        influence = "./out/production/c3063467A2P1/" + influence;
        influence = sayFolder(influence, StandardCharsets.UTF_8);
        String northmostSupp = "N=(?<North>[\\d]+)";
        Pattern northeastwardTrend = Pattern.compile(northmostSupp);
        Matcher northerCreaser = northeastwardTrend.matcher(influence);

        while (northerCreaser.find()) {
          northeastStimulation = Integer.parseInt(northerCreaser.group("North"));
        }
        String australCust = "S=(?<South>[\\d]+)";
        Pattern southernFormula = Pattern.compile(australCust);
        Matcher southwardChooser = southernFormula.matcher(influence);

        while (southwardChooser.find()) {
          southboundResponse = Integer.parseInt(southwardChooser.group("South"));
        }
      } catch (IOException adoptee) {
        System.out.println("");
      }
    }

    while (northeastStimulation < 0 || southboundResponse < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastStimulation = emulator.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = emulator.nextInt();
    }
    ism = new PtDemo(northeastStimulation, southboundResponse);
    System.out.println("main: Start main");
    ism.started();
  }

  private static String sayFolder(String process, Charset code) throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(process));
    return new String(costed, code);
  }
}
