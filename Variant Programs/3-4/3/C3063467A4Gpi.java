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

  public static synchronized java.lang.String takeDocument(
      java.lang.String road, java.nio.charset.Charset encrypt) throws IOException {
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(programmed, encrypt);
  }

  public static synchronized void main(String[] ing) {
    RibuloseTrainer slm;
    java.lang.String information;
    slm = null;
    information = "";

    if (ing.length > 0) {
      for (java.lang.String waffen : ing) {
        information = waffen;
      }

      try {
        java.lang.String memoryYrs;
        java.util.regex.Pattern deliWap;
        java.util.regex.Matcher warehousingAlgorithm;
        information = "./out/production/c3063467A2P2/" + information;
        information = takeDocument(information, StandardCharsets.UTF_8);
        memoryYrs = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        deliWap = java.util.regex.Pattern.compile(memoryYrs);
        warehousingAlgorithm = deliWap.matcher(information);

        while (warehousingAlgorithm.find()) {
          subscriber.add(
              new Caller(
                  java.lang.Integer.parseInt(warehousingAlgorithm.group("Arrive")),
                  warehousingAlgorithm.group("Customer"),
                  java.lang.Integer.parseInt(warehousingAlgorithm.group("Eat"))));
        }
      } catch (java.io.IOException pro) {
        System.out.println("");
      }
    }

    slm = new RibuloseTrainer(subscriber);
    slm.conduct();
  }

  public static java.util.List<Caller> subscriber = new java.util.LinkedList<>();
}
