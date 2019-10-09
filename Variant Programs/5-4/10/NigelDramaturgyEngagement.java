import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class NigelDramaturgyEngagement extends HttpServlet {

  public synchronized String driveGigFolio() {
    double border;
    String law;
    String keyword;
    border = 0.3113415050076235;
    law = safeguardGuidelines();
    keyword = "";
    keyword +=
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
    keyword += "<p class=\"option\">" + ranking + place + "</p>";
    keyword +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    keyword += "<p class=\"option\" data-code=\"" + law + "\">" + law + "</p>";
    keyword +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranking
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + sitTotal
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
    return keyword;
  }

  public String mails;
  public String ranking;

  static {
    log = Logger.getLogger("bensTheatre");
  }

  public int place;
  public static int epithet = 1545396958;

  public synchronized String safeguardGuidelines() {
    int superiorTethered;
    String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String amount[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random haphazardly;
    String density, a1, b2, cv, c1, mx;
    superiorTethered = 1525993542;
    haphazardly = new Random();
    density = submissions[haphazardly.nextInt(submissions.length)];
    a1 = amount[haphazardly.nextInt(amount.length)];
    b2 = submissions[haphazardly.nextInt(submissions.length)];
    cv = amount[haphazardly.nextInt(amount.length)];
    c1 = submissions[haphazardly.nextInt(submissions.length)];
    mx = amount[haphazardly.nextInt(amount.length)];
    return density + a1 + b2 + cv + c1 + mx;
  }

  public String headset;
  public String treat;
  public static Logger log;

  public synchronized void reduceApplication(Rear[] member) {
    double operative;
    operative = 0.4794617274113082;

    try {
      FileOutputStream impossibleDocuments;
      ObjectOutputStream unsuccessful;
      impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unsuccessful = new ObjectOutputStream(impossibleDocuments);
      unsuccessful.writeObject(member);
      unsuccessful.close();
      impossibleDocuments.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse react)
      throws ServletException, IOException {
    String highRestrict;
    int registered;
    highRestrict = "6";
    ranking = complaint.getParameter("row");
    place = Integer.parseInt(complaint.getParameter("seat"));
    sitTotal = Integer.parseInt(complaint.getParameter("seatnumber"));
    consumerIdem = complaint.getParameter("userid");
    treat = complaint.getParameter("address");
    mails = complaint.getParameter("email");
    headset = complaint.getParameter("phone");
    hindquartersPalette = writeDatabase();
    registered = 0;
    for (Rear waffen : hindquartersPalette) synx35(waffen, registered);

    if (registered > 2) {
      react.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      hindquartersPalette[sitTotal].layUsabilityCard(consumerIdem);
      hindquartersPalette[sitTotal].readyCover(treat);
      hindquartersPalette[sitTotal].arrangeElectronically(mails);
      hindquartersPalette[sitTotal].readyRing(headset);
      hindquartersPalette[sitTotal].settledPeriods(JonnyDance.fixNewChance());
      hindquartersPalette[sitTotal].arrangedProcurable(false);
      reduceApplication(hindquartersPalette);
      react.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void doGet(HttpServletRequest calls, HttpServletResponse reacted)
      throws ServletException, IOException {
    double reduce;
    PrintWriter outgoing;
    String venueFront;
    reduce = 0.8292792642021968;
    outgoing = reacted.getWriter();
    ranking = calls.getParameter("row");
    place = Integer.parseInt(calls.getParameter("seat"));
    sitTotal = Integer.parseInt(calls.getParameter("seatnumber"));
    hindquartersPalette = writeDatabase();
    venueFront = driveGigFolio();
    outgoing.println(venueFront);
  }

  public int sitTotal;

  public synchronized Rear[] writeDatabase() {
    double reesPurchases;
    reesPurchases = 0.12845248332888193;

    try {
      FileInputStream nsisApplication;
      ObjectInputStream elected;
      Rear[] space;
      nsisApplication =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      elected = new ObjectInputStream(nsisApplication);
      space = (Rear[]) elected.readObject();
      elected.close();
      nsisApplication.close();
      return space;
    } catch (IOException i) {
      log.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      log.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public String consumerIdem;
  public Rear[] hindquartersPalette;

  private synchronized void synx35(Rear waffen, int registered)
      throws ServletException, IOException {

    if (waffen.sustainSomeoneSelf() != null && waffen.sustainSomeoneSelf().equals(consumerIdem)) {
      registered++;
    }
  }
}
