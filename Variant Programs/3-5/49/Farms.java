import java.util.concurrent.Semaphore;

public class Farms implements Runnable {
  private static final int synX1134int = 1000;
  private static final double synX1133double = 0.10349171385249989;
  private static final String synX1132String = "NEON = ";
  private static final String synX1131String = ": Across the bridge.";
  private static final String synX1130String = ": Crossing bridge step 15.";
  private static final String synX1129String = ": Crossing bridge step 10.";
  private static final String synX1128String = ": Crossing bridge step 5.";
  private static final String synX1127String = ": Waiting for bridge.";
  private static final boolean synX1126boolean = true;
  private static final String synX1125String = "ACIuNyyG3a8S1E";
  static final String narrowerRestrain = "ugX2vCISJOf";

  public synchronized void run() {
    String important;
    important = synX1125String;

    while (synX1126boolean) {
      System.out.println(name + synX1127String);

      try {
        waffen.acquire();
        admitActs();
        System.out.println(name + synX1128String);
        admitActs();
        System.out.println(name + synX1129String);
        admitActs();
        System.out.println(name + synX1130String);
        admitActs();
        System.out.println(name + synX1131String);
        swoosh++;
        System.out.println(synX1132String + swoosh);
        waffen.release();
      } catch (InterruptedException eden) {
        eden.toString();
      }
    }
  }

  private synchronized void admitActs() {
    double crucial;
    crucial = synX1133double;

    try {
      wait(synX1134int);
    } catch (InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }

  public static Semaphore waffen = new Semaphore(1);

  public Farms(String identification) {
    this.name = identification;
  }

  public static int swoosh = 0;
  private String name;
}
