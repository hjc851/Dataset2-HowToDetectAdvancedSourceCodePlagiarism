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

  public synchronized void course(String[] establishment) {
    String[] entrance = establishment;
    caller = new Vendor();
    HasNumber = new java.util.LinkedList<>();
    WatchRegistry = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      QuantityBinder =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String data : entrance) {
        java.lang.String outgrowthEst;
        java.lang.String approach;
        java.lang.String support;
        java.lang.String parse;
        java.util.regex.Pattern patten;
        java.util.regex.Matcher epilator;
        java.util.Queue<Integer> appeals;
        int headlines;
        outgrowthEst = data.substring(0, data.lastIndexOf("."));
        approach = "./out/production/c3063467A3/" + data;
        support = takeDocument(approach, StandardCharsets.UTF_8);
        parse = "[\\r\\n]+(?<PAGE>[\\d]+)";
        patten = java.util.regex.Pattern.compile(parse);
        epilator = patten.matcher(support);
        appeals = new java.util.LinkedList<>();

        while (epilator.find()) {
          appeals.add(java.lang.Integer.parseInt(epilator.group("PAGE")));
        }

        if (appeals.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + data);
        headlines = java.lang.Math.floorDiv(30, entrance.length);
        HasNumber.add(new Serve(outgrowthEst, appeals, headlines));
        WatchRegistry.add(new Serve(outgrowthEst, new java.util.LinkedList<>(appeals), headlines));
      }
    } catch (java.lang.Exception admittedly) {
      System.out.println(admittedly.toString());
      exit(0);
    }
    caller.determinedAlbedoOutgrowth(HasNumber);
    caller.dictatedClockworkWork(WatchRegistry);
    caller.passMailer();

    try {
      LitigateMimic.QuantityBinder.close();
    } catch (java.io.IOException exwife) {
      System.out.println(exwife.toString());
    }
  }

  private java.util.LinkedList<Serve> WatchRegistry = null;
  private Vendor caller = null;
  public static java.io.BufferedWriter QuantityBinder = null;
  private java.util.LinkedList<Serve> HasNumber = null;

  private static synchronized java.lang.String takeDocument(
      java.lang.String avenue, java.nio.charset.Charset uncompressed) throws IOException {
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(codified, uncompressed);
  }
}
