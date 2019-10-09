import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends HttpServlet {

  public synchronized String fetchAppointmentLayouts() {
    double designation;
    String designator;
    String plugin;
    designation = 0.1508951587048616;
    designator = insecureCodex();
    plugin = "";
    plugin +=
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Seat Booking</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"booking\">\n"
            + "    <header>\n"
            + "      <a href=\"benstheatre\">HOME</a>\n"
            + "      <h1>Seat Booking</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <h2>Your Selection</h2>\n"
            + "      <div class=\"selected\">\n"
            + "        <p class=\"heading\">Selected Seat:</p>";
    plugin += "<p class=\"option\">" + ranking + can + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + can
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranking
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + pratStatistic
            + "\" />\n"
            + "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n"
            + "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n"
            + "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n"
            + "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n"
            + "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n"
            + "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n"
            + "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n"
            + "      </form>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>";
    return plugin;
  }

  private String couriers;
  private String telephones;

  static {
    woodcutter = Logger.getLogger("bensTheatre");
  }

  private Fanny[] bumSelection;

  public synchronized void doPost(HttpServletRequest demands, HttpServletResponse explanation)
      throws ServletException, IOException {
    double significance;
    int purchased;
    significance = 0.051752202387790436;
    ranking = demands.getParameter("row");
    can = Integer.parseInt(demands.getParameter("seat"));
    pratStatistic = Integer.parseInt(demands.getParameter("seatnumber"));
    searcherIdentification = demands.getParameter("userid");
    fix = demands.getParameter("address");
    couriers = demands.getParameter("email");
    telephones = demands.getParameter("phone");
    bumSelection = hearBinder();
    purchased = 0;
    for (Fanny fh : bumSelection) {

      if (fh.canVisitorOwnership() != null
          && fh.canVisitorOwnership().equals(searcherIdentification)) {
        purchased++;
      }
    }

    if (purchased > 2) {
      explanation.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bumSelection[pratStatistic].bentAddictPeg(searcherIdentification);
      bumSelection[pratStatistic].fixedResolve(fix);
      bumSelection[pratStatistic].situatedPostal(couriers);
      bumSelection[pratStatistic].dictatedEarpiece(telephones);
      bumSelection[pratStatistic].arrangedSentence(RemoTheater.generateUnderwayYear());
      bumSelection[pratStatistic].orderedGetable(false);
      safeguardArchiving(bumSelection);
      explanation.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized Fanny[] hearBinder() {
    double decreaseThresholds;
    decreaseThresholds = 0.9515011014195868;

    try {
      FileInputStream detailsSubmitted;
      ObjectInputStream advocates;
      Fanny[] positions;
      detailsSubmitted =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      advocates = new ObjectInputStream(detailsSubmitted);
      positions = (Fanny[]) advocates.readObject();
      advocates.close();
      detailsSubmitted.close();
      return positions;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      woodcutter.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  private String searcherIdentification;
  public static double ultimate = 0.8936817584012059;

  public synchronized String insecureCodex() {
    int charge;
    String epistles[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String volumes[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random indiscriminate;
    String momenta, cn, lituus, fgf, manifold, s2;
    charge = 1584637838;
    indiscriminate = new Random();
    momenta = epistles[indiscriminate.nextInt(epistles.length)];
    cn = volumes[indiscriminate.nextInt(volumes.length)];
    lituus = epistles[indiscriminate.nextInt(epistles.length)];
    fgf = volumes[indiscriminate.nextInt(volumes.length)];
    manifold = epistles[indiscriminate.nextInt(epistles.length)];
    s2 = volumes[indiscriminate.nextInt(volumes.length)];
    return momenta + cn + lituus + fgf + manifold + s2;
  }

  private String fix;

  public synchronized void doGet(HttpServletRequest invitation, HttpServletResponse intervention)
      throws ServletException, IOException {
    double bound;
    PrintWriter tabu;
    String rentPaper;
    bound = 0.8169048241587191;
    tabu = intervention.getWriter();
    ranking = invitation.getParameter("row");
    can = Integer.parseInt(invitation.getParameter("seat"));
    pratStatistic = Integer.parseInt(invitation.getParameter("seatnumber"));
    bumSelection = hearBinder();
    rentPaper = fetchAppointmentLayouts();
    tabu.println(rentPaper);
  }

  private int pratStatistic;
  private String ranking;
  private static Logger woodcutter;

  public synchronized void safeguardArchiving(Fanny[] venues) {
    int reckon;
    reckon = -885358835;

    try {
      FileOutputStream proscribedSubmitting;
      ObjectOutputStream exterior;
      proscribedSubmitting =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      exterior = new ObjectOutputStream(proscribedSubmitting);
      exterior.writeObject(venues);
      exterior.close();
      proscribedSubmitting.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }

  private int can;
}
