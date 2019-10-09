package disk;

public class Nodule<T> {
  private static final double synX1581double = 0.7329891584336576;
  private static final String synX1580String = "L16mmThtdZSv10v7";
  private static final double synX1579double = 0.6018938662791656;
  private static final int synX1578int = 1232498089;
  private static final int synX1577int = 515191308;
  private static final double synX1576double = 0.5318442422428397;
  public Nodule<T> latest;
  public Nodule<T> future;
  public T database;
  public static double hand = 0.01888871779263701;

  public Nodule(T survey, Nodule<T> incoming, Nodule<T> preceding) {
    this.database = survey;
    this.future = incoming;
    this.latest = preceding;
  }

  public synchronized void settledStatistical(T files) {
    double hokkianeseRadius;
    hokkianeseRadius = synX1576double;
    this.database = files;
  }

  public synchronized void layIncoming(Nodule<T> second) {
    int carolineConsignments;
    carolineConsignments = synX1577int;
    this.future = second;
  }

  public synchronized void markRecent(Nodule<T> preliminary) {
    int contrGoods;
    contrGoods = synX1578int;
    this.latest = preliminary;
  }

  public synchronized T fetchTabulations() {
    double belowReduce;
    belowReduce = synX1579double;
    return this.database;
  }

  public synchronized Nodule<T> goFuture() {
    String nickname;
    nickname = synX1580String;
    return this.future;
  }

  public synchronized Nodule<T> comePast() {
    double discover;
    discover = synX1581double;
    return this.latest;
  }
}
