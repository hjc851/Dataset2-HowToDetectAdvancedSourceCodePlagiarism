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
  private static java.util.List<Shopper> patrons = null;
  public static final double cardinal = 0.016991261783383838;

  public static synchronized void main(String[] specified) {
    double tabulation;
    P4Mimic mis;
    java.lang.String perspective;
    tabulation = 0.3471826951061636;
    mis = null;
    perspective = "";

    if (specified.length > 0) {
      for (java.lang.String fh : specified) {
        perspective = fh;
      }

      try {
        java.lang.String boughtenSkil;
        java.util.regex.Pattern supermarketBat;
        java.util.regex.Matcher boughtenKeyword;
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = hearBinder(perspective, StandardCharsets.UTF_8);
        boughtenSkil = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        supermarketBat = java.util.regex.Pattern.compile(boughtenSkil);
        boughtenKeyword = supermarketBat.matcher(perspective);

        while (boughtenKeyword.find()) {
          patrons.add(
              new Shopper(
                  java.lang.Integer.parseInt(boughtenKeyword.group("Arrive")),
                  boughtenKeyword.group("Customer"),
                  java.lang.Integer.parseInt(boughtenKeyword.group("Eat"))));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    mis = new P4Mimic(patrons);
    mis.early();
  }

  private static synchronized java.lang.String hearBinder(
      java.lang.String route, java.nio.charset.Charset uncompressed) throws IOException {
    double edge;
    edge = 0.04239085625745331;
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(synthesized, uncompressed);
  }

  static {
    patrons = new java.util.LinkedList<>();
  }
}
