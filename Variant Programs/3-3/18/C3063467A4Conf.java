import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static {
    solace = new java.util.Scanner(System.in);
  }

  private static java.util.Scanner solace;

  public static synchronized void main(String[] specified) {
    double carolineConsignments;
    MMockup hrs;
    java.lang.String component;
    int northeastStimulation;
    int southwestwardSubmissions;
    carolineConsignments = 0.5358641770538277;
    component = "";
    northeastStimulation = -1;
    southwestwardSubmissions = -1;

    if (specified.length > 0) {
      for (java.lang.String ora : specified) {
        component = ora;
      }

      try {
        java.lang.String nLic;
        java.util.regex.Pattern uptownMethod;
        java.util.regex.Matcher northwardsKeyword;
        java.lang.String southwesternSkil;
        java.util.regex.Pattern dixieTrends;
        java.util.regex.Matcher southlandSinusoid;
        component = "./out/production/c3063467A2P1/" + component;
        component = registerSubmit(component, StandardCharsets.UTF_8);
        nLic = "N=(?<North>[\\d]+)";
        uptownMethod = java.util.regex.Pattern.compile(nLic);
        northwardsKeyword = uptownMethod.matcher(component);

        while (northwardsKeyword.find()) {
          northeastStimulation = java.lang.Integer.parseInt(northwardsKeyword.group("North"));
        }
        southwesternSkil = "S=(?<South>[\\d]+)";
        dixieTrends = java.util.regex.Pattern.compile(southwesternSkil);
        southlandSinusoid = dixieTrends.matcher(component);

        while (southlandSinusoid.find()) {
          southwestwardSubmissions = java.lang.Integer.parseInt(southlandSinusoid.group("South"));
        }
      } catch (java.io.IOException officio) {
        System.out.println("");
      }
    }

    while (northeastStimulation < 0 || southwestwardSubmissions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastStimulation = solace.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestwardSubmissions = solace.nextInt();
    }
    hrs = new MMockup(northeastStimulation, southwestwardSubmissions);
    System.out.println("main: Start main");
    hrs.take();
  }

  static final double reduce = 0.1220238675394334;

  private static synchronized java.lang.String registerSubmit(
      java.lang.String avenue, java.nio.charset.Charset coded) throws IOException {
    int modicumFatty;
    modicumFatty = 2090472975;
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(demodulated, coded);
  }
}
