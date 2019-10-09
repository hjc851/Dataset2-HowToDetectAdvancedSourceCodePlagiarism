package warehouse;

public class DepositoryEliminateDeparture extends Exception {

  public DepositoryEliminateDeparture() {
    super();
  }

  public DepositoryEliminateDeparture(String address) {
    super(address);
  }
}
