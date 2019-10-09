import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class YyyDramaticsTicketing extends HttpServlet {
  private Bum[] tushFinery;
  private String penalty;
  private int buttHandful;
  private int ass;
  private String subscriberHandle;
  private String mobiles;
  private String destination;
  private String inbox;
  private static Logger thermometer = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest wishes, HttpServletResponse responsive)
      throws ServletException, IOException {
    PrintWriter impossible = responsive.getWriter();
    penalty = wishes.getParameter("row");
    ass = Integer.parseInt(wishes.getParameter("seat"));
    buttHandful = Integer.parseInt(wishes.getParameter("seatnumber"));
    tushFinery = recordExecutable();
    String ticketingWebpage = haveRentingSection();
    impossible.println(ticketingWebpage);
  }

  public void doPost(HttpServletRequest petitioning, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    penalty = petitioning.getParameter("row");
    ass = Integer.parseInt(petitioning.getParameter("seat"));
    buttHandful = Integer.parseInt(petitioning.getParameter("seatnumber"));
    subscriberHandle = petitioning.getParameter("userid");
    destination = petitioning.getParameter("address");
    inbox = petitioning.getParameter("email");
    mobiles = petitioning.getParameter("phone");
    tushFinery = recordExecutable();
    int attributed = 0;
    for (Bum waffen : tushFinery) {

      if (waffen.goExploiterQuod() != null && waffen.goExploiterQuod().equals(subscriberHandle)) {
        attributed++;
      }
    }

    if (attributed > 2) {
      rejoinder.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tushFinery[buttHandful].adjustClientIdentifying(subscriberHandle);
      tushFinery[buttHandful].markAdress(destination);
      tushFinery[buttHandful].determinedMail(inbox);
      tushFinery[buttHandful].markMobile(mobiles);
      tushFinery[buttHandful].markHours(NigelDramaturgy.drawStreamWeek());
      tushFinery[buttHandful].settledVisible(false);
      spareFolder(tushFinery);
      rejoinder.sendRedirect("benstheatre?message=success");
    }
  }

  public String haveRentingSection() {
    String ciphers = policemenStandards();
    String ascii = "";
    ascii +=
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
    ascii += "<p class=\"option\">" + penalty + ass + "</p>";
    ascii +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ascii += "<p class=\"option\" data-code=\"" + ciphers + "\">" + ciphers + "</p>";
    ascii +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + ass
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + penalty
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + buttHandful
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
    return ascii;
  }

  public String policemenStandards() {
    String initials[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sporadic = new Random();
    String a0, acetylcholine, impedance, cv, eq, r8;
    a0 = initials[sporadic.nextInt(initials.length)];
    acetylcholine = population[sporadic.nextInt(population.length)];
    impedance = initials[sporadic.nextInt(initials.length)];
    cv = population[sporadic.nextInt(population.length)];
    eq = initials[sporadic.nextInt(initials.length)];
    r8 = population[sporadic.nextInt(population.length)];
    return a0 + acetylcholine + impedance + cv + eq + r8;
  }

  public Bum[] recordExecutable() {

    try {
      Bum[] positions;
      FileInputStream incumbentsSubmitting =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(incumbentsSubmitting);
      positions = (Bum[]) tenants.readObject();
      tenants.close();
      incumbentsSubmitting.close();
      return positions;
    } catch (IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      thermometer.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void spareFolder(Bum[] jobs) {

    try {
      FileOutputStream deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream outgoing = new ObjectOutputStream(deadSubmit);
      outgoing.writeObject(jobs);
      outgoing.close();
      deadSubmit.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }
}
