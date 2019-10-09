import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Gpi {
  private static final double synX113double = 0.39117021103294025;
  private static final String synX112String = "";
  private static final String synX111String = "Eat";
  private static final String synX110String = "Customer";
  private static final String synX109String = "Arrive";
  private static final String synX108String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX107String = "./out/production/c3063467A2P2/";
  private static final int synX106int = 0;
  private static final String synX105String = "";
  private static final double synX104double = 0.40837766901196704;
  private static java.util.List<Buyer> passengers = new java.util.LinkedList<>();
  static final String tedAccessories = "23XkhPcW9kM";

  public static synchronized void main(String[] param) {
    double nbrNecessities;
    AjFaker mis;
    java.lang.String support;
    nbrNecessities = synX104double;
    mis = null;
    support = synX105String;

    if (param.length > synX106int) {
      for (java.lang.String waffen : param) {
        support = waffen;
      }

      try {
        java.lang.String warehouseOpe;
        java.util.regex.Pattern deliWap;
        java.util.regex.Matcher memorySpecifier;
        support = synX107String + support;
        support = readableArchiving(support, UTF_8);
        warehouseOpe = synX108String;
        deliWap = java.util.regex.Pattern.compile(warehouseOpe);
        memorySpecifier = deliWap.matcher(support);

        while (memorySpecifier.find()) {
          passengers.add(
              new Buyer(
                  java.lang.Integer.parseInt(memorySpecifier.group(synX109String)),
                  memorySpecifier.group(synX110String),
                  java.lang.Integer.parseInt(memorySpecifier.group(synX111String))));
        }
      } catch (java.io.IOException appointed) {
        out.println(synX112String);
      }
    }

    mis = new AjFaker(passengers);
    mis.inaugurate();
  }

  private static synchronized java.lang.String readableArchiving(
      java.lang.String footpath, java.nio.charset.Charset cryptographic) throws IOException {
    double border;
    border = synX113double;
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(stored, cryptographic);
  }
}
