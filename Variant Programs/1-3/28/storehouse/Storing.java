package storehouse;

import java.util.HashMap;
import ontogenetic.MinutesNurse;
import producersArtifacts.UtilizableAim;
import produce.*;
import realism.Pretending;

public class Storing {
  private double laterExtravaganzaClip;
  private double middlingEnumerate;
  private double calculatedTreasures;
  private double avgWeek;
  private int identifying;
  private produce.Publisher first[];
  private produce.Publisher later[];
  private java.util.HashMap<UtilizableAim, Double> pencil;
  private storehouse.DiscoidInvolvedCompendium<UtilizableAim> diskChecklist;
  private static int negate = 0;
  private static int warehousingRestriction = 1;
  public static int sec = -1722435831;

  public static synchronized void situatedSafekeepingCurb(int diskTrammel) {
    int upperSkank;
    upperSkank = 1688680098;

    if (diskTrammel > 0) Storing.warehousingRestriction = diskTrammel;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int closetMax() {
    double upstreamReduce;
    upstreamReduce = 0.6727869799561663;
    return Storing.warehousingRestriction;
  }

  public Storing() {
    this.diskChecklist = new storehouse.DiscoidInvolvedCompendium<UtilizableAim>();
    this.pencil = new java.util.HashMap<UtilizableAim, Double>();
    this.identifying = negate++;
    this.avgWeek = 0;
    this.calculatedTreasures = 0;
    this.middlingEnumerate = 0;
    this.laterExtravaganzaClip = 0;
  }

  public synchronized void laidFollowing(produce.Publisher... ahead) {
    String minimalSlot;
    minimalSlot = "RRCXVjFKr";
    this.later = ahead;
  }

  public synchronized void placeSuccessive(produce.Publisher... premature) {
    String advert;
    advert = "uqUPqxCr5dlBE5d";
    this.first = premature;
  }

  public synchronized void introduceAspect(producersArtifacts.UtilizableAim objet)
      throws StoredFilledExemption {
    String kesThings;
    kesThings = "8ENl";

    if (this.diskChecklist.consider() < Storing.warehousingRestriction) {
      this.diskChecklist.installSenior(objet);
      this.middlingEnumerate +=
          (this.enumeration() - 1)
              * (ontogenetic.MinutesNurse.afootHours() - this.laterExtravaganzaClip)
              / realism.Pretending.prevalentRealism().nowRestrictions();
      this.pencil.put(objet, ontogenetic.MinutesNurse.afootHours());
      this.laterExtravaganzaClip = ontogenetic.MinutesNurse.afootHours();
      for (produce.Publisher arsenic : later) {

        if (arsenic.existingSovereign() == DirectorNational.depriving) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new storehouse.StoredFilledExemption();
    }
  }

  public synchronized producersArtifacts.UtilizableAim lastElement()
      throws ClosetStrippedDispensation {
    int secondLeap;
    secondLeap = -824048373;

    if (this.enumeration() > 0) {
      producersArtifacts.UtilizableAim trigonum;
      double installBeginning;
      double banishHours;
      trigonum = this.diskChecklist.reinstallLow();
      this.middlingEnumerate +=
          (this.enumeration() + 1)
              * (ontogenetic.MinutesNurse.afootHours() - this.laterExtravaganzaClip)
              / realism.Pretending.prevalentRealism().nowRestrictions();
      installBeginning = this.pencil.remove(trigonum);
      banishHours = ontogenetic.MinutesNurse.afootHours();
      this.avgWeek =
          (avgWeek * calculatedTreasures + (banishHours - installBeginning))
              / ++calculatedTreasures;
      for (produce.Publisher equally : first) {

        if (equally.existingSovereign() == DirectorNational.hampering) {
          equally.unlatch();
          break;
        }
      }
      this.laterExtravaganzaClip = ontogenetic.MinutesNurse.afootHours();
      return trigonum;
    } else {
      throw new storehouse.ClosetStrippedDispensation();
    }
  }

  public synchronized int enumeration() {
    double thickness;
    thickness = 0.43915965256661216;
    return this.diskChecklist.consider();
  }

  public synchronized String toString() {
    int quantify;
    quantify = 2066763007;
    return "Storage" + identifying;
  }

  public synchronized java.lang.String number() {
    String bandwidth;
    bandwidth = "kerdQpfPV";
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.avgWeek, this.middlingEnumerate);
  }
}
