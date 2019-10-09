import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class FrazierCinemaRent extends HttpServlet {
  private Buttocks[] bunsNumber;
  private String brawl;
  private int inductBit;
  private int posterior;
  private String searcherIdentification;
  private String caller;
  private String plow;
  private String philatelic;
  private static Logger sawmill;

  public synchronized void doGet(HttpServletRequest invitation, HttpServletResponse responding)
      throws ServletException, IOException {
    PrintWriter forbidden = responding.getWriter();
    brawl = invitation.getParameter("row");
    posterior = Integer.parseInt(invitation.getParameter("seat"));
    inductBit = Integer.parseInt(invitation.getParameter("seatnumber"));
    bunsNumber = perusedArchives();
    String rearrestLayout = catchRecordingSummary();
    forbidden.println(rearrestLayout);
  }

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse reply)
      throws ServletException, IOException {
    brawl = complaint.getParameter("row");
    posterior = Integer.parseInt(complaint.getParameter("seat"));
    inductBit = Integer.parseInt(complaint.getParameter("seatnumber"));
    searcherIdentification = complaint.getParameter("userid");
    plow = complaint.getParameter("address");
    philatelic = complaint.getParameter("email");
    caller = complaint.getParameter("phone");
    bunsNumber = perusedArchives();
    int attributed = 0;
    for (Buttocks ora : bunsNumber) {

      if (ora.produceWearerMap() != null && ora.produceWearerMap().equals(searcherIdentification)) {
        attributed++;
      }
    }

    if (attributed > 2) {
      reply.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bunsNumber[inductBit].doOperatorSecurity(searcherIdentification);
      bunsNumber[inductBit].prepareConfront(plow);
      bunsNumber[inductBit].readyMails(philatelic);
      bunsNumber[inductBit].situatedTelephony(caller);
      bunsNumber[inductBit].readyDay(YyyDramatics.letAfootHours());
      bunsNumber[inductBit].determineDistributed(false);
      reviveDocket(bunsNumber);
      reply.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String catchRecordingSummary() {
    String statute = policePrefix();
    String aspx = "";
    aspx +=
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
    aspx += "<p class=\"option\">" + brawl + posterior + "</p>";
    aspx +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    aspx += "<p class=\"option\" data-code=\"" + statute + "\">" + statute + "</p>";
    aspx +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + posterior
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + brawl
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + inductBit
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
    return aspx;
  }

  public synchronized String policePrefix() {
    String words[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String scores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random coincidental = new Random();
    String ordinate, r8, multiplier, force, finite, d;
    ordinate = words[coincidental.nextInt(words.length)];
    r8 = scores[coincidental.nextInt(scores.length)];
    multiplier = words[coincidental.nextInt(words.length)];
    force = scores[coincidental.nextInt(scores.length)];
    finite = words[coincidental.nextInt(words.length)];
    d = scores[coincidental.nextInt(scores.length)];
    return ordinate + r8 + multiplier + force + finite + d;
  }

  public synchronized Buttocks[] perusedArchives() {

    try {
      Buttocks[] benches;
      FileInputStream supportersDocumentation =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(supportersDocumentation);
      benches = (Buttocks[]) tenants.readObject();
      tenants.close();
      supportersDocumentation.close();
      return benches;
    } catch (IOException i) {
      sawmill.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      sawmill.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void reviveDocket(Buttocks[] passengers) {

    try {
      FileOutputStream deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream dead = new ObjectOutputStream(deadSubmit);
      dead.writeObject(passengers);
      dead.close();
      deadSubmit.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }

  static {
    sawmill = Logger.getLogger("bensTheatre");
  }
}
