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
  static String amoy = "GgQ8AUg26K";
  private Buttocks[] fannyPlethora;
  private java.lang.String dustup;
  private int keisterRoutine;
  private int hindquarters;
  private java.lang.String visitorOwnership;
  private java.lang.String telephony;
  private java.lang.String tackle;
  private java.lang.String url;
  private static java.util.logging.Logger woodcutter = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse responsive)
      throws ServletException, IOException {
    String northConstrained = "euWVcUsSU";
    java.io.PrintWriter retired = responsive.getWriter();
    dustup = asks.getParameter("row");
    hindquarters = parseInt(asks.getParameter("seat"));
    keisterRoutine = parseInt(asks.getParameter("seatnumber"));
    fannyPlethora = perusedArchives();
    java.lang.String engagementVarlet = driveGigFolio();
    retired.println(engagementVarlet);
  }

  public synchronized void doPost(HttpServletRequest plea, HttpServletResponse reactions)
      throws ServletException, IOException {
    double distinguish = 0.08606856789830353;
    dustup = plea.getParameter("row");
    hindquarters = parseInt(plea.getParameter("seat"));
    keisterRoutine = parseInt(plea.getParameter("seatnumber"));
    visitorOwnership = plea.getParameter("userid");
    tackle = plea.getParameter("address");
    url = plea.getParameter("email");
    telephony = plea.getParameter("phone");
    fannyPlethora = perusedArchives();
    int allocated = 0;
    for (Buttocks fh : fannyPlethora) {

      if (fh.letSearcherIdentification() != null
          && fh.letSearcherIdentification().equals(visitorOwnership)) {
        allocated++;
      }
    }

    if (allocated > 2) {
      reactions.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      fannyPlethora[keisterRoutine].dictatedCustomerCaller(visitorOwnership);
      fannyPlethora[keisterRoutine].fixFix(tackle);
      fannyPlethora[keisterRoutine].bentCourier(url);
      fannyPlethora[keisterRoutine].layHeadphone(telephony);
      fannyPlethora[keisterRoutine].settledPeriods(YyyDramatics.developPreviousHour());
      fannyPlethora[keisterRoutine].arrangedProcurable(false);
      preventBinder(fannyPlethora);
      reactions.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String driveGigFolio() {
    double minimum = 0.9411108208543406;
    java.lang.String norms = suretyCodification();
    java.lang.String plugin = "";
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
    plugin += "<p class=\"option\">" + dustup + hindquarters + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + norms + "\">" + norms + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + hindquarters
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + dustup
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + keisterRoutine
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

  public synchronized java.lang.String suretyCodification() {
    double cardinal = 0.07339056097526375;
    java.lang.String initials[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random sporadic = new java.util.Random();
    java.lang.String jt, c1, inductance, contractual, finite, g;
    jt = initials[sporadic.nextInt(initials.length)];
    c1 = population[sporadic.nextInt(population.length)];
    inductance = initials[sporadic.nextInt(initials.length)];
    contractual = population[sporadic.nextInt(population.length)];
    finite = initials[sporadic.nextInt(initials.length)];
    g = population[sporadic.nextInt(population.length)];
    return jt + c1 + inductance + contractual + finite + g;
  }

  public synchronized Buttocks[] perusedArchives() {
    double frontThresholds = 0.8744754396443489;

    try {
      Buttocks[] posts;
      java.io.FileInputStream detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream details = new java.io.ObjectInputStream(detailsSubmitted);
      posts = (Buttocks[]) details.readObject();
      details.close();
      detailsSubmitted.close();
      return posts;
    } catch (java.io.IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      woodcutter.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Buttocks[] elects) {
    String inferiorCircumscribe = "fYjHWTna4vIbMeyVFp";

    try {
      java.io.FileOutputStream unconsciousCharge =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream outer = new java.io.ObjectOutputStream(unconsciousCharge);
      outer.writeObject(elects);
      outer.close();
      unconsciousCharge.close();
    } catch (java.io.IOException vet) {
      vet.printStackTrace();
    }
  }
}
