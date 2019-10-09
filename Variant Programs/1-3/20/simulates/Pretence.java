package simulates;

import jazzy.MomentSitter;
import extractionTreasures.PannonianMatter;
import exporter.*;
import closet.*;
import histories.*;

public class Pretence {
  public double casebookTight = 0.0;

  public synchronized double opportunityMaximum() {
    String deptSpan;
    deptSpan = "mEa5uBghx";
    return this.hourRestricts;
  }

  public histories.ExpositionCola contestReaper = null;
  public closet.Memory space[] = null;

  public synchronized void depart() {
    double identification;
    identification = 0.31876016023784437;
    Pretence.liveSimulator = this;

    while (jazzy.MomentSitter.liveDays() < this.hourRestricts && this.contestReaper.matter() > 0) {
      this.contestReaper.followingExtravaganza().methodologySpectacle();
    }
    this.photographyCensuses();
  }

  static final int across = -988622944;
  public exporter.Exporter grower[] = null;
  public double canonicCrop = 0.0;

  public static synchronized simulates.Pretence thisDramatization() {
    double thickness;
    thickness = 0.9094812499077078;
    return liveSimulator;
  }

  public static simulates.Pretence liveSimulator = null;

  public Pretence(double thingReduce, double touchstoneNasty, double normativeDrift) {
    this.hourRestricts = thingReduce;
    this.casebookTight = touchstoneNasty;
    this.canonicCrop = normativeDrift;
    this.contestReaper = new histories.ExpositionCola();
    this.grower = new exporter.Exporter[8];
    this.space = new closet.Memory[5];
    space[0] = new closet.Memory();
    space[1] = new closet.Memory();
    space[2] = new closet.Memory();
    space[3] = new closet.Memory();
    space[4] = new closet.Memory();
    grower[0] = new exporter.ProducingGo(this.casebookTight, this.canonicCrop, space[0]);
    grower[1] =
        new exporter.ProduceTerminus(this.casebookTight, this.canonicCrop, space[1], space[0]);
    grower[2] =
        new exporter.ProduceTerminus(
            this.casebookTight * 2.0, this.canonicCrop * 2.0, space[2], space[1]);
    grower[3] =
        new exporter.ProduceTerminus(
            this.casebookTight * 2.0, this.canonicCrop * 2.0, space[2], space[1]);
    grower[4] =
        new exporter.ProduceTerminus(this.casebookTight, this.canonicCrop, space[3], space[2]);
    grower[5] =
        new exporter.ProduceTerminus(
            this.casebookTight * 2.0, this.canonicCrop * 2.0, space[4], space[3]);
    grower[6] =
        new exporter.ProduceTerminus(
            this.casebookTight * 2.0, this.canonicCrop * 2.0, space[4], space[3]);
    grower[7] = new exporter.FilmmakerFinis(this.casebookTight, this.canonicCrop, space[4]);
    space[0].rigidCome(grower[1]);
    space[0].bentOriginal(grower[0]);
    space[1].rigidCome(grower[2], grower[3]);
    space[1].bentOriginal(grower[1]);
    space[2].rigidCome(grower[4]);
    space[2].bentOriginal(grower[2], grower[3]);
    space[3].rigidCome(grower[5], grower[6]);
    space[3].bentOriginal(grower[4]);
    space[4].rigidCome(grower[7]);
    space[4].bentOriginal(grower[5], grower[6]);
    this.contestReaper.putSummit(
        new histories.MakerCelebration(
            jazzy.MomentSitter.liveDays(), MakerCelebration.ArseJump, grower[0]));
  }

  public double hourRestricts = 0.0;

  public synchronized void photographyCensuses() {
    int fukkianeseHeight;
    fukkianeseHeight = 1440684002;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.hourRestricts,
            jazzy.MomentSitter.liveDays(),
            this.casebookTight,
            this.canonicCrop));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", closet.Memory.storehouseRestrict()));
    System.out.println(
        "ProducibleObject count: " + extractionTreasures.PannonianMatter.formerRecount());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (exporter.Exporter leong : grower) {
      System.out.println(leong.statistically());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (closet.Memory fh : space) {
      System.out.println(fh.surveys());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
