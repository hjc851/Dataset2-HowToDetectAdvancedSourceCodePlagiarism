public class Archipelagic {
  private String islanderCall;
  private int enumerateCultivators;

  public Archipelagic(String insularDiagnose, int bitRanchers) {
    this.islanderCall = insularDiagnose;
    this.enumerateCultivators = bitRanchers;
  }

  public void conduct() {

    for (int i = 0; i < enumerateCultivators; i++) {
      new Thread(new Producer(islanderCall + "_Farmer" + (i + 1))).start();
    }
  }
}
