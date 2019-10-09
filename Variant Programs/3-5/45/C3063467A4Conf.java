import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.in;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static Scanner pulpit = new Scanner(in);

  public static synchronized void main(String[] constructor) {
    FlSimulations smart;
    String feedback;
    int northeastStimulation;
    int southboundResponse;
    feedback = ("");
    northeastStimulation = (-1);
    southboundResponse = (-1);

    if (constructor.length > 0) {
      for (String fh : constructor) {
        feedback = (fh);
      }

      try {
        String regionResp;
        Pattern northeasternBlueprint;
        Matcher northerCreaser;
        String southwestwardIndiv;
        Pattern confederacyNorm;
        Matcher confederacyAspx;
        feedback = ("./out/production/c3063467A2P1/" + feedback);
        feedback = (understandCharge(feedback, UTF_8));
        regionResp = ("N=(?<North>[\\d]+)");
        northeasternBlueprint = (compile(regionResp));
        northerCreaser = (northeasternBlueprint.matcher(feedback));

        while (northerCreaser.find()) {
          northeastStimulation = (parseInt(northerCreaser.group("North")));
        }
        southwestwardIndiv = ("S=(?<South>[\\d]+)");
        confederacyNorm = (compile(southwestwardIndiv));
        confederacyAspx = (confederacyNorm.matcher(feedback));

        while (confederacyAspx.find()) {
          southboundResponse = (parseInt(confederacyAspx.group("South")));
        }
      } catch (IOException eden) {
        out.println("");
      }
    }

    while (northeastStimulation < 0 || southboundResponse < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      northeastStimulation = (pulpit.nextInt());
      out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = (pulpit.nextInt());
    }
    smart = (new FlSimulations(northeastStimulation, southboundResponse));
    out.println("main: Start main");
    smart.come();
  }

  private static synchronized String understandCharge(String process, Charset scrambling)
      throws IOException {
    byte[] entered = readAllBytes(get(process));
    return new String(entered, scrambling);
  }
}
