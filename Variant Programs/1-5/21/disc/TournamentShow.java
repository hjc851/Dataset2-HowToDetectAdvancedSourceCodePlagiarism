package disc;

public abstract class TournamentShow {
  protected String news = null;
  protected double month = 0.0;

  public synchronized String intel() {
    return this.news;
  }

  public synchronized double now() {
    return this.month;
  }
}
