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
  private LinkedList<Mechanism> ReplacementTilt;
  private LinkedList<Mechanism> TimeNumber;
  private Caller originator;
  public static BufferedWriter YieldRegister;

  public void ram(String[] supporters) {
    String[] enter = supporters;
    originator = new Caller();
    ReplacementTilt = new LinkedList<>();
    TimeNumber = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      YieldRegister = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException past) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String application : enter) {
        String operationMilad = application.substring(0, application.lastIndexOf("."));
        String lane = "./out/production/c3063467A3/" + application;
        String support = scanFolders(lane, StandardCharsets.UTF_8);
        String malloc = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern trend = Pattern.compile(malloc);
        Matcher algorithm = trend.matcher(support);
        Queue<Integer> inquires = new LinkedList<>();

        while (algorithm.find()) {
          inquires.add(Integer.parseInt(algorithm.group("PAGE")));
        }

        if (inquires.size() > 50)
          throw new IOException(
              "Process: "
                  + operationMilad
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + application);
        int site = Math.floorDiv(30, enter.length);
        ReplacementTilt.add(new Mechanism(operationMilad, inquires, site));
        TimeNumber.add(new Mechanism(operationMilad, new LinkedList<>(inquires), site));
      }
    } catch (Exception abe) {
      System.out.println(abe.toString());
      exit(0);
    }
    originator.putHasProcedure(ReplacementTilt);
    originator.arrangedTimerAct(TimeNumber);
    originator.playSalesperson();

    try {
      MethodologyEmulator.YieldRegister.close();
    } catch (IOException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  private static String scanFolders(String trails, Charset codify) throws IOException {
    byte[] initiated = Files.readAllBytes(Paths.get(trails));
    return new String(initiated, codify);
  }
}
