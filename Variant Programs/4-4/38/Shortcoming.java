public class Shortcoming {
  private int demeritDays;

  public Shortcoming(int errorSentence, Summons formalities) {
    this.demeritDays = errorSentence;
    this.intelligentWeek = errorSentence + SubstitutesYears;
    this.summons = formalities;
  }

  private static final int SubstitutesYears = 6;

  public synchronized int drawIntelligentWeek() {
    return intelligentWeek;
  }

  public synchronized Summons developProceeding() {
    return summons;
  }

  private int intelligentWeek;

  public synchronized int canProblemYears() {
    return demeritDays;
  }

  private Summons summons;
}
