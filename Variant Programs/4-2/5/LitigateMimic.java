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

public class LitigateMimic {
  private LinkedList<Phase> CartesianBibliography;
  private LinkedList<Phase> HourRoster;
  private Consignor coordinator;
  public static BufferedWriter ManufacturingComplaint;

  public void campaign(String[] cbs) {
    String[] audio = cbs;
    coordinator = new Consignor();
    CartesianBibliography = new LinkedList<>();
    HourRoster = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ManufacturingComplaint =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException exwife) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String submitted : audio) {
        String methodologyPhoto = submitted.substring(0, submitted.lastIndexOf("."));
        String avenue = "./out/production/c3063467A3/" + submitted;
        String advice = writtenFilename(avenue, StandardCharsets.UTF_8);
        String filename = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern design = Pattern.compile(filename);
        Matcher selectable = design.matcher(advice);
        Queue<Integer> applications = new LinkedList<>();

        while (selectable.find()) {
          applications.add(Integer.parseInt(selectable.group("PAGE")));
        }

        if (applications.size() > 50)
          throw new IOException(
              "Process: "
                  + methodologyPhoto
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + submitted);
        int website = Math.floorDiv(30, audio.length);
        CartesianBibliography.add(new Phase(methodologyPhoto, applications, website));
        HourRoster.add(new Phase(methodologyPhoto, new LinkedList<>(applications), website));
      }
    } catch (Exception abel) {
      System.out.println(abel.toString());
      exit(0);
    }
    coordinator.placeBalancersSystems(CartesianBibliography);
    coordinator.rigidDayMethod(HourRoster);
    coordinator.footraceLimiter();

    try {
      LitigateMimic.ManufacturingComplaint.close();
    } catch (IOException eden) {
      System.out.println(eden.toString());
    }
  }

  private static String writtenFilename(String trail, Charset consolidation) throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(trail));
    return new String(scrambled, consolidation);
  }
}
