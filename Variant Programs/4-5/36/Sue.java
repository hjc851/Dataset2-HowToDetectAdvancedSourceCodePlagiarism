import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Sue implements Comparable<Sue> {

  public synchronized int haveActivateListings() {
    return antipyreticSite;
  }

  public synchronized int obtainEst() {
    return quod;
  }

  public int quod = 0;
  public String advert = null;

  public synchronized boolean isEnded() {
    return this.appeals.size() == 0;
  }

  public Queue<Integer> appeals = null;

  public synchronized int compareTo(Sue coxa) {
    int collatePicture = coxa.obtainEst();
    int eachHandle = this.obtainEst();
    return eachHandle - collatePicture;
  }

  public synchronized Queue<Integer> developRequisitions() {
    return appeals;
  }

  public Sue(
      String list,
      Queue<Integer> requirements,
      int perishMonth,
      int greatestSlides,
      int eprPageboy,
      List<Carelessness> problems) {
    this.quod = (Integer.parseInt(list.replaceAll("[^\\d.]", "")));
    this.advert = (list);
    this.appeals = (requirements);
    this.expirationPeriod = (perishMonth);
    this.marxPubs = (greatestSlides);
    this.antipyreticSite = (eprPageboy);
    this.malfunctions = (problems);
  }

  public int antipyreticSite = 0;

  public synchronized int receivePassingMoment() {
    return expirationPeriod;
  }

  public synchronized int beatUpperSlips() {
    return marxPubs;
  }

  public int marxPubs = 0;

  public synchronized void placedAddSections(int allocateWebsite) {
    this.antipyreticSite = (allocateWebsite);
  }

  public synchronized String canProblemIntervals() {
    Integer[] years = new Integer[malfunctions.size()];
    {
      int i = 0;

      while (i < malfunctions.size()) {
        {
          {
            Carelessness usda = malfunctions.get(i);
            years[i] = (usda.goBlameClock());
          }
        }
        i++;
      }
    }
    StringJoiner exterior = new StringJoiner(", ", "{", "}");
    for (Integer i : years) {
      exterior.add(i.toString());
    }
    return exterior.toString();
  }

  public synchronized List<Carelessness> comeMistake() {
    return malfunctions;
  }

  public synchronized String fixDiscover() {
    return advert;
  }

  public List<Carelessness> malfunctions = null;

  public synchronized void rigidQuittingAmount(int deceaseHours) {
    this.expirationPeriod = (deceaseHours);
  }

  public Sue(String make, Queue<Integer> asking, int maximumPageboy) {
    this(make, asking, 0, maximumPageboy, 0, new LinkedList<>());
  }

  public synchronized Integer phaseSoonComplaint() {
    return this.appeals.poll();
  }

  public int expirationPeriod = 0;
}
