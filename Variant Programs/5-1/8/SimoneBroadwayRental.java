import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SimoneBroadwayRental extends HttpServlet {
  private Derriere[] investRaft;
  private String brawl;
  private int investFrequency;
  private int invest;
  private String subscriberHandle;
  private String ring;
  private String work;
  private String sending;
  private static Logger woodsman = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest ask, HttpServletResponse feedback)
      throws ServletException, IOException {
    PrintWriter outgoing = feedback.getWriter();
    brawl = ask.getParameter("row");
    invest = Integer.parseInt(ask.getParameter("seat"));
    investFrequency = Integer.parseInt(ask.getParameter("seatnumber"));
    investRaft = wrotePapers();
    String rentalSite = takeRentalSite();
    outgoing.println(rentalSite);
  }

  public void doPost(HttpServletRequest asked, HttpServletResponse reacted)
      throws ServletException, IOException {
    brawl = asked.getParameter("row");
    invest = Integer.parseInt(asked.getParameter("seat"));
    investFrequency = Integer.parseInt(asked.getParameter("seatnumber"));
    subscriberHandle = asked.getParameter("userid");
    work = asked.getParameter("address");
    sending = asked.getParameter("email");
    ring = asked.getParameter("phone");
    investRaft = wrotePapers();
    int earmarked = 0;
    for (Derriere waffen : investRaft) {

      if (waffen.produceWearerMap() != null && waffen.produceWearerMap().equals(subscriberHandle)) {
        earmarked++;
      }
    }

    if (earmarked > 2) {
      reacted.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      investRaft[investFrequency].fixSomeoneSelf(subscriberHandle);
      investRaft[investFrequency].bentAnswer(work);
      investRaft[investFrequency].situatedPostal(sending);
      investRaft[investFrequency].bentDial(ring);
      investRaft[investFrequency].placeWeek(ScottyPerformances.driveContinuingAgain());
      investRaft[investFrequency].doUnavailable(false);
      redeemDocuments(investRaft);
      reacted.sendRedirect("benstheatre?message=success");
    }
  }

  public String takeRentalSite() {
    String cypher = stabilityRules();
    String powerpoint = "";
    powerpoint +=
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
    powerpoint += "<p class=\"option\">" + brawl + invest + "</p>";
    powerpoint +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    powerpoint += "<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>";
    powerpoint +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + invest
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + brawl
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
    return powerpoint;
  }

  public String stabilityRules() {
    String initials[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String figures[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random selective = new Random();
    String k, activating, betas, ac, c1, c3;
    k = initials[selective.nextInt(initials.length)];
    activating = figures[selective.nextInt(figures.length)];
    betas = initials[selective.nextInt(initials.length)];
    ac = figures[selective.nextInt(figures.length)];
    c1 = initials[selective.nextInt(initials.length)];
    c3 = figures[selective.nextInt(figures.length)];
    return k + activating + betas + ac + c1 + c3;
  }

  public Derriere[] wrotePapers() {

    try {
      Derriere[] positions;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream details = new ObjectInputStream(niiComplaint);
      positions = (Derriere[]) details.readObject();
      details.close();
      niiComplaint.close();
      return positions;
    } catch (IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      woodsman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void redeemDocuments(Derriere[] venues) {

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impermissible = new ObjectOutputStream(impossibleDocuments);
      impermissible.writeObject(venues);
      impermissible.close();
      impossibleDocuments.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }
}
