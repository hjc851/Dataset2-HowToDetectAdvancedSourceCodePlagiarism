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

public class FormalitiesDemo {
  public java.util.LinkedList<Operation> ClockworkLean;

  public static synchronized java.lang.String aloudApplication(
      java.lang.String trail, java.nio.charset.Charset codifying) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(encrypts, codifying);
  }

  public synchronized void lead(String[] elected) {
    String[] assistance = elected;
    shipper = new Trainmaster();
    AlbedoBlacklist = new java.util.LinkedList<>();
    ClockworkLean = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducePaperwork =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException post) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String lodge : assistance) {
        java.lang.String summonsIdentification = lodge.substring(0, lodge.lastIndexOf("."));
        java.lang.String way = "./out/production/c3063467A3/" + lodge;
        java.lang.String response = aloudApplication(way, StandardCharsets.UTF_8);
        java.lang.String bytecode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern motif = java.util.regex.Pattern.compile(bytecode);
        java.util.regex.Matcher selectable = motif.matcher(response);
        java.util.Queue<Integer> inquiries = new java.util.LinkedList<>();

        while (selectable.find()) {
          inquiries.add(java.lang.Integer.parseInt(selectable.group("PAGE")));
        }

        if (inquiries.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + lodge);
        int websites = java.lang.Math.floorDiv(30, assistance.length);
        AlbedoBlacklist.add(new Operation(summonsIdentification, inquiries, websites));
        ClockworkLean.add(
            new Operation(summonsIdentification, new java.util.LinkedList<>(inquiries), websites));
      }
    } catch (java.lang.Exception exwife) {
      System.out.println(exwife.toString());
      exit(0);
    }
    shipper.arrangeBetasMethods(AlbedoBlacklist);
    shipper.placedPendulumSue(ClockworkLean);
    shipper.tallyConsignor();

    try {
      FormalitiesDemo.ProducePaperwork.close();
    } catch (java.io.IOException past) {
      System.out.println(past.toString());
    }
  }

  public java.util.LinkedList<Operation> AlbedoBlacklist;
  public static java.io.BufferedWriter ProducePaperwork;
  public Trainmaster shipper;
}
