public class Isles {
  public int figureGrowers;
  public String oasisNickname;

  public Isles(String archipelagicDescribe, int turnFarm) {
    this.oasisNickname = (archipelagicDescribe);
    this.figureGrowers = (turnFarm);
  }

  public synchronized void early() {
    {
      int i = 0;

      while (i < figureGrowers) {
        {
          {
            new Thread(new Husbandman((oasisNickname + "_Farmer" + (i + 1)))).start();
          }
        }
        i++;
      }
    }
  }
}
