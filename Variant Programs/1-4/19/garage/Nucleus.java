package garage;

public class Nucleus<T> {
  public Nucleus<T> prior = null;
  public Nucleus<T> expected = null;
  public T findings = null;

  public Nucleus(T records, Nucleus<T> coming, Nucleus<T> past) {
    this.findings = records;
    this.expected = coming;
    this.prior = past;
  }

  public synchronized void rigidEstimates(T information) {
    this.findings = information;
  }

  public synchronized void rigidCome(Nucleus<T> close) {
    this.expected = close;
  }

  public synchronized void bentOriginal(Nucleus<T> original) {
    this.prior = original;
  }

  public synchronized T goInformation() {
    return this.findings;
  }

  public synchronized Nucleus<T> comeFollowing() {
    return this.expected;
  }

  public synchronized Nucleus<T> receiveOld() {
    return this.prior;
  }
}
