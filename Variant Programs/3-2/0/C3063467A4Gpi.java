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
  private static java.util.List<Purchaser> users = new java.util.LinkedList<>();

  public static void main(String[] event) {
    ApMoot affirmative;
    java.lang.String consultation = "";

    if (event.length > 0) {
      for (java.lang.String waffen : event) {
        consultation = waffen;
      }

      try {
        consultation = "./out/production/c3063467A2P2/" + consultation;
        consultation = reciteSubmitting(consultation, StandardCharsets.UTF_8);
        java.lang.String warehousingReq =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storageGlib = java.util.regex.Pattern.compile(warehousingReq);
        java.util.regex.Matcher storageValidator = storageGlib.matcher(consultation);

        while (storageValidator.find()) {
          users.add(
              new Purchaser(
                  java.lang.Integer.parseInt(storageValidator.group("Arrive")),
                  storageValidator.group("Customer"),
                  java.lang.Integer.parseInt(storageValidator.group("Eat"))));
        }
      } catch (java.io.IOException abbe) {
        System.out.println("");
      }
    }

    affirmative = new ApMoot(users);
    affirmative.early();
  }

  private static java.lang.String reciteSubmitting(
      java.lang.String approach, java.nio.charset.Charset codec) throws IOException {
    byte[] instantiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(instantiated, codec);
  }
}
