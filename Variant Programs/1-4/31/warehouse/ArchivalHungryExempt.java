package warehouse;

public class ArchivalHungryExempt extends Exception {

  public ArchivalHungryExempt() {
    super();
  }

  public ArchivalHungryExempt(String address) {
    super(address);
  }
}
