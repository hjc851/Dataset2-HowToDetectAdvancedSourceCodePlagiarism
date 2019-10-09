import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends javax.servlet.http.HttpServlet {
  private static final String synX1716String = "bensTheatre";
  private static final String synX1715String = "/WEB-INF/bookingData.ser";
  private static final String synX1714String = "ZvGIGD2CGX";
  private static final String synX1713String = "/WEB-INF/bookingData.ser";
  private static final double synX1712double = 0.7530985140970551;
  private static final double synX1711double = 0.6441712700640065;
  private static final String synX1710String = "9";
  private static final String synX1709String = "8";
  private static final String synX1708String = "7";
  private static final String synX1707String = "6";
  private static final String synX1706String = "5";
  private static final String synX1705String = "4";
  private static final String synX1704String = "3";
  private static final String synX1703String = "2";
  private static final String synX1702String = "1";
  private static final String synX1701String = "0";
  private static final String synX1700String = "Z";
  private static final String synX1699String = "Y";
  private static final String synX1698String = "X";
  private static final String synX1697String = "W";
  private static final String synX1696String = "V";
  private static final String synX1695String = "U";
  private static final String synX1694String = "T";
  private static final String synX1693String = "S";
  private static final String synX1692String = "R";
  private static final String synX1691String = "Q";
  private static final String synX1690String = "P";
  private static final String synX1689String = "O";
  private static final String synX1688String = "N";
  private static final String synX1687String = "M";
  private static final String synX1686String = "L";
  private static final String synX1685String = "K";
  private static final String synX1684String = "J";
  private static final String synX1683String = "I";
  private static final String synX1682String = "H";
  private static final String synX1681String = "G";
  private static final String synX1680String = "F";
  private static final String synX1679String = "E";
  private static final String synX1678String = "D";
  private static final String synX1677String = "C";
  private static final String synX1676String = "B";
  private static final String synX1675String = "A";
  private static final String synX1674String = "</html>";
  private static final String synX1673String = "  </body>\t\n";
  private static final String synX1672String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1671String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1670String = "    </footer>\n";
  private static final String synX1669String = "      </div>\n";
  private static final String synX1668String = "        <p>c3063467</p>\n";
  private static final String synX1667String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1666String = "      <div class=\"author\">\n";
  private static final String synX1665String = "    <footer>\n";
  private static final String synX1664String = "    </article>\n";
  private static final String synX1663String = "      </form>\n";
  private static final String synX1662String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX1661String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX1660String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX1659String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX1658String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX1657String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX1656String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX1655String = "\" />\n";
  private static final String synX1654String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX1653String = "\" />\n";
  private static final String synX1652String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX1651String = "\" />\n";
  private static final String synX1650String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX1649String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX1648String = "\n";
  private static final String synX1647String = "</div>\n";
  private static final String synX1646String = "</p>";
  private static final String synX1645String = "\">";
  private static final String synX1644String = "<p class=\"option\" data-code=\"";
  private static final String synX1643String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX1642String = "      <div class=\"security\">\n";
  private static final String synX1641String = "</div>\n";
  private static final String synX1640String = "</p>";
  private static final String synX1639String = "<p class=\"option\">";
  private static final String synX1638String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX1637String = "      <div class=\"selected\">\n";
  private static final String synX1636String = "      <h2>Your Selection</h2>\n";
  private static final String synX1635String = "    <article>\n";
  private static final String synX1634String = "    </header>\n";
  private static final String synX1633String = "      <h1>Seat Booking</h1>\n";
  private static final String synX1632String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX1631String = "    <header>\n";
  private static final String synX1630String = "  <body class=\"booking\">\n";
  private static final String synX1629String = "  </head>\n";
  private static final String synX1628String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1627String = "    <![endif]-->\n";
  private static final String synX1626String = "      </script>\n";
  private static final String synX1625String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1624String = "    <!--[if IE]>\n";
  private static final String synX1623String = "    <title>Seat Booking</title>\n";
  private static final String synX1622String = "    <meta charset=utf-8>\n";
  private static final String synX1621String = "  <head>\n";
  private static final String synX1620String = "<html lang=\"en\">\n";
  private static final String synX1619String = "<!DOCTYPE html>\n";
  private static final String synX1618String = "";
  private static final double synX1617double = 0.7325350569834539;
  private static final String synX1616String = "benstheatre?message=success";
  private static final boolean synX1615boolean = false;
  private static final String synX1614String = "benstheatre?message=limitexceeded";
  private static final int synX1613int = 2;
  private static final int synX1612int = 0;
  private static final String synX1611String = "phone";
  private static final String synX1610String = "email";
  private static final String synX1609String = "address";
  private static final String synX1608String = "userid";
  private static final String synX1607String = "seatnumber";
  private static final String synX1606String = "seat";
  private static final String synX1605String = "row";
  private static final String synX1604String = "NqdPWoMmZLNeoXc";
  private static final String synX1603String = "seatnumber";
  private static final String synX1602String = "seat";
  private static final String synX1601String = "row";
  private static final double synX1600double = 0.7986124458212494;
  public static java.util.logging.Logger thermometer;
  public java.lang.String netmail;
  public java.lang.String answer;
  public java.lang.String headphone;
  public java.lang.String usernameDimidiate;
  public int behind;
  public int placeList;
  public java.lang.String spat;
  public static final double minimum = 0.4294013117559047;
  public Induct[] fannyPlethora;

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse replies)
      throws ServletException, IOException {
    double get;
    java.io.PrintWriter unsuccessful;
    java.lang.String registerChapter;
    get = (synX1600double);
    unsuccessful = (replies.getWriter());
    spat = (suggestion.getParameter(synX1601String));
    behind = (java.lang.Integer.parseInt(suggestion.getParameter(synX1602String)));
    placeList = (java.lang.Integer.parseInt(suggestion.getParameter(synX1603String)));
    fannyPlethora = (writtenFilename());
    registerChapter = (generateHiringSheet());
    unsuccessful.println(registerChapter);
  }

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse reactions)
      throws ServletException, IOException {
    String generProducts;
    int reserved;
    generProducts = (synX1604String);
    spat = (complaint.getParameter(synX1605String));
    behind = (java.lang.Integer.parseInt(complaint.getParameter(synX1606String)));
    placeList = (java.lang.Integer.parseInt(complaint.getParameter(synX1607String)));
    usernameDimidiate = (complaint.getParameter(synX1608String));
    answer = (complaint.getParameter(synX1609String));
    netmail = (complaint.getParameter(synX1610String));
    headphone = (complaint.getParameter(synX1611String));
    fannyPlethora = (writtenFilename());
    reserved = (synX1612int);
    for (Induct waffen : fannyPlethora) synx45(waffen, reserved);

    if (reserved > synX1613int) {
      reactions.sendRedirect(synX1614String);
    } else {
      fannyPlethora[placeList].determineEmployeePictures(usernameDimidiate);
      fannyPlethora[placeList].fitPlow(answer);
      fannyPlethora[placeList].arrangeElectronically(netmail);
      fannyPlethora[placeList].primedCellphone(headphone);
      fannyPlethora[placeList].fixThing(AllanSalle.obtainLiveDays());
      fannyPlethora[placeList].situatedAvailability(synX1615boolean);
      conserveRegister(fannyPlethora);
      reactions.sendRedirect(synX1616String);
    }
  }

  public synchronized java.lang.String generateHiringSheet() {
    double identify;
    java.lang.String encodes;
    java.lang.String aspx;
    identify = (synX1617double);
    encodes = (safeguardingDesignator());
    aspx = (synX1618String);
    aspx +=
        ((synX1619String
            + synX1620String
            + synX1621String
            + synX1622String
            + synX1623String
            + synX1624String
            + synX1625String
            + synX1626String
            + synX1627String
            + synX1628String
            + synX1629String
            + synX1630String
            + synX1631String
            + synX1632String
            + synX1633String
            + synX1634String
            + synX1635String
            + synX1636String
            + synX1637String
            + synX1638String));
    aspx += ((synX1639String + spat + behind + synX1640String));
    aspx += ((synX1641String + synX1642String + synX1643String));
    aspx += ((synX1644String + encodes + synX1645String + encodes + synX1646String));
    aspx +=
        ((synX1647String
            + synX1648String
            + synX1649String
            + synX1650String
            + behind
            + synX1651String
            + synX1652String
            + spat
            + synX1653String
            + synX1654String
            + placeList
            + synX1655String
            + synX1656String
            + synX1657String
            + synX1658String
            + synX1659String
            + synX1660String
            + synX1661String
            + synX1662String
            + synX1663String
            + synX1664String
            + synX1665String
            + synX1666String
            + synX1667String
            + synX1668String
            + synX1669String
            + synX1670String
            + synX1671String
            + synX1672String
            + synX1673String
            + synX1674String));
    return aspx;
  }

  public synchronized java.lang.String safeguardingDesignator() {
    double minn;
    java.lang.String parcels[] = {
      synX1675String,
      synX1676String,
      synX1677String,
      synX1678String,
      synX1679String,
      synX1680String,
      synX1681String,
      synX1682String,
      synX1683String,
      synX1684String,
      synX1685String,
      synX1686String,
      synX1687String,
      synX1688String,
      synX1689String,
      synX1690String,
      synX1691String,
      synX1692String,
      synX1693String,
      synX1694String,
      synX1695String,
      synX1696String,
      synX1697String,
      synX1698String,
      synX1699String,
      synX1700String
    };
    java.lang.String figures[] = {
      synX1701String,
      synX1702String,
      synX1703String,
      synX1704String,
      synX1705String,
      synX1706String,
      synX1707String,
      synX1708String,
      synX1709String,
      synX1710String
    };
    java.util.Random sample;
    java.lang.String fl, bp, intercept, adc, dn, s2;
    minn = (synX1711double);
    sample = (new java.util.Random());
    fl = (parcels[sample.nextInt(parcels.length)]);
    bp = (figures[sample.nextInt(figures.length)]);
    intercept = (parcels[sample.nextInt(parcels.length)]);
    adc = (figures[sample.nextInt(figures.length)]);
    dn = (parcels[sample.nextInt(parcels.length)]);
    s2 = (figures[sample.nextInt(figures.length)]);
    return (fl + bp + intercept + adc + dn + s2);
  }

  public synchronized Induct[] writtenFilename() {
    double worth;
    worth = (synX1712double);

    try {
      java.io.FileInputStream adherentsPaperwork;
      java.io.ObjectInputStream proponents;
      Induct[] positions;
      adherentsPaperwork =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX1713String)));
      proponents = (new java.io.ObjectInputStream(adherentsPaperwork));
      positions = ((Induct[]) proponents.readObject());
      proponents.close();
      adherentsPaperwork.close();
      return positions;
    } catch (java.io.IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      thermometer.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void conserveRegister(Induct[] chairs) {
    String contrGoods;
    contrGoods = (synX1714String);

    try {
      java.io.FileOutputStream deadSubmit;
      java.io.ObjectOutputStream dead;
      deadSubmit = (new java.io.FileOutputStream(getServletContext().getRealPath(synX1715String)));
      dead = (new java.io.ObjectOutputStream(deadSubmit));
      dead.writeObject(chairs);
      dead.close();
      deadSubmit.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  static {
    thermometer = (java.util.logging.Logger.getLogger(synX1716String));
  }

  private synchronized void synx45(Induct waffen, int reserved)
      throws ServletException, IOException {

    if (waffen.arriveClientIdentifying() != null
        && waffen.arriveClientIdentifying().equals(usernameDimidiate)) {
      reserved++;
    }
  }
}
