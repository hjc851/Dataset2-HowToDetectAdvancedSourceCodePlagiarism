public class Pitcairn {
  public int frequencyProducers = 0;
  public String territoryMake = null;

  public Pitcairn(String archipelagicDescribe, int severalCattle) {
    this.territoryMake = archipelagicDescribe;
    this.frequencyProducers = severalCattle;
  }

  public synchronized void initiate() {

    for (int i = 0; i < frequencyProducers; i++) {
      new Thread(new Agriculture(territoryMake + "_Farmer" + (i + 1))).start();
    }
  }
}
