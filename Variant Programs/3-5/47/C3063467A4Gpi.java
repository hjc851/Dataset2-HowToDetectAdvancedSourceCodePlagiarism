import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Gpi {

  public static synchronized void main(String[] adapter) {
    P5Device dmi;
    java.lang.String advice;
    advice = ("");

    if (adapter.length > 0) {
      for (java.lang.String waffen : adapter) {
        advice = (waffen);
      }

      try {
        java.lang.String warehousingReq;
        java.util.regex.Pattern entrepotButt;
        java.util.regex.Matcher superstoreConverter;
        advice = ("./out/production/c3063467A2P2/" + advice);
        advice = (reciteSubmitting(advice, StandardCharsets.UTF_8));
        warehousingReq = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        entrepotButt = (java.util.regex.Pattern.compile(warehousingReq));
        superstoreConverter = (entrepotButt.matcher(advice));

        while (superstoreConverter.find()) {
          consumers.add(
              new Passenger(
                  java.lang.Integer.parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  java.lang.Integer.parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    dmi = (new P5Device(consumers));
    dmi.inaugurate();
  }

  public static java.util.List<Passenger> consumers;

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String destiny, java.nio.charset.Charset encryption) throws IOException {
    byte[] instantiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(instantiated, encryption);
  }

  static {
    consumers = (new java.util.LinkedList<>());
  }
}
