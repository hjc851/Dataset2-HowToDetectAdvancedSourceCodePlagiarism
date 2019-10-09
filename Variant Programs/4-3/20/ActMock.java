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

public class ActMock {
  public java.util.LinkedList<Outgrowth> AveragesCompendium = null;
  public java.util.LinkedList<Outgrowth> TimeNumber = null;
  public Distributors exporter = null;
  public static java.io.BufferedWriter InputInitiate = null;

  public synchronized void race(String[] nsi) {
    String[] commentary = nsi;
    exporter = new Distributors();
    AveragesCompendium = new java.util.LinkedList<>();
    TimeNumber = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      InputInitiate =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException past) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String executable : commentary) {
        java.lang.String methodologyPhoto = executable.substring(0, executable.lastIndexOf("."));
        java.lang.String lane = "./out/production/c3063467A3/" + executable;
        java.lang.String response = understandCharge(lane, StandardCharsets.UTF_8);
        java.lang.String xml = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern chart = java.util.regex.Pattern.compile(xml);
        java.util.regex.Matcher recognizer = chart.matcher(response);
        java.util.Queue<Integer> bespeak = new java.util.LinkedList<>();

        while (recognizer.find()) {
          bespeak.add(java.lang.Integer.parseInt(recognizer.group("PAGE")));
        }

        if (bespeak.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + methodologyPhoto
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + executable);
        int slides = java.lang.Math.floorDiv(30, commentary.length);
        AveragesCompendium.add(new Outgrowth(methodologyPhoto, bespeak, slides));
        TimeNumber.add(
            new Outgrowth(methodologyPhoto, new java.util.LinkedList<>(bespeak), slides));
      }
    } catch (java.lang.Exception vet) {
      System.out.println(vet.toString());
      exit(0);
    }
    exporter.putHasProcedure(AveragesCompendium);
    exporter.layCountdownLitigate(TimeNumber);
    exporter.scarperCaller();

    try {
      ActMock.InputInitiate.close();
    } catch (java.io.IOException con) {
      System.out.println(con.toString());
    }
  }

  public static synchronized java.lang.String understandCharge(
      java.lang.String road, java.nio.charset.Charset coder) throws IOException {
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(programmed, coder);
  }
}
