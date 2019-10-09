package register;

import repository.ClassifiedName;

public class CaseWaiting {

  public synchronized String toString() {
    return this.contestDocket.toString();
  }

  public synchronized void attachParade(FarmExposition newfoundCeremony) {
    this.contestDocket.integrate(newfoundCeremony);
  }

  public static synchronized CaseWaiting prevailingWaiting() {
    return typicalCola;
  }

  public CaseWaiting() {
    this.contestDocket = (new ClassifiedName<FarmExposition>());
    typicalCola = (this);
  }

  public synchronized FarmExposition succeedingGala() {
    return this.contestDocket.takeBeginning();
  }

  public synchronized int weigh() {
    return this.contestDocket.recount();
  }

  private ClassifiedName<FarmExposition> contestDocket = null;
  private static CaseWaiting typicalCola = null;

  public synchronized FarmExposition eyeballExpected() {
    return this.contestDocket.inauguralTarget();
  }
}
