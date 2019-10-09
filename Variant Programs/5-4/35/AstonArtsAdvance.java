import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AstonArtsAdvance extends javax.servlet.http.HttpServlet {

  public synchronized java.lang.String bringTicketingWebpage() {
    java.lang.String standards = policePrefix();
    java.lang.String metadata = "";
    metadata +=
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
    metadata += "<p class=\"option\">" + dustup + backside + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + standards + "\">" + standards + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + backside
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + dustup
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tailMany
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
    return metadata;
  }

  private Stern[] tushFinery = null;
  private java.lang.String fax = null;
  private int tailMany = 0;
  private java.lang.String wearerMap = null;
  private int backside = 0;
  private java.lang.String headset = null;

  public synchronized void doPost(HttpServletRequest demands, HttpServletResponse responded)
      throws ServletException, IOException {
    dustup = demands.getParameter("row");
    backside = java.lang.Integer.parseInt(demands.getParameter("seat"));
    tailMany = java.lang.Integer.parseInt(demands.getParameter("seatnumber"));
    wearerMap = demands.getParameter("userid");
    cover = demands.getParameter("address");
    fax = demands.getParameter("email");
    headset = demands.getParameter("phone");
    tushFinery = hearBinder();
    int engaged = 0;
    for (Stern ora : tushFinery) synx80(ora, engaged);

    if (engaged > 2) {
      responded.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tushFinery[tailMany].fixSomeoneSelf(wearerMap);
      tushFinery[tailMany].fixFix(cover);
      tushFinery[tailMany].fixDissemination(fax);
      tushFinery[tailMany].dictatedEarpiece(headset);
      tushFinery[tailMany].situatedMinutes(JonnyDance.beatTypicalJuncture());
      tushFinery[tailMany].settledVisible(false);
      helpData(tushFinery);
      responded.sendRedirect("benstheatre?message=success");
    }
  }

  private java.lang.String cover = null;

  public synchronized Stern[] hearBinder() {

    try {
      Stern[] space = null;
      java.io.FileInputStream entriesLodge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream without = new java.io.ObjectInputStream(entriesLodge);
      space = (Stern[]) without.readObject();
      without.close();
      entriesLodge.close();
      return space;
    } catch (java.io.IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      fisherman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  private java.lang.String dustup = null;
  private static java.util.logging.Logger fisherman = null;

  public synchronized void helpData(Stern[] vacancies) {

    try {
      java.io.FileOutputStream tabooApplication =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream kayoed = new java.io.ObjectOutputStream(tabooApplication);
      kayoed.writeObject(vacancies);
      kayoed.close();
      tabooApplication.close();
    } catch (java.io.IOException aba) {
      aba.printStackTrace();
    }
  }

  static {
    fisherman = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public synchronized java.lang.String policePrefix() {
    java.lang.String initials[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String statistics[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random stochastic = new java.util.Random();
    java.lang.String fl = null, crh = null, eigenvalue = null, c1 = null, ip = null, e = null;
    fl = initials[stochastic.nextInt(initials.length)];
    crh = statistics[stochastic.nextInt(statistics.length)];
    eigenvalue = initials[stochastic.nextInt(initials.length)];
    c1 = statistics[stochastic.nextInt(statistics.length)];
    ip = initials[stochastic.nextInt(initials.length)];
    e = statistics[stochastic.nextInt(statistics.length)];
    return fl + crh + eigenvalue + c1 + ip + e;
  }

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse intervention)
      throws ServletException, IOException {
    java.io.PrintWriter down = intervention.getWriter();
    dustup = complaint.getParameter("row");
    backside = java.lang.Integer.parseInt(complaint.getParameter("seat"));
    tailMany = java.lang.Integer.parseInt(complaint.getParameter("seatnumber"));
    tushFinery = hearBinder();
    java.lang.String gigFolio = bringTicketingWebpage();
    down.println(gigFolio);
  }

  private synchronized void synx80(Stern ora, int engaged) throws ServletException, IOException {

    if (ora.drawPersonName() != null && ora.drawPersonName().equals(wearerMap)) {
      engaged++;
    }
  }
}
