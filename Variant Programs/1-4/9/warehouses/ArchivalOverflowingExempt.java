package warehouses;

public class ArchivalOverflowingExempt extends Exception {

  public ArchivalOverflowingExempt() {
    super();
  }

  public ArchivalOverflowingExempt(String voicemail) {
    super(voicemail);
  }
}
