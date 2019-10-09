package warehouses;

public class Ganglia<T> {
  public Ganglia<T> initial = null;
  public Ganglia<T> following = null;
  public T intelligence = null;

  public Ganglia(T study, Ganglia<T> then, Ganglia<T> earlier) {
    this.intelligence = study;
    this.following = then;
    this.initial = earlier;
  }

  public synchronized void situatedComputer(T computer) {
    this.intelligence = computer;
  }

  public synchronized void situatedForthcoming(Ganglia<T> last) {
    this.following = last;
  }

  public synchronized void doFinal(Ganglia<T> premature) {
    this.initial = premature;
  }

  public synchronized T haveStatistical() {
    return this.intelligence;
  }

  public synchronized Ganglia<T> obtainLast() {
    return this.following;
  }

  public synchronized Ganglia<T> findEarly() {
    return this.initial;
  }
}
