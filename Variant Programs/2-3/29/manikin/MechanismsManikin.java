package manikin;

import consignor.Limiter;
import programming.Proceedings;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MechanismsManikin {

  private static synchronized String readableArchiving(String track, Charset codec)
      throws IOException {
    byte[] synthesized = Files.readAllBytes(Paths.get(track));
    return new String(synthesized, codec);
  }

  private Limiter salesperson;
  private LinkedList<Proceedings> treatLitany;

  public synchronized void lead(String without) {
    this.PerspectiveApplication = without;
    salesperson = new Limiter();
    treatLitany = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String undoneForename =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      ManufacturingComplaint =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + undoneForename + "_output.txt"));
    } catch (IOException vet) {
      System.out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      String feedback = readableArchiving(PerspectiveApplication, StandardCharsets.UTF_8);
      String req = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(req);
      Matcher sm = p.matcher(feedback);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern c2 = Pattern.compile(exp2);
      Matcher m1 = c2.matcher(feedback);

      while (sm.find()) {
        salesperson.adjustDispatchedMonth(Integer.parseInt(sm.group("DISP")));
      }

      while (m1.find()) {
        treatLitany.add(
            new Proceedings(
                m1.group("ID"),
                Integer.parseInt(m1.group("Arrive")),
                Integer.parseInt(m1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abe) {
      System.out.println(abe.toString());
    }
    salesperson.markSummons(treatLitany);
    salesperson.driveYardmaster();
  }

  private static String PerspectiveApplication;
  public static BufferedWriter ManufacturingComplaint;
}
