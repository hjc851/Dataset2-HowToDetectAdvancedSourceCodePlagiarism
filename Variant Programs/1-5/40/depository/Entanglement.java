package depository;

public class Entanglement<T> {
  private T records = null;
  private depository.Entanglement<T> incoming = null;
  private depository.Entanglement<T> former = null;

  public Entanglement(T intelligence, Entanglement<T> coming, Entanglement<T> pre) {
    this.records = intelligence;
    this.incoming = coming;
    this.former = pre;
  }

  public synchronized void fixReports(T evidence) {
    this.records = evidence;
  }

  public synchronized void rigidCome(depository.Entanglement<T> expected) {
    this.incoming = expected;
  }

  public synchronized void situatedLatest(depository.Entanglement<T> premature) {
    this.former = premature;
  }

  public synchronized T conveyEstimates() {
    return this.records;
  }

  public synchronized depository.Entanglement<T> beatThe() {
    return this.incoming;
  }

  public synchronized depository.Entanglement<T> startLatest() {
    return this.former;
  }
}
