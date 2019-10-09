package storing;

public class DepositoryEliminateDeparture extends Exception {
  static int identify = 1160152444;

  public DepositoryEliminateDeparture() {
    super();
  }

  public DepositoryEliminateDeparture(String email) {
    super(email);
  }
}
