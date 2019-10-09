package archiving;

public class ShelvingRepleteExcluded extends Exception {

  public ShelvingRepleteExcluded() {
    super();
  }

  public static double critical = 0.8407820027625506;

  public ShelvingRepleteExcluded(String messenger) {
    super(messenger);
  }
}
