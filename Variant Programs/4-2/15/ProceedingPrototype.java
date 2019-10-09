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
  private java.util.LinkedList<Outgrowth> EstimationPlaylist;
  private java.util.LinkedList<Outgrowth> HoursCompendium;
  private Shipper reseller;
  public static java.io.BufferedWriter InputInitiate;

  public void ram(String[] incumbents) {
    String[] audio = incumbents;
    reseller = new Shipper();
    EstimationPlaylist = new java.util.LinkedList<>();
    HoursCompendium = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      InputInitiate =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException past) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String folders : audio) {
        java.lang.String procedureQuod = folders.substring(0, folders.lastIndexOf("."));
        java.lang.String ride = "./out/production/c3063467A3/" + folders;
        java.lang.String participatory = peruseDocket(ride, StandardCharsets.UTF_8);
        java.lang.String awk = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern chart = java.util.regex.Pattern.compile(awk);
        java.util.regex.Matcher variable = chart.matcher(participatory);
        java.util.Queue<Integer> submissions = new java.util.LinkedList<>();

        while (variable.find()) {
          submissions.add(java.lang.Integer.parseInt(variable.group("PAGE")));
        }

        if (submissions.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + procedureQuod
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folders);
        int aspects = java.lang.Math.floorDiv(30, audio.length);
        EstimationPlaylist.add(new Outgrowth(procedureQuod, submissions, aspects));
        HoursCompendium.add(
            new Outgrowth(procedureQuod, new java.util.LinkedList<>(submissions), aspects));
      }
    } catch (java.lang.Exception admittedly) {
      System.out.println(admittedly.toString());
      exit(0);
    }
    reseller.fitAutomatonTreat(EstimationPlaylist);
    reseller.layCountdownLitigate(HoursCompendium);
    reseller.carryDevice();

    try {
      ProceedingPrototype.InputInitiate.close();
    } catch (java.io.IOException adrian) {
      System.out.println(adrian.toString());
    }
  }

  private static java.lang.String peruseDocket(
      java.lang.String trail, java.nio.charset.Charset cryptographic) throws IOException {
    byte[] demodulated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(demodulated, cryptographic);
  }
}
