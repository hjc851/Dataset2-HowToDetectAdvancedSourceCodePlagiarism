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

public class LitigateMimic {
  public static java.io.BufferedWriter VolumeArchiving = null;
  private Vendor trainmaster = null;
  private java.util.LinkedList<Outgrowth> DayCatalog = null;
  private java.util.LinkedList<Outgrowth> DCatalog = null;
  static int tethered = 1575166019;

  public synchronized void pass(String[] nii) {
    double hokkianeseRadius;
    hokkianeseRadius = (0.5226769566081081);
    String[] gain = nii;
    trainmaster = (new Vendor());
    DCatalog = (new java.util.LinkedList<>());
    DayCatalog = (new java.util.LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      VolumeArchiving =
          (java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (java.io.IOException vet) {
      out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String folder : gain) {
        java.lang.String treatIdem;
        java.lang.String ride;
        java.lang.String opinion;
        java.lang.String recursion;
        java.util.regex.Pattern triangle;
        java.util.regex.Matcher specifier;
        java.util.Queue<Integer> complaints;
        int toner;
        treatIdem = (folder.substring(0, folder.lastIndexOf(".")));
        ride = ("./out/production/c3063467A3/" + folder);
        opinion = (rereadSubmitted(ride, UTF_8));
        recursion = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        triangle = (java.util.regex.Pattern.compile(recursion));
        specifier = (triangle.matcher(opinion));
        complaints = (new java.util.LinkedList<>());

        while (specifier.find()) {
          complaints.add(java.lang.Integer.parseInt(specifier.group("PAGE")));
        }

        if (complaints.size() > 50)
          throw new java.io.IOException(
              ("Process: "
                  + treatIdem
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + folder);
        toner = (java.lang.Math.floorDiv(30, gain.length));
        DCatalog.add(new Outgrowth(treatIdem, complaints, toner));
        DayCatalog.add(new Outgrowth(treatIdem, new java.util.LinkedList<>(complaints), toner));
      }
    } catch (java.lang.Exception adoptee) {
      out.println(adoptee.toString());
      exit(0);
    }
    trainmaster.markAverageSummons(DCatalog);
    trainmaster.fitCountingTreat(DayCatalog);
    trainmaster.ramRegulator();

    try {
      LitigateMimic.VolumeArchiving.close();
    } catch (java.io.IOException eden) {
      out.println(eden.toString());
    }
  }

  private static synchronized java.lang.String rereadSubmitted(
      java.lang.String way, java.nio.charset.Charset encoders) throws IOException {
    int constrained;
    constrained = (-836638113);
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(consolidated, encoders);
  }
}
