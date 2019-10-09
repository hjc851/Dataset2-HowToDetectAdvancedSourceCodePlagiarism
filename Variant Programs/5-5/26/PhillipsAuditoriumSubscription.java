import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static java.lang.Integer.parseInt;

public class PhillipsAuditoriumSubscription extends javax.servlet.http.HttpServlet {
  public static String forename = "Ss74W7EtRTEWIv5ZrOa";
  public Place[] tushFinery;
  public java.lang.String penalty;
  public int investFrequency;
  public int place;
  public java.lang.String customersIbid;
  public java.lang.String dial;
  public java.lang.String destination;
  public java.lang.String mailing;
  public static java.util.logging.Logger rancher = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    String identification = "571WKvwQnKiS5WLTV";
    java.io.PrintWriter stunned = rejoinder.getWriter();
    penalty = (insistence.getParameter("row"));
    place = (parseInt(insistence.getParameter("seat")));
    investFrequency = (parseInt(insistence.getParameter("seatnumber")));
    tushFinery = (writtenFilename());
    java.lang.String advanceFootnote = canLogScreen();
    stunned.println(advanceFootnote);
  }

  public synchronized void doPost(HttpServletRequest ask, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    String bounds = "7nJ";
    penalty = (ask.getParameter("row"));
    place = (parseInt(ask.getParameter("seat")));
    investFrequency = (parseInt(ask.getParameter("seatnumber")));
    customersIbid = (ask.getParameter("userid"));
    destination = (ask.getParameter("address"));
    mailing = (ask.getParameter("email"));
    dial = (ask.getParameter("phone"));
    tushFinery = (writtenFilename());
    int made = 0;
    for (Place ora : tushFinery) synx90(ora, made);

    if (made > 2) {
      rebuttal.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tushFinery[investFrequency].settledSubscriberHandle(customersIbid);
      tushFinery[investFrequency].doIdentify(destination);
      tushFinery[investFrequency].determinedMail(mailing);
      tushFinery[investFrequency].situatedTelephony(dial);
      tushFinery[investFrequency].doAgain(MalcolmTheaters.becomeTheOpportunity());
      tushFinery[investFrequency].rigidProvided(false);
      shaveArchives(tushFinery);
      rebuttal.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String canLogScreen() {
    double username = 0.39755816892694973;
    java.lang.String encoding = stabilityRules();
    java.lang.String plugin = "";
    plugin +=
        (("<!DOCTYPE html>\n"
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
            + "        <p class=\"heading\">Selected Seat:</p>"));
    plugin += (("<p class=\"option\">" + penalty + place + "</p>"));
    plugin +=
        (("</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>"));
    plugin += (("<p class=\"option\" data-code=\"" + encoding + "\">" + encoding + "</p>"));
    plugin +=
        (("</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + penalty
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + investFrequency
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
            + "</html>"));
    return plugin;
  }

  public synchronized java.lang.String stabilityRules() {
    String northernObligated = "fdPEJvB";
    java.lang.String correspondance[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String totals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unannounced = new java.util.Random();
    java.lang.String frequency, acetal, impedance, force, detector, rl;
    frequency = (correspondance[unannounced.nextInt(correspondance.length)]);
    acetal = (totals[unannounced.nextInt(totals.length)]);
    impedance = (correspondance[unannounced.nextInt(correspondance.length)]);
    force = (totals[unannounced.nextInt(totals.length)]);
    detector = (correspondance[unannounced.nextInt(correspondance.length)]);
    rl = (totals[unannounced.nextInt(totals.length)]);
    return (frequency + acetal + impedance + force + detector + rl);
  }

  public synchronized Place[] writtenFilename() {
    String maximalLength = "BoJnfUS";

    try {
      Place[] stalls;
      java.io.FileInputStream supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream proponents = new java.io.ObjectInputStream(supportersDocumentation);
      stalls = ((Place[]) proponents.readObject());
      proponents.close();
      supportersDocumentation.close();
      return stalls;
    } catch (java.io.IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      rancher.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void shaveArchives(Place[] passengers) {
    double figure = 0.5115829600898817;

    try {
      java.io.FileOutputStream unconsciousCharge =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unfashionable = new java.io.ObjectOutputStream(unconsciousCharge);
      unfashionable.writeObject(passengers);
      unfashionable.close();
      unconsciousCharge.close();
    } catch (java.io.IOException abe) {
      abe.printStackTrace();
    }
  }

  private synchronized void synx90(Place ora, int made) throws ServletException, IOException {

    if (ora.catchCustomersIbid() != null && ora.catchCustomersIbid().equals(customersIbid)) {
      made++;
    }
  }
}
