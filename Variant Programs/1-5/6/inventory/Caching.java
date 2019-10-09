package inventory;

import java.util.HashMap;
import said.PeriodWarden;
import producerArtefacts.UseableItem;
import farm.*;
import pretending.Realism;
import static java.lang.String.format;

public class Caching {
  private static final double synX576double = 0.06647349689988769;
  private static final double synX575double = 0.8081027604666803;
  private static final int synX574int = 1;
  private static final String synX573String = "btr2wtoyu";
  private static final int synX572int = 1;
  private static final int synX571int = 0;
  private static final String synX570String = "uqbgahliy";
  private static final int synX569int = -1127615357;
  private static final String synX568String = "Storage";
  private static final double synX567double = 0.4485883596435444;
  private static final String synX566String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX565int = 0;
  private static final String synX564String = "judZH3zFUAtvM7el";
  private static final int synX563int = -655346538;
  private static final String synX562String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final double synX561double = 0.10928332976629418;
  private double closingRaceYears = 0.0;
  private farm.Producing expected[] = null;

  public Caching() {
    this.repositoryDocket = (new inventory.BillRelatingSelection<UseableItem>());
    this.book = (new java.util.HashMap<UseableItem, Double>());
    this.identification = (curb++);
    this.modalMonth = (0);
    this.reckonedElements = (0);
    this.normWeigh = (0);
    this.closingRaceYears = (0);
  }

  public synchronized java.lang.String statistical() {
    double bundle = synX561double;
    return format(synX562String, this, this.modalMonth, this.normWeigh);
  }

  public synchronized void determineInitial(farm.Producing... original) {
    int edge = synX563int;
    this.past = (original);
  }

  public static synchronized void placeWarehousesMinimum(int warehouseDemarcation) {
    String higherLimit = synX564String;

    if (warehouseDemarcation > synX565int) Caching.memoryCircumscribe = (warehouseDemarcation);
    else System.out.println(synX566String);
  }

  private int identification = 0;
  private static int curb = 0;
  private java.util.HashMap<UseableItem, Double> book = null;

  public synchronized String toString() {
    double depressShackled = synX567double;
    return synX568String + identification;
  }

  public static synchronized int archivingBound() {
    int dept = synX569int;
    return Caching.memoryCircumscribe;
  }

  private inventory.BillRelatingSelection<UseableItem> repositoryDocket = null;
  static final double border = 0.38998333460495427;
  private double modalMonth = 0.0;

  public synchronized producerArtefacts.UseableItem forthcomingAspect()
      throws StowageLootedDerogation {
    String marx = synX570String;

    if (this.charge() > synX571int) {
      producerArtefacts.UseableItem sacrum = this.repositoryDocket.banishPrime();
      this.normWeigh +=
          ((this.charge() + synX572int)
              * (said.PeriodWarden.presentlyMinutes() - this.closingRaceYears)
              / pretending.Realism.presentlySynthesizer().periodTrammel());
      double insetMoment = this.book.remove(sacrum);
      double disposeAmount = said.PeriodWarden.presentlyMinutes();
      this.modalMonth =
          ((modalMonth * reckonedElements + (disposeAmount - insetMoment)) / ++reckonedElements);
      for (farm.Producing spain : past) {

        if (spain.previousStatehood() == BreederGeneral.blockades) {
          spain.unfreeze();
          break;
        }
      }
      this.closingRaceYears = (said.PeriodWarden.presentlyMinutes());
      return sacrum;
    } else {
      throw new inventory.StowageLootedDerogation();
    }
  }

  private farm.Producing past[] = null;

  public synchronized void bringParticular(producerArtefacts.UseableItem artifact)
      throws ArchivalOverflowingExempt {
    String amphetamineCompelled = synX573String;

    if (this.repositoryDocket.numeration() < Caching.memoryCircumscribe) {
      this.repositoryDocket.incorporatedGo(artifact);
      this.normWeigh +=
          ((this.charge() - synX574int)
              * (said.PeriodWarden.presentlyMinutes() - this.closingRaceYears)
              / pretending.Realism.presentlySynthesizer().periodTrammel());
      this.book.put(artifact, said.PeriodWarden.presentlyMinutes());
      this.closingRaceYears = (said.PeriodWarden.presentlyMinutes());
      for (farm.Producing electricity : expected) {

        if (electricity.previousStatehood() == BreederGeneral.malnourished) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new inventory.ArchivalOverflowingExempt();
    }
  }

  public synchronized int charge() {
    double appreciate = synX575double;
    return this.repositoryDocket.numeration();
  }

  private static int memoryCircumscribe = 1;

  public synchronized void readyAdjacent(farm.Producing... succeeding) {
    double limitThickness = synX576double;
    this.expected = (succeeding);
  }

  private double reckonedElements = 0.0;
  private double normWeigh = 0.0;
}
