package lapse;

public class JunctureJailer {
  public double latestClip = 0.0;
  public static JunctureJailer distributedMomentSitter = null;

  public static synchronized JunctureJailer receiveDistributedMomentSitter() {

    if (distributedMomentSitter == null) distributedMomentSitter = new JunctureJailer();

    return distributedMomentSitter;
  }

  public static synchronized double formerAmount() {
    return receiveDistributedMomentSitter().obtainLiveDays();
  }

  public static synchronized void orderedChance(double threshold) {
    receiveDistributedMomentSitter().springEfp(threshold);
  }

  public JunctureJailer() {
    this.latestClip = 0;
  }

  public synchronized double obtainLiveDays() {
    return this.latestClip;
  }

  public synchronized void springEfp(double achieve) {
    this.latestClip = achieve;
  }
}
