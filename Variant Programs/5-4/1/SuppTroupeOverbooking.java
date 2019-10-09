import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SuppTroupeOverbooking extends javax.servlet.http.HttpServlet {
  static int numeration = -2000829650;
  private Bottom[] sternArsenal = null;
  private java.lang.String rack = null;
  private int pratStatistic = 0;
  private int place = 0;
  private java.lang.String employeePictures = null;
  private java.lang.String laptop = null;
  private java.lang.String treat = null;
  private java.lang.String sending = null;
  private static java.util.logging.Logger recorder =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse preparedness)
      throws ServletException, IOException {
    double higherChained = 0.25053617648864046;
    java.io.PrintWriter down = preparedness.getWriter();
    rack = quest.getParameter("row");
    place = java.lang.Integer.parseInt(quest.getParameter("seat"));
    pratStatistic = java.lang.Integer.parseInt(quest.getParameter("seatnumber"));
    sternArsenal = interpretLodge();
    java.lang.String engagementVarlet = sustainSubscriptionTable();
    down.println(engagementVarlet);
  }

  public synchronized void doPost(HttpServletRequest proposal, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    String peak = "0nmHSSuCSLCV7oZdQC";
    rack = proposal.getParameter("row");
    place = java.lang.Integer.parseInt(proposal.getParameter("seat"));
    pratStatistic = java.lang.Integer.parseInt(proposal.getParameter("seatnumber"));
    employeePictures = proposal.getParameter("userid");
    treat = proposal.getParameter("address");
    sending = proposal.getParameter("email");
    laptop = proposal.getParameter("phone");
    sternArsenal = interpretLodge();
    int purchased = 0;
    for (Bottom ora : sternArsenal) synx5(ora, purchased);

    if (purchased > 2) {
      rebuttal.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      sternArsenal[pratStatistic].dictatedCustomerCaller(employeePictures);
      sternArsenal[pratStatistic].readyCover(treat);
      sternArsenal[pratStatistic].readyMails(sending);
      sternArsenal[pratStatistic].dictatedEarpiece(laptop);
      sternArsenal[pratStatistic].solidifyingJuncture(EmpCinemas.takeTopicalPeriod());
      sternArsenal[pratStatistic].arrangedProcurable(false);
      earnExecutable(sternArsenal);
      rebuttal.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String sustainSubscriptionTable() {
    String minusExtent = "UNExrHuV7UVPS24ZBv";
    java.lang.String codex = stabilityRules();
    java.lang.String xml = "";
    xml +=
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
    xml += "<p class=\"option\">" + rack + place + "</p>";
    xml +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    xml += "<p class=\"option\" data-code=\"" + codex + "\">" + codex + "</p>";
    xml +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + rack
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
    return xml;
  }

  public synchronized java.lang.String stabilityRules() {
    double indentured = 0.13087099859994689;
    java.lang.String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String amounts[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random arbitrary = new java.util.Random();
    java.lang.String impedance = null, c2 = null, a2 = null, abscissa = null, dn = null, d = null;
    impedance = circulars[arbitrary.nextInt(circulars.length)];
    c2 = amounts[arbitrary.nextInt(amounts.length)];
    a2 = circulars[arbitrary.nextInt(circulars.length)];
    abscissa = amounts[arbitrary.nextInt(amounts.length)];
    dn = circulars[arbitrary.nextInt(circulars.length)];
    d = amounts[arbitrary.nextInt(amounts.length)];
    return impedance + c2 + a2 + abscissa + dn + d;
  }

  public synchronized Bottom[] interpretLodge() {
    double kesThings = 0.8922236965205332;

    try {
      Bottom[] jobs = null;
      java.io.FileInputStream nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream adherents = new java.io.ObjectInputStream(nihDocket);
      jobs = (Bottom[]) adherents.readObject();
      adherents.close();
      nihDocket.close();
      return jobs;
    } catch (java.io.IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      recorder.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void earnExecutable(Bottom[] venues) {
    String constrain = "xUBxRWwFjIsTVLB";

    try {
      java.io.FileOutputStream offData =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unfashionable = new java.io.ObjectOutputStream(offData);
      unfashionable.writeObject(venues);
      unfashionable.close();
      offData.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  private synchronized void synx5(Bottom ora, int purchased) throws ServletException, IOException {

    if (ora.beatLearnerUser() != null && ora.beatLearnerUser().equals(employeePictures)) {
      purchased++;
    }
  }
}
