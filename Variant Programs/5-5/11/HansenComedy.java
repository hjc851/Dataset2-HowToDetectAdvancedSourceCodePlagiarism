import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class HansenComedy extends javax.servlet.http.HttpServlet {
  private static final int synX1599int = 64;
  private static final int synX1598int = 0;
  private static final String synX1597String = "";
  private static final String synX1596String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX1595String = "limitexceeded";
  private static final String synX1594String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX1593String = "success";
  private static final String synX1592String = "bensTheatre";
  private static final String synX1591String = "dd-MM-YY ss-MM-HH";
  private static final int synX1590int = 1591947207;
  private static final String synX1589String = "</html>";
  private static final String synX1588String = "  </body>\t\n";
  private static final String synX1587String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1586String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1585String = "    </div>\n";
  private static final String synX1584String = "      </div>\n";
  private static final String synX1583String = "        </div>\n";
  private static final String synX1582String = "          <button>OK</button>\n";
  private static final String synX1581String = "        <div class=\"close\">\n";
  private static final String synX1580String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX1579String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX1578String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX1577String = "      <div class=\"inner\">\n";
  private static final String synX1576String = "    <div id=\"popup\">\n";
  private static final String synX1575String = "    </footer>\n";
  private static final String synX1574String = "      </div>\n";
  private static final String synX1573String = "        <p>c3063467</p>\n";
  private static final String synX1572String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1571String = "      <div class=\"author\">\n";
  private static final String synX1570String = "    <footer>\n";
  private static final String synX1569String = "    </article>\n";
  private static final String synX1568String = "      </div>\n";
  private static final String synX1567String = "        </div>\n";
  private static final String synX1566String = "          <p>Booked</p>\n";
  private static final String synX1565String = "        <div class=\"booked\">\n";
  private static final String synX1564String = "        </div>\n";
  private static final String synX1563String = "          <p>Available</p>\n";
  private static final String synX1562String = "        <div class=\"available\">\n";
  private static final String synX1561String = "      <div class=\"legend\">\n";
  private static final String synX1560String = "      </table>\n";
  private static final String synX1559String = "</tbody>\n";
  private static final String synX1558String = "</tr>\n";
  private static final String synX1557String = "</td>";
  private static final String synX1556String = "</p>\n";
  private static final int synX1555int = 1;
  private static final String synX1554String = "  <p>";
  private static final String synX1553String = "\">\n";
  private static final String synX1552String = "\" data-seatNumber=\"";
  private static final int synX1551int = 1;
  private static final String synX1550String = "\" data-seat=\"";
  private static final String synX1549String = "\" data-row=\"";
  private static final String synX1548String = "\" data-time=\"";
  private static final String synX1547String = "\" data-user=\"";
  private static final String synX1546String = "<td class=\"seat";
  private static final String synX1545String = " booked";
  private static final String synX1544String = "";
  private static final int synX1543int = 8;
  private static final int synX1542int = 0;
  private static final String synX1541String = "<tr>\n";
  private static final int synX1540int = 8;
  private static final int synX1539int = 0;
  private static final int synX1538int = 0;
  private static final String synX1537String = "H";
  private static final String synX1536String = "G";
  private static final String synX1535String = "F";
  private static final String synX1534String = "E";
  private static final String synX1533String = "D";
  private static final String synX1532String = "C";
  private static final String synX1531String = "B";
  private static final String synX1530String = "A";
  private static final String synX1529String = "        <tbody>";
  private static final String synX1528String = "        </thead>\n";
  private static final String synX1527String = "          </tr>\n";
  private static final String synX1526String = "            </td>\n";
  private static final String synX1525String = "              <p>Stage</p>\n";
  private static final String synX1524String = "            <td colspan=\"8\">\n";
  private static final String synX1523String = "          <tr>\n";
  private static final String synX1522String = "        <thead>\n";
  private static final String synX1521String = "      <table>\n";
  private static final String synX1520String = "      </div>\n";
  private static final String synX1519String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX1518String = "      <div class=\"instructions\">\n";
  private static final String synX1517String = "      </div>\n";
  private static final String synX1516String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX1515String = "        <p>";
  private static final String synX1514String = "      <div class=\"time\">\n";
  private static final String synX1513String = "      <h2>Seats</h2>\n";
  private static final String synX1512String = "</p>\n";
  private static final String synX1511String = "      <p class=\"message\">";
  private static final String synX1510String = "    <article>\n";
  private static final String synX1509String = "    </header>\n";
  private static final String synX1508String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX1507String = "    <header>\n";
  private static final String synX1506String = "  <body class=\"home\">\n";
  private static final String synX1505String = "  </head>\n";
  private static final String synX1504String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1503String = "    <![endif]-->\n";
  private static final String synX1502String = "      </script>\n";
  private static final String synX1501String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1500String = "    <!--[if IE]>\n";
  private static final String synX1499String = "    <title>Theatre Booking System</title>\n";
  private static final String synX1498String = "    <meta charset=utf-8>\n";
  private static final String synX1497String = "  <head>\n";
  private static final String synX1496String = "<html lang=\"en\">\n";
  private static final String synX1495String = "<!DOCTYPE html>\n";
  private static final String synX1494String = "RXdYpvyUR";
  private static final String synX1493String = "/WEB-INF/bookingData.ser";
  private static final double synX1492double = 0.02583971955702058;
  private static final String synX1491String = "/WEB-INF/bookingData.ser";
  private static final String synX1490String = "jL0S7MnSYOd39uN";
  private static final String synX1489String = "/WEB-INF/bookingData.ser";
  private static final int synX1488int = 64;
  private static final String synX1487String = "message";
  private static final double synX1486double = 0.5035053879571287;
  public static final double outer = 0.03922907632610573;
  public Buttocks[] behindPanoply;
  public java.lang.String comment;
  public static java.util.logging.Logger thermometer;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse feedback)
      throws ServletException, IOException {
    double deptSpan = synX1486double;
    java.io.PrintWriter exterior = feedback.getWriter();
    comment = decision.getParameter(synX1487String);

    if (comment != null) synx36();
    else synx37();
    behindPanoply = new Buttocks[synX1488int];
    java.io.File recordingPaperwork =
        new java.io.File(getServletContext().getRealPath(synX1489String));

    if (recordingPaperwork.exists()) synx38();
    else synx39();
    java.lang.String backTable = developApartmentLayout();
    exterior.println(backTable);
  }

  public synchronized Buttocks[] recordExecutable() {
    String logic = synX1490String;

    try {
      Buttocks[] chairs;
      java.io.FileInputStream adherentsPaperwork =
          new java.io.FileInputStream(getServletContext().getRealPath(synX1491String));
      java.io.ObjectInputStream incumbents = new java.io.ObjectInputStream(adherentsPaperwork);
      chairs = (Buttocks[]) incumbents.readObject();
      incumbents.close();
      adherentsPaperwork.close();
      return chairs;
    } catch (java.io.IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      thermometer.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Buttocks[] elections) {
    double calculation = synX1492double;

    try {
      java.io.FileOutputStream unconsciousCharge =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX1493String));
      java.io.ObjectOutputStream retired = new java.io.ObjectOutputStream(unconsciousCharge);
      retired.writeObject(elections);
      retired.close();
      unconsciousCharge.close();
    } catch (java.io.IOException appointed) {
      appointed.printStackTrace();
    }
  }

  public synchronized java.lang.String developApartmentLayout() {
    String upperSkank = synX1494String;
    java.lang.String pdf =
        synX1495String
            + synX1496String
            + synX1497String
            + synX1498String
            + synX1499String
            + synX1500String
            + synX1501String
            + synX1502String
            + synX1503String
            + synX1504String
            + synX1505String
            + synX1506String
            + synX1507String
            + synX1508String
            + synX1509String
            + synX1510String
            + synX1511String
            + comment
            + synX1512String
            + synX1513String
            + synX1514String
            + synX1515String
            + obtainLiveDays()
            + synX1516String
            + synX1517String
            + synX1518String
            + synX1519String
            + synX1520String
            + synX1521String
            + synX1522String
            + synX1523String
            + synX1524String
            + synX1525String
            + synX1526String
            + synX1527String
            + synX1528String
            + synX1529String;
    String[] successionPlethora = {
      synX1530String,
      synX1531String,
      synX1532String,
      synX1533String,
      synX1534String,
      synX1535String,
      synX1536String,
      synX1537String
    };
    int sitTotal = synX1538int;

    for (int i = synX1539int; i < synX1540int; i++) {
      pdf += pdf + synX1541String;

      for (int gruss = synX1542int; gruss < synX1543int; gruss++) {
        java.lang.String rented = synX1544String;

        if (!behindPanoply[sitTotal].isAccessible()) {
          rented = synX1545String;
        }

        pdf +=
            pdf
                + synX1546String
                + rented
                + synX1547String
                + behindPanoply[sitTotal].becomeUsePhoto()
                + synX1548String
                + behindPanoply[sitTotal].arriveMonth()
                + synX1549String
                + successionPlethora[i]
                + synX1550String
                + (gruss + synX1551int)
                + synX1552String
                + sitTotal
                + synX1553String
                + synX1554String
                + successionPlethora[i]
                + (gruss + synX1555int)
                + synX1556String
                + synX1557String;
        sitTotal++;
      }
      pdf += pdf + synX1558String;
    }
    pdf +=
        pdf
            + synX1559String
            + synX1560String
            + synX1561String
            + synX1562String
            + synX1563String
            + synX1564String
            + synX1565String
            + synX1566String
            + synX1567String
            + synX1568String
            + synX1569String
            + synX1570String
            + synX1571String
            + synX1572String
            + synX1573String
            + synX1574String
            + synX1575String
            + synX1576String
            + synX1577String
            + synX1578String
            + synX1579String
            + synX1580String
            + synX1581String
            + synX1582String
            + synX1583String
            + synX1584String
            + synX1585String
            + synX1586String
            + synX1587String
            + synX1588String
            + synX1589String;
    return pdf;
  }

  public static synchronized java.lang.String obtainLiveDays() {
    int bottomConfine = synX1590int;
    java.text.SimpleDateFormat originalEscortLayout =
        new java.text.SimpleDateFormat(synX1591String);
    java.util.Date engagement = new java.util.Date();
    java.lang.String mixedTimeframeMoment = originalEscortLayout.format(engagement);
    return mixedTimeframeMoment;
  }

  static {
    thermometer = getLogger(synX1592String);
  }

  private synchronized void synx36() throws ServletException, IOException {

    if (comment.equals(synX1593String)) {
      comment = synX1594String;
    } else if (comment.equals(synX1595String)) {
      comment = synX1596String;
    }
  }

  private synchronized void synx37() throws ServletException, IOException {
    comment = synX1597String;
  }

  private synchronized void synx38() throws ServletException, IOException {
    behindPanoply = recordExecutable();
  }

  private synchronized void synx39() throws ServletException, IOException {

    for (int i = synX1598int; i < synX1599int; i++) {
      Buttocks babyBum = new Buttocks();
      behindPanoply[i] = babyBum;
    }
    salvageCharge(behindPanoply);
  }
}
