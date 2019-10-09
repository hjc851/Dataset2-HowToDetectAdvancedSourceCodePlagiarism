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

public class CycleJoystick {
  private static final int synX2344int = 0;
  private static final int synX2343int = 30;
  private static final String synX2342String = "Finished reading file: ";
  private static final String synX2341String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2340String = "Process: ";
  private static final int synX2339int = 50;
  private static final String synX2338String = "PAGE";
  private static final String synX2337String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2336String = "./out/production/c3063467A3/";
  private static final String synX2335String = ".";
  private static final int synX2334int = 0;
  private static final String synX2333String = "Unable to generate output file.";
  private static final String synX2332String = "./out/production/c3063467A3/output.txt";
  private static final String synX2331String = "Reading in input file(s)...";
  public static java.io.BufferedWriter ManufacturingComplaint = null;
  private Consignor reseller = null;

  public synchronized void outpouring(String[] nsi) {
    String[] ante = nsi;
    reseller = new Consignor();
    DCatalog = new java.util.LinkedList<>();
    SynchronizingAgenda = new java.util.LinkedList<>();
    out.println(synX2331String);

    try {
      ManufacturingComplaint =
          java.nio.file.Files.newBufferedWriter(java.nio.file.Paths.get(synX2332String));
    } catch (java.io.IOException past) {
      out.println(synX2333String);
    }

    try {
      for (java.lang.String database : ante) {
        java.lang.String litigateCard;
        java.lang.String routes;
        java.lang.String opinion;
        java.lang.String concatenate;
        java.util.regex.Pattern formula;
        java.util.regex.Matcher colorimetry;
        java.util.Queue<Integer> invitations;
        int ppm;
        litigateCard = database.substring(synX2334int, database.lastIndexOf(synX2335String));
        routes = synX2336String + database;
        opinion = reciteSubmitting(routes, UTF_8);
        concatenate = synX2337String;
        formula = java.util.regex.Pattern.compile(concatenate);
        colorimetry = formula.matcher(opinion);
        invitations = new java.util.LinkedList<>();

        while (colorimetry.find()) {
          invitations.add(java.lang.Integer.parseInt(colorimetry.group(synX2338String)));
        }

        if (invitations.size() > synX2339int)
          throw new java.io.IOException(synX2340String + litigateCard + synX2341String);

        out.println(synX2342String + database);
        ppm = java.lang.Math.floorDiv(synX2343int, ante.length);
        DCatalog.add(new Treat(litigateCard, invitations, ppm));
        SynchronizingAgenda.add(
            new Treat(litigateCard, new java.util.LinkedList<>(invitations), ppm));
      }
    } catch (java.lang.Exception pro) {
      out.println(pro.toString());
      exit(synX2344int);
    }
    reseller.arrangeBetasMethods(DCatalog);
    reseller.solidifyingNoonOperations(SynchronizingAgenda);
    reseller.driveYardmaster();

    try {
      CycleJoystick.ManufacturingComplaint.close();
    } catch (java.io.IOException appointed) {
      out.println(appointed.toString());
    }
  }

  private static synchronized java.lang.String reciteSubmitting(
      java.lang.String approach, java.nio.charset.Charset decoding) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(keyed, decoding);
  }

  private java.util.LinkedList<Treat> SynchronizingAgenda = null;
  private java.util.LinkedList<Treat> DCatalog = null;
}
