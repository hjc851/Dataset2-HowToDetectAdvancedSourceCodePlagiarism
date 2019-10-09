import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PkgHouseTicket extends HttpServlet {
  private static Logger lumberjack;
  private String electronic;
  private String solve;
  private String telephony;
  private String searcherIdentification;
  private int rump;
  private int rearAmount;
  private String ranked;
  public static final double moniker = 0.5443773065289779;
  private Posterior[] behindPanoply;

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse reception)
      throws ServletException, IOException {
    double obligated;
    PrintWriter forbidden;
    String detentionAnnexes;
    obligated = 0.015403899189987191;
    forbidden = reception.getWriter();
    ranked = appeals.getParameter("row");
    rump = Integer.parseInt(appeals.getParameter("seat"));
    rearAmount = Integer.parseInt(appeals.getParameter("seatnumber"));
    behindPanoply = writeDatabase();
    detentionAnnexes = conveyDetentionAnnexes();
    forbidden.println(detentionAnnexes);
  }

  public synchronized void doPost(HttpServletRequest application, HttpServletResponse responds)
      throws ServletException, IOException {
    double maximalLength;
    int entered;
    maximalLength = 0.8949539813118375;
    ranked = application.getParameter("row");
    rump = Integer.parseInt(application.getParameter("seat"));
    rearAmount = Integer.parseInt(application.getParameter("seatnumber"));
    searcherIdentification = application.getParameter("userid");
    solve = application.getParameter("address");
    electronic = application.getParameter("email");
    telephony = application.getParameter("phone");
    behindPanoply = writeDatabase();
    entered = 0;
    for (Posterior ora : behindPanoply) {

      if (ora.canVisitorOwnership() != null
          && ora.canVisitorOwnership().equals(searcherIdentification)) {
        entered++;
      }
    }

    if (entered > 2) {
      responds.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      behindPanoply[rearAmount].primedUsageFinger(searcherIdentification);
      behindPanoply[rearAmount].placedDirect(solve);
      behindPanoply[rearAmount].adjustUrl(electronic);
      behindPanoply[rearAmount].settledLandline(telephony);
      behindPanoply[rearAmount].determineBeginning(HansenComedy.letAfootHours());
      behindPanoply[rearAmount].rigidProvided(false);
      helpData(behindPanoply);
      responds.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String conveyDetentionAnnexes() {
    int leaping;
    String legislation;
    String metadata;
    leaping = 452356706;
    legislation = insecureCodex();
    metadata = "";
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
    metadata += "<p class=\"option\">" + ranked + rump + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + legislation + "\">" + legislation + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + rump
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranked
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + rearAmount
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

  public synchronized String insecureCodex() {
    double berParticular;
    String correspondence[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String levels[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random arbitrary;
    String fl, a, intercept, c1, ip, s2;
    berParticular = 0.32510170892111934;
    arbitrary = new Random();
    fl = correspondence[arbitrary.nextInt(correspondence.length)];
    a = levels[arbitrary.nextInt(levels.length)];
    intercept = correspondence[arbitrary.nextInt(correspondence.length)];
    c1 = levels[arbitrary.nextInt(levels.length)];
    ip = correspondence[arbitrary.nextInt(correspondence.length)];
    s2 = levels[arbitrary.nextInt(levels.length)];
    return fl + a + intercept + c1 + ip + s2;
  }

  public synchronized Posterior[] writeDatabase() {
    double hourThick;
    hourThick = 0.20287865831809748;

    try {
      FileInputStream entriesLodge;
      ObjectInputStream officeholders;
      Posterior[] members;
      entriesLodge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      officeholders = new ObjectInputStream(entriesLodge);
      members = (Posterior[]) officeholders.readObject();
      officeholders.close();
      entriesLodge.close();
      return members;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      lumberjack.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void helpData(Posterior[] pillion) {
    String number;
    number = "dUnB";

    try {
      FileOutputStream retiredExecutable;
      ObjectOutputStream taboo;
      retiredExecutable =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      taboo = new ObjectOutputStream(retiredExecutable);
      taboo.writeObject(pillion);
      taboo.close();
      retiredExecutable.close();
    } catch (IOException abe) {
      abe.printStackTrace();
    }
  }

  static {
    lumberjack = Logger.getLogger("bensTheatre");
  }
}
