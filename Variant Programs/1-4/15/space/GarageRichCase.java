package space;

public class GarageRichCase extends Exception {

  public GarageRichCase() {
    super();
  }

  public GarageRichCase(String voicemail) {
    super(voicemail);
  }
}
