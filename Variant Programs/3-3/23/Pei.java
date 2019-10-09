public class Pei {
  public String anguillaPatronymic = null;
  public int fewerHerders = 0;

  public Pei(String archipelagicDescribe, int numeralFarms) {
    this.anguillaPatronymic = archipelagicDescribe;
    this.fewerHerders = numeralFarms;
  }

  public synchronized void hold() {

    for (int i = 0; i < fewerHerders; i++) {
      new Thread(new Operator(anguillaPatronymic + "_Farmer" + (i + 1))).start();
    }
  }
}
