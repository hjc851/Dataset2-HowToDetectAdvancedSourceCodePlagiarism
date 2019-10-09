import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SthTeatroRecording extends HttpServlet {
  private Tush[] assCollection;
  private String succession;
  private int hindquartersNumerous;
  private int prat;
  private String wearerMap;
  private String caller;
  private String plow;
  private String dissemination;
  private static Logger woodworker = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest motion, HttpServletResponse respond)
      throws ServletException, IOException {
    PrintWriter impermissible = respond.getWriter();
    succession = motion.getParameter("row");
    prat = Integer.parseInt(motion.getParameter("seat"));
    hindquartersNumerous = Integer.parseInt(motion.getParameter("seatnumber"));
    assCollection = writeDatabase();
    String ticketHomepage = drawAdvanceFootnote();
    impermissible.println(ticketHomepage);
  }

  public void doPost(HttpServletRequest demands, HttpServletResponse react)
      throws ServletException, IOException {
    succession = demands.getParameter("row");
    prat = Integer.parseInt(demands.getParameter("seat"));
    hindquartersNumerous = Integer.parseInt(demands.getParameter("seatnumber"));
    wearerMap = demands.getParameter("userid");
    plow = demands.getParameter("address");
    dissemination = demands.getParameter("email");
    caller = demands.getParameter("phone");
    assCollection = writeDatabase();
    int listed = 0;
    for (Tush ora : assCollection) {

      if (ora.fixPatientNerfling() != null && ora.fixPatientNerfling().equals(wearerMap)) {
        listed++;
      }
    }

    if (listed > 2) {
      react.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[hindquartersNumerous].fixedUsePhoto(wearerMap);
      assCollection[hindquartersNumerous].fitPlow(plow);
      assCollection[hindquartersNumerous].prepareAddress(dissemination);
      assCollection[hindquartersNumerous].putTelephone(caller);
      assCollection[hindquartersNumerous].primedPeriod(PhillipsAuditorium.fetchPresentBeginning());
      assCollection[hindquartersNumerous].fixedViewable(false);
      protectComplaint(assCollection);
      react.sendRedirect("benstheatre?message=success");
    }
  }

  public String drawAdvanceFootnote() {
    String cypher = protectionCipher();
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
    http += "<p class=\"option\">" + succession + prat + "</p>";
    http +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    http += "<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>";
    http +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + prat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + succession
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + hindquartersNumerous
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

  public String protectionCipher() {
    String missive[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String numerals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random spontaneous = new Random();
    String temperature, b2, interval, anachronistic, b, d;
    temperature = missive[spontaneous.nextInt(missive.length)];
    b2 = numerals[spontaneous.nextInt(numerals.length)];
    interval = missive[spontaneous.nextInt(missive.length)];
    anachronistic = numerals[spontaneous.nextInt(numerals.length)];
    b = missive[spontaneous.nextInt(missive.length)];
    d = numerals[spontaneous.nextInt(numerals.length)];
    return temperature + b2 + interval + anachronistic + b + d;
  }

  public Tush[] writeDatabase() {

    try {
      Tush[] votes;
      FileInputStream electedFilename =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream details = new ObjectInputStream(electedFilename);
      votes = (Tush[]) details.readObject();
      details.close();
      electedFilename.close();
      return votes;
    } catch (IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      woodworker.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void protectComplaint(Tush[] space) {

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(outgoingArchives);
      kayoed.writeObject(space);
      kayoed.close();
      outgoingArchives.close();
    } catch (IOException exwife) {
      exwife.printStackTrace();
    }
  }
}
