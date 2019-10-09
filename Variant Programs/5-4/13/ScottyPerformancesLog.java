import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends HttpServlet {

  public synchronized void reviveDocket(Posterior[] member) {

    try {
      FileOutputStream prohibitedPapers =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream dead = new ObjectOutputStream(prohibitedPapers);
      dead.writeObject(member);
      dead.close();
      prohibitedPapers.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse preparedness)
      throws ServletException, IOException {
    PrintWriter unconscious = preparedness.getWriter();
    rack = proposal.getParameter("row");
    buttocks = Integer.parseInt(proposal.getParameter("seat"));
    tailMany = Integer.parseInt(proposal.getParameter("seatnumber"));
    investRaft = rereadSubmitted();
    String rearrestLayout = takeRentalSite();
    unconscious.println(rearrestLayout);
  }

  private Posterior[] investRaft;

  public synchronized String takeRentalSite() {
    String encodes = safeguardsIdentifier();
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
    powerpoint += "<p class=\"option\">" + rack + buttocks + "</p>";
    powerpoint +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    powerpoint += "<p class=\"option\" data-code=\"" + encodes + "\">" + encodes + "</p>";
    powerpoint +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buttocks
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + rack
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
    return powerpoint;
  }

  private int tailMany;
  private String rack;
  private static Logger surveyor = Logger.getLogger("bensTheatre");
  private int buttocks;

  public synchronized void doPost(HttpServletRequest motions, HttpServletResponse retort)
      throws ServletException, IOException {
    rack = motions.getParameter("row");
    buttocks = Integer.parseInt(motions.getParameter("seat"));
    tailMany = Integer.parseInt(motions.getParameter("seatnumber"));
    developerPicture = motions.getParameter("userid");
    handle = motions.getParameter("address");
    dissemination = motions.getParameter("email");
    telephone = motions.getParameter("phone");
    investRaft = rereadSubmitted();
    int logged = 0;
    for (Posterior fh : investRaft) {

      if (fh.makeUsernameDimidiate() != null
          && fh.makeUsernameDimidiate().equals(developerPicture)) {
        logged++;
      }
    }

    if (logged > 2) {
      retort.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      investRaft[tailMany].settledSubscriberHandle(developerPicture);
      investRaft[tailMany].dictatedTreat(handle);
      investRaft[tailMany].primedMailing(dissemination);
      investRaft[tailMany].doLaptop(telephone);
      investRaft[tailMany].determinedDays(NathanMovie.fetchPresentBeginning());
      investRaft[tailMany].determinedFree(false);
      reviveDocket(investRaft);
      retort.sendRedirect("benstheatre?message=success");
    }
  }

  private String handle;
  private String dissemination;

  public synchronized Posterior[] rereadSubmitted() {

    try {
      Posterior[] beds;
      FileInputStream withoutRegister =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream officeholders = new ObjectInputStream(withoutRegister);
      beds = (Posterior[]) officeholders.readObject();
      officeholders.close();
      withoutRegister.close();
      return beds;
    } catch (IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      surveyor.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  private String developerPicture;
  private String telephone;

  public synchronized String safeguardsIdentifier() {
    String memoranda[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String levels[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unannounced = new Random();
    String durations, c2, inductance, b, ip, c3;
    durations = memoranda[unannounced.nextInt(memoranda.length)];
    c2 = levels[unannounced.nextInt(levels.length)];
    inductance = memoranda[unannounced.nextInt(memoranda.length)];
    b = levels[unannounced.nextInt(levels.length)];
    ip = memoranda[unannounced.nextInt(memoranda.length)];
    c3 = levels[unannounced.nextInt(levels.length)];
    return durations + c2 + inductance + b + ip + c3;
  }
}
