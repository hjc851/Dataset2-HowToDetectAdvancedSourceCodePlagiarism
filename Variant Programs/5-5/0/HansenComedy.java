import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class HansenComedy extends javax.servlet.http.HttpServlet {
  private static final int synX237int = 64;
  private static final int synX236int = 0;
  private static final String synX235String = "";
  private static final String synX234String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX233String = "limitexceeded";
  private static final String synX232String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX231String = "success";
  private static final String synX230String = "dd-MM-YY ss-MM-HH";
  private static final double synX229double = 0.14860571987167914;
  private static final String synX228String = "</html>";
  private static final String synX227String = "  </body>\t\n";
  private static final String synX226String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX225String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX224String = "    </div>\n";
  private static final String synX223String = "      </div>\n";
  private static final String synX222String = "        </div>\n";
  private static final String synX221String = "          <button>OK</button>\n";
  private static final String synX220String = "        <div class=\"close\">\n";
  private static final String synX219String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX218String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX217String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX216String = "      <div class=\"inner\">\n";
  private static final String synX215String = "    <div id=\"popup\">\n";
  private static final String synX214String = "    </footer>\n";
  private static final String synX213String = "      </div>\n";
  private static final String synX212String = "        <p>c3063467</p>\n";
  private static final String synX211String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX210String = "      <div class=\"author\">\n";
  private static final String synX209String = "    <footer>\n";
  private static final String synX208String = "    </article>\n";
  private static final String synX207String = "      </div>\n";
  private static final String synX206String = "        </div>\n";
  private static final String synX205String = "          <p>Booked</p>\n";
  private static final String synX204String = "        <div class=\"booked\">\n";
  private static final String synX203String = "        </div>\n";
  private static final String synX202String = "          <p>Available</p>\n";
  private static final String synX201String = "        <div class=\"available\">\n";
  private static final String synX200String = "      <div class=\"legend\">\n";
  private static final String synX199String = "      </table>\n";
  private static final String synX198String = "</tbody>\n";
  private static final String synX197String = "</tr>\n";
  private static final String synX196String = "</td>";
  private static final String synX195String = "</p>\n";
  private static final int synX194int = 1;
  private static final String synX193String = "  <p>";
  private static final String synX192String = "\">\n";
  private static final String synX191String = "\" data-seatNumber=\"";
  private static final int synX190int = 1;
  private static final String synX189String = "\" data-seat=\"";
  private static final String synX188String = "\" data-row=\"";
  private static final String synX187String = "\" data-time=\"";
  private static final String synX186String = "\" data-user=\"";
  private static final String synX185String = "<td class=\"seat";
  private static final String synX184String = " booked";
  private static final String synX183String = "";
  private static final int synX182int = 8;
  private static final int synX181int = 0;
  private static final String synX180String = "<tr>\n";
  private static final int synX179int = 8;
  private static final int synX178int = 0;
  private static final int synX177int = 0;
  private static final String synX176String = "H";
  private static final String synX175String = "G";
  private static final String synX174String = "F";
  private static final String synX173String = "E";
  private static final String synX172String = "D";
  private static final String synX171String = "C";
  private static final String synX170String = "B";
  private static final String synX169String = "A";
  private static final String synX168String = "        <tbody>";
  private static final String synX167String = "        </thead>\n";
  private static final String synX166String = "          </tr>\n";
  private static final String synX165String = "            </td>\n";
  private static final String synX164String = "              <p>Stage</p>\n";
  private static final String synX163String = "            <td colspan=\"8\">\n";
  private static final String synX162String = "          <tr>\n";
  private static final String synX161String = "        <thead>\n";
  private static final String synX160String = "      <table>\n";
  private static final String synX159String = "      </div>\n";
  private static final String synX158String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX157String = "      <div class=\"instructions\">\n";
  private static final String synX156String = "      </div>\n";
  private static final String synX155String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX154String = "        <p>";
  private static final String synX153String = "      <div class=\"time\">\n";
  private static final String synX152String = "      <h2>Seats</h2>\n";
  private static final String synX151String = "</p>\n";
  private static final String synX150String = "      <p class=\"message\">";
  private static final String synX149String = "    <article>\n";
  private static final String synX148String = "    </header>\n";
  private static final String synX147String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX146String = "    <header>\n";
  private static final String synX145String = "  <body class=\"home\">\n";
  private static final String synX144String = "  </head>\n";
  private static final String synX143String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX142String = "    <![endif]-->\n";
  private static final String synX141String = "      </script>\n";
  private static final String synX140String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX139String = "    <!--[if IE]>\n";
  private static final String synX138String = "    <title>Theatre Booking System</title>\n";
  private static final String synX137String = "    <meta charset=utf-8>\n";
  private static final String synX136String = "  <head>\n";
  private static final String synX135String = "<html lang=\"en\">\n";
  private static final String synX134String = "<!DOCTYPE html>\n";
  private static final double synX133double = 0.8742622102831944;
  private static final String synX132String = "/WEB-INF/bookingData.ser";
  private static final double synX131double = 0.3025369185032576;
  private static final String synX130String = "/WEB-INF/bookingData.ser";
  private static final String synX129String = "5UW6o0zqN";
  private static final String synX128String = "/WEB-INF/bookingData.ser";
  private static final int synX127int = 64;
  private static final String synX126String = "message";
  private static final String synX125String = "CZSRa3KGXMFe";
  public static java.util.logging.Logger rancher = getLogger("bensTheatre");
  public java.lang.String telegram;
  static String marquez = "1Z65pINr3WHOGPe";
  public Behind[] rumpRaiment;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    String leap;
    java.io.PrintWriter unstylish;
    java.io.File rentingDocumentation;
    java.lang.String interiorPagination;
    leap = (synX125String);
    unstylish = (rejoinder.getWriter());
    telegram = (asking.getParameter(synX126String));

    if (telegram != null) synx1();
    else synx2();
    rumpRaiment = (new Behind[synX127int]);
    rentingDocumentation = (new java.io.File(getServletContext().getRealPath(synX128String)));

    if (rentingDocumentation.exists()) synx3();
    else synx4();
    interiorPagination = (becomeTownhouseFront());
    unstylish.println(interiorPagination);
  }

  public synchronized Behind[] interpretLodge() {
    String get;
    get = (synX129String);

    try {
      java.io.FileInputStream whysCharge;
      java.io.ObjectInputStream officeholders;
      Behind[] member;
      whysCharge = (new java.io.FileInputStream(getServletContext().getRealPath(synX130String)));
      officeholders = (new java.io.ObjectInputStream(whysCharge));
      member = ((Behind[]) officeholders.readObject());
      officeholders.close();
      whysCharge.close();
      return member;
    } catch (java.io.IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      rancher.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void shaveArchives(Behind[] elects) {
    double measure;
    measure = (synX131double);

    try {
      java.io.FileOutputStream kayoedDocket;
      java.io.ObjectOutputStream taboo;
      kayoedDocket = (new java.io.FileOutputStream(getServletContext().getRealPath(synX132String)));
      taboo = (new java.io.ObjectOutputStream(kayoedDocket));
      taboo.writeObject(elects);
      taboo.close();
      kayoedDocket.close();
    } catch (java.io.IOException officio) {
      officio.printStackTrace();
    }
  }

  public synchronized java.lang.String becomeTownhouseFront() {
    double appoint;
    java.lang.String browser;
    int bumFewer;
    appoint = (synX133double);
    browser =
        ((synX134String
            + synX135String
            + synX136String
            + synX137String
            + synX138String
            + synX139String
            + synX140String
            + synX141String
            + synX142String
            + synX143String
            + synX144String
            + synX145String
            + synX146String
            + synX147String
            + synX148String
            + synX149String
            + synX150String
            + telegram
            + synX151String
            + synX152String
            + synX153String
            + synX154String
            + haveCirculatingPeriods()
            + synX155String
            + synX156String
            + synX157String
            + synX158String
            + synX159String
            + synX160String
            + synX161String
            + synX162String
            + synX163String
            + synX164String
            + synX165String
            + synX166String
            + synX167String
            + synX168String));
    String[] spatAssortment = {
      synX169String,
      synX170String,
      synX171String,
      synX172String,
      synX173String,
      synX174String,
      synX175String,
      synX176String
    };
    bumFewer = (synX177int);

    for (int i = synX178int; i < synX179int; i++) {
      browser += (synX180String);

      for (int gruss = synX181int; gruss < synX182int; gruss++) {
        java.lang.String recorded;
        recorded = (synX183String);

        if (!rumpRaiment[bumFewer].isAccessible()) {
          recorded = (synX184String);
        }

        browser +=
            ((synX185String
                + recorded
                + synX186String
                + rumpRaiment[bumFewer].produceWearerMap()
                + synX187String
                + rumpRaiment[bumFewer].beatJuncture()
                + synX188String
                + spatAssortment[i]
                + synX189String
                + (gruss + synX190int)
                + synX191String
                + bumFewer
                + synX192String
                + synX193String
                + spatAssortment[i]
                + (gruss + synX194int)
                + synX195String
                + synX196String));
        bumFewer++;
      }
      browser += (synX197String);
    }
    browser +=
        ((synX198String
            + synX199String
            + synX200String
            + synX201String
            + synX202String
            + synX203String
            + synX204String
            + synX205String
            + synX206String
            + synX207String
            + synX208String
            + synX209String
            + synX210String
            + synX211String
            + synX212String
            + synX213String
            + synX214String
            + synX215String
            + synX216String
            + synX217String
            + synX218String
            + synX219String
            + synX220String
            + synX221String
            + synX222String
            + synX223String
            + synX224String
            + synX225String
            + synX226String
            + synX227String
            + synX228String));
    return browser;
  }

  public static synchronized java.lang.String haveCirculatingPeriods() {
    double bottomCompelled;
    java.text.SimpleDateFormat earlyBeginningArrangement;
    java.util.Date year;
    java.lang.String curshipTimeAmount;
    bottomCompelled = (synX229double);
    earlyBeginningArrangement = (new java.text.SimpleDateFormat(synX230String));
    year = (new java.util.Date());
    curshipTimeAmount = (earlyBeginningArrangement.format(year));
    return curshipTimeAmount;
  }

  private synchronized void synx1() throws ServletException, IOException {

    if (telegram.equals(synX231String)) {
      telegram = (synX232String);
    } else if (telegram.equals(synX233String)) {
      telegram = (synX234String);
    }
  }

  private synchronized void synx2() throws ServletException, IOException {
    telegram = (synX235String);
  }

  private synchronized void synx3() throws ServletException, IOException {
    rumpRaiment = (interpretLodge());
  }

  private synchronized void synx4() throws ServletException, IOException {

    for (int i = synX236int; i < synX237int; i++) {
      Behind newfangledBackside;
      newfangledBackside = (new Behind());
      rumpRaiment[i] = (newfangledBackside);
    }
    shaveArchives(rumpRaiment);
  }
}
