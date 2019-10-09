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

public class ZackDramaRegister extends HttpServlet {
  private int invest;
  private String course;
  private Invest[] bumSelection;
  private String identify;
  private String searcherIdentification;

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse responds)
      throws ServletException, IOException {
    PrintWriter unstylish;
    String gigFolio;
    unstylish = (responds.getWriter());
    course = (appeal.getParameter("row"));
    invest = (parseInt(appeal.getParameter("seat")));
    tushFigure = (parseInt(appeal.getParameter("seatnumber")));
    bumSelection = (writtenFilename());
    gigFolio = (letRegistrationTab());
    unstylish.println(gigFolio);
  }

  public synchronized String firewallEncode() {
    String messages[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String scores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random accidental;
    String tc, c1, inductance, cf, nb, ri;
    accidental = (new Random());
    tc = (messages[accidental.nextInt(messages.length)]);
    c1 = (scores[accidental.nextInt(scores.length)]);
    inductance = (messages[accidental.nextInt(messages.length)]);
    cf = (scores[accidental.nextInt(scores.length)]);
    nb = (messages[accidental.nextInt(messages.length)]);
    ri = (scores[accidental.nextInt(scores.length)]);
    return (tc + c1 + inductance + cf + nb + ri);
  }

  public synchronized String letRegistrationTab() {
    String cypher;
    String browser;
    cypher = (firewallEncode());
    browser = ("");
    browser +=
        (("<!DOCTYPE html>\n"
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
            + "        <p class=\"heading\">Selected Seat:</p>"));
    browser += (("<p class=\"option\">" + course + invest + "</p>"));
    browser +=
        (("</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>"));
    browser += (("<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>"));
    browser +=
        (("</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + invest
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + course
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tushFigure
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
            + "</html>"));
    return browser;
  }

  public synchronized Invest[] writtenFilename() {

    try {
      FileInputStream establishmentFolders;
      ObjectInputStream officeholders;
      Invest[] votes;
      establishmentFolders =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      officeholders = (new ObjectInputStream(establishmentFolders));
      votes = ((Invest[]) officeholders.readObject());
      officeholders.close();
      establishmentFolders.close();
      return votes;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      recorder.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void doPost(HttpServletRequest requisition, HttpServletResponse riposte)
      throws ServletException, IOException {
    int rented;
    course = (requisition.getParameter("row"));
    invest = (parseInt(requisition.getParameter("seat")));
    tushFigure = (parseInt(requisition.getParameter("seatnumber")));
    searcherIdentification = (requisition.getParameter("userid"));
    identify = (requisition.getParameter("address"));
    fax = (requisition.getParameter("email"));
    headphone = (requisition.getParameter("phone"));
    bumSelection = (writtenFilename());
    rented = (0);
    for (Invest ora : bumSelection) synx55(ora, rented);

    if (rented > 2) {
      riposte.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bumSelection[tushFigure].arrangeVisitorOwnership(searcherIdentification);
      bumSelection[tushFigure].placeAlleviate(identify);
      bumSelection[tushFigure].arrangeElectronically(fax);
      bumSelection[tushFigure].fixDevice(headphone);
      bumSelection[tushFigure].arrangeYears(NigelDramaturgy.goPrevailingClock());
      bumSelection[tushFigure].layUsable(false);
      rescuingReadme(bumSelection);
      riposte.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void rescuingReadme(Invest[] stools) {

    try {
      FileOutputStream offData;
      ObjectOutputStream tabu;
      offData = (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      tabu = (new ObjectOutputStream(offData));
      tabu.writeObject(stools);
      tabu.close();
      offData.close();
    } catch (IOException exwife) {
      exwife.printStackTrace();
    }
  }

  private int tushFigure;
  private static Logger recorder = getLogger("bensTheatre");
  private String headphone;
  private String fax;

  private synchronized void synx55(Invest ora, int rented) throws ServletException, IOException {

    if (ora.fixPatientNerfling() != null
        && ora.fixPatientNerfling().equals(searcherIdentification)) {
      rented++;
    }
  }
}
