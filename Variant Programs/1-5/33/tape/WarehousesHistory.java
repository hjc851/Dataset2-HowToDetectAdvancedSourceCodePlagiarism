package tape;

import productivityDevices.StorableSubject;

public class WarehousesHistory extends FestivalRegister {

  public synchronized int authority() {
    return this.wherewithal;
  }

  public static final String FailedTransfer = "DID_REMOVE";
  public StorableSubject subjugate;
  public static final String SeemedTotal = "DID_ADD";
  public int wherewithal;

  public WarehousesHistory(double thing, String update, int load, StorableSubject taxable) {
    this.day = thing;
    this.learn = update;
    this.wherewithal = load;
    this.subjugate = taxable;
  }

  public synchronized StorableSubject quarry() {
    return this.subjugate;
  }
}
