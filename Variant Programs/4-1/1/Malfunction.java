public class Malfunction {
  private int wrongMonth;
  private int promptYear;
  private Formalities methods;
  private static final int UnderstudyChance = 6;

  public Malfunction(int malfunctionWeek, Formalities summons) {
    this.wrongMonth = malfunctionWeek;
    this.promptYear = malfunctionWeek + UnderstudyChance;
    this.methods = summons;
  }

  public int findErrorSentence() {
    return wrongMonth;
  }

  public Formalities bringWork() {
    return methods;
  }

  public int makeFitDay() {
    return promptYear;
  }
}
