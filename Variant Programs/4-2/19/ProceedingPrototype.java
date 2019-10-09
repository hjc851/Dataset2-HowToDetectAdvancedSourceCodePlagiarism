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

public class ProceedingPrototype {
  private java.util.LinkedList<March> AutocorrelationShortlist;
  private java.util.LinkedList<March> WakingBibliography;
  private Vendor exporter;
  public static java.io.BufferedWriter CropData;

  public void ram(String[] tenants) {
    String[] tar = tenants;
    exporter = new Vendor();
    AutocorrelationShortlist = new java.util.LinkedList<>();
    WakingBibliography = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      CropData =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String binder : tar) {
        java.lang.String cycleOwnership = binder.substring(0, binder.lastIndexOf("."));
        java.lang.String pathways = "./out/production/c3063467A3/" + binder;
        java.lang.String contributions = peruseDocket(pathways, StandardCharsets.UTF_8);
        java.lang.String recursion = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern practice = java.util.regex.Pattern.compile(recursion);
        java.util.regex.Matcher spooler = practice.matcher(contributions);
        java.util.Queue<Integer> invitations = new java.util.LinkedList<>();

        while (spooler.find()) {
          invitations.add(java.lang.Integer.parseInt(spooler.group("PAGE")));
        }

        if (invitations.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + cycleOwnership
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + binder);
        int length = java.lang.Math.floorDiv(30, tar.length);
        AutocorrelationShortlist.add(new March(cycleOwnership, invitations, length));
        WakingBibliography.add(
            new March(cycleOwnership, new java.util.LinkedList<>(invitations), length));
      }
    } catch (java.lang.Exception abdul) {
      System.out.println(abdul.toString());
      exit(0);
    }
    exporter.fixCryptographyMechanism(AutocorrelationShortlist);
    exporter.rigidDayMethod(WakingBibliography);
    exporter.testDistributors();

    try {
      ProceedingPrototype.CropData.close();
    } catch (java.io.IOException former) {
      System.out.println(former.toString());
    }
  }

  private static java.lang.String peruseDocket(
      java.lang.String road, java.nio.charset.Charset encrypted) throws IOException {
    byte[] transmit = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(transmit, encrypted);
  }
}
