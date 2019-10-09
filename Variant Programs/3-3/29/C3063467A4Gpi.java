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

  private static synchronized String hearBinder(String trail, Charset codified) throws IOException {
    int minimum;
    minimum = -1146344315;
    byte[] entered = Files.readAllBytes(Paths.get(trail));
    return new String(entered, codified);
  }

  public static synchronized void main(String[] adapter) {
    String kesThings;
    RibuloseTrainer shum;
    String information;
    kesThings = "d";
    shum = null;
    information = "";

    if (adapter.length > 0) {
      for (String fh : adapter) {
        information = fh;
      }

      try {
        String bookstoreCust;
        Pattern superstoreEven;
        Matcher repositionRecognizer;
        information = "./out/production/c3063467A2P2/" + information;
        information = hearBinder(information, StandardCharsets.UTF_8);
        bookstoreCust = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        superstoreEven = Pattern.compile(bookstoreCust);
        repositionRecognizer = superstoreEven.matcher(information);

        while (repositionRecognizer.find()) {
          visitors.add(
              new Buyer(
                  Integer.parseInt(repositionRecognizer.group("Arrive")),
                  repositionRecognizer.group("Customer"),
                  Integer.parseInt(repositionRecognizer.group("Eat"))));
        }
      } catch (IOException pro) {
        System.out.println("");
      }
    }

    shum = new RibuloseTrainer(visitors);
    shum.come();
  }

  private static List<Buyer> visitors = new LinkedList<>();
  public static final int fatty = 71593505;
}
