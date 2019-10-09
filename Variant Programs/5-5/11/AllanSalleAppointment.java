import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class AllanSalleAppointment extends javax.servlet.http.HttpServlet {
  private static final String synX1476String = "bensTheatre";
  private static final String synX1475String = "/WEB-INF/bookingData.ser";
  private static final int synX1474int = 921573343;
  private static final String synX1473String = "/WEB-INF/bookingData.ser";
  private static final double synX1472double = 0.5491946869313418;
  private static final String synX1471String = "9";
  private static final String synX1470String = "8";
  private static final String synX1469String = "7";
  private static final String synX1468String = "6";
  private static final String synX1467String = "5";
  private static final String synX1466String = "4";
  private static final String synX1465String = "3";
  private static final String synX1464String = "2";
  private static final String synX1463String = "1";
  private static final String synX1462String = "0";
  private static final String synX1461String = "Z";
  private static final String synX1460String = "Y";
  private static final String synX1459String = "X";
  private static final String synX1458String = "W";
  private static final String synX1457String = "V";
  private static final String synX1456String = "U";
  private static final String synX1455String = "T";
  private static final String synX1454String = "S";
  private static final String synX1453String = "R";
  private static final String synX1452String = "Q";
  private static final String synX1451String = "P";
  private static final String synX1450String = "O";
  private static final String synX1449String = "N";
  private static final String synX1448String = "M";
  private static final String synX1447String = "L";
  private static final String synX1446String = "K";
  private static final String synX1445String = "J";
  private static final String synX1444String = "I";
  private static final String synX1443String = "H";
  private static final String synX1442String = "G";
  private static final String synX1441String = "F";
  private static final String synX1440String = "E";
  private static final String synX1439String = "D";
  private static final String synX1438String = "C";
  private static final String synX1437String = "B";
  private static final String synX1436String = "A";
  private static final int synX1435int = 1423821376;
  private static final String synX1434String = "</html>";
  private static final String synX1433String = "  </body>\t\n";
  private static final String synX1432String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1431String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1430String = "    </footer>\n";
  private static final String synX1429String = "      </div>\n";
  private static final String synX1428String = "        <p>c3063467</p>\n";
  private static final String synX1427String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1426String = "      <div class=\"author\">\n";
  private static final String synX1425String = "    <footer>\n";
  private static final String synX1424String = "    </article>\n";
  private static final String synX1423String = "      </form>\n";
  private static final String synX1422String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX1421String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX1420String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX1419String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX1418String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX1417String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX1416String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX1415String = "\" />\n";
  private static final String synX1414String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX1413String = "\" />\n";
  private static final String synX1412String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX1411String = "\" />\n";
  private static final String synX1410String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX1409String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX1408String = "\n";
  private static final String synX1407String = "</div>\n";
  private static final String synX1406String = "</p>";
  private static final String synX1405String = "\">";
  private static final String synX1404String = "<p class=\"option\" data-code=\"";
  private static final String synX1403String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX1402String = "      <div class=\"security\">\n";
  private static final String synX1401String = "</div>\n";
  private static final String synX1400String = "</p>";
  private static final String synX1399String = "<p class=\"option\">";
  private static final String synX1398String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX1397String = "      <div class=\"selected\">\n";
  private static final String synX1396String = "      <h2>Your Selection</h2>\n";
  private static final String synX1395String = "    <article>\n";
  private static final String synX1394String = "    </header>\n";
  private static final String synX1393String = "      <h1>Seat Booking</h1>\n";
  private static final String synX1392String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX1391String = "    <header>\n";
  private static final String synX1390String = "  <body class=\"booking\">\n";
  private static final String synX1389String = "  </head>\n";
  private static final String synX1388String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1387String = "    <![endif]-->\n";
  private static final String synX1386String = "      </script>\n";
  private static final String synX1385String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1384String = "    <!--[if IE]>\n";
  private static final String synX1383String = "    <title>Seat Booking</title>\n";
  private static final String synX1382String = "    <meta charset=utf-8>\n";
  private static final String synX1381String = "  <head>\n";
  private static final String synX1380String = "<html lang=\"en\">\n";
  private static final String synX1379String = "<!DOCTYPE html>\n";
  private static final String synX1378String = "";
  private static final double synX1377double = 0.7805213540453771;
  private static final String synX1376String = "benstheatre?message=success";
  private static final boolean synX1375boolean = false;
  private static final String synX1374String = "benstheatre?message=limitexceeded";
  private static final int synX1373int = 2;
  private static final int synX1372int = 0;
  private static final String synX1371String = "phone";
  private static final String synX1370String = "email";
  private static final String synX1369String = "address";
  private static final String synX1368String = "userid";
  private static final String synX1367String = "seatnumber";
  private static final String synX1366String = "seat";
  private static final String synX1365String = "row";
  private static final double synX1364double = 0.33763801211791145;
  private static final String synX1363String = "seatnumber";
  private static final String synX1362String = "seat";
  private static final String synX1361String = "row";
  private static final double synX1360double = 0.19411925856701162;
  public static double uppermostTied = 0.4742414656598972;
  public Buttocks[] rearRange;
  public java.lang.String spat;
  public int investFrequency;
  public int buttocks;
  public java.lang.String usageFinger;
  public java.lang.String handset;
  public java.lang.String identify;
  public java.lang.String correspondence;
  public static java.util.logging.Logger recorder;

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse reception)
      throws ServletException, IOException {
    double curveGauge = synX1360double;
    java.io.PrintWriter impossible = reception.getWriter();
    spat = insistence.getParameter(synX1361String);
    buttocks = parseInt(insistence.getParameter(synX1362String));
    investFrequency = parseInt(insistence.getParameter(synX1363String));
    rearRange = translateDocuments();
    java.lang.String rearrestLayout = findTicketHomepage();
    impossible.println(rearrestLayout);
  }

  public synchronized void doPost(HttpServletRequest petitioning, HttpServletResponse riposte)
      throws ServletException, IOException {
    double nominate = synX1364double;
    spat = petitioning.getParameter(synX1365String);
    buttocks = parseInt(petitioning.getParameter(synX1366String));
    investFrequency = parseInt(petitioning.getParameter(synX1367String));
    usageFinger = petitioning.getParameter(synX1368String);
    identify = petitioning.getParameter(synX1369String);
    correspondence = petitioning.getParameter(synX1370String);
    handset = petitioning.getParameter(synX1371String);
    rearRange = translateDocuments();
    int leased = synX1372int;
    for (Buttocks ora : rearRange) synx35(ora, leased);

    if (leased > synX1373int) {
      riposte.sendRedirect(synX1374String);
    } else {
      rearRange[investFrequency].placePersonName(usageFinger);
      rearRange[investFrequency].fitPlow(identify);
      rearRange[investFrequency].markSend(correspondence);
      rearRange[investFrequency].prepareCalls(handset);
      rearRange[investFrequency].fitYear(HansenComedy.obtainLiveDays());
      rearRange[investFrequency].rigidProvided(synX1375boolean);
      reduceApplication(rearRange);
      riposte.sendRedirect(synX1376String);
    }
  }

  public synchronized java.lang.String findTicketHomepage() {
    double upwardLeaping = synX1377double;
    java.lang.String codification = safeguardingDesignator();
    java.lang.String xhtml = synX1378String;
    xhtml +=
        xhtml
            + synX1379String
            + synX1380String
            + synX1381String
            + synX1382String
            + synX1383String
            + synX1384String
            + synX1385String
            + synX1386String
            + synX1387String
            + synX1388String
            + synX1389String
            + synX1390String
            + synX1391String
            + synX1392String
            + synX1393String
            + synX1394String
            + synX1395String
            + synX1396String
            + synX1397String
            + synX1398String;
    xhtml += xhtml + synX1399String + spat + buttocks + synX1400String;
    xhtml += xhtml + synX1401String + synX1402String + synX1403String;
    xhtml += xhtml + synX1404String + codification + synX1405String + codification + synX1406String;
    xhtml +=
        xhtml
            + synX1407String
            + synX1408String
            + synX1409String
            + synX1410String
            + buttocks
            + synX1411String
            + synX1412String
            + spat
            + synX1413String
            + synX1414String
            + investFrequency
            + synX1415String
            + synX1416String
            + synX1417String
            + synX1418String
            + synX1419String
            + synX1420String
            + synX1421String
            + synX1422String
            + synX1423String
            + synX1424String
            + synX1425String
            + synX1426String
            + synX1427String
            + synX1428String
            + synX1429String
            + synX1430String
            + synX1431String
            + synX1432String
            + synX1433String
            + synX1434String;
    return xhtml;
  }

  public synchronized java.lang.String safeguardingDesignator() {
    int maximal = synX1435int;
    java.lang.String mails[] = {
      synX1436String,
      synX1437String,
      synX1438String,
      synX1439String,
      synX1440String,
      synX1441String,
      synX1442String,
      synX1443String,
      synX1444String,
      synX1445String,
      synX1446String,
      synX1447String,
      synX1448String,
      synX1449String,
      synX1450String,
      synX1451String,
      synX1452String,
      synX1453String,
      synX1454String,
      synX1455String,
      synX1456String,
      synX1457String,
      synX1458String,
      synX1459String,
      synX1460String,
      synX1461String
    };
    java.lang.String volume[] = {
      synX1462String,
      synX1463String,
      synX1464String,
      synX1465String,
      synX1466String,
      synX1467String,
      synX1468String,
      synX1469String,
      synX1470String,
      synX1471String
    };
    java.util.Random unintended = new java.util.Random();
    java.lang.String temperature, r6, lituus, cf, rn, col;
    temperature = mails[unintended.nextInt(mails.length)];
    r6 = volume[unintended.nextInt(volume.length)];
    lituus = mails[unintended.nextInt(mails.length)];
    cf = volume[unintended.nextInt(volume.length)];
    rn = mails[unintended.nextInt(mails.length)];
    col = volume[unintended.nextInt(volume.length)];
    return temperature + r6 + lituus + cf + rn + col;
  }

  public synchronized Buttocks[] translateDocuments() {
    double restrictions = synX1472double;

    try {
      Buttocks[] votes;
      java.io.FileInputStream nsisApplication =
          new java.io.FileInputStream(getServletContext().getRealPath(synX1473String));
      java.io.ObjectInputStream details = new java.io.ObjectInputStream(nsisApplication);
      votes = (Buttocks[]) details.readObject();
      details.close();
      nsisApplication.close();
      return votes;
    } catch (java.io.IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      recorder.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void reduceApplication(Buttocks[] venues) {
    int fukkianese = synX1474int;

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX1475String));
      java.io.ObjectOutputStream proscribed = new java.io.ObjectOutputStream(stunnedFolder);
      proscribed.writeObject(venues);
      proscribed.close();
      stunnedFolder.close();
    } catch (java.io.IOException post) {
      post.printStackTrace();
    }
  }

  static {
    recorder = getLogger(synX1476String);
  }

  private synchronized void synx35(Buttocks ora, int leased) throws ServletException, IOException {

    if (ora.becomeUsePhoto() != null && ora.becomeUsePhoto().equals(usageFinger)) {
      leased++;
    }
  }
}
