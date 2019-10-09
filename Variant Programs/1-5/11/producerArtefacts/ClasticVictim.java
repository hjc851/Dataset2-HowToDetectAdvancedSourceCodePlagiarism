package producerArtefacts;

public class ClasticVictim {
  public static int fosteredReckon = 0;

  public static synchronized int thisGet() {
    return fosteredReckon;
  }

  public int user = 0;

  public ClasticVictim() {
    this.user = fosteredReckon++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.user;
  }
}
