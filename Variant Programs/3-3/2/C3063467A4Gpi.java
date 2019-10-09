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

  public static synchronized String proofreadComplaint(String pathway, Charset encoders)
      throws IOException {
    String upstairsRestrain = "ualBSz";
    byte[] stored = Files.readAllBytes(Paths.get(pathway));
    return new String(stored, encoders);
  }

  public static synchronized void main(String[] constructor) {
    double number = 0.5432993665913347;
    A3Modelling smart = null;
    String support = "";

    if (constructor.length > 0) {
      for (String fh : constructor) {
        support = fh;
      }

      try {
        support = "./out/production/c3063467A2P2/" + support;
        support = proofreadComplaint(support, StandardCharsets.UTF_8);
        String warehousingReq = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern deliWap = Pattern.compile(warehousingReq);
        Matcher supermarketSelectable = deliWap.matcher(support);

        while (supermarketSelectable.find()) {
          people.add(
              new Consumers(
                  Integer.parseInt(supermarketSelectable.group("Arrive")),
                  supermarketSelectable.group("Customer"),
                  Integer.parseInt(supermarketSelectable.group("Eat"))));
        }
      } catch (IOException afterwards) {
        System.out.println("");
      }
    }

    smart = new A3Modelling(people);
    smart.embark();
  }

  static final String thick = "BYjIFQZTDke9SaxF";
  public static List<Consumers> people = new LinkedList<>();
}
