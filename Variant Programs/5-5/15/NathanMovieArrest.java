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

public class NathanMovieArrest extends HttpServlet {
  private static final String synX1950String = "bensTheatre";
  private static final String synX1949String = "/WEB-INF/bookingData.ser";
  private static final String synX1948String = "/WEB-INF/bookingData.ser";
  private static final String synX1947String = "9";
  private static final String synX1946String = "8";
  private static final String synX1945String = "7";
  private static final String synX1944String = "6";
  private static final String synX1943String = "5";
  private static final String synX1942String = "4";
  private static final String synX1941String = "3";
  private static final String synX1940String = "2";
  private static final String synX1939String = "1";
  private static final String synX1938String = "0";
  private static final String synX1937String = "Z";
  private static final String synX1936String = "Y";
  private static final String synX1935String = "X";
  private static final String synX1934String = "W";
  private static final String synX1933String = "V";
  private static final String synX1932String = "U";
  private static final String synX1931String = "T";
  private static final String synX1930String = "S";
  private static final String synX1929String = "R";
  private static final String synX1928String = "Q";
  private static final String synX1927String = "P";
  private static final String synX1926String = "O";
  private static final String synX1925String = "N";
  private static final String synX1924String = "M";
  private static final String synX1923String = "L";
  private static final String synX1922String = "K";
  private static final String synX1921String = "J";
  private static final String synX1920String = "I";
  private static final String synX1919String = "H";
  private static final String synX1918String = "G";
  private static final String synX1917String = "F";
  private static final String synX1916String = "E";
  private static final String synX1915String = "D";
  private static final String synX1914String = "C";
  private static final String synX1913String = "B";
  private static final String synX1912String = "A";
  private static final String synX1911String = "</html>";
  private static final String synX1910String = "  </body>\t\n";
  private static final String synX1909String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX1908String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX1907String = "    </footer>\n";
  private static final String synX1906String = "      </div>\n";
  private static final String synX1905String = "        <p>c3063467</p>\n";
  private static final String synX1904String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX1903String = "      <div class=\"author\">\n";
  private static final String synX1902String = "    <footer>\n";
  private static final String synX1901String = "    </article>\n";
  private static final String synX1900String = "      </form>\n";
  private static final String synX1899String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX1898String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX1897String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX1896String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX1895String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX1894String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX1893String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX1892String = "\" />\n";
  private static final String synX1891String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX1890String = "\" />\n";
  private static final String synX1889String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX1888String = "\" />\n";
  private static final String synX1887String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX1886String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX1885String = "\n";
  private static final String synX1884String = "</div>\n";
  private static final String synX1883String = "</p>";
  private static final String synX1882String = "\">";
  private static final String synX1881String = "<p class=\"option\" data-code=\"";
  private static final String synX1880String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX1879String = "      <div class=\"security\">\n";
  private static final String synX1878String = "</div>\n";
  private static final String synX1877String = "</p>";
  private static final String synX1876String = "<p class=\"option\">";
  private static final String synX1875String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX1874String = "      <div class=\"selected\">\n";
  private static final String synX1873String = "      <h2>Your Selection</h2>\n";
  private static final String synX1872String = "    <article>\n";
  private static final String synX1871String = "    </header>\n";
  private static final String synX1870String = "      <h1>Seat Booking</h1>\n";
  private static final String synX1869String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX1868String = "    <header>\n";
  private static final String synX1867String = "  <body class=\"booking\">\n";
  private static final String synX1866String = "  </head>\n";
  private static final String synX1865String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1864String = "    <![endif]-->\n";
  private static final String synX1863String = "      </script>\n";
  private static final String synX1862String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1861String = "    <!--[if IE]>\n";
  private static final String synX1860String = "    <title>Seat Booking</title>\n";
  private static final String synX1859String = "    <meta charset=utf-8>\n";
  private static final String synX1858String = "  <head>\n";
  private static final String synX1857String = "<html lang=\"en\">\n";
  private static final String synX1856String = "<!DOCTYPE html>\n";
  private static final String synX1855String = "";
  private static final String synX1854String = "benstheatre?message=success";
  private static final boolean synX1853boolean = false;
  private static final String synX1852String = "benstheatre?message=limitexceeded";
  private static final int synX1851int = 2;
  private static final int synX1850int = 0;
  private static final String synX1849String = "phone";
  private static final String synX1848String = "email";
  private static final String synX1847String = "address";
  private static final String synX1846String = "userid";
  private static final String synX1845String = "seatnumber";
  private static final String synX1844String = "seat";
  private static final String synX1843String = "row";
  private static final String synX1842String = "seatnumber";
  private static final String synX1841String = "seat";
  private static final String synX1840String = "row";
  private Prat[] posteriorGamut = null;
  private String brawl = null;
  private int tooshieMultiple = 0;
  private int bum = 0;
  private String usernameDimidiate = null;
  private String earphone = null;
  private String adress = null;
  private String netmail = null;
  private static Logger sawmill = null;

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse reacting)
      throws ServletException, IOException {
    PrintWriter proscribed = reacting.getWriter();
    brawl = (appeal.getParameter(synX1840String));
    bum = (parseInt(appeal.getParameter(synX1841String)));
    tooshieMultiple = (parseInt(appeal.getParameter(synX1842String)));
    posteriorGamut = (perusedArchives());
    String engagementVarlet = makeOverbookingText();
    proscribed.println(engagementVarlet);
  }

  public synchronized void doPost(HttpServletRequest motions, HttpServletResponse answers)
      throws ServletException, IOException {
    brawl = (motions.getParameter(synX1843String));
    bum = (parseInt(motions.getParameter(synX1844String)));
    tooshieMultiple = (parseInt(motions.getParameter(synX1845String)));
    usernameDimidiate = (motions.getParameter(synX1846String));
    adress = (motions.getParameter(synX1847String));
    netmail = (motions.getParameter(synX1848String));
    earphone = (motions.getParameter(synX1849String));
    posteriorGamut = (perusedArchives());
    int rented = synX1850int;
    for (Prat ora : posteriorGamut) synx50(ora, rented);

    if (rented > synX1851int) {
      answers.sendRedirect(synX1852String);
    } else {
      posteriorGamut[tooshieMultiple].fitConsumerIdem(usernameDimidiate);
      posteriorGamut[tooshieMultiple].orderedRectify(adress);
      posteriorGamut[tooshieMultiple].adjustUrl(netmail);
      posteriorGamut[tooshieMultiple].readyRing(earphone);
      posteriorGamut[tooshieMultiple].situatedMinutes(EmpCinemas.generateUnderwayYear());
      posteriorGamut[tooshieMultiple].fixDownloadable(synX1853boolean);
      conserveRegister(posteriorGamut);
      answers.sendRedirect(synX1854String);
    }
  }

  public synchronized String makeOverbookingText() {
    String codification = certificateCypher();
    String plugin = synX1855String;
    plugin +=
        (plugin
            + (synX1856String
                + synX1857String
                + synX1858String
                + synX1859String
                + synX1860String
                + synX1861String
                + synX1862String
                + synX1863String
                + synX1864String
                + synX1865String
                + synX1866String
                + synX1867String
                + synX1868String
                + synX1869String
                + synX1870String
                + synX1871String
                + synX1872String
                + synX1873String
                + synX1874String
                + synX1875String));
    plugin += (plugin + (synX1876String + brawl + bum + synX1877String));
    plugin += (plugin + (synX1878String + synX1879String + synX1880String));
    plugin +=
        (plugin + (synX1881String + codification + synX1882String + codification + synX1883String));
    plugin +=
        (plugin
            + (synX1884String
                + synX1885String
                + synX1886String
                + synX1887String
                + bum
                + synX1888String
                + synX1889String
                + brawl
                + synX1890String
                + synX1891String
                + tooshieMultiple
                + synX1892String
                + synX1893String
                + synX1894String
                + synX1895String
                + synX1896String
                + synX1897String
                + synX1898String
                + synX1899String
                + synX1900String
                + synX1901String
                + synX1902String
                + synX1903String
                + synX1904String
                + synX1905String
                + synX1906String
                + synX1907String
                + synX1908String
                + synX1909String
                + synX1910String
                + synX1911String));
    return plugin;
  }

  public synchronized String certificateCypher() {
    String mail[] = {
      synX1912String,
      synX1913String,
      synX1914String,
      synX1915String,
      synX1916String,
      synX1917String,
      synX1918String,
      synX1919String,
      synX1920String,
      synX1921String,
      synX1922String,
      synX1923String,
      synX1924String,
      synX1925String,
      synX1926String,
      synX1927String,
      synX1928String,
      synX1929String,
      synX1930String,
      synX1931String,
      synX1932String,
      synX1933String,
      synX1934String,
      synX1935String,
      synX1936String,
      synX1937String
    };
    String proportion[] = {
      synX1938String,
      synX1939String,
      synX1940String,
      synX1941String,
      synX1942String,
      synX1943String,
      synX1944String,
      synX1945String,
      synX1946String,
      synX1947String
    };
    Random weird = new Random();
    String tc = null, ao = null, intercept = null, contractual = null, r6 = null, mx = null;
    tc = (mail[weird.nextInt(mail.length)]);
    ao = (proportion[weird.nextInt(proportion.length)]);
    intercept = (mail[weird.nextInt(mail.length)]);
    contractual = (proportion[weird.nextInt(proportion.length)]);
    r6 = (mail[weird.nextInt(mail.length)]);
    mx = (proportion[weird.nextInt(proportion.length)]);
    return (tc + ao + intercept + contractual + r6 + mx);
  }

  public synchronized Prat[] perusedArchives() {

    try {
      Prat[] slots = null;
      FileInputStream supportersDocumentation =
          new FileInputStream(getServletContext().getRealPath(synX1948String));
      ObjectInputStream nsis = new ObjectInputStream(supportersDocumentation);
      slots = ((Prat[]) nsis.readObject());
      nsis.close();
      supportersDocumentation.close();
      return slots;
    } catch (IOException i) {
      sawmill.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      sawmill.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void conserveRegister(Prat[] ridings) {

    try {
      FileOutputStream kayoedDocket =
          new FileOutputStream(getServletContext().getRealPath(synX1949String));
      ObjectOutputStream impossible = new ObjectOutputStream(kayoedDocket);
      impossible.writeObject(ridings);
      impossible.close();
      kayoedDocket.close();
    } catch (IOException abe) {
      abe.printStackTrace();
    }
  }

  static {
    sawmill = (getLogger(synX1950String));
  }

  private synchronized void synx50(Prat ora, int rented) throws ServletException, IOException {

    if (ora.becomeUsePhoto() != null && ora.becomeUsePhoto().equals(usernameDimidiate)) {
      rented++;
    }
  }
}
