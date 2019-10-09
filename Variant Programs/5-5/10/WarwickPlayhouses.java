import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class WarwickPlayhouses extends javax.servlet.http.HttpServlet {
  private static final String synX1359String = "</html>";
  private static final String synX1358String = "  </body>\t\n";
  private static final String synX1357String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1356String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1355String = "    </div>\n";
  private static final String synX1354String = "      </div>\n";
  private static final String synX1353String = "        </div>\n";
  private static final String synX1352String = "          <button>OK</button>\n";
  private static final String synX1351String = "        <div class=\"close\">\n";
  private static final String synX1350String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX1349String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX1348String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX1347String = "      <div class=\"inner\">\n";
  private static final String synX1346String = "    <div id=\"popup\">\n";
  private static final String synX1345String = "    </footer>\n";
  private static final String synX1344String = "      </div>\n";
  private static final String synX1343String = "        <p>c3063467</p>\n";
  private static final String synX1342String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1341String = "      <div class=\"author\">\n";
  private static final String synX1340String = "    <footer>\n";
  private static final String synX1339String = "    </article>\n";
  private static final String synX1338String = "      </div>\n";
  private static final String synX1337String = "        </div>\n";
  private static final String synX1336String = "          <p>Booked</p>\n";
  private static final String synX1335String = "        <div class=\"booked\">\n";
  private static final String synX1334String = "        </div>\n";
  private static final String synX1333String = "          <p>Available</p>\n";
  private static final String synX1332String = "        <div class=\"available\">\n";
  private static final String synX1331String = "      <div class=\"legend\">\n";
  private static final String synX1330String = "      </table>\n";
  private static final String synX1329String = "</tbody>\n";
  private static final String synX1328String = "</tr>\n";
  private static final String synX1327String = "</td>";
  private static final String synX1326String = "</p>\n";
  private static final int synX1325int = 1;
  private static final String synX1324String = "  <p>";
  private static final String synX1323String = "\">\n";
  private static final String synX1322String = "\" data-seatNumber=\"";
  private static final int synX1321int = 1;
  private static final String synX1320String = "\" data-seat=\"";
  private static final String synX1319String = "\" data-row=\"";
  private static final String synX1318String = "\" data-time=\"";
  private static final String synX1317String = "\" data-user=\"";
  private static final String synX1316String = "<td class=\"seat";
  private static final String synX1315String = " booked";
  private static final String synX1314String = "";
  private static final int synX1313int = 8;
  private static final int synX1312int = 0;
  private static final String synX1311String = "<tr>\n";
  private static final int synX1310int = 8;
  private static final int synX1309int = 0;
  private static final int synX1308int = 0;
  private static final String synX1307String = "H";
  private static final String synX1306String = "G";
  private static final String synX1305String = "F";
  private static final String synX1304String = "E";
  private static final String synX1303String = "D";
  private static final String synX1302String = "C";
  private static final String synX1301String = "B";
  private static final String synX1300String = "A";
  private static final String synX1299String = "        <tbody>";
  private static final String synX1298String = "        </thead>\n";
  private static final String synX1297String = "          </tr>\n";
  private static final String synX1296String = "            </td>\n";
  private static final String synX1295String = "              <p>Stage</p>\n";
  private static final String synX1294String = "            <td colspan=\"8\">\n";
  private static final String synX1293String = "          <tr>\n";
  private static final String synX1292String = "        <thead>\n";
  private static final String synX1291String = "      <table>\n";
  private static final String synX1290String = "      </div>\n";
  private static final String synX1289String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX1288String = "      <div class=\"instructions\">\n";
  private static final String synX1287String = "      </div>\n";
  private static final String synX1286String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX1285String = "        <p>";
  private static final String synX1284String = "      <div class=\"time\">\n";
  private static final String synX1283String = "      <h2>Seats</h2>\n";
  private static final String synX1282String = "</p>\n";
  private static final String synX1281String = "      <p class=\"message\">";
  private static final String synX1280String = "    <article>\n";
  private static final String synX1279String = "    </header>\n";
  private static final String synX1278String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX1277String = "    <header>\n";
  private static final String synX1276String = "  <body class=\"home\">\n";
  private static final String synX1275String = "  </head>\n";
  private static final String synX1274String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1273String = "    <![endif]-->\n";
  private static final String synX1272String = "      </script>\n";
  private static final String synX1271String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1270String = "    <!--[if IE]>\n";
  private static final String synX1269String = "    <title>Theatre Booking System</title>\n";
  private static final String synX1268String = "    <meta charset=utf-8>\n";
  private static final String synX1267String = "  <head>\n";
  private static final String synX1266String = "<html lang=\"en\">\n";
  private static final String synX1265String = "<!DOCTYPE html>\n";
  private static final double synX1264double = 0.25004589996437243;
  private static final String synX1263String = "/WEB-INF/bookingData.ser";
  private static final int synX1262int = 64;
  private static final String synX1261String = "message";
  private static final int synX1260int = -606183363;
  private static final String synX1259String = "dd-MM-YY ss-MM-HH";
  private static final int synX1258int = -1013395641;
  private static final String synX1257String = "/WEB-INF/bookingData.ser";
  private static final double synX1256double = 0.7012741199514169;
  private static final String synX1255String = "/WEB-INF/bookingData.ser";
  private static final double synX1254double = 0.3304584313566594;
  private java.lang.String messenger = null;
  private Sit[] placeAlign = null;

  public synchronized void redeemDocuments(Sit[] beds) {
    double elevatedBoundary;
    elevatedBoundary = synX1254double;

    try {
      java.io.FileOutputStream backBinder;
      java.io.ObjectOutputStream stunned;
      backBinder = new java.io.FileOutputStream(getServletContext().getRealPath(synX1255String));
      stunned = new java.io.ObjectOutputStream(backBinder);
      stunned.writeObject(beds);
      stunned.close();
      backBinder.close();
    } catch (java.io.IOException late) {
      late.printStackTrace();
    }
  }

  public static double vital = 0.4765039952917054;

  public synchronized Sit[] translateDocuments() {
    double little;
    little = synX1256double;

    try {
      java.io.FileInputStream entriesLodge;
      java.io.ObjectInputStream incumbents;
      Sit[] passengers = null;
      entriesLodge = new java.io.FileInputStream(getServletContext().getRealPath(synX1257String));
      incumbents = new java.io.ObjectInputStream(entriesLodge);
      passengers = (Sit[]) incumbents.readObject();
      incumbents.close();
      entriesLodge.close();
      return passengers;
    } catch (java.io.IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      lumberman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public static synchronized java.lang.String takeTopicalPeriod() {
    int kateOuter;
    java.text.SimpleDateFormat recentYearStructure;
    java.util.Date see;
    java.lang.String lewDueJuncture;
    kateOuter = synX1258int;
    recentYearStructure = new java.text.SimpleDateFormat(synX1259String);
    see = new java.util.Date();
    lewDueJuncture = recentYearStructure.format(see);
    return lewDueJuncture;
  }

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse feedback)
      throws ServletException, IOException {
    int certain;
    java.io.PrintWriter unsuccessful;
    java.io.File recordingPaperwork;
    java.lang.String nationalTab;
    certain = synX1260int;
    unsuccessful = feedback.getWriter();
    messenger = petition.getParameter(synX1261String);

    if (messenger != null) synx31();
    else synx32();
    placeAlign = new Sit[synX1262int];
    recordingPaperwork = new java.io.File(getServletContext().getRealPath(synX1263String));

    if (recordingPaperwork.exists()) synx33();
    else synx34();
    nationalTab = canResidenceScreen();
    unsuccessful.println(nationalTab);
  }

  public synchronized java.lang.String canResidenceScreen() {
    double secondRestricted;
    java.lang.String jpg;
    int backsideNumeral;
    secondRestricted = synX1264double;
    jpg =
        synX1265String
            + synX1266String
            + synX1267String
            + synX1268String
            + synX1269String
            + synX1270String
            + synX1271String
            + synX1272String
            + synX1273String
            + synX1274String
            + synX1275String
            + synX1276String
            + synX1277String
            + synX1278String
            + synX1279String
            + synX1280String
            + synX1281String
            + messenger
            + synX1282String
            + synX1283String
            + synX1284String
            + synX1285String
            + takeTopicalPeriod()
            + synX1286String
            + synX1287String
            + synX1288String
            + synX1289String
            + synX1290String
            + synX1291String
            + synX1292String
            + synX1293String
            + synX1294String
            + synX1295String
            + synX1296String
            + synX1297String
            + synX1298String
            + synX1299String;
    String[] placeBreadth = {
      synX1300String,
      synX1301String,
      synX1302String,
      synX1303String,
      synX1304String,
      synX1305String,
      synX1306String,
      synX1307String
    };
    backsideNumeral = synX1308int;

    for (int i = synX1309int; i < synX1310int; i++) {
      jpg += synX1311String;

      for (int gruss = synX1312int; gruss < synX1313int; gruss++) {
        java.lang.String rented;
        rented = synX1314String;

        if (!placeAlign[backsideNumeral].isAccessible()) {
          rented = synX1315String;
        }

        jpg +=
            synX1316String
                + rented
                + synX1317String
                + placeAlign[backsideNumeral].comeEnjoyerMilad()
                + synX1318String
                + placeAlign[backsideNumeral].beatJuncture()
                + synX1319String
                + placeBreadth[i]
                + synX1320String
                + (gruss + synX1321int)
                + synX1322String
                + backsideNumeral
                + synX1323String
                + synX1324String
                + placeBreadth[i]
                + (gruss + synX1325int)
                + synX1326String
                + synX1327String;
        backsideNumeral++;
      }
      jpg += synX1328String;
    }
    jpg +=
        synX1329String
            + synX1330String
            + synX1331String
            + synX1332String
            + synX1333String
            + synX1334String
            + synX1335String
            + synX1336String
            + synX1337String
            + synX1338String
            + synX1339String
            + synX1340String
            + synX1341String
            + synX1342String
            + synX1343String
            + synX1344String
            + synX1345String
            + synX1346String
            + synX1347String
            + synX1348String
            + synX1349String
            + synX1350String
            + synX1351String
            + synX1352String
            + synX1353String
            + synX1354String
            + synX1355String
            + synX1356String
            + synX1357String
            + synX1358String
            + synX1359String;
    return jpg;
  }

  private static java.util.logging.Logger lumberman = getLogger("bensTheatre");

  private synchronized void synx31() throws ServletException, IOException {

    if (messenger.equals("success")) {
      messenger = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (messenger.equals("limitexceeded")) {
      messenger =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx32() throws ServletException, IOException {
    messenger = "";
  }

  private synchronized void synx33() throws ServletException, IOException {
    placeAlign = translateDocuments();
  }

  private synchronized void synx34() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Sit greenTail;
      greenTail = new Sit();
      placeAlign[i] = greenTail;
    }
    redeemDocuments(placeAlign);
  }
}
