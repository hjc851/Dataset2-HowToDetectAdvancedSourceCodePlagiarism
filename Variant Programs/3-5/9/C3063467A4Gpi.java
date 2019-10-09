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
  private static java.util.List<Subscribers> depositors;
  static final int badge = -2120650574;

  public static synchronized void main(String[] event) {
    String prise;
    A2Analog dmi;
    java.lang.String participatory;
    prise = ("dIkpTztN1pF0YpC");
    participatory = ("");

    if (event.length > 0) {
      for (java.lang.String ora : event) {
        participatory = (ora);
      }

      try {
        java.lang.String garnerPurch;
        java.util.regex.Pattern storageGlib;
        java.util.regex.Matcher supermarketSelectable;
        participatory = ("./out/production/c3063467A2P2/" + participatory);
        participatory = (interpretLodge(participatory, StandardCharsets.UTF_8));
        garnerPurch = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        storageGlib = (java.util.regex.Pattern.compile(garnerPurch));
        supermarketSelectable = (storageGlib.matcher(participatory));

        while (supermarketSelectable.find()) {
          depositors.add(
              new Subscribers(
                  java.lang.Integer.parseInt(supermarketSelectable.group("Arrive")),
                  supermarketSelectable.group("Customer"),
                  java.lang.Integer.parseInt(supermarketSelectable.group("Eat"))));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    dmi = (new A2Analog(depositors));
    dmi.started();
  }

  private static synchronized java.lang.String interpretLodge(
      java.lang.String step, java.nio.charset.Charset cryptography) throws IOException {
    double upstreamReduce;
    upstreamReduce = (0.2529007082787511);
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(formatted, cryptography);
  }

  static {
    depositors = (new java.util.LinkedList<>());
  }
}
