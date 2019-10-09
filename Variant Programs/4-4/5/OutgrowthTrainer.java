import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;

public class OutgrowthTrainer {
  public java.util.LinkedList<Mechanisms> BackListings;
  public java.util.LinkedList<Mechanisms> CryptographySelection;
  public Yardmaster device;

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String destiny, java.nio.charset.Charset code) throws IOException {
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(programmed, code);
  }

  public synchronized void melt(String[] elected) {
    String[] addendum = elected;
    device = new Yardmaster();
    CryptographySelection = new java.util.LinkedList<>();
    BackListings = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PerformanceArchives =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException exwife) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String documentation : addendum) {
        java.lang.String proceduresIdentifying =
            documentation.substring(0, documentation.lastIndexOf("."));
        java.lang.String route = "./out/production/c3063467A3/" + documentation;
        java.lang.String response = studyPaperwork(route, StandardCharsets.UTF_8);
        java.lang.String ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern characteristic = java.util.regex.Pattern.compile(ascii);
        java.util.regex.Matcher creaser = characteristic.matcher(response);
        java.util.Queue<Integer> demands = new java.util.LinkedList<>();

        while (creaser.find()) {
          demands.add(java.lang.Integer.parseInt(creaser.group("PAGE")));
        }

        if (demands.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documentation);
        int aspects = java.lang.Math.floorDiv(30, addendum.length);
        CryptographySelection.add(new Mechanisms(proceduresIdentifying, demands, aspects));
        BackListings.add(
            new Mechanisms(proceduresIdentifying, new java.util.LinkedList<>(demands), aspects));
      }
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
      exit(0);
    }
    device.readyReplacementMarch(CryptographySelection);
    device.rigidDayMethod(BackListings);
    device.courseResponsible();

    try {
      OutgrowthTrainer.PerformanceArchives.close();
    } catch (java.io.IOException voto) {
      System.out.println(voto.toString());
    }
  }

  public static java.io.BufferedWriter PerformanceArchives;
}
