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

public class MechanismMockup {
  private java.util.LinkedList<Treat> AssociatedLean = null;
  private java.util.LinkedList<Treat> BackListings = null;
  private Trainmaster retailer = null;
  public static java.io.BufferedWriter ProducingFolders = null;

  public synchronized void streak(String[] nsi) {
    String[] submissions = nsi;
    retailer = new Trainmaster();
    AssociatedLean = new java.util.LinkedList<>();
    BackListings = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducingFolders =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException adrian) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String database : submissions) {
        java.lang.String proceedingsUser = database.substring(0, database.lastIndexOf("."));
        java.lang.String trails = "./out/production/c3063467A3/" + database;
        java.lang.String output = translateDocuments(trails, StandardCharsets.UTF_8);
        java.lang.String unicode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern rule = java.util.regex.Pattern.compile(unicode);
        java.util.regex.Matcher synchroniser = rule.matcher(output);
        java.util.Queue<Integer> petition = new java.util.LinkedList<>();

        while (synchroniser.find()) {
          petition.add(java.lang.Integer.parseInt(synchroniser.group("PAGE")));
        }

        if (petition.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + proceedingsUser
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + database);
        int slips = java.lang.Math.floorDiv(30, submissions.length);
        AssociatedLean.add(new Treat(proceedingsUser, petition, slips));
        BackListings.add(new Treat(proceedingsUser, new java.util.LinkedList<>(petition), slips));
      }
    } catch (java.lang.Exception pro) {
      System.out.println(pro.toString());
      exit(0);
    }
    retailer.laidUsingOperation(AssociatedLean);
    retailer.putTimeProcedure(BackListings);
    retailer.campaignReseller();

    try {
      MechanismMockup.ProducingFolders.close();
    } catch (java.io.IOException exwife) {
      System.out.println(exwife.toString());
    }
  }

  private static synchronized java.lang.String translateDocuments(
      java.lang.String journey, java.nio.charset.Charset encoders) throws IOException {
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(synthesized, encoders);
  }
}
