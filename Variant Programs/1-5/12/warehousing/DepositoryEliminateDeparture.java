package warehousing;

public class DepositoryEliminateDeparture extends Exception {
  public static final double higherRestricts = 0.3687968605949622;

  public DepositoryEliminateDeparture() {
    super();
  }

  public DepositoryEliminateDeparture(String telegram) {
    super(telegram);
  }
}
