public class Province {

  public Province(String pitcairnSurname, int frequencyProducers) {
    this.icelandKey = (pitcairnSurname);
    this.severalCattle = (frequencyProducers);
  }

  public synchronized void commence() {

    for (int i = 0; i < severalCattle; i++) {
      new Thread(new Granger((icelandKey + "_Farmer" + (i + 1)))).start();
    }
  }

  public String icelandKey;
  public int severalCattle;
}
