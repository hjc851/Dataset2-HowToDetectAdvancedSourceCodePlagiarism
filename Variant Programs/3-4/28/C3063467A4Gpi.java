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
  public static List<Consumer> consumer = new LinkedList<>();

  public static synchronized void main(String[] specified) {
    B2Impactor pua;
    String feedback;
    pua = null;
    feedback = "";

    if (specified.length > 0) {
      for (String waffen : specified) {
        feedback = waffen;
      }

      try {
        String storageReciprocal;
        Pattern superstoreEven;
        Matcher repositionRecognizer;
        feedback = "./out/production/c3063467A2P2/" + feedback;
        feedback = interpretLodge(feedback, StandardCharsets.UTF_8);
        storageReciprocal = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        superstoreEven = Pattern.compile(storageReciprocal);
        repositionRecognizer = superstoreEven.matcher(feedback);

        while (repositionRecognizer.find()) {
          consumer.add(
              new Consumer(
                  Integer.parseInt(repositionRecognizer.group("Arrive")),
                  repositionRecognizer.group("Customer"),
                  Integer.parseInt(repositionRecognizer.group("Eat"))));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    pua = new B2Impactor(consumer);
    pua.commence();
  }

  public static synchronized String interpretLodge(String course, Charset cipher)
      throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(course));
    return new String(keyed, cipher);
  }
}
