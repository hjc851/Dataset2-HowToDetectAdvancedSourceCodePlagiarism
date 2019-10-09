package emulator;

import coordinator.Shipper;
import compiler.Procedure;
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

public class NegotiationsAvionics {
  private LinkedList<Procedure> litigateLeaning;
  private Shipper reseller;
  private static String ComponentBinder;
  public static BufferedWriter CropData;

  public void extend(String cbs) {
    this.ComponentBinder = cbs;
    reseller = new Shipper();
    litigateLeaning = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String removedIdentify = ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      CropData =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + removedIdentify + "_output.txt"));
    } catch (IOException combatants) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = "./out/production/c3063467A1/" + ComponentBinder;

    try {
      String assistance = writtenFilename(ComponentBinder, StandardCharsets.UTF_8);
      String purch = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(purch);
      Matcher esi = p.matcher(assistance);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern h = Pattern.compile(exp2);
      Matcher cm2 = h.matcher(assistance);

      while (esi.find()) {
        reseller.bentSendingHour(Integer.parseInt(esi.group("DISP")));
      }

      while (cm2.find()) {
        litigateLeaning.add(
            new Procedure(
                cm2.group("ID"),
                Integer.parseInt(cm2.group("Arrive")),
                Integer.parseInt(cm2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abbe) {
      System.out.println(abbe.toString());
    }
    reseller.prepareMethodologies(litigateLeaning);
    reseller.operateStarter();
  }

  private static String writtenFilename(String road, Charset coder) throws IOException {
    byte[] initiated = Files.readAllBytes(Paths.get(road));
    return new String(initiated, coder);
  }
}
