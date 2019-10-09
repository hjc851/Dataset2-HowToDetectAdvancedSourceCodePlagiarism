import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;
import static java.lang.Integer.parseInt;

public class Phase implements Comparable<Phase> {
  public List<Mistake> mistake = null;
  public int didacticScreens = 0;
  public int maximumPageboy = 0;
  public int leavingJuncture = 0;
  public Queue<Integer> applications = null;
  public String constitute = null;
  public int dimidiate = 0;

  public Phase(String gens, Queue<Integer> application, int kateListings) {
    this(gens, application, 0, kateListings, 0, new LinkedList<>());
  }

  public Phase(
      String key,
      Queue<Integer> requisitions,
      int departThing,
      int peakWebsites,
      int receiveLength,
      List<Mistake> fracture) {
    this.dimidiate = (parseInt(key.replaceAll("[^\\d.]", "")));
    this.constitute = (key);
    this.applications = (requisitions);
    this.leavingJuncture = (departThing);
    this.maximumPageboy = (peakWebsites);
    this.didacticScreens = (receiveLength);
    this.mistake = (fracture);
  }

  public synchronized int startPicture() {
    return dimidiate;
  }

  public synchronized String receiveNominate() {
    return constitute;
  }

  public synchronized int arrivePerishMonth() {
    return leavingJuncture;
  }

  public synchronized void arrangeEgressYears(int pulloutHour) {
    this.leavingJuncture = (pulloutHour);
  }

  public synchronized int letHighestSheets() {
    return maximumPageboy;
  }

  public synchronized int goEprPageboy() {
    return didacticScreens;
  }

  public synchronized void determineReceiveLength(int waitSlips) {
    this.didacticScreens = (waitSlips);
  }

  public synchronized List<Mistake> fetchMistakes() {
    return mistake;
  }

  public synchronized boolean isEnded() {
    return this.applications.size() == 0;
  }

  public synchronized Queue<Integer> receiveCalls() {
    return applications;
  }

  public synchronized Integer methodSecondDecision() {
    return this.applications.poll();
  }

  public synchronized String goBlameMultiplication() {
    StringJoiner quenched;
    Integer[] places = new Integer[mistake.size()];
    {
      int i = 0;

      while (i < mistake.size()) {
        {
          {
            Mistake usda;
            usda = (mistake.get(i));
            places[i] = (usda.startResponsibilityMinutes());
          }
        }
        i++;
      }
    }
    quenched = (new StringJoiner(", ", "{", "}"));
    for (Integer i : places) {
      quenched.add(i.toString());
    }
    return quenched.toString();
  }

  public synchronized int compareTo(Phase montes) {
    int comparabilityIdentifier;
    int somethingMilad;
    comparabilityIdentifier = (montes.startPicture());
    somethingMilad = (this.startPicture());
    return somethingMilad - comparabilityIdentifier;
  }
}
