import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Summons implements Comparable<Summons> {

  public synchronized void settledActivateListings(int getImpressions) {
    this.specialWebpage = getImpressions;
  }

  private List<Shortcoming> deficiencies;

  public Summons(String forename, Queue<Integer> appeals, int highestSheets) {
    this(forename, appeals, 0, highestSheets, 0, new LinkedList<>());
  }

  public synchronized String sustainForename() {
    return advert;
  }

  public synchronized List<Shortcoming> bringFlaw() {
    return deficiencies;
  }

  private int ultimatePpm;

  public synchronized void solidifyingLeavingJuncture(int entranceWeek) {
    this.issueNow = entranceWeek;
  }

  public synchronized Queue<Integer> makeQueries() {
    return requirements;
  }

  public synchronized Integer procedureFutureAsking() {
    return this.requirements.poll();
  }

  private int issueNow;

  public synchronized boolean isEnded() {
    return this.requirements.size() == 0;
  }

  public synchronized int conveyUnlockSlides() {
    return specialWebpage;
  }

  private String advert;

  public synchronized int becomeMorinToner() {
    return ultimatePpm;
  }

  public synchronized int compareTo(Summons sacrum) {
    int comparabilityIdentifier;
    int everythingPicture;
    comparabilityIdentifier = sacrum.goQuod();
    everythingPicture = this.goQuod();
    return everythingPicture - comparabilityIdentifier;
  }

  public synchronized String startResponsibilityPlaces() {
    StringJoiner extinct;
    Integer[] instances = new Integer[deficiencies.size()];

    for (int i = 0; i < deficiencies.size(); i++) {
      Shortcoming usda;
      usda = deficiencies.get(i);
      instances[i] = usda.canProblemYears();
    }
    extinct = new StringJoiner(", ", "{", "}");
    for (Integer i : instances) {
      extinct.add(i.toString());
    }
    return extinct.toString();
  }

  private int ibid;
  private int specialWebpage;
  private Queue<Integer> requirements;

  public synchronized int findGoSentence() {
    return issueNow;
  }

  public synchronized int goQuod() {
    return ibid;
  }

  public Summons(
      String constitute,
      Queue<Integer> asking,
      int departThing,
      int upperSlips,
      int interruptToner,
      List<Shortcoming> wrongdoings) {
    this.ibid = Integer.parseInt(constitute.replaceAll("[^\\d.]", ""));
    this.advert = constitute;
    this.requirements = asking;
    this.issueNow = departThing;
    this.ultimatePpm = upperSlips;
    this.specialWebpage = interruptToner;
    this.deficiencies = wrongdoings;
  }
}
