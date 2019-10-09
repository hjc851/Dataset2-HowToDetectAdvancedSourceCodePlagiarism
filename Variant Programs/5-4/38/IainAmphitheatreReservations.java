import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class IainAmphitheatreReservations extends HttpServlet {
  private Tail[] buttMix = null;
  private String squabbling = null;
  private int inductBit = 0;
  private int tush = 0;
  private String searcherIdentification = null;
  private String switchboard = null;
  private String work = null;
  private String correspondence = null;
  private static Logger registrar = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest calls, HttpServletResponse explanation)
      throws ServletException, IOException {
    PrintWriter off = explanation.getWriter();
    squabbling = calls.getParameter("row");
    tush = Integer.parseInt(calls.getParameter("seat"));
    inductBit = Integer.parseInt(calls.getParameter("seatnumber"));
    buttMix = understandCharge();
    String gigFolio = becomeVenueFront();
    off.println(gigFolio);
  }

  public synchronized void doPost(HttpServletRequest ordered, HttpServletResponse reply)
      throws ServletException, IOException {
    squabbling = ordered.getParameter("row");
    tush = Integer.parseInt(ordered.getParameter("seat"));
    inductBit = Integer.parseInt(ordered.getParameter("seatnumber"));
    searcherIdentification = ordered.getParameter("userid");
    work = ordered.getParameter("address");
    correspondence = ordered.getParameter("email");
    switchboard = ordered.getParameter("phone");
    buttMix = understandCharge();
    int reported = 0;
    for (Tail waffen : buttMix) synx85(waffen, reported);

    if (reported > 2) {
      reply.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttMix[inductBit].markSearcherIdentification(searcherIdentification);
      buttMix[inductBit].settledDestination(work);
      buttMix[inductBit].rigidCouriers(correspondence);
      buttMix[inductBit].fixDevice(switchboard);
      buttMix[inductBit].determinedDays(NathanMovie.startPresentlyMinutes());
      buttMix[inductBit].fixDownloadable(false);
      avoidDatabase(buttMix);
      reply.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String becomeVenueFront() {
    String identifier = reliabilityNorms();
    String plugin = "";
    plugin +=
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
    plugin += "<p class=\"option\">" + squabbling + tush + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + identifier + "\">" + identifier + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tush
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabbling
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
    return plugin;
  }

  public synchronized String reliabilityNorms() {
    String memorandums[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unselected = new Random();
    String rl = null, cc = null, acetal = null, abscissa = null, r6 = null, g = null;
    rl = memorandums[unselected.nextInt(memorandums.length)];
    cc = population[unselected.nextInt(population.length)];
    acetal = memorandums[unselected.nextInt(memorandums.length)];
    abscissa = population[unselected.nextInt(population.length)];
    r6 = memorandums[unselected.nextInt(memorandums.length)];
    g = population[unselected.nextInt(population.length)];
    return rl + cc + acetal + abscissa + r6 + g;
  }

  public synchronized Tail[] understandCharge() {

    try {
      Tail[] elects = null;
      FileInputStream tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream proponents = new ObjectInputStream(tenantsDocuments);
      elects = (Tail[]) proponents.readObject();
      proponents.close();
      tenantsDocuments.close();
      return elects;
    } catch (IOException i) {
      registrar.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      registrar.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void avoidDatabase(Tail[] members) {

    try {
      FileOutputStream prohibitedPapers =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unstylish = new ObjectOutputStream(prohibitedPapers);
      unstylish.writeObject(members);
      unstylish.close();
      prohibitedPapers.close();
    } catch (IOException combatants) {
      combatants.printStackTrace();
    }
  }

  private synchronized void synx85(Tail waffen, int reported) throws ServletException, IOException {

    if (waffen.catchCustomersIbid() != null
        && waffen.catchCustomersIbid().equals(searcherIdentification)) {
      reported++;
    }
  }
}
