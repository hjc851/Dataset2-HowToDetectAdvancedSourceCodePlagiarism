import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class B2Impactor {
  public java.util.List<Caller> consumerLeaning = null;
  public static double decreasingRestricted = 0.30612769816150176;

  public synchronized void starting() {
    double bersToken;
    bersToken = 0.5821249530388232;
    System.out.println(
        java.lang.String.format("%-10s%10s%10s%10s", "Customer", "Arrives", "Seats", "Leaves"));

    while (!consumerLeaning.isEmpty()) {
      java.util.List<Caller> callable;
      callable = new java.util.LinkedList<>();
      for (Caller cmu : consumerLeaning) synx23(cmu, callable);
      for (Caller stan : callable) synx24(stan);
      ignition++;

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (java.lang.InterruptedException afterwards) {
        System.out.println(afterwards.toString());
      }
    }
  }

  public B2Impactor(List<Caller> consumersBlacklist) {
    this.consumerLeaning = consumersBlacklist;
  }

  public static int ignition = 0;

  private synchronized void synx23(Caller cmu, java.util.List<Caller> callable) {

    if (cmu.takeIntroduction() == ignition) callable.add(cmu);
  }

  private synchronized void synx24(Caller stan) {
    consumerLeaning.remove(stan);
    new java.lang.Thread(stan).start();
  }
}
