import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends HttpServlet {

  public synchronized String generateHiringSheet() {
    String rules = safetyInscribe();
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
    http += "<p class=\"option\">" + series + hindquarters + "</p>";
    http +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    http += "<p class=\"option\" data-code=\"" + rules + "\">" + rules + "</p>";
    http +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + hindquarters
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + series
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
    return http;
  }

  private String caller = null;
  private String fix = null;
  private int hindquarters = 0;

  public synchronized void avoidDatabase(Stern[] member) {

    try {
      FileOutputStream deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream outgoing = new ObjectOutputStream(deadSubmit);
      outgoing.writeObject(member);
      outgoing.close();
      deadSubmit.close();
    } catch (IOException late) {
      late.printStackTrace();
    }
  }

  private static Logger skidder = Logger.getLogger("bensTheatre");
  private String fax = null;
  private int tailMany = 0;

  public synchronized void doPost(HttpServletRequest bespeak, HttpServletResponse replies)
      throws ServletException, IOException {
    series = bespeak.getParameter("row");
    hindquarters = Integer.parseInt(bespeak.getParameter("seat"));
    tailMany = Integer.parseInt(bespeak.getParameter("seatnumber"));
    adopterTag = bespeak.getParameter("userid");
    fix = bespeak.getParameter("address");
    fax = bespeak.getParameter("email");
    caller = bespeak.getParameter("phone");
    rearRange = recordExecutable();
    int taken = 0;
    for (Stern waffen : rearRange) synx55(waffen, taken);

    if (taken > 2) {
      replies.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rearRange[tailMany].fixedUsePhoto(adopterTag);
      rearRange[tailMany].laidSpeak(fix);
      rearRange[tailMany].markSend(fax);
      rearRange[tailMany].determineTelephonic(caller);
      rearRange[tailMany].layMoment(VeleOpera.takeTopicalPeriod());
      rearRange[tailMany].placedForthcoming(false);
      avoidDatabase(rearRange);
      replies.sendRedirect("benstheatre?message=success");
    }
  }

  private String adopterTag = null;
  private String series = null;

  public synchronized String safetyInscribe() {
    String messages[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String totals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sample = new Random();
    String fe = null, a = null, inductance = null, internal = null, detector = null, g = null;
    fe = messages[sample.nextInt(messages.length)];
    a = totals[sample.nextInt(totals.length)];
    inductance = messages[sample.nextInt(messages.length)];
    internal = totals[sample.nextInt(totals.length)];
    detector = messages[sample.nextInt(messages.length)];
    g = totals[sample.nextInt(totals.length)];
    return fe + a + inductance + internal + detector + g;
  }

  public synchronized Stern[] recordExecutable() {

    try {
      Stern[] venues = null;
      FileInputStream tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream proponents = new ObjectInputStream(tenantsDocuments);
      venues = (Stern[]) proponents.readObject();
      proponents.close();
      tenantsDocuments.close();
      return venues;
    } catch (IOException i) {
      skidder.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      skidder.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void doGet(HttpServletRequest invitation, HttpServletResponse preparedness)
      throws ServletException, IOException {
    PrintWriter off = preparedness.getWriter();
    series = invitation.getParameter("row");
    hindquarters = Integer.parseInt(invitation.getParameter("seat"));
    tailMany = Integer.parseInt(invitation.getParameter("seatnumber"));
    rearRange = recordExecutable();
    String logScreen = generateHiringSheet();
    off.println(logScreen);
  }

  private Stern[] rearRange = null;

  private synchronized void synx55(Stern waffen, int taken) throws ServletException, IOException {

    if (waffen.receiveUsabilityCard() != null && waffen.receiveUsabilityCard().equals(adopterTag)) {
      taken++;
    }
  }
}
