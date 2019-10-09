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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ProceedingsKinematics {
  public static java.io.BufferedWriter ExportSubmit = null;
  public Dealer yardmaster = null;
  public java.util.LinkedList<Proceedings> WatchRegistry = null;
  public java.util.LinkedList<Proceedings> CapitalistAgenda = null;

  public synchronized void endure(String[] supporters) {
    String[] cassette = supporters;
    yardmaster = (new Dealer());
    CapitalistAgenda = (new java.util.LinkedList<>());
    WatchRegistry = (new java.util.LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      ExportSubmit =
          (java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (java.io.IOException libris) {
      out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String paperwork : cassette) {
        java.lang.String appendageFinger;
        java.lang.String track;
        java.lang.String assistance;
        java.lang.String syntax;
        java.util.regex.Pattern trend;
        java.util.regex.Matcher verifier;
        java.util.Queue<Integer> wishes;
        int homepage;
        appendageFinger = (paperwork.substring(0, paperwork.lastIndexOf(".")));
        track = ("./out/production/c3063467A3/" + paperwork);
        assistance = (scanFolders(track, UTF_8));
        syntax = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        trend = (java.util.regex.Pattern.compile(syntax));
        verifier = (trend.matcher(assistance));
        wishes = (new java.util.LinkedList<>());

        while (verifier.find()) {
          wishes.add(java.lang.Integer.parseInt(verifier.group("PAGE")));
        }

        if (wishes.size() > 50)
          throw new java.io.IOException(
              ("Process: "
                  + appendageFinger
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + paperwork);
        homepage = (java.lang.Math.floorDiv(30, cassette.length));
        CapitalistAgenda.add(new Proceedings(appendageFinger, wishes, homepage));
        WatchRegistry.add(
            new Proceedings(appendageFinger, new java.util.LinkedList<>(wishes), homepage));
      }
    } catch (java.lang.Exception former) {
      out.println(former.toString());
      exit(0);
    }
    yardmaster.determinedAlbedoOutgrowth(CapitalistAgenda);
    yardmaster.placedPendulumSue(WatchRegistry);
    yardmaster.driveYardmaster();

    try {
      ProceedingsKinematics.ExportSubmit.close();
    } catch (java.io.IOException pro) {
      out.println(pro.toString());
    }
  }

  public static synchronized java.lang.String scanFolders(
      java.lang.String route, java.nio.charset.Charset codec) throws IOException {
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(demodulated, codec);
  }
}
