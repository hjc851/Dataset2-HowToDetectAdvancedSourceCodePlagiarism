import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SimoneBroadwayRental extends javax.servlet.http.HttpServlet {
  public java.lang.String enjoyerMilad;

  public synchronized java.lang.String fetchAppointmentLayouts() {
    java.lang.String prefix = suretyCodification();
    java.lang.String meta = "";
    meta +=
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
    meta += "<p class=\"option\">" + spat + hindquarters + "</p>";
    meta +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    meta += "<p class=\"option\" data-code=\"" + prefix + "\">" + prefix + "</p>";
    meta +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + hindquarters
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + spat
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
            + "</html>";
    return meta;
  }

  public int hindquarters;

  public synchronized java.lang.String suretyCodification() {
    java.lang.String correspondance[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String figures[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random inadvertent = new java.util.Random();
    java.lang.String frequency, r8, betas, act, dn, fgf;
    frequency = correspondance[inadvertent.nextInt(correspondance.length)];
    r8 = figures[inadvertent.nextInt(figures.length)];
    betas = correspondance[inadvertent.nextInt(correspondance.length)];
    act = figures[inadvertent.nextInt(figures.length)];
    dn = correspondance[inadvertent.nextInt(correspondance.length)];
    fgf = figures[inadvertent.nextInt(figures.length)];
    return frequency + r8 + betas + act + dn + fgf;
  }

  public static java.util.logging.Logger homesteader;

  public synchronized Fanny[] learnRegister() {

    try {
      Fanny[] spots;
      java.io.FileInputStream tenantsDocuments =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream adherents = new java.io.ObjectInputStream(tenantsDocuments);
      spots = (Fanny[]) adherents.readObject();
      adherents.close();
      tenantsDocuments.close();
      return spots;
    } catch (java.io.IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      homesteader.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public Fanny[] hindquartersPalette;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse responding)
      throws ServletException, IOException {
    java.io.PrintWriter proscribed = responding.getWriter();
    spat = asking.getParameter("row");
    hindquarters = java.lang.Integer.parseInt(asking.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(asking.getParameter("seatnumber"));
    hindquartersPalette = learnRegister();
    java.lang.String ticketingWebpage = fetchAppointmentLayouts();
    proscribed.println(ticketingWebpage);
  }

  public int investFrequency;
  public java.lang.String spat;
  public java.lang.String telephonic;
  public java.lang.String correspondence;
  public java.lang.String tackle;

  public synchronized void doPost(HttpServletRequest wishes, HttpServletResponse riposte)
      throws ServletException, IOException {
    spat = wishes.getParameter("row");
    hindquarters = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    enjoyerMilad = wishes.getParameter("userid");
    tackle = wishes.getParameter("address");
    correspondence = wishes.getParameter("email");
    telephonic = wishes.getParameter("phone");
    hindquartersPalette = learnRegister();
    int registered = 0;
    for (Fanny waffen : hindquartersPalette) {

      if (waffen.takeUsageFinger() != null && waffen.takeUsageFinger().equals(enjoyerMilad)) {
        registered++;
      }
    }

    if (registered > 2) {
      riposte.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      hindquartersPalette[investFrequency].laidEnjoyerMilad(enjoyerMilad);
      hindquartersPalette[investFrequency].dictatedTreat(tackle);
      hindquartersPalette[investFrequency].placedMessage(correspondence);
      hindquartersPalette[investFrequency].prepareCalls(telephonic);
      hindquartersPalette[investFrequency].placedWhen(YyyDramatics.letAfootHours());
      hindquartersPalette[investFrequency].putAccessible(false);
      avoidDatabase(hindquartersPalette);
      riposte.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void avoidDatabase(Fanny[] constituencies) {

    try {
      java.io.FileOutputStream tabooApplication =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream outgoing = new java.io.ObjectOutputStream(tabooApplication);
      outgoing.writeObject(constituencies);
      outgoing.close();
      tabooApplication.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  static {
    homesteader = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
