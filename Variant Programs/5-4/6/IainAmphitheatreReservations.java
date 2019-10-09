import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class IainAmphitheatreReservations extends HttpServlet {
  public Place[] rumpRaiment = null;
  public String brawl = null;
  public int rumpCount = 0;
  public int posterior = 0;
  public String usePhoto = null;
  public String earpiece = null;
  public String fix = null;
  public String philatelic = null;
  public static Logger recorder = null;

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse replies)
      throws ServletException, IOException {
    PrintWriter extinguished = replies.getWriter();
    brawl = application.getParameter("row");
    posterior = Integer.parseInt(application.getParameter("seat"));
    rumpCount = Integer.parseInt(application.getParameter("seatnumber"));
    rumpRaiment = recordExecutable();
    String engagementVarlet = drawAdvanceFootnote();
    extinguished.println(engagementVarlet);
  }

  public synchronized void doPost(HttpServletRequest demands, HttpServletResponse reacted)
      throws ServletException, IOException {
    brawl = demands.getParameter("row");
    posterior = Integer.parseInt(demands.getParameter("seat"));
    rumpCount = Integer.parseInt(demands.getParameter("seatnumber"));
    usePhoto = demands.getParameter("userid");
    fix = demands.getParameter("address");
    philatelic = demands.getParameter("email");
    earpiece = demands.getParameter("phone");
    rumpRaiment = recordExecutable();
    int arranged = 0;
    for (Place fh : rumpRaiment) synx25(fh, arranged);

    if (arranged > 2) {
      reacted.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rumpRaiment[rumpCount].orderedPatientNerfling(usePhoto);
      rumpRaiment[rumpCount].settledDestination(fix);
      rumpRaiment[rumpCount].orderedPostage(philatelic);
      rumpRaiment[rumpCount].fixedHeadset(earpiece);
      rumpRaiment[rumpCount].determinedDays(EmpCinemas.generateUnderwayYear());
      rumpRaiment[rumpCount].adjustAddressable(false);
      relieveFolders(rumpRaiment);
      reacted.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String drawAdvanceFootnote() {
    String codification = suretyCodification();
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
    http += "<p class=\"option\">" + brawl + posterior + "</p>";
    http +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    http += "<p class=\"option\" data-code=\"" + codification + "\">" + codification + "</p>";
    http +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + posterior
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + brawl
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + rumpCount
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

  public synchronized String suretyCodification() {
    String correspondance[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random probability = new Random();
    String q = null, bp = null, frequencies = null, fgf = null, manifold = null, sw = null;
    q = correspondance[probability.nextInt(correspondance.length)];
    bp = estimates[probability.nextInt(estimates.length)];
    frequencies = correspondance[probability.nextInt(correspondance.length)];
    fgf = estimates[probability.nextInt(estimates.length)];
    manifold = correspondance[probability.nextInt(correspondance.length)];
    sw = estimates[probability.nextInt(estimates.length)];
    return q + bp + frequencies + fgf + manifold + sw;
  }

  public synchronized Place[] recordExecutable() {

    try {
      Place[] elections = null;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream without = new ObjectInputStream(niiComplaint);
      elections = (Place[]) without.readObject();
      without.close();
      niiComplaint.close();
      return elections;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      recorder.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Place[] stools) {

    try {
      FileOutputStream unsuccessfulFolders =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream down = new ObjectOutputStream(unsuccessfulFolders);
      down.writeObject(stools);
      down.close();
      unsuccessfulFolders.close();
    } catch (IOException exwife) {
      exwife.printStackTrace();
    }
  }

  static {
    recorder = Logger.getLogger("bensTheatre");
  }

  private synchronized void synx25(Place fh, int arranged) throws ServletException, IOException {

    if (fh.drawPersonName() != null && fh.drawPersonName().equals(usePhoto)) {
      arranged++;
    }
  }
}
