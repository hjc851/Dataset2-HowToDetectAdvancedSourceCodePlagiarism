import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AllanSalle extends javax.servlet.http.HttpServlet {
  private static final int synX1839int = 64;
  private static final int synX1838int = 0;
  private static final String synX1837String = "";
  private static final String synX1836String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX1835String = "limitexceeded";
  private static final String synX1834String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX1833String = "success";
  private static final String synX1832String = "bensTheatre";
  private static final String synX1831String = "dd-MM-YY ss-MM-HH";
  private static final double synX1830double = 0.17311746205232892;
  private static final String synX1829String = "</html>";
  private static final String synX1828String = "  </body>\t\n";
  private static final String synX1827String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1826String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1825String = "    </div>\n";
  private static final String synX1824String = "      </div>\n";
  private static final String synX1823String = "        </div>\n";
  private static final String synX1822String = "          <button>OK</button>\n";
  private static final String synX1821String = "        <div class=\"close\">\n";
  private static final String synX1820String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX1819String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX1818String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX1817String = "      <div class=\"inner\">\n";
  private static final String synX1816String = "    <div id=\"popup\">\n";
  private static final String synX1815String = "    </footer>\n";
  private static final String synX1814String = "      </div>\n";
  private static final String synX1813String = "        <p>c3063467</p>\n";
  private static final String synX1812String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1811String = "      <div class=\"author\">\n";
  private static final String synX1810String = "    <footer>\n";
  private static final String synX1809String = "    </article>\n";
  private static final String synX1808String = "      </div>\n";
  private static final String synX1807String = "        </div>\n";
  private static final String synX1806String = "          <p>Booked</p>\n";
  private static final String synX1805String = "        <div class=\"booked\">\n";
  private static final String synX1804String = "        </div>\n";
  private static final String synX1803String = "          <p>Available</p>\n";
  private static final String synX1802String = "        <div class=\"available\">\n";
  private static final String synX1801String = "      <div class=\"legend\">\n";
  private static final String synX1800String = "      </table>\n";
  private static final String synX1799String = "</tbody>\n";
  private static final String synX1798String = "</tr>\n";
  private static final String synX1797String = "</td>";
  private static final String synX1796String = "</p>\n";
  private static final int synX1795int = 1;
  private static final String synX1794String = "  <p>";
  private static final String synX1793String = "\">\n";
  private static final String synX1792String = "\" data-seatNumber=\"";
  private static final int synX1791int = 1;
  private static final String synX1790String = "\" data-seat=\"";
  private static final String synX1789String = "\" data-row=\"";
  private static final String synX1788String = "\" data-time=\"";
  private static final String synX1787String = "\" data-user=\"";
  private static final String synX1786String = "<td class=\"seat";
  private static final String synX1785String = " booked";
  private static final String synX1784String = "";
  private static final int synX1783int = 8;
  private static final int synX1782int = 0;
  private static final String synX1781String = "<tr>\n";
  private static final int synX1780int = 8;
  private static final int synX1779int = 0;
  private static final int synX1778int = 0;
  private static final String synX1777String = "H";
  private static final String synX1776String = "G";
  private static final String synX1775String = "F";
  private static final String synX1774String = "E";
  private static final String synX1773String = "D";
  private static final String synX1772String = "C";
  private static final String synX1771String = "B";
  private static final String synX1770String = "A";
  private static final String synX1769String = "        <tbody>";
  private static final String synX1768String = "        </thead>\n";
  private static final String synX1767String = "          </tr>\n";
  private static final String synX1766String = "            </td>\n";
  private static final String synX1765String = "              <p>Stage</p>\n";
  private static final String synX1764String = "            <td colspan=\"8\">\n";
  private static final String synX1763String = "          <tr>\n";
  private static final String synX1762String = "        <thead>\n";
  private static final String synX1761String = "      <table>\n";
  private static final String synX1760String = "      </div>\n";
  private static final String synX1759String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX1758String = "      <div class=\"instructions\">\n";
  private static final String synX1757String = "      </div>\n";
  private static final String synX1756String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX1755String = "        <p>";
  private static final String synX1754String = "      <div class=\"time\">\n";
  private static final String synX1753String = "      <h2>Seats</h2>\n";
  private static final String synX1752String = "</p>\n";
  private static final String synX1751String = "      <p class=\"message\">";
  private static final String synX1750String = "    <article>\n";
  private static final String synX1749String = "    </header>\n";
  private static final String synX1748String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX1747String = "    <header>\n";
  private static final String synX1746String = "  <body class=\"home\">\n";
  private static final String synX1745String = "  </head>\n";
  private static final String synX1744String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1743String = "    <![endif]-->\n";
  private static final String synX1742String = "      </script>\n";
  private static final String synX1741String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1740String = "    <!--[if IE]>\n";
  private static final String synX1739String = "    <title>Theatre Booking System</title>\n";
  private static final String synX1738String = "    <meta charset=utf-8>\n";
  private static final String synX1737String = "  <head>\n";
  private static final String synX1736String = "<html lang=\"en\">\n";
  private static final String synX1735String = "<!DOCTYPE html>\n";
  private static final double synX1734double = 0.13008732925439692;
  private static final String synX1733String = "/WEB-INF/bookingData.ser";
  private static final double synX1732double = 0.3154180948636153;
  private static final String synX1731String = "/WEB-INF/bookingData.ser";
  private static final String synX1730String = "PDjfub4wp8Psts65";
  private static final String synX1729String = "/WEB-INF/bookingData.ser";
  private static final int synX1728int = 64;
  private static final String synX1727String = "message";
  private static final String synX1726String = "HcM";
  public static java.util.logging.Logger woodworker;
  public java.lang.String correspondence;
  public static final String topmostMinimum = "";
  public Induct[] tooshiePortfolio;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse respond)
      throws ServletException, IOException {
    String upstreamReduce;
    java.io.PrintWriter away;
    java.io.File gigInitiate;
    java.lang.String apartmentLayout;
    upstreamReduce = (synX1726String);
    away = (respond.getWriter());
    correspondence = (requisition.getParameter(synX1727String));

    if (correspondence != null) synx46();
    else synx47();
    tooshiePortfolio = (new Induct[synX1728int]);
    gigInitiate = (new java.io.File(getServletContext().getRealPath(synX1729String)));

    if (gigInitiate.exists()) synx48();
    else synx49();
    apartmentLayout = (driveCottageFolio());
    away.println(apartmentLayout);
  }

  public synchronized Induct[] learnRegister() {
    String chained;
    chained = (synX1730String);

    try {
      java.io.FileInputStream electedFilename;
      java.io.ObjectInputStream entries;
      Induct[] votes;
      electedFilename =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX1731String)));
      entries = (new java.io.ObjectInputStream(electedFilename));
      votes = ((Induct[]) entries.readObject());
      entries.close();
      electedFilename.close();
      return votes;
    } catch (java.io.IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      woodworker.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Induct[] posts) {
    double confine;
    confine = (synX1732double);

    try {
      java.io.FileOutputStream outerSubmitted;
      java.io.ObjectOutputStream extinguished;
      outerSubmitted =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX1733String)));
      extinguished = (new java.io.ObjectOutputStream(outerSubmitted));
      extinguished.writeObject(posts);
      extinguished.close();
      outerSubmitted.close();
    } catch (java.io.IOException pro) {
      pro.printStackTrace();
    }
  }

  public synchronized java.lang.String driveCottageFolio() {
    double higherBound;
    java.lang.String drupal;
    int bottomCaseload;
    higherBound = (synX1734double);
    drupal =
        ((synX1735String
            + synX1736String
            + synX1737String
            + synX1738String
            + synX1739String
            + synX1740String
            + synX1741String
            + synX1742String
            + synX1743String
            + synX1744String
            + synX1745String
            + synX1746String
            + synX1747String
            + synX1748String
            + synX1749String
            + synX1750String
            + synX1751String
            + correspondence
            + synX1752String
            + synX1753String
            + synX1754String
            + synX1755String
            + obtainLiveDays()
            + synX1756String
            + synX1757String
            + synX1758String
            + synX1759String
            + synX1760String
            + synX1761String
            + synX1762String
            + synX1763String
            + synX1764String
            + synX1765String
            + synX1766String
            + synX1767String
            + synX1768String
            + synX1769String));
    String[] brawlGamut = {
      synX1770String,
      synX1771String,
      synX1772String,
      synX1773String,
      synX1774String,
      synX1775String,
      synX1776String,
      synX1777String
    };
    bottomCaseload = (synX1778int);
    {
      int i = synX1779int;

      while (i < synX1780int) {
        {
          {
            drupal += (synX1781String);
            {
              int gruss = synX1782int;

              while (gruss < synX1783int) {
                {
                  {
                    java.lang.String charged;
                    charged = (synX1784String);

                    if (!tooshiePortfolio[bottomCaseload].isAccessible()) {
                      charged = (synX1785String);
                    }

                    drupal +=
                        ((synX1786String
                            + charged
                            + synX1787String
                            + tooshiePortfolio[bottomCaseload].arriveClientIdentifying()
                            + synX1788String
                            + tooshiePortfolio[bottomCaseload].makeDay()
                            + synX1789String
                            + brawlGamut[i]
                            + synX1790String
                            + (gruss + synX1791int)
                            + synX1792String
                            + bottomCaseload
                            + synX1793String
                            + synX1794String
                            + brawlGamut[i]
                            + (gruss + synX1795int)
                            + synX1796String
                            + synX1797String));
                    bottomCaseload++;
                  }
                }
                gruss++;
              }
            }
            drupal += (synX1798String);
          }
        }
        i++;
      }
    }
    drupal +=
        ((synX1799String
            + synX1800String
            + synX1801String
            + synX1802String
            + synX1803String
            + synX1804String
            + synX1805String
            + synX1806String
            + synX1807String
            + synX1808String
            + synX1809String
            + synX1810String
            + synX1811String
            + synX1812String
            + synX1813String
            + synX1814String
            + synX1815String
            + synX1816String
            + synX1817String
            + synX1818String
            + synX1819String
            + synX1820String
            + synX1821String
            + synX1822String
            + synX1823String
            + synX1824String
            + synX1825String
            + synX1826String
            + synX1827String
            + synX1828String
            + synX1829String));
    return drupal;
  }

  public static synchronized java.lang.String obtainLiveDays() {
    double littleRoll;
    java.text.SimpleDateFormat untestedDeadlineApproach;
    java.util.Date yet;
    java.lang.String blackguardTimelineDays;
    littleRoll = (synX1830double);
    untestedDeadlineApproach = (new java.text.SimpleDateFormat(synX1831String));
    yet = (new java.util.Date());
    blackguardTimelineDays = (untestedDeadlineApproach.format(yet));
    return blackguardTimelineDays;
  }

  static {
    woodworker = (java.util.logging.Logger.getLogger(synX1832String));
  }

  private synchronized void synx46() throws ServletException, IOException {

    if (correspondence.equals(synX1833String)) {
      correspondence = (synX1834String);
    } else if (correspondence.equals(synX1835String)) {
      correspondence = (synX1836String);
    }
  }

  private synchronized void synx47() throws ServletException, IOException {
    correspondence = (synX1837String);
  }

  private synchronized void synx48() throws ServletException, IOException {
    tooshiePortfolio = (learnRegister());
  }

  private synchronized void synx49() throws ServletException, IOException {
    {
      int i = synX1838int;

      while (i < synX1839int) {
        {
          {
            Induct novelTooshie;
            novelTooshie = (new Induct());
            tooshiePortfolio[i] = (novelTooshie);
          }
        }
        i++;
      }
    }
    deliverDocument(tooshiePortfolio);
  }
}
