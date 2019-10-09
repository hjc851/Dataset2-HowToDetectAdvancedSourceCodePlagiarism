import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class MalcolmTheatersLeasing extends HttpServlet {
  private static final String synX1004String = "bensTheatre";
  private static final String synX1003String = "/WEB-INF/bookingData.ser";
  private static final double synX1002double = 0.5857481062410259;
  private static final String synX1001String = "/WEB-INF/bookingData.ser";
  private static final String synX1000String = "KH5yc1Qhn4zT";
  private static final double synX999double = 0.5731757835582741;
  private static final String synX998String = "9";
  private static final String synX997String = "8";
  private static final String synX996String = "7";
  private static final String synX995String = "6";
  private static final String synX994String = "5";
  private static final String synX993String = "4";
  private static final String synX992String = "3";
  private static final String synX991String = "2";
  private static final String synX990String = "1";
  private static final String synX989String = "0";
  private static final String synX988String = "Z";
  private static final String synX987String = "Y";
  private static final String synX986String = "X";
  private static final String synX985String = "W";
  private static final String synX984String = "V";
  private static final String synX983String = "U";
  private static final String synX982String = "T";
  private static final String synX981String = "S";
  private static final String synX980String = "R";
  private static final String synX979String = "Q";
  private static final String synX978String = "P";
  private static final String synX977String = "O";
  private static final String synX976String = "N";
  private static final String synX975String = "M";
  private static final String synX974String = "L";
  private static final String synX973String = "K";
  private static final String synX972String = "J";
  private static final String synX971String = "I";
  private static final String synX970String = "H";
  private static final String synX969String = "G";
  private static final String synX968String = "F";
  private static final String synX967String = "E";
  private static final String synX966String = "D";
  private static final String synX965String = "C";
  private static final String synX964String = "B";
  private static final String synX963String = "A";
  private static final String synX962String = "</html>";
  private static final String synX961String = "  </body>\t\n";
  private static final String synX960String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX959String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX958String = "    </footer>\n";
  private static final String synX957String = "      </div>\n";
  private static final String synX956String = "        <p>c3063467</p>\n";
  private static final String synX955String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX954String = "      <div class=\"author\">\n";
  private static final String synX953String = "    <footer>\n";
  private static final String synX952String = "    </article>\n";
  private static final String synX951String = "      </form>\n";
  private static final String synX950String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX949String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX948String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX947String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX946String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX945String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX944String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX943String = "\" />\n";
  private static final String synX942String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX941String = "\" />\n";
  private static final String synX940String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX939String = "\" />\n";
  private static final String synX938String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX937String = "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX936String = "\n";
  private static final String synX935String = "</div>\n";
  private static final String synX934String = "</p>";
  private static final String synX933String = "\">";
  private static final String synX932String = "<p class=\"option\" data-code=\"";
  private static final String synX931String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX930String = "      <div class=\"security\">\n";
  private static final String synX929String = "</div>\n";
  private static final String synX928String = "</p>";
  private static final String synX927String = "<p class=\"option\">";
  private static final String synX926String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX925String = "      <div class=\"selected\">\n";
  private static final String synX924String = "      <h2>Your Selection</h2>\n";
  private static final String synX923String = "    <article>\n";
  private static final String synX922String = "    </header>\n";
  private static final String synX921String = "      <h1>Seat Booking</h1>\n";
  private static final String synX920String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX919String = "    <header>\n";
  private static final String synX918String = "  <body class=\"booking\">\n";
  private static final String synX917String = "  </head>\n";
  private static final String synX916String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX915String = "    <![endif]-->\n";
  private static final String synX914String = "      </script>\n";
  private static final String synX913String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX912String = "    <!--[if IE]>\n";
  private static final String synX911String = "    <title>Seat Booking</title>\n";
  private static final String synX910String = "    <meta charset=utf-8>\n";
  private static final String synX909String = "  <head>\n";
  private static final String synX908String = "<html lang=\"en\">\n";
  private static final String synX907String = "<!DOCTYPE html>\n";
  private static final String synX906String = "";
  private static final String synX905String = "RTanZ";
  private static final String synX904String = "benstheatre?message=success";
  private static final boolean synX903boolean = false;
  private static final String synX902String = "benstheatre?message=limitexceeded";
  private static final int synX901int = 2;
  private static final int synX900int = 0;
  private static final String synX899String = "phone";
  private static final String synX898String = "email";
  private static final String synX897String = "address";
  private static final String synX896String = "userid";
  private static final String synX895String = "seatnumber";
  private static final String synX894String = "seat";
  private static final String synX893String = "row";
  private static final double synX892double = 0.632556925245722;
  private static final String synX891String = "seatnumber";
  private static final String synX890String = "seat";
  private static final String synX889String = "row";
  private static final double synX888double = 0.8878893723838296;
  private static Logger skidder;
  private String electronically;
  private String identify;
  private String payphone;
  private String loginIdentifier;
  private int induct;
  private int sternProportion;
  private String bickering;
  public static final double maximalLength = 0.33480242353505485;
  private Prat[] rumpRaiment;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse responsive)
      throws ServletException, IOException {
    double curveGauge;
    PrintWriter off;
    String arrestContents;
    curveGauge = synX888double;
    off = responsive.getWriter();
    bickering = asking.getParameter(synX889String);
    induct = Integer.parseInt(asking.getParameter(synX890String));
    sternProportion = Integer.parseInt(asking.getParameter(synX891String));
    rumpRaiment = takeDocument();
    arrestContents = goReservationPageboy();
    off.println(arrestContents);
  }

  public synchronized void doPost(HttpServletRequest appeals, HttpServletResponse explanation)
      throws ServletException, IOException {
    double token;
    int reserved;
    token = synX892double;
    bickering = appeals.getParameter(synX893String);
    induct = Integer.parseInt(appeals.getParameter(synX894String));
    sternProportion = Integer.parseInt(appeals.getParameter(synX895String));
    loginIdentifier = appeals.getParameter(synX896String);
    identify = appeals.getParameter(synX897String);
    electronically = appeals.getParameter(synX898String);
    payphone = appeals.getParameter(synX899String);
    rumpRaiment = takeDocument();
    reserved = synX900int;
    for (Prat ora : rumpRaiment) synx25(ora, reserved);

    if (reserved > synX901int) {
      explanation.sendRedirect(synX902String);
    } else {
      rumpRaiment[sternProportion].fitConsumerIdem(loginIdentifier);
      rumpRaiment[sternProportion].adjustSolve(identify);
      rumpRaiment[sternProportion].laidFax(electronically);
      rumpRaiment[sternProportion].placeMobiles(payphone);
      rumpRaiment[sternProportion].placeWeek(WarwickPlayhouses.findActualSentence());
      rumpRaiment[sternProportion].situatedAvailability(synX903boolean);
      salvagingSubmitting(rumpRaiment);
      explanation.sendRedirect(synX904String);
    }
  }

  public synchronized String goReservationPageboy() {
    String amount;
    String encrypt;
    String filename;
    amount = synX905String;
    encrypt = certificateCypher();
    filename = synX906String;
    filename +=
        synX907String
            + synX908String
            + synX909String
            + synX910String
            + synX911String
            + synX912String
            + synX913String
            + synX914String
            + synX915String
            + synX916String
            + synX917String
            + synX918String
            + synX919String
            + synX920String
            + synX921String
            + synX922String
            + synX923String
            + synX924String
            + synX925String
            + synX926String;
    filename += synX927String + bickering + induct + synX928String;
    filename += synX929String + synX930String + synX931String;
    filename += synX932String + encrypt + synX933String + encrypt + synX934String;
    filename +=
        synX935String
            + synX936String
            + synX937String
            + synX938String
            + induct
            + synX939String
            + synX940String
            + bickering
            + synX941String
            + synX942String
            + sternProportion
            + synX943String
            + synX944String
            + synX945String
            + synX946String
            + synX947String
            + synX948String
            + synX949String
            + synX950String
            + synX951String
            + synX952String
            + synX953String
            + synX954String
            + synX955String
            + synX956String
            + synX957String
            + synX958String
            + synX959String
            + synX960String
            + synX961String
            + synX962String;
    return filename;
  }

  public synchronized String certificateCypher() {
    double max;
    String correspondance[] = {
      synX963String,
      synX964String,
      synX965String,
      synX966String,
      synX967String,
      synX968String,
      synX969String,
      synX970String,
      synX971String,
      synX972String,
      synX973String,
      synX974String,
      synX975String,
      synX976String,
      synX977String,
      synX978String,
      synX979String,
      synX980String,
      synX981String,
      synX982String,
      synX983String,
      synX984String,
      synX985String,
      synX986String,
      synX987String,
      synX988String
    };
    String amounts[] = {
      synX989String,
      synX990String,
      synX991String,
      synX992String,
      synX993String,
      synX994String,
      synX995String,
      synX996String,
      synX997String,
      synX998String
    };
    Random weird;
    String q, tnf, eigenvalue, adc, geometries, u;
    max = synX999double;
    weird = new Random();
    q = correspondance[weird.nextInt(correspondance.length)];
    tnf = amounts[weird.nextInt(amounts.length)];
    eigenvalue = correspondance[weird.nextInt(correspondance.length)];
    adc = amounts[weird.nextInt(amounts.length)];
    geometries = correspondance[weird.nextInt(correspondance.length)];
    u = amounts[weird.nextInt(amounts.length)];
    return q + tnf + eigenvalue + adc + geometries + u;
  }

  public synchronized Prat[] takeDocument() {
    String symbol;
    symbol = synX1000String;

    try {
      FileInputStream officeholdersSubmit;
      ObjectInputStream establishment;
      Prat[] member;
      officeholdersSubmit = new FileInputStream(getServletContext().getRealPath(synX1001String));
      establishment = new ObjectInputStream(officeholdersSubmit);
      member = (Prat[]) establishment.readObject();
      establishment.close();
      officeholdersSubmit.close();
      return member;
    } catch (IOException i) {
      skidder.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      skidder.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void salvagingSubmitting(Prat[] spots) {
    double highDestined;
    highDestined = synX1002double;

    try {
      FileOutputStream proscribedSubmitting;
      ObjectOutputStream kayoed;
      proscribedSubmitting = new FileOutputStream(getServletContext().getRealPath(synX1003String));
      kayoed = new ObjectOutputStream(proscribedSubmitting);
      kayoed.writeObject(spots);
      kayoed.close();
      proscribedSubmitting.close();
    } catch (IOException pro) {
      pro.printStackTrace();
    }
  }

  static {
    skidder = Logger.getLogger(synX1004String);
  }

  private synchronized void synx25(Prat ora, int reserved) throws ServletException, IOException {

    if (ora.obtainViewerEst() != null && ora.obtainViewerEst().equals(loginIdentifier)) {
      reserved++;
    }
  }
}
