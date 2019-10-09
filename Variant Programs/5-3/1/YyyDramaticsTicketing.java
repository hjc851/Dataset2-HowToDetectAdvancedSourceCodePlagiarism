import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class YyyDramaticsTicketing extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger log = java.util.logging.Logger.getLogger("bensTheatre");
  private java.lang.String correspondence;
  private java.lang.String resolve;
  private java.lang.String calls;
  private java.lang.String usernameDimidiate;
  private int can;
  private int placeList;
  private java.lang.String wrangle;
  public static int list = -779918512;
  private Ass[] rearRange;

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    double desirability;
    java.io.PrintWriter outgoing;
    java.lang.String appointmentLayouts;
    desirability = 0.043686735841552804;
    outgoing = responsiveness.getWriter();
    wrangle = insistence.getParameter("row");
    can = java.lang.Integer.parseInt(insistence.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(insistence.getParameter("seatnumber"));
    rearRange = learnRegister();
    appointmentLayouts = bringTicketingWebpage();
    outgoing.println(appointmentLayouts);
  }

  public synchronized void doPost(HttpServletRequest plea, HttpServletResponse responded)
      throws ServletException, IOException {
    double higherChained;
    int earmarked;
    higherChained = 0.25053617648864046;
    wrangle = plea.getParameter("row");
    can = java.lang.Integer.parseInt(plea.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(plea.getParameter("seatnumber"));
    usernameDimidiate = plea.getParameter("userid");
    resolve = plea.getParameter("address");
    correspondence = plea.getParameter("email");
    calls = plea.getParameter("phone");
    rearRange = learnRegister();
    earmarked = 0;
    for (Ass waffen : rearRange) {

      if (waffen.findLoginIdentifier() != null
          && waffen.findLoginIdentifier().equals(usernameDimidiate)) {
        earmarked++;
      }
    }

    if (earmarked > 2) {
      responded.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rearRange[placeList].fixSomeoneSelf(usernameDimidiate);
      rearRange[placeList].fixFix(resolve);
      rearRange[placeList].prepareAddress(correspondence);
      rearRange[placeList].dictatedEarpiece(calls);
      rearRange[placeList].readyDay(ReqPlayhouse.catchRifeWhen());
      rearRange[placeList].bentGettable(false);
      safeguardArchiving(rearRange);
      responded.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String bringTicketingWebpage() {
    String peak;
    java.lang.String rules;
    java.lang.String xhtml;
    peak = "wApIWGqbAdh6qAXBRS";
    rules = safeguardsIdentifier();
    xhtml = "";
    xhtml +=
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
    xhtml += "<p class=\"option\">" + wrangle + can + "</p>";
    xhtml +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    xhtml += "<p class=\"option\" data-code=\"" + rules + "\">" + rules + "</p>";
    xhtml +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + can
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangle
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + placeList
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
    return xhtml;
  }

  public synchronized java.lang.String safeguardsIdentifier() {
    String minusExtent;
    java.lang.String digits[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String size[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random accidental;
    java.lang.String ordinate, acetylcholine, b2, internal, finite, c3;
    minusExtent = "AHF0PgUyIM7o8qi6Hy";
    accidental = new java.util.Random();
    ordinate = digits[accidental.nextInt(digits.length)];
    acetylcholine = size[accidental.nextInt(size.length)];
    b2 = digits[accidental.nextInt(digits.length)];
    internal = size[accidental.nextInt(size.length)];
    finite = digits[accidental.nextInt(digits.length)];
    c3 = size[accidental.nextInt(size.length)];
    return ordinate + acetylcholine + b2 + internal + finite + c3;
  }

  public synchronized Ass[] learnRegister() {
    double indentured;
    indentured = 0.13087099859994689;

    try {
      java.io.FileInputStream detailsSubmitted;
      java.io.ObjectInputStream establishment;
      Ass[] space;
      detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      establishment = new java.io.ObjectInputStream(detailsSubmitted);
      space = (Ass[]) establishment.readObject();
      establishment.close();
      detailsSubmitted.close();
      return space;
    } catch (java.io.IOException i) {
      log.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      log.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void safeguardArchiving(Ass[] pillion) {
    double kesThings;
    kesThings = 0.8922236965205332;

    try {
      java.io.FileOutputStream backBinder;
      java.io.ObjectOutputStream dead;
      backBinder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      dead = new java.io.ObjectOutputStream(backBinder);
      dead.writeObject(pillion);
      dead.close();
      backBinder.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }
}
