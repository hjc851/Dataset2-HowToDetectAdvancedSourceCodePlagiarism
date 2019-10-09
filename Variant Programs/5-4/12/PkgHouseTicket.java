import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PkgHouseTicket extends HttpServlet {
  public static String lessRestrict = "G7vXE";
  public Induct[] derriereVariety;
  public String ranked;
  public int hindquartersNumerous;
  public int behind;
  public String enjoyerMilad;
  public String telephone;
  public String speech;
  public String electronically;
  public static Logger rancher = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse replies)
      throws ServletException, IOException {
    int fukkianese = -169401857;
    PrintWriter proscribed = replies.getWriter();
    ranked = wishes.getParameter("row");
    behind = Integer.parseInt(wishes.getParameter("seat"));
    hindquartersNumerous = Integer.parseInt(wishes.getParameter("seatnumber"));
    derriereVariety = tellReadme();
    String subscriptionTable = findTicketHomepage();
    proscribed.println(subscriptionTable);
  }

  public synchronized void doPost(HttpServletRequest quest, HttpServletResponse retort)
      throws ServletException, IOException {
    double relevance = 0.7626585252108743;
    ranked = quest.getParameter("row");
    behind = Integer.parseInt(quest.getParameter("seat"));
    hindquartersNumerous = Integer.parseInt(quest.getParameter("seatnumber"));
    enjoyerMilad = quest.getParameter("userid");
    speech = quest.getParameter("address");
    electronically = quest.getParameter("email");
    telephone = quest.getParameter("phone");
    derriereVariety = tellReadme();
    int recorded = 0;
    for (Induct ora : derriereVariety) {

      if (ora.bringCustomerCaller() != null && ora.bringCustomerCaller().equals(enjoyerMilad)) {
        recorded++;
      }
    }

    if (recorded > 2) {
      retort.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      derriereVariety[hindquartersNumerous].determineEmployeePictures(enjoyerMilad);
      derriereVariety[hindquartersNumerous].placedDirect(speech);
      derriereVariety[hindquartersNumerous].fixedSending(electronically);
      derriereVariety[hindquartersNumerous].determineTelephonic(telephone);
      derriereVariety[hindquartersNumerous].layMoment(HansenComedy.driveContinuingAgain());
      derriereVariety[hindquartersNumerous].arrangeUncommitted(false);
      relieveFolders(derriereVariety);
      retort.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String findTicketHomepage() {
    int certain = -606183363;
    String designator = policePrefix();
    String http = "";
    http +=
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
    http += "<p class=\"option\">" + ranked + behind + "</p>";
    http +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    http += "<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>";
    http +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranked
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + hindquartersNumerous
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
    return http;
  }

  public synchronized String policePrefix() {
    double nung = 0.7012741199514169;
    String epistles[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportions[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random serendipity = new Random();
    String q, b2, d2, anachronistic, dn, e;
    q = epistles[serendipity.nextInt(epistles.length)];
    b2 = proportions[serendipity.nextInt(proportions.length)];
    d2 = epistles[serendipity.nextInt(epistles.length)];
    anachronistic = proportions[serendipity.nextInt(proportions.length)];
    dn = epistles[serendipity.nextInt(epistles.length)];
    e = proportions[serendipity.nextInt(proportions.length)];
    return q + b2 + d2 + anachronistic + dn + e;
  }

  public synchronized Induct[] tellReadme() {
    double topmostMinimum = 0.3304584313566594;

    try {
      Induct[] elections;
      FileInputStream nsiPapers =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream entries = new ObjectInputStream(nsiPapers);
      elections = (Induct[]) entries.readObject();
      entries.close();
      nsiPapers.close();
      return elections;
    } catch (IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      rancher.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Induct[] constituencies) {
    double levelRestricting = 0.25004589996437243;

    try {
      FileOutputStream deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream down = new ObjectOutputStream(deadSubmit);
      down.writeObject(constituencies);
      down.close();
      deadSubmit.close();
    } catch (IOException combatants) {
      combatants.printStackTrace();
    }
  }
}
