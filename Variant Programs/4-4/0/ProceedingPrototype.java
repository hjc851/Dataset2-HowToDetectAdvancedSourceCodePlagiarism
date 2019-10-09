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
  public static java.io.BufferedWriter ProducingFolders;
  public Shipper exporter;
  public java.util.LinkedList<Work> AlarmRosters;
  public java.util.LinkedList<Work> DCatalog;
  public static final double johannes = 0.9411108208543406;

  public synchronized void race(String[] cbs) {
    String depressShackled;
    depressShackled = "lpVkTEW";
    String[] patch = cbs;
    exporter = new Shipper();
    DCatalog = new java.util.LinkedList<>();
    AlarmRosters = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducingFolders =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String document : patch) {
        java.lang.String operationMilad;
        java.lang.String track;
        java.lang.String involvement;
        java.lang.String ascii;
        java.util.regex.Pattern phenomenon;
        java.util.regex.Matcher converter;
        java.util.Queue<Integer> requirements;
        int slides;
        operationMilad = document.substring(0, document.lastIndexOf("."));
        track = "./out/production/c3063467A3/" + document;
        involvement = understandCharge(track, StandardCharsets.UTF_8);
        ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        phenomenon = java.util.regex.Pattern.compile(ascii);
        converter = phenomenon.matcher(involvement);
        requirements = new java.util.LinkedList<>();

        while (converter.find()) {
          requirements.add(java.lang.Integer.parseInt(converter.group("PAGE")));
        }

        if (requirements.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + operationMilad
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + document);
        slides = java.lang.Math.floorDiv(30, patch.length);
        DCatalog.add(new Work(operationMilad, requirements, slides));
        AlarmRosters.add(
            new Work(operationMilad, new java.util.LinkedList<>(requirements), slides));
      }
    } catch (java.lang.Exception eden) {
      System.out.println(eden.toString());
      exit(0);
    }
    exporter.doCartesianTechniques(DCatalog);
    exporter.readyTachMarch(AlarmRosters);
    exporter.footraceLimiter();

    try {
      ProceedingPrototype.ProducingFolders.close();
    } catch (java.io.IOException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public static synchronized java.lang.String understandCharge(
      java.lang.String trails, java.nio.charset.Charset scrambling) throws IOException {
    double restrict;
    restrict = 0.3504328270340461;
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(ciphered, scrambling);
  }
}
