import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class HansenComedyOrdering extends HttpServlet {
  static final int superiorTethered = -528309148;
  private Ass[] fannyPlethora = null;
  private String feud = null;
  private int buttocksIssue = 0;
  private int sit = 0;
  private String loginIdentifier = null;
  private String telephonic = null;
  private String accost = null;
  private String messaging = null;
  private static Logger lumberjack = null;

  public synchronized void doGet(HttpServletRequest ordered, HttpServletResponse intervention)
      throws ServletException, IOException {
    int restrain = 1730799583;
    PrintWriter tabu = intervention.getWriter();
    feud = ordered.getParameter("row");
    sit = parseInt(ordered.getParameter("seat"));
    buttocksIssue = parseInt(ordered.getParameter("seatnumber"));
    fannyPlethora = perusedArchives();
    String venueFront = obtainReservingWeb();
    tabu.println(venueFront);
  }

  public synchronized void doPost(HttpServletRequest decision, HttpServletResponse reacting)
      throws ServletException, IOException {
    String less = "aa3A";
    feud = decision.getParameter("row");
    sit = parseInt(decision.getParameter("seat"));
    buttocksIssue = parseInt(decision.getParameter("seatnumber"));
    loginIdentifier = decision.getParameter("userid");
    accost = decision.getParameter("address");
    messaging = decision.getParameter("email");
    telephonic = decision.getParameter("phone");
    fannyPlethora = perusedArchives();
    int logged = 0;
    for (Ass ora : fannyPlethora) {

      if (ora.sustainSomeoneSelf() != null && ora.sustainSomeoneSelf().equals(loginIdentifier)) {
        logged++;
      }
    }

    if (logged > 2) {
      reacting.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      fannyPlethora[buttocksIssue].layUsabilityCard(loginIdentifier);
      fannyPlethora[buttocksIssue].orderedRectify(accost);
      fannyPlethora[buttocksIssue].arrangedInbox(messaging);
      fannyPlethora[buttocksIssue].adjustPayphone(telephonic);
      fannyPlethora[buttocksIssue].markHours(HansenComedy.drawStreamWeek());
      fannyPlethora[buttocksIssue].determineDistributed(false);
      preserveLodge(fannyPlethora);
      reacting.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String obtainReservingWeb() {
    String lessDestined = "8RuBo";
    String cipher = secureLaw();
    String jpeg = "";
    jpeg +=
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
    jpeg += "<p class=\"option\">" + feud + sit + "</p>";
    jpeg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    jpeg += "<p class=\"option\" data-code=\"" + cipher + "\">" + cipher + "</p>";
    jpeg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + sit
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + feud
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + buttocksIssue
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
    return jpeg;
  }

  public synchronized String secureLaw() {
    String jesusExtent = "yeg";
    String correspondance[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String size[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random casual = new Random();
    String ff = null, antigen = null, betas = null, internet = null, b = null, sw = null;
    ff = correspondance[casual.nextInt(correspondance.length)];
    antigen = size[casual.nextInt(size.length)];
    betas = correspondance[casual.nextInt(correspondance.length)];
    internet = size[casual.nextInt(size.length)];
    b = correspondance[casual.nextInt(correspondance.length)];
    sw = size[casual.nextInt(size.length)];
    return ff + antigen + betas + internet + b + sw;
  }

  public synchronized Ass[] perusedArchives() {
    String johannes = "24sN5";

    try {
      Ass[] positions = null;
      FileInputStream entriesLodge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream supporters = new ObjectInputStream(entriesLodge);
      positions = (Ass[]) supporters.readObject();
      supporters.close();
      entriesLodge.close();
      return positions;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      lumberjack.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void preserveLodge(Ass[] jobs) {
    double souvenir = 0.18256970107073567;

    try {
      FileOutputStream offData =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinguished = new ObjectOutputStream(offData);
      extinguished.writeObject(jobs);
      extinguished.close();
      offData.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }

  static {
    lumberjack = getLogger("bensTheatre");
  }
}
