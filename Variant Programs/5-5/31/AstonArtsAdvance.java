import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AstonArtsAdvance extends javax.servlet.http.HttpServlet {
  private static final String synX3562String = "bensTheatre";
  private static final String synX3561String = "/WEB-INF/bookingData.ser";
  private static final double synX3560double = 0.06274102771545842;
  private static final String synX3559String = "/WEB-INF/bookingData.ser";
  private static final String synX3558String = "ewwlU5V0";
  private static final String synX3557String = "9";
  private static final String synX3556String = "8";
  private static final String synX3555String = "7";
  private static final String synX3554String = "6";
  private static final String synX3553String = "5";
  private static final String synX3552String = "4";
  private static final String synX3551String = "3";
  private static final String synX3550String = "2";
  private static final String synX3549String = "1";
  private static final String synX3548String = "0";
  private static final String synX3547String = "Z";
  private static final String synX3546String = "Y";
  private static final String synX3545String = "X";
  private static final String synX3544String = "W";
  private static final String synX3543String = "V";
  private static final String synX3542String = "U";
  private static final String synX3541String = "T";
  private static final String synX3540String = "S";
  private static final String synX3539String = "R";
  private static final String synX3538String = "Q";
  private static final String synX3537String = "P";
  private static final String synX3536String = "O";
  private static final String synX3535String = "N";
  private static final String synX3534String = "M";
  private static final String synX3533String = "L";
  private static final String synX3532String = "K";
  private static final String synX3531String = "J";
  private static final String synX3530String = "I";
  private static final String synX3529String = "H";
  private static final String synX3528String = "G";
  private static final String synX3527String = "F";
  private static final String synX3526String = "E";
  private static final String synX3525String = "D";
  private static final String synX3524String = "C";
  private static final String synX3523String = "B";
  private static final String synX3522String = "A";
  private static final double synX3521double = 0.010143737246329554;
  private static final String synX3520String = "</html>";
  private static final String synX3519String = "  </body>\t\n";
  private static final String synX3518String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3517String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3516String = "    </footer>\n";
  private static final String synX3515String = "      </div>\n";
  private static final String synX3514String = "        <p>c3063467</p>\n";
  private static final String synX3513String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3512String = "      <div class=\"author\">\n";
  private static final String synX3511String = "    <footer>\n";
  private static final String synX3510String = "    </article>\n";
  private static final String synX3509String = "      </form>\n";
  private static final String synX3508String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX3507String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX3506String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX3505String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX3504String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX3503String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX3502String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX3501String = "\" />\n";
  private static final String synX3500String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX3499String = "\" />\n";
  private static final String synX3498String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX3497String = "\" />\n";
  private static final String synX3496String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX3495String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX3494String = "\n";
  private static final String synX3493String = "</div>\n";
  private static final String synX3492String = "</p>";
  private static final String synX3491String = "\">";
  private static final String synX3490String = "<p class=\"option\" data-code=\"";
  private static final String synX3489String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX3488String = "      <div class=\"security\">\n";
  private static final String synX3487String = "</div>\n";
  private static final String synX3486String = "</p>";
  private static final String synX3485String = "<p class=\"option\">";
  private static final String synX3484String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX3483String = "      <div class=\"selected\">\n";
  private static final String synX3482String = "      <h2>Your Selection</h2>\n";
  private static final String synX3481String = "    <article>\n";
  private static final String synX3480String = "    </header>\n";
  private static final String synX3479String = "      <h1>Seat Booking</h1>\n";
  private static final String synX3478String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX3477String = "    <header>\n";
  private static final String synX3476String = "  <body class=\"booking\">\n";
  private static final String synX3475String = "  </head>\n";
  private static final String synX3474String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3473String = "    <![endif]-->\n";
  private static final String synX3472String = "      </script>\n";
  private static final String synX3471String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3470String = "    <!--[if IE]>\n";
  private static final String synX3469String = "    <title>Seat Booking</title>\n";
  private static final String synX3468String = "    <meta charset=utf-8>\n";
  private static final String synX3467String = "  <head>\n";
  private static final String synX3466String = "<html lang=\"en\">\n";
  private static final String synX3465String = "<!DOCTYPE html>\n";
  private static final String synX3464String = "";
  private static final double synX3463double = 0.10425010396471435;
  private static final String synX3462String = "benstheatre?message=success";
  private static final boolean synX3461boolean = false;
  private static final String synX3460String = "benstheatre?message=limitexceeded";
  private static final int synX3459int = 2;
  private static final int synX3458int = 0;
  private static final String synX3457String = "phone";
  private static final String synX3456String = "email";
  private static final String synX3455String = "address";
  private static final String synX3454String = "userid";
  private static final String synX3453String = "seatnumber";
  private static final String synX3452String = "seat";
  private static final String synX3451String = "row";
  private static final double synX3450double = 0.8596674846295308;
  private static final String synX3449String = "seatnumber";
  private static final String synX3448String = "seat";
  private static final String synX3447String = "row";
  private static final double synX3446double = 0.5741933517743548;
  static double list = 0.37335674067737357;
  public Can[] keisterMyriad;
  public java.lang.String series;
  public int posteriorAct;
  public int place;
  public java.lang.String visitorOwnership;
  public java.lang.String voice;
  public java.lang.String confronting;
  public java.lang.String couriers;
  public static java.util.logging.Logger trapper;

  public synchronized void doGet(HttpServletRequest motions, HttpServletResponse respond)
      throws ServletException, IOException {
    double lessRestrict = synX3446double;
    java.io.PrintWriter outgoing = respond.getWriter();
    series = motions.getParameter(synX3447String);
    place = java.lang.Integer.parseInt(motions.getParameter(synX3448String));
    posteriorAct = java.lang.Integer.parseInt(motions.getParameter(synX3449String));
    keisterMyriad = showDocumentation();
    java.lang.String recordingSummary = sustainSubscriptionTable();
    outgoing.println(recordingSummary);
  }

  public synchronized void doPost(HttpServletRequest wishes, HttpServletResponse responsive)
      throws ServletException, IOException {
    double trussed = synX3450double;
    series = wishes.getParameter(synX3451String);
    place = java.lang.Integer.parseInt(wishes.getParameter(synX3452String));
    posteriorAct = java.lang.Integer.parseInt(wishes.getParameter(synX3453String));
    visitorOwnership = wishes.getParameter(synX3454String);
    confronting = wishes.getParameter(synX3455String);
    couriers = wishes.getParameter(synX3456String);
    voice = wishes.getParameter(synX3457String);
    keisterMyriad = showDocumentation();
    int arranged = synX3458int;
    for (Can fh : keisterMyriad) synx105(fh, arranged);

    if (arranged > synX3459int) {
      responsive.sendRedirect(synX3460String);
    } else {
      keisterMyriad[posteriorAct].determinedViewerEst(visitorOwnership);
      keisterMyriad[posteriorAct].dictatedTreat(confronting);
      keisterMyriad[posteriorAct].markSend(couriers);
      keisterMyriad[posteriorAct].arrangeSwitchboard(voice);
      keisterMyriad[posteriorAct].placeWeek(RemoTheater.goPrevailingClock());
      keisterMyriad[posteriorAct].rigidProvided(synX3461boolean);
      conserveRegister(keisterMyriad);
      responsive.sendRedirect(synX3462String);
    }
  }

  public synchronized java.lang.String sustainSubscriptionTable() {
    double bersToken = synX3463double;
    java.lang.String law = safeguardGuidelines();
    java.lang.String filename = synX3464String;
    filename +=
        synX3465String
            + synX3466String
            + synX3467String
            + synX3468String
            + synX3469String
            + synX3470String
            + synX3471String
            + synX3472String
            + synX3473String
            + synX3474String
            + synX3475String
            + synX3476String
            + synX3477String
            + synX3478String
            + synX3479String
            + synX3480String
            + synX3481String
            + synX3482String
            + synX3483String
            + synX3484String;
    filename += synX3485String + series + place + synX3486String;
    filename += synX3487String + synX3488String + synX3489String;
    filename += synX3490String + law + synX3491String + law + synX3492String;
    filename +=
        synX3493String
            + synX3494String
            + synX3495String
            + synX3496String
            + place
            + synX3497String
            + synX3498String
            + series
            + synX3499String
            + synX3500String
            + posteriorAct
            + synX3501String
            + synX3502String
            + synX3503String
            + synX3504String
            + synX3505String
            + synX3506String
            + synX3507String
            + synX3508String
            + synX3509String
            + synX3510String
            + synX3511String
            + synX3512String
            + synX3513String
            + synX3514String
            + synX3515String
            + synX3516String
            + synX3517String
            + synX3518String
            + synX3519String
            + synX3520String;
    return filename;
  }

  public synchronized java.lang.String safeguardGuidelines() {
    double bounds = synX3521double;
    java.lang.String circulars[] = {
      synX3522String,
      synX3523String,
      synX3524String,
      synX3525String,
      synX3526String,
      synX3527String,
      synX3528String,
      synX3529String,
      synX3530String,
      synX3531String,
      synX3532String,
      synX3533String,
      synX3534String,
      synX3535String,
      synX3536String,
      synX3537String,
      synX3538String,
      synX3539String,
      synX3540String,
      synX3541String,
      synX3542String,
      synX3543String,
      synX3544String,
      synX3545String,
      synX3546String,
      synX3547String
    };
    java.lang.String names[] = {
      synX3548String,
      synX3549String,
      synX3550String,
      synX3551String,
      synX3552String,
      synX3553String,
      synX3554String,
      synX3555String,
      synX3556String,
      synX3557String
    };
    java.util.Random serendipity = new java.util.Random();
    java.lang.String impedance, cn, b2, abscissa, rn, d;
    impedance = circulars[serendipity.nextInt(circulars.length)];
    cn = names[serendipity.nextInt(names.length)];
    b2 = circulars[serendipity.nextInt(circulars.length)];
    abscissa = names[serendipity.nextInt(names.length)];
    rn = circulars[serendipity.nextInt(circulars.length)];
    d = names[serendipity.nextInt(names.length)];
    return impedance + cn + b2 + abscissa + rn + d;
  }

  public synchronized Can[] showDocumentation() {
    String desirability = synX3558String;

    try {
      Can[] members;
      java.io.FileInputStream proponentsDatabase =
          new java.io.FileInputStream(getServletContext().getRealPath(synX3559String));
      java.io.ObjectInputStream supporters = new java.io.ObjectInputStream(proponentsDatabase);
      members = (Can[]) supporters.readObject();
      supporters.close();
      proponentsDatabase.close();
      return members;
    } catch (java.io.IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      trapper.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void conserveRegister(Can[] benches) {
    double matt = synX3560double;

    try {
      java.io.FileOutputStream outerSubmitted =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX3561String));
      java.io.ObjectOutputStream back = new java.io.ObjectOutputStream(outerSubmitted);
      back.writeObject(benches);
      back.close();
      outerSubmitted.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  static {
    trapper = java.util.logging.Logger.getLogger(synX3562String);
  }

  private synchronized void synx105(Can fh, int arranged) throws ServletException, IOException {

    if (fh.sustainSomeoneSelf() != null && fh.sustainSomeoneSelf().equals(visitorOwnership)) {
      arranged++;
    }
  }
}
