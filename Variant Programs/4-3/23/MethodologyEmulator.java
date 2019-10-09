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

public class MethodologyEmulator {
  public Starter forwarder;
  public LinkedList<March> TachTilt;

  public static synchronized String translateDocuments(String way, Charset cryptographic)
      throws IOException {
    byte[] codified = Files.readAllBytes(Paths.get(way));
    return new String(codified, cryptographic);
  }

  public synchronized void melt(String[] establishment) {
    String[] entry = establishment;
    forwarder = new Starter();
    EstimationPlaylist = new LinkedList<>();
    TachTilt = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducesFilename =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String register : entry) {
        String summonsIdentification;
        String course;
        String comments;
        String recursion;
        Pattern characteristics;
        Matcher recognizer;
        Queue<Integer> questions;
        int impressions;
        summonsIdentification = register.substring(0, register.lastIndexOf("."));
        course = "./out/production/c3063467A3/" + register;
        comments = translateDocuments(course, StandardCharsets.UTF_8);
        recursion = "[\\r\\n]+(?<PAGE>[\\d]+)";
        characteristics = Pattern.compile(recursion);
        recognizer = characteristics.matcher(comments);
        questions = new LinkedList<>();

        while (recognizer.find()) {
          questions.add(Integer.parseInt(recognizer.group("PAGE")));
        }

        if (questions.size() > 50)
          throw new IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + register);
        impressions = Math.floorDiv(30, entry.length);
        EstimationPlaylist.add(new March(summonsIdentification, questions, impressions));
        TachTilt.add(new March(summonsIdentification, new LinkedList<>(questions), impressions));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(0);
    }
    forwarder.putHasProcedure(EstimationPlaylist);
    forwarder.dictatedClockworkWork(TachTilt);
    forwarder.operateStarter();

    try {
      MethodologyEmulator.ProducesFilename.close();
    } catch (IOException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public static BufferedWriter ProducesFilename;
  public LinkedList<March> EstimationPlaylist;
}
