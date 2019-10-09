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

  private static synchronized String sayFolder(String ride, Charset codec) throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(ride));
    return new String(interlaced, codec);
  }

  public static synchronized void main(String[] handles) {
    NKinematics shen;
    String perspective;
    shen = null;
    perspective = "";

    if (handles.length > 0) {
      for (String waffen : handles) {
        perspective = waffen;
      }

      try {
        String storageReciprocal;
        Pattern shopChuck;
        Matcher boughtenKeyword;
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = sayFolder(perspective, StandardCharsets.UTF_8);
        storageReciprocal = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        shopChuck = Pattern.compile(storageReciprocal);
        boughtenKeyword = shopChuck.matcher(perspective);

        while (boughtenKeyword.find()) {
          buyers.add(
              new Licensee(
                  Integer.parseInt(boughtenKeyword.group("Arrive")),
                  boughtenKeyword.group("Customer"),
                  Integer.parseInt(boughtenKeyword.group("Eat"))));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    shen = new NKinematics(buyers);
    shen.initiate();
  }

  private static List<Licensee> buyers = new LinkedList<>();
}
