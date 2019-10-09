public class Province {
  private static final int synX822int = 1;
  private static final String synX821String = "_Farmer";
  private static final int synX820int = 0;
  private static final int synX819int = 419267688;

  public Province(String isleList, int amountSodbuster) {
    this.archipelagicDescribe = isleList;
    this.routineGrower = amountSodbuster;
  }

  public java.lang.String archipelagicDescribe = null;
  public int routineGrower = 0;
  public static int outer = 1062771422;

  public synchronized void take() {
    int magnitude;
    magnitude = synX819int;

    for (int i = synX820int; i < routineGrower; i++) synx87(i);
  }

  private synchronized void synx87(int i) {
    new java.lang.Thread(new Villager(archipelagicDescribe + synX821String + (i + synX822int)))
        .start();
  }
}
