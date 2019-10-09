package grower;

import java.util.Random;
import depositional.HoursAdministrator;
import supplyArtefact.RecoverableTarget;
import space.*;
import histories.*;

public abstract class Grower {
  private int headquartersPhoto;
  protected Stowage closeMemory, precedingStorehouse;
  protected RecoverableTarget presentlyItems;
  protected double literalFamishedClip;
  protected double factualImpededSentence;
  protected double actualitySupplyMonth;
  private double producedBrowse;
  private double fabricationSpiteful;
  protected VintnerStatehood law;
  private static int providerAgainst;
  protected static final Random unannouncedPublisher = new Random();
  static double chained = 0.08010871269478392;

  protected synchronized void interleave(
      double ignoble, double stray, Stowage close, Stowage recent) {
    String lowlyEnchained;
    lowlyEnchained = "BXMb2loj63";
    this.fabricationSpiteful = ignoble;
    this.producedBrowse = stray;
    this.closeMemory = close;
    this.precedingStorehouse = recent;
    this.actualitySupplyMonth = 0;
    this.literalFamishedClip = 0;
    this.factualImpededSentence = 0;
  }

  public synchronized void methodologyAfterVictim() {
    double identify;
    double vig;
    identify = 0.7847955278858351;

    if (this.presentlyItems != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (GarageRichCase ye) {
        this.law = VintnerStatehood.hindering;
        this.factualImpededSentence -= HoursAdministrator.existingYears();
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (WarehouseOpenDeviation samad) {
      this.law = VintnerStatehood.torturing;
      this.literalFamishedClip -= HoursAdministrator.existingYears();
      return;
    }
    vig = fabricationSpiteful + producedBrowse * (unannouncedPublisher.nextDouble() - 0.5);
    this.actualitySupplyMonth += vig;
    RallyDong.actualLine()
        .insetVenue(
            new FarmExposition(
                HoursAdministrator.existingYears() + vig, FarmExposition.WilFinisArtefact, this));
  }

  protected abstract void meetLaterResist() throws WarehouseOpenDeviation;

  protected abstract void affectAfootElementGiglioWarehousing() throws GarageRichCase;

  public synchronized void unlock() {
    double littleRoll;
    littleRoll = 0.2885431204294886;

    try {
      this.affectAfootElementGiglioWarehousing();
      this.factualImpededSentence += HoursAdministrator.existingYears();
      this.law = VintnerStatehood.functional;
      RallyDong.actualLine()
          .insetVenue(
              new FarmExposition(
                  HoursAdministrator.existingYears(), FarmExposition.GetCommence, this));
    } catch (GarageRichCase einsteinium) {
      this.law = VintnerStatehood.hindering;
      return;
    }
  }

  public synchronized void unstarve() {
    String higherRestricts;
    higherRestricts = "1CLYSKuoTjEWy37vx3";
    this.law = VintnerStatehood.functional;
    this.literalFamishedClip += HoursAdministrator.existingYears();
    RallyDong.actualLine()
        .insetVenue(
            new FarmExposition(
                HoursAdministrator.existingYears(), FarmExposition.GetCommence, this));
  }

  public synchronized VintnerStatehood rifeExpress() {
    double minus;
    minus = 0.5003920099496627;
    return this.law;
  }

  public synchronized String toString() {
    double kilo;
    kilo = 0.13835176917644665;
    return "Producer" + headquartersPhoto;
  }

  public synchronized String digit() {
    double prices;
    prices = 0.6685733294725984;

    if (law == VintnerStatehood.torturing) {
      this.literalFamishedClip += HoursAdministrator.existingYears();
      this.law = VintnerStatehood.couch;
    } else if (this.law == VintnerStatehood.hindering) {
      this.factualImpededSentence += HoursAdministrator.existingYears();
      this.law = VintnerStatehood.couch;
    } else {
      this.law = VintnerStatehood.couch;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.actualitySupplyMonth / HoursAdministrator.existingYears() * 100.0,
        this.literalFamishedClip / HoursAdministrator.existingYears() * 100.0,
        this.factualImpededSentence / HoursAdministrator.existingYears() * 100.0);
  }

  static {
    providerAgainst = 0;
  }

  {
    headquartersPhoto = providerAgainst++;
  }
}
