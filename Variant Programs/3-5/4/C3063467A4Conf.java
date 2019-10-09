import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner cantilever = new Scanner(System.in);

  public static synchronized void main(String[] sender) {
    AtAnalogue msi;
    String component;
    int northerRepresentations;
    int southmostOutput;
    component = ("");
    northerRepresentations = (-1);
    southmostOutput = (-1);

    if (sender.length > 0) {
      for (String waffen : sender) {
        component = (waffen);
      }

      try {
        String northboundEmp;
        Pattern northwesterlyPatten;
        Matcher uptownPseudorandom;
        String southlandEmp;
        Pattern southwesterlyConvention;
        Matcher southeasternAlgorithm;
        component = ("./out/production/c3063467A2P1/" + component);
        component = (perusedArchives(component, StandardCharsets.UTF_8));
        northboundEmp = ("N=(?<North>[\\d]+)");
        northwesterlyPatten = (Pattern.compile(northboundEmp));
        uptownPseudorandom = (northwesterlyPatten.matcher(component));

        while (uptownPseudorandom.find()) {
          northerRepresentations = (Integer.parseInt(uptownPseudorandom.group("North")));
        }
        southlandEmp = ("S=(?<South>[\\d]+)");
        southwesterlyConvention = (Pattern.compile(southlandEmp));
        southeasternAlgorithm = (southwesterlyConvention.matcher(component));

        while (southeasternAlgorithm.find()) {
          southmostOutput = (Integer.parseInt(southeasternAlgorithm.group("South")));
        }
      } catch (IOException abbe) {
        System.out.println("");
      }
    }

    while (northerRepresentations < 0 || southmostOutput < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerRepresentations = (cantilever.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southmostOutput = (cantilever.nextInt());
    }
    msi = (new AtAnalogue(northerRepresentations, southmostOutput));
    System.out.println("main: Start main");
    msi.commence();
  }

  public static synchronized String perusedArchives(String ride, Charset code) throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(ride));
    return new String(cryptographic, code);
  }
}
