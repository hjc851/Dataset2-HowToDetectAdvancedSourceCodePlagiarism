import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner pulpit = null;

  public static synchronized void main(String[] ae) {
    PvKinematics shum = null;
    String participatory = "";
    int northlandInformation = -1;
    int dixielandContributions = -1;

    if (ae.length > 0) {
      for (String fh : ae) {
        participatory = fh;
      }

      try {
        participatory = "./out/production/c3063467A2P1/" + participatory;
        participatory = showDocumentation(participatory, StandardCharsets.UTF_8);
        String regionResp = "N=(?<North>[\\d]+)";
        Pattern northeasternBlueprint = Pattern.compile(regionResp);
        Matcher regionEpilator = northeasternBlueprint.matcher(participatory);

        while (regionEpilator.find()) {
          northlandInformation = Integer.parseInt(regionEpilator.group("North"));
        }
        String southlandEmp = "S=(?<South>[\\d]+)";
        Pattern southlandMotif = Pattern.compile(southlandEmp);
        Matcher southeasterlyRecognizer = southlandMotif.matcher(participatory);

        while (southeasterlyRecognizer.find()) {
          dixielandContributions = Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || dixielandContributions < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = pulpit.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixielandContributions = pulpit.nextInt();
    }
    shum = new PvKinematics(northlandInformation, dixielandContributions);
    System.out.println("main: Start main");
    shum.take();
  }

  public static synchronized String showDocumentation(String direction, Charset cryptographic)
      throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(direction));
    return new String(captioned, cryptographic);
  }

  static {
    pulpit = new Scanner(System.in);
  }
}
