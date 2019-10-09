import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ZackDramaRegister extends HttpServlet {
  private static final String synX2175String = "/WEB-INF/bookingData.ser";
  private static final double synX2174double = 0.8182982979206196;
  private static final String synX2173String = "/WEB-INF/bookingData.ser";
  private static final double synX2172double = 0.5905029386757469;
  private static final String synX2171String = "9";
  private static final String synX2170String = "8";
  private static final String synX2169String = "7";
  private static final String synX2168String = "6";
  private static final String synX2167String = "5";
  private static final String synX2166String = "4";
  private static final String synX2165String = "3";
  private static final String synX2164String = "2";
  private static final String synX2163String = "1";
  private static final String synX2162String = "0";
  private static final String synX2161String = "Z";
  private static final String synX2160String = "Y";
  private static final String synX2159String = "X";
  private static final String synX2158String = "W";
  private static final String synX2157String = "V";
  private static final String synX2156String = "U";
  private static final String synX2155String = "T";
  private static final String synX2154String = "S";
  private static final String synX2153String = "R";
  private static final String synX2152String = "Q";
  private static final String synX2151String = "P";
  private static final String synX2150String = "O";
  private static final String synX2149String = "N";
  private static final String synX2148String = "M";
  private static final String synX2147String = "L";
  private static final String synX2146String = "K";
  private static final String synX2145String = "J";
  private static final String synX2144String = "I";
  private static final String synX2143String = "H";
  private static final String synX2142String = "G";
  private static final String synX2141String = "F";
  private static final String synX2140String = "E";
  private static final String synX2139String = "D";
  private static final String synX2138String = "C";
  private static final String synX2137String = "B";
  private static final String synX2136String = "A";
  private static final double synX2135double = 0.7665256568388998;
  private static final String synX2134String = "</html>";
  private static final String synX2133String = "  </body>\t\n";
  private static final String synX2132String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2131String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2130String = "    </footer>\n";
  private static final String synX2129String = "      </div>\n";
  private static final String synX2128String = "        <p>c3063467</p>\n";
  private static final String synX2127String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2126String = "      <div class=\"author\">\n";
  private static final String synX2125String = "    <footer>\n";
  private static final String synX2124String = "    </article>\n";
  private static final String synX2123String = "      </form>\n";
  private static final String synX2122String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX2121String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX2120String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX2119String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX2118String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX2117String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX2116String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX2115String = "\" />\n";
  private static final String synX2114String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX2113String = "\" />\n";
  private static final String synX2112String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX2111String = "\" />\n";
  private static final String synX2110String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX2109String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX2108String = "\n";
  private static final String synX2107String = "</div>\n";
  private static final String synX2106String = "</p>";
  private static final String synX2105String = "\">";
  private static final String synX2104String = "<p class=\"option\" data-code=\"";
  private static final String synX2103String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX2102String = "      <div class=\"security\">\n";
  private static final String synX2101String = "</div>\n";
  private static final String synX2100String = "</p>";
  private static final String synX2099String = "<p class=\"option\">";
  private static final String synX2098String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX2097String = "      <div class=\"selected\">\n";
  private static final String synX2096String = "      <h2>Your Selection</h2>\n";
  private static final String synX2095String = "    <article>\n";
  private static final String synX2094String = "    </header>\n";
  private static final String synX2093String = "      <h1>Seat Booking</h1>\n";
  private static final String synX2092String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX2091String = "    <header>\n";
  private static final String synX2090String = "  <body class=\"booking\">\n";
  private static final String synX2089String = "  </head>\n";
  private static final String synX2088String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2087String = "    <![endif]-->\n";
  private static final String synX2086String = "      </script>\n";
  private static final String synX2085String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2084String = "    <!--[if IE]>\n";
  private static final String synX2083String = "    <title>Seat Booking</title>\n";
  private static final String synX2082String = "    <meta charset=utf-8>\n";
  private static final String synX2081String = "  <head>\n";
  private static final String synX2080String = "<html lang=\"en\">\n";
  private static final String synX2079String = "<!DOCTYPE html>\n";
  private static final String synX2078String = "";
  private static final int synX2077int = 1875668461;
  private static final String synX2076String = "benstheatre?message=success";
  private static final boolean synX2075boolean = false;
  private static final String synX2074String = "benstheatre?message=limitexceeded";
  private static final int synX2073int = 2;
  private static final int synX2072int = 0;
  private static final String synX2071String = "phone";
  private static final String synX2070String = "email";
  private static final String synX2069String = "address";
  private static final String synX2068String = "userid";
  private static final String synX2067String = "seatnumber";
  private static final String synX2066String = "seat";
  private static final String synX2065String = "row";
  private static final double synX2064double = 0.6089107324015919;
  private static final String synX2063String = "seatnumber";
  private static final String synX2062String = "seat";
  private static final String synX2061String = "row";
  private static final int synX2060int = -1297971180;
  static double pseudonym = 0.674203585728449;
  public Sit[] buttMix;
  public String spat;
  public int posteriorAct;
  public int posterior;
  public String customerCaller;
  public String headset;
  public String discuss;
  public String correspondence;
  public static Logger recorder = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse react)
      throws ServletException, IOException {
    int bestAmount = synX2060int;
    PrintWriter proscribed = react.getWriter();
    spat = insistence.getParameter(synX2061String);
    posterior = Integer.parseInt(insistence.getParameter(synX2062String));
    posteriorAct = Integer.parseInt(insistence.getParameter(synX2063String));
    buttMix = aloudApplication();
    String engagementVarlet = beatArrestContents();
    proscribed.println(engagementVarlet);
  }

  public synchronized void doPost(HttpServletRequest suggestion, HttpServletResponse responding)
      throws ServletException, IOException {
    double frownThrottle = synX2064double;
    spat = suggestion.getParameter(synX2065String);
    posterior = Integer.parseInt(suggestion.getParameter(synX2066String));
    posteriorAct = Integer.parseInt(suggestion.getParameter(synX2067String));
    customerCaller = suggestion.getParameter(synX2068String);
    discuss = suggestion.getParameter(synX2069String);
    correspondence = suggestion.getParameter(synX2070String);
    headset = suggestion.getParameter(synX2071String);
    buttMix = aloudApplication();
    int allocated = synX2072int;
    for (Sit waffen : buttMix) synx70(waffen, allocated);

    if (allocated > synX2073int) {
      responding.sendRedirect(synX2074String);
    } else {
      buttMix[posteriorAct].fixedUsePhoto(customerCaller);
      buttMix[posteriorAct].solidifyingDiscuss(discuss);
      buttMix[posteriorAct].putNetmail(correspondence);
      buttMix[posteriorAct].determinedSound(headset);
      buttMix[posteriorAct].situatedMinutes(ScottyPerformances.drawStreamWeek());
      buttMix[posteriorAct].placeDisposable(synX2075boolean);
      salveDocumentation(buttMix);
      responding.sendRedirect(synX2076String);
    }
  }

  public synchronized String beatArrestContents() {
    int lotGauge = synX2077int;
    String cipher = policemenStandards();
    String bitmap = synX2078String;
    bitmap +=
        bitmap
            + synX2079String
            + synX2080String
            + synX2081String
            + synX2082String
            + synX2083String
            + synX2084String
            + synX2085String
            + synX2086String
            + synX2087String
            + synX2088String
            + synX2089String
            + synX2090String
            + synX2091String
            + synX2092String
            + synX2093String
            + synX2094String
            + synX2095String
            + synX2096String
            + synX2097String
            + synX2098String;
    bitmap += bitmap + synX2099String + spat + posterior + synX2100String;
    bitmap += bitmap + synX2101String + synX2102String + synX2103String;
    bitmap += bitmap + synX2104String + cipher + synX2105String + cipher + synX2106String;
    bitmap +=
        bitmap
            + synX2107String
            + synX2108String
            + synX2109String
            + synX2110String
            + posterior
            + synX2111String
            + synX2112String
            + spat
            + synX2113String
            + synX2114String
            + posteriorAct
            + synX2115String
            + synX2116String
            + synX2117String
            + synX2118String
            + synX2119String
            + synX2120String
            + synX2121String
            + synX2122String
            + synX2123String
            + synX2124String
            + synX2125String
            + synX2126String
            + synX2127String
            + synX2128String
            + synX2129String
            + synX2130String
            + synX2131String
            + synX2132String
            + synX2133String
            + synX2134String;
    return bitmap;
  }

  public synchronized String policemenStandards() {
    double designation = synX2135double;
    String missives[] = {
      synX2136String,
      synX2137String,
      synX2138String,
      synX2139String,
      synX2140String,
      synX2141String,
      synX2142String,
      synX2143String,
      synX2144String,
      synX2145String,
      synX2146String,
      synX2147String,
      synX2148String,
      synX2149String,
      synX2150String,
      synX2151String,
      synX2152String,
      synX2153String,
      synX2154String,
      synX2155String,
      synX2156String,
      synX2157String,
      synX2158String,
      synX2159String,
      synX2160String,
      synX2161String
    };
    String figure[] = {
      synX2162String,
      synX2163String,
      synX2164String,
      synX2165String,
      synX2166String,
      synX2167String,
      synX2168String,
      synX2169String,
      synX2170String,
      synX2171String
    };
    Random serendipity = new Random();
    String impedance, r8, robot, force, r6, g;
    impedance = missives[serendipity.nextInt(missives.length)];
    r8 = figure[serendipity.nextInt(figure.length)];
    robot = missives[serendipity.nextInt(missives.length)];
    force = figure[serendipity.nextInt(figure.length)];
    r6 = missives[serendipity.nextInt(missives.length)];
    g = figure[serendipity.nextInt(figure.length)];
    return impedance + r8 + robot + force + r6 + g;
  }

  public synchronized Sit[] aloudApplication() {
    double across = synX2172double;

    try {
      Sit[] jobs;
      FileInputStream officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath(synX2173String));
      ObjectInputStream incumbents = new ObjectInputStream(officeholdersSubmit);
      jobs = (Sit[]) incumbents.readObject();
      incumbents.close();
      officeholdersSubmit.close();
      return jobs;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      recorder.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void salveDocumentation(Sit[] pillion) {
    double greaterConstrain = synX2174double;

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath(synX2175String));
      ObjectOutputStream retired = new ObjectOutputStream(outgoingArchives);
      retired.writeObject(pillion);
      retired.close();
      outgoingArchives.close();
    } catch (IOException con) {
      con.printStackTrace();
    }
  }

  private synchronized void synx70(Sit waffen, int allocated) throws ServletException, IOException {

    if (waffen.driveOperatorSecurity() != null
        && waffen.driveOperatorSecurity().equals(customerCaller)) {
      allocated++;
    }
  }
}
