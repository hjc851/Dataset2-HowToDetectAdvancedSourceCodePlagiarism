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

public class MechanismsManikin {
  private java.util.LinkedList<Operation> BetasCompilation;
  private java.util.LinkedList<Operation> TachTilt;
  private Mailer forwarder;
  public static java.io.BufferedWriter ProducesFilename;

  public synchronized void course(String[] supporters) {
    String[] flied = supporters;
    forwarder = new Mailer();
    BetasCompilation = new java.util.LinkedList<>();
    TachTilt = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducesFilename =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException pro) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String database : flied) {
        java.lang.String methodMap = database.substring(0, database.lastIndexOf("."));
        java.lang.String step = "./out/production/c3063467A3/" + database;
        java.lang.String involvement = learnRegister(step, StandardCharsets.UTF_8);
        java.lang.String recursion = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern characteristics = java.util.regex.Pattern.compile(recursion);
        java.util.regex.Matcher brite = characteristics.matcher(involvement);
        java.util.Queue<Integer> petitions = new java.util.LinkedList<>();

        while (brite.find()) {
          petitions.add(java.lang.Integer.parseInt(brite.group("PAGE")));
        }

        if (petitions.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + methodMap
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + database);
        int website = java.lang.Math.floorDiv(30, flied.length);
        BetasCompilation.add(new Operation(methodMap, petitions, website));
        TachTilt.add(new Operation(methodMap, new java.util.LinkedList<>(petitions), website));
      }
    } catch (java.lang.Exception admittedly) {
      System.out.println(admittedly.toString());
      exit(0);
    }
    forwarder.fixCryptographyMechanism(BetasCompilation);
    forwarder.laidStopwatchOperation(TachTilt);
    forwarder.operateStarter();

    try {
      MechanismsManikin.ProducesFilename.close();
    } catch (java.io.IOException officio) {
      System.out.println(officio.toString());
    }
  }

  private static synchronized java.lang.String learnRegister(
      java.lang.String track, java.nio.charset.Charset encrypted) throws IOException {
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(initiated, encrypted);
  }
}
