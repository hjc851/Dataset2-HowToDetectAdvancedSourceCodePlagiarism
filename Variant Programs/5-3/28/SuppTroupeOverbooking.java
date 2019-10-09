import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SuppTroupeOverbooking extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger forester = null;
  private java.lang.String postal = null;
  private java.lang.String discuss = null;
  private java.lang.String cellphone = null;
  private java.lang.String enjoyerMilad = null;
  private int behind = 0;
  private int bottomCaseload = 0;
  private java.lang.String melee = null;
  private Tush[] investRaft = null;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    java.io.PrintWriter forbidden;
    java.lang.String rentingSection;
    forbidden = responsiveness.getWriter();
    melee = motion.getParameter("row");
    behind = java.lang.Integer.parseInt(motion.getParameter("seat"));
    bottomCaseload = java.lang.Integer.parseInt(motion.getParameter("seatnumber"));
    investRaft = showDocumentation();
    rentingSection = fetchAppointmentLayouts();
    forbidden.println(rentingSection);
  }

  public synchronized void doPost(HttpServletRequest bespeak, HttpServletResponse reception)
      throws ServletException, IOException {
    int arranged;
    melee = bespeak.getParameter("row");
    behind = java.lang.Integer.parseInt(bespeak.getParameter("seat"));
    bottomCaseload = java.lang.Integer.parseInt(bespeak.getParameter("seatnumber"));
    enjoyerMilad = bespeak.getParameter("userid");
    discuss = bespeak.getParameter("address");
    postal = bespeak.getParameter("email");
    cellphone = bespeak.getParameter("phone");
    investRaft = showDocumentation();
    arranged = 0;
    for (Tush ora : investRaft) {

      if (ora.drawPersonName() != null && ora.drawPersonName().equals(enjoyerMilad)) {
        arranged++;
      }
    }

    if (arranged > 2) {
      reception.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      investRaft[bottomCaseload].laidEnjoyerMilad(enjoyerMilad);
      investRaft[bottomCaseload].determinedWork(discuss);
      investRaft[bottomCaseload].arrangeElectronically(postal);
      investRaft[bottomCaseload].settledLandline(cellphone);
      investRaft[bottomCaseload].adjustMonth(SuppTroupe.generateUnderwayYear());
      investRaft[bottomCaseload].putAccessible(false);
      spareFolder(investRaft);
      reception.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String fetchAppointmentLayouts() {
    java.lang.String designator;
    java.lang.String ajax;
    designator = safeguardsIdentifier();
    ajax = "";
    ajax +=
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
    ajax += "<p class=\"option\">" + melee + behind + "</p>";
    ajax +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ajax += "<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>";
    ajax +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bottomCaseload
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
    return ajax;
  }

  public synchronized java.lang.String safeguardsIdentifier() {
    java.lang.String messages[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unintended;
    java.lang.String k, ap, multiplier, exponent, en, c3;
    unintended = new java.util.Random();
    k = null;
    ap = null;
    multiplier = null;
    exponent = null;
    en = null;
    c3 = null;
    k = messages[unintended.nextInt(messages.length)];
    ap = estimates[unintended.nextInt(estimates.length)];
    multiplier = messages[unintended.nextInt(messages.length)];
    exponent = estimates[unintended.nextInt(estimates.length)];
    en = messages[unintended.nextInt(messages.length)];
    c3 = estimates[unintended.nextInt(estimates.length)];
    return k + ap + multiplier + exponent + en + c3;
  }

  public synchronized Tush[] showDocumentation() {

    try {
      java.io.FileInputStream advocatesExecutable;
      java.io.ObjectInputStream nih;
      Tush[] members = null;
      advocatesExecutable =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nih = new java.io.ObjectInputStream(advocatesExecutable);
      members = (Tush[]) nih.readObject();
      nih.close();
      advocatesExecutable.close();
      return members;
    } catch (java.io.IOException i) {
      forester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      forester.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void spareFolder(Tush[] chairs) {

    try {
      java.io.FileOutputStream proscribedSubmitting;
      java.io.ObjectOutputStream impossible;
      proscribedSubmitting =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      impossible = new java.io.ObjectOutputStream(proscribedSubmitting);
      impossible.writeObject(chairs);
      impossible.close();
      proscribedSubmitting.close();
    } catch (java.io.IOException late) {
      late.printStackTrace();
    }
  }

  static {
    forester = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
