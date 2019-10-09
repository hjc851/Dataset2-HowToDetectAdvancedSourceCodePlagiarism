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

public class OperationSimulated {
  public LinkedList<Serve> EstimationPlaylist;
  public static BufferedWriter GdpDatabase;

  public static synchronized String understandCharge(String trails, Charset keying)
      throws IOException {
    byte[] codified = Files.readAllBytes(Paths.get(trails));
    return new String(codified, keying);
  }

  public Distributor mailer;

  public synchronized void lean(String[] nih) {
    String[] feedback = nih;
    mailer = new Distributor();
    EstimationPlaylist = new LinkedList<>();
    SynchronizationCompilation = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      GdpDatabase = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException pro) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String lodge : feedback) {
        String mechanismPicture = lodge.substring(0, lodge.lastIndexOf("."));
        String roadway = "./out/production/c3063467A3/" + lodge;
        String submissions = understandCharge(roadway, StandardCharsets.UTF_8);
        String subroutine = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern model = Pattern.compile(subroutine);
        Matcher creaser = model.matcher(submissions);
        Queue<Integer> appeals = new LinkedList<>();

        while (creaser.find()) {
          appeals.add(Integer.parseInt(creaser.group("PAGE")));
        }

        if (appeals.size() > 50)
          throw new IOException(
              "Process: "
                  + mechanismPicture
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + lodge);
        int webpages = Math.floorDiv(30, feedback.length);
        EstimationPlaylist.add(new Serve(mechanismPicture, appeals, webpages));
        SynchronizationCompilation.add(
            new Serve(mechanismPicture, new LinkedList<>(appeals), webpages));
      }
    } catch (Exception former) {
      System.out.println(former.toString());
      exit(0);
    }
    mailer.markAverageSummons(EstimationPlaylist);
    mailer.determinedBellOutgrowth(SynchronizationCompilation);
    mailer.passMailer();

    try {
      OperationSimulated.GdpDatabase.close();
    } catch (IOException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public LinkedList<Serve> SynchronizationCompilation;
}
