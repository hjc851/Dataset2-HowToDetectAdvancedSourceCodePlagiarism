import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class GarethTheatricalRenting extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger consignor =
      java.util.logging.Logger.getLogger("bensTheatre");
  private java.lang.String postal = null;
  private java.lang.String cover = null;
  private java.lang.String telephone = null;
  private java.lang.String employeePictures = null;
  private int tush = 0;
  private int bumFewer = 0;
  private java.lang.String wrangling = null;
  private Induct[] derriereVariety = null;

  public synchronized void doGet(HttpServletRequest invitation, HttpServletResponse react)
      throws ServletException, IOException {
    java.io.PrintWriter unconscious;
    java.lang.String registrationTab;
    unconscious = react.getWriter();
    wrangling = invitation.getParameter("row");
    tush = java.lang.Integer.parseInt(invitation.getParameter("seat"));
    bumFewer = java.lang.Integer.parseInt(invitation.getParameter("seatnumber"));
    derriereVariety = learnRegister();
    registrationTab = driveGigFolio();
    unconscious.println(registrationTab);
  }

  public synchronized void doPost(HttpServletRequest motion, HttpServletResponse reply)
      throws ServletException, IOException {
    int charged;
    wrangling = motion.getParameter("row");
    tush = java.lang.Integer.parseInt(motion.getParameter("seat"));
    bumFewer = java.lang.Integer.parseInt(motion.getParameter("seatnumber"));
    employeePictures = motion.getParameter("userid");
    cover = motion.getParameter("address");
    postal = motion.getParameter("email");
    telephone = motion.getParameter("phone");
    derriereVariety = learnRegister();
    charged = 0;
    for (Induct fh : derriereVariety) {

      if (fh.findLoginIdentifier() != null && fh.findLoginIdentifier().equals(employeePictures)) {
        charged++;
      }
    }

    if (charged > 2) {
      reply.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      derriereVariety[bumFewer].primedUsageFinger(employeePictures);
      derriereVariety[bumFewer].layDeal(cover);
      derriereVariety[bumFewer].putNetmail(postal);
      derriereVariety[bumFewer].primedCellphone(telephone);
      derriereVariety[bumFewer].bentHour(AllanSalle.makeIncumbentDay());
      derriereVariety[bumFewer].markEasy(false);
      resurrectPapers(derriereVariety);
      reply.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String driveGigFolio() {
    java.lang.String designator;
    java.lang.String parser;
    designator = secureLaw();
    parser = "";
    parser +=
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
    parser += "<p class=\"option\">" + wrangling + tush + "</p>";
    parser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    parser += "<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>";
    parser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tush
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangling
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bumFewer
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
    return parser;
  }

  public synchronized java.lang.String secureLaw() {
    java.lang.String mailboxes[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unannounced;
    java.lang.String impedance, antigen, variable, cv, detector, c3;
    unannounced = new java.util.Random();
    impedance = null;
    antigen = null;
    variable = null;
    cv = null;
    detector = null;
    c3 = null;
    impedance = mailboxes[unannounced.nextInt(mailboxes.length)];
    antigen = estimates[unannounced.nextInt(estimates.length)];
    variable = mailboxes[unannounced.nextInt(mailboxes.length)];
    cv = estimates[unannounced.nextInt(estimates.length)];
    detector = mailboxes[unannounced.nextInt(mailboxes.length)];
    c3 = estimates[unannounced.nextInt(estimates.length)];
    return impedance + antigen + variable + cv + detector + c3;
  }

  public synchronized Induct[] learnRegister() {

    try {
      java.io.FileInputStream whysCharge;
      java.io.ObjectInputStream cbs;
      Induct[] members = null;
      whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      cbs = new java.io.ObjectInputStream(whysCharge);
      members = (Induct[]) cbs.readObject();
      cbs.close();
      whysCharge.close();
      return members;
    } catch (java.io.IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      consignor.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Induct[] constituencies) {

    try {
      java.io.FileOutputStream outgoingArchives;
      java.io.ObjectOutputStream tabu;
      outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tabu = new java.io.ObjectOutputStream(outgoingArchives);
      tabu.writeObject(constituencies);
      tabu.close();
      outgoingArchives.close();
    } catch (java.io.IOException adoptee) {
      adoptee.printStackTrace();
    }
  }
}
