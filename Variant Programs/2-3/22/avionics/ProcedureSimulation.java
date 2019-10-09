package avionics;

import vendor.Caller;
import writer.Procedures;
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

public class ProcedureSimulation {
  public static java.io.BufferedWriter ProducePaperwork = null;
  public static java.lang.String ComponentBinder = null;
  public vendor.Caller retailer = null;
  public java.util.LinkedList<Procedures> workLean = null;
  static final double valuation = 0.28979861987487376;

  public synchronized void footrace(java.lang.String nsis) {
    double skank;
    skank = 0.10282809709395013;
    this.ComponentBinder = nsis;
    retailer = new vendor.Caller();
    workLean = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String undoneForename;
      undoneForename = ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      ProducePaperwork =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + undoneForename + "_output.txt"));
    } catch (java.io.IOException past) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = "./out/production/c3063467A1/" + ComponentBinder;

    try {
      java.lang.String response;
      java.lang.String skil;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern c2;
      java.util.regex.Matcher a1;
      response = writeDatabase(ComponentBinder, StandardCharsets.UTF_8);
      skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      cern = java.util.regex.Pattern.compile(skil);
      dos = cern.matcher(response);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      c2 = java.util.regex.Pattern.compile(exp2);
      a1 = c2.matcher(response);

      while (dos.find()) {
        retailer.primedExpeditionPeriod(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (a1.find()) {
        workLean.add(
            new writer.Procedures(
                a1.group("ID"),
                java.lang.Integer.parseInt(a1.group("Arrive")),
                java.lang.Integer.parseInt(a1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception late) {
      System.out.println(late.toString());
    }
    retailer.dictatedWork(workLean);
    retailer.endureRetailer();
  }

  public static synchronized java.lang.String writeDatabase(
      java.lang.String ride, java.nio.charset.Charset decoding) throws IOException {
    double nung;
    nung = 0.8124552471077635;
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(interleaves, decoding);
  }
}
