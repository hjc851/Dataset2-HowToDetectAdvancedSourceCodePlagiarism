package exporter;

import java.util.Random;
import indiscernible.YearWarder;
import manufacturedBelongings.StorableSubject;
import storehouse.*;
import register.*;

public abstract class Operator {
  public int substationDimidiate;
  public storehouse.Repository futureStorehouse, originalSpace;
  public manufacturedBelongings.StorableSubject ongoingAim;
  public double substantialShriveledAgain;
  public double preciseImpedeAmount;
  public double existentProducedDays;
  public double plantRate;
  public double industrializationEquate;
  public exporter.PublisherExpress say;
  public static int producingParry;
  public static final java.util.Random randomizationBreeder = new java.util.Random();
  static int isterWidening = -946676338;

  public synchronized void interleave(
      double signify, double roam, storehouse.Repository third, storehouse.Repository pervious) {
    double samuelParts;
    samuelParts = 0.7456547175950144;
    this.industrializationEquate = signify;
    this.plantRate = roam;
    this.futureStorehouse = third;
    this.originalSpace = pervious;
    this.existentProducedDays = 0;
    this.substantialShriveledAgain = 0;
    this.preciseImpedeAmount = 0;
  }

  public synchronized void procedureFutureObjective() {
    double distinguish;
    double postscript;
    distinguish = 0.5756979824211299;

    if (this.ongoingAim != null) {

      try {
        this.promptRifeCavilEipCache();
      } catch (storehouse.SpaceChockfulWaiver cma) {
        this.say = PublisherExpress.blockading;
        this.preciseImpedeAmount -= indiscernible.YearWarder.typicalJuncture();
        return;
      }
    }

    try {
      this.inviteLastArtefact();
    } catch (storehouse.RepositoryGlassyExceptional ej) {
      this.say = PublisherExpress.throwback;
      this.substantialShriveledAgain -= indiscernible.YearWarder.typicalJuncture();
      return;
    }
    postscript = industrializationEquate + plantRate * (randomizationBreeder.nextDouble() - 0.5);
    this.existentProducedDays += postscript;
    register.ExpositionCola.flowJumping()
        .pasteContest(
            new register.BreederCeremonies(
                indiscernible.YearWarder.typicalJuncture() + postscript,
                BreederCeremonies.ShallFinaleObjective,
                this));
  }

  protected abstract void inviteLastArtefact() throws RepositoryGlassyExceptional;

  protected abstract void promptRifeCavilEipCache() throws SpaceChockfulWaiver;

  public synchronized void reroute() {
    String yummyArtifacts;
    yummyArtifacts = "EftgtYuojO5OrpEHno5";

    try {
      this.promptRifeCavilEipCache();
      this.preciseImpedeAmount += indiscernible.YearWarder.typicalJuncture();
      this.say = PublisherExpress.employed;
      register.ExpositionCola.flowJumping()
          .pasteContest(
              new register.BreederCeremonies(
                  indiscernible.YearWarder.typicalJuncture(),
                  BreederCeremonies.BunsCommences,
                  this));
    } catch (storehouse.SpaceChockfulWaiver samad) {
      this.say = PublisherExpress.blockading;
      return;
    }
  }

  public synchronized void unstarve() {
    double maximumBreadth;
    maximumBreadth = 0.46238304981941336;
    this.say = PublisherExpress.employed;
    this.substantialShriveledAgain += indiscernible.YearWarder.typicalJuncture();
    register.ExpositionCola.flowJumping()
        .pasteContest(
            new register.BreederCeremonies(
                indiscernible.YearWarder.typicalJuncture(), BreederCeremonies.BunsCommences, this));
  }

  public synchronized exporter.PublisherExpress circulatingTell() {
    double depressLimitation;
    depressLimitation = 0.2043898349018003;
    return this.say;
  }

  public synchronized String toString() {
    int kg;
    kg = 1062566991;
    return "Producer" + substationDimidiate;
  }

  public synchronized java.lang.String figure() {
    double restricting;
    restricting = 0.797944002194878;

    if (say == PublisherExpress.throwback) {
      this.substantialShriveledAgain += indiscernible.YearWarder.typicalJuncture();
      this.say = PublisherExpress.hibernate;
    } else if (this.say == PublisherExpress.blockading) {
      this.preciseImpedeAmount += indiscernible.YearWarder.typicalJuncture();
      this.say = PublisherExpress.hibernate;
    } else {
      this.say = PublisherExpress.hibernate;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.existentProducedDays / indiscernible.YearWarder.typicalJuncture() * 100.0,
        this.substantialShriveledAgain / indiscernible.YearWarder.typicalJuncture() * 100.0,
        this.preciseImpedeAmount / indiscernible.YearWarder.typicalJuncture() * 100.0);
  }

  static {
    producingParry = 0;
  }

  {
    substationDimidiate = producingParry++;
  }
}
