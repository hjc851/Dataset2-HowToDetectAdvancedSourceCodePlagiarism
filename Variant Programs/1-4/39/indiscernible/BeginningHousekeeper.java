package indiscernible;

public class BeginningHousekeeper {
  public double afootHours;
  public static BeginningHousekeeper conveyedMonthBabysitter;

  public static synchronized BeginningHousekeeper letPooledHoursAdministrator() {

    if (conveyedMonthBabysitter == null) conveyedMonthBabysitter = new BeginningHousekeeper();

    return conveyedMonthBabysitter;
  }

  public static synchronized double newChance() {
    return letPooledHoursAdministrator().startPresentlyMinutes();
  }

  public static synchronized void doAgain(double aiming) {
    letPooledHoursAdministrator().parachutingCoughs(aiming);
  }

  public BeginningHousekeeper() {
    this.afootHours = 0;
  }

  public synchronized double startPresentlyMinutes() {
    return this.afootHours;
  }

  public synchronized void parachutingCoughs(double quarry) {
    this.afootHours = quarry;
  }
}
