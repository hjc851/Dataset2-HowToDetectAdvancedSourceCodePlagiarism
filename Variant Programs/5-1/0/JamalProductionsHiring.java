import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JamalProductionsHiring extends HttpServlet {
  private Prat[] rumpRaiment;
  private String melee;
  private int assSeveral;
  private int tush;
  private String visitorOwnership;
  private String mobile;
  private String mitigate;
  private String courier;
  private static Logger log = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest quest, HttpServletResponse intervention)
      throws ServletException, IOException {
    PrintWriter quenched = intervention.getWriter();
    melee = quest.getParameter("row");
    tush = Integer.parseInt(quest.getParameter("seat"));
    assSeveral = Integer.parseInt(quest.getParameter("seatnumber"));
    rumpRaiment = tellReadme();
    String registerChapter = catchRecordingSummary();
    quenched.println(registerChapter);
  }

  public void doPost(HttpServletRequest proposal, HttpServletResponse replies)
      throws ServletException, IOException {
    melee = proposal.getParameter("row");
    tush = Integer.parseInt(proposal.getParameter("seat"));
    assSeveral = Integer.parseInt(proposal.getParameter("seatnumber"));
    visitorOwnership = proposal.getParameter("userid");
    mitigate = proposal.getParameter("address");
    courier = proposal.getParameter("email");
    mobile = proposal.getParameter("phone");
    rumpRaiment = tellReadme();
    int made = 0;
    for (Prat ora : rumpRaiment) {

      if (ora.produceWearerMap() != null && ora.produceWearerMap().equals(visitorOwnership)) {
        made++;
      }
    }

    if (made > 2) {
      replies.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rumpRaiment[assSeveral].solidifyingLearnerUser(visitorOwnership);
      rumpRaiment[assSeveral].fixFix(mitigate);
      rumpRaiment[assSeveral].determineElectronic(courier);
      rumpRaiment[assSeveral].fitHandset(mobile);
      rumpRaiment[assSeveral].arrangedSentence(SimoneBroadway.developPreviousHour());
      rumpRaiment[assSeveral].rigidProvided(false);
      rescuingReadme(rumpRaiment);
      replies.sendRedirect("benstheatre?message=success");
    }
  }

  public String catchRecordingSummary() {
    String ciphers = safeguardingDesignator();
    String metadata = "";
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
    metadata += "<p class=\"option\">" + melee + tush + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + ciphers + "\">" + ciphers + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tush
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + assSeveral
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

  public String safeguardingDesignator() {
    String correspondence[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String populations[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random haphazard = new Random();
    String a0, cc, crh, bt, nb, u;
    a0 = correspondence[haphazard.nextInt(correspondence.length)];
    cc = populations[haphazard.nextInt(populations.length)];
    crh = correspondence[haphazard.nextInt(correspondence.length)];
    bt = populations[haphazard.nextInt(populations.length)];
    nb = correspondence[haphazard.nextInt(correspondence.length)];
    u = populations[haphazard.nextInt(populations.length)];
    return a0 + cc + crh + bt + nb + u;
  }

  public Prat[] tellReadme() {

    try {
      Prat[] benches;
      FileInputStream detailsSubmitted =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream officeholders = new ObjectInputStream(detailsSubmitted);
      benches = (Prat[]) officeholders.readObject();
      officeholders.close();
      detailsSubmitted.close();
      return benches;
    } catch (IOException i) {
      log.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      log.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public void rescuingReadme(Prat[] posts) {

    try {
      FileOutputStream quenchedDatabase =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impossible = new ObjectOutputStream(quenchedDatabase);
      impossible.writeObject(posts);
      impossible.close();
      quenchedDatabase.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }
}
