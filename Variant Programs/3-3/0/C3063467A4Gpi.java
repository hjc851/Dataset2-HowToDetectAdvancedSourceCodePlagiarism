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
  public static java.util.List<Passenger> visitors = new java.util.LinkedList<>();
  static double ids = 0.7150310138504744;

  public static synchronized void main(String[] specified) {
    String symbol;
    A3Modelling pua;
    java.lang.String consultation;
    symbol = "uM8QRIWCB9VO";
    consultation = "";

    if (specified.length > 0) {
      for (java.lang.String fh : specified) {
        consultation = fh;
      }

      try {
        java.lang.String memoryYrs;
        java.util.regex.Pattern shopChuck;
        java.util.regex.Matcher retailerRandomizer;
        consultation = "./out/production/c3063467A2P2/" + consultation;
        consultation = writeDatabase(consultation, StandardCharsets.UTF_8);
        memoryYrs = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        shopChuck = java.util.regex.Pattern.compile(memoryYrs);
        retailerRandomizer = shopChuck.matcher(consultation);

        while (retailerRandomizer.find()) {
          visitors.add(
              new Passenger(
                  java.lang.Integer.parseInt(retailerRandomizer.group("Arrive")),
                  retailerRandomizer.group("Customer"),
                  java.lang.Integer.parseInt(retailerRandomizer.group("Eat"))));
        }
      } catch (java.io.IOException eden) {
        System.out.println("");
      }
    }

    pua = new A3Modelling(visitors);
    pua.commenced();
  }

  public static synchronized java.lang.String writeDatabase(
      java.lang.String pattern, java.nio.charset.Charset codec) throws IOException {
    int namDetail;
    namDetail = -790542135;
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(programmed, codec);
  }
}
