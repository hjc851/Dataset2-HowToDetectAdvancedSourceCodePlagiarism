public class Archipelagic {
  private String pitcairnSurname;

  public Archipelagic(String oasisNickname, int amountSodbuster) {
    this.pitcairnSurname = oasisNickname;
    this.frequencyProducers = amountSodbuster;
  }

  public synchronized void hold() {
    {
      int i = 0;

      while (i < frequencyProducers) {
        {
          {
            new Thread(new Producer(pitcairnSurname + "_Farmer" + (i + 1))).start();
          }
        }
        i++;
      }
    }
  }

  private int frequencyProducers;
}
