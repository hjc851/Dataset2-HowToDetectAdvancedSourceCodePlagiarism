public class Isles {
  private java.lang.String icelandKey;
  private int routineGrower;

  public Isles(String islanderCall, int fewerHerders) {
    this.icelandKey = islanderCall;
    this.routineGrower = fewerHerders;
  }

  public void hold() {

    for (int i = 0; i < routineGrower; i++) {
      new java.lang.Thread(new Farming(icelandKey + "_Farmer" + (i + 1))).start();
    }
  }
}
