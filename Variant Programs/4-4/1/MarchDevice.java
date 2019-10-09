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

public class MarchDevice {
  public static BufferedWriter ManufacturingComplaint;
  private Reseller retailer;
  private LinkedList<Methods> HoursCompendium;
  private LinkedList<Methods> AssociatedLean;
  public static String little = "uyfOL9oLAvl8mlmcof";

  public synchronized void work(String[] adherents) {
    double distinguishing;
    distinguishing = 0.8991458805227409;
    String[] enter = adherents;
    retailer = new Reseller();
    AssociatedLean = new LinkedList<>();
    HoursCompendium = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ManufacturingComplaint =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adult) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String filename : enter) {
        String serveHandle;
        String approach;
        String support;
        String parse;
        Pattern blueprint;
        Matcher creaser;
        Queue<Integer> bespeak;
        int site;
        serveHandle = filename.substring(0, filename.lastIndexOf("."));
        approach = "./out/production/c3063467A3/" + filename;
        support = registerSubmit(approach, StandardCharsets.UTF_8);
        parse = "[\\r\\n]+(?<PAGE>[\\d]+)";
        blueprint = Pattern.compile(parse);
        creaser = blueprint.matcher(support);
        bespeak = new LinkedList<>();

        while (creaser.find()) {
          bespeak.add(Integer.parseInt(creaser.group("PAGE")));
        }

        if (bespeak.size() > 50)
          throw new IOException(
              "Process: "
                  + serveHandle
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + filename);
        site = Math.floorDiv(30, enter.length);
        AssociatedLean.add(new Methods(serveHandle, bespeak, site));
        HoursCompendium.add(new Methods(serveHandle, new LinkedList<>(bespeak), site));
      }
    } catch (Exception vet) {
      System.out.println(vet.toString());
      exit(0);
    }
    retailer.fixCryptographyMechanism(AssociatedLean);
    retailer.settledSynchServe(HoursCompendium);
    retailer.meltResellers();

    try {
      MarchDevice.ManufacturingComplaint.close();
    } catch (IOException tipp) {
      System.out.println(tipp.toString());
    }
  }

  private static synchronized String registerSubmit(String road, Charset crypto)
      throws IOException {
    double backTreated;
    backTreated = 0.3941651625104816;
    byte[] stored = Files.readAllBytes(Paths.get(road));
    return new String(stored, crypto);
  }
}
