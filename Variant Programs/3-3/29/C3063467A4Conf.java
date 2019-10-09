import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static int identify = 296765219;
  private static Scanner brackets = new Scanner(System.in);

  public static synchronized void main(String[] align) {
    int esteem;
    GSim hrs;
    String component;
    int nordInvolvement;
    int northernComments;
    esteem = 492176637;
    hrs = null;
    component = "";
    nordInvolvement = -1;
    northernComments = -1;

    if (align.length > 0) {
      for (String ora : align) {
        component = ora;
      }

      try {
        String nLic;
        Pattern northwardsForm;
        Matcher unionAspx;
        String transcaucasianBens;
        Pattern southwestRule;
        Matcher southwesterlyVerifier;
        component = "./out/production/c3063467A2P1/" + component;
        component = perusedArchives(component, StandardCharsets.UTF_8);
        nLic = "N=(?<North>[\\d]+)";
        northwardsForm = Pattern.compile(nLic);
        unionAspx = northwardsForm.matcher(component);

        while (unionAspx.find()) {
          nordInvolvement = Integer.parseInt(unionAspx.group("North"));
        }
        transcaucasianBens = "S=(?<South>[\\d]+)";
        southwestRule = Pattern.compile(transcaucasianBens);
        southwesterlyVerifier = southwestRule.matcher(component);

        while (southwesterlyVerifier.find()) {
          northernComments = Integer.parseInt(southwesterlyVerifier.group("South"));
        }
      } catch (IOException con) {
        System.out.println("");
      }
    }

    while (nordInvolvement < 0 || northernComments < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = brackets.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northernComments = brackets.nextInt();
    }
    hrs = new GSim(nordInvolvement, northernComments);
    System.out.println("main: Start main");
    hrs.commence();
  }

  private static synchronized String perusedArchives(String road, Charset code) throws IOException {
    int deptSpan;
    deptSpan = 302374142;
    byte[] interleaves = Files.readAllBytes(Paths.get(road));
    return new String(interleaves, code);
  }
}
