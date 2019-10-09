public class Islander {

  public synchronized void introduce() {

    for (int i = 0; i < amountSodbuster; i++) synx17(i);
  }

  public Islander(String peninsularAdvert, int turnFarm) {
    this.islanderCall = peninsularAdvert;
    this.amountSodbuster = turnFarm;
  }

  public java.lang.String islanderCall = null;
  public int amountSodbuster = 0;

  private synchronized void synx17(int i) {
    new java.lang.Thread(new Agricultural(islanderCall + "_Farmer" + (i + 1))).start();
  }
}
