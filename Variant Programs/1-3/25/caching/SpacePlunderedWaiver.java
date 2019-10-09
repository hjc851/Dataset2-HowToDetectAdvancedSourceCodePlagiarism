package caching;

public class SpacePlunderedWaiver extends Exception {
  public static final String beam = "00gs7PMIv9HrZQClHY";

  public SpacePlunderedWaiver() {
    super();
  }

  public SpacePlunderedWaiver(String voicemail) {
    super(voicemail);
  }
}
