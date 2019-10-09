import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends HttpServlet {
  private int pratStatistic = 0;

  public synchronized String catchRecordingSummary() {
    String norms = safetyInscribe();
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
    http += "<p class=\"option\">" + pack + stern + "</p>";
    http +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    http += "<p class=\"option\" data-code=\"" + norms + "\">" + norms + "</p>";
    http +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + stern
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + pack
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + pratStatistic
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

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse react)
      throws ServletException, IOException {
    pack = complaint.getParameter("row");
    stern = Integer.parseInt(complaint.getParameter("seat"));
    pratStatistic = Integer.parseInt(complaint.getParameter("seatnumber"));
    usageFinger = complaint.getParameter("userid");
    adress = complaint.getParameter("address");
    philatelic = complaint.getParameter("email");
    landline = complaint.getParameter("phone");
    assCollection = tellReadme();
    int reserved = 0;
    for (Buns fh : assCollection) {

      if (fh.bringCustomerCaller() != null && fh.bringCustomerCaller().equals(usageFinger)) {
        reserved++;
      }
    }

    if (reserved > 2) {
      react.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[pratStatistic].primedUsageFinger(usageFinger);
      assCollection[pratStatistic].determinedWork(adress);
      assCollection[pratStatistic].fixedSending(philatelic);
      assCollection[pratStatistic].fixedHeadset(landline);
      assCollection[pratStatistic].prepareNow(GarethTheatrical.startPresentlyMinutes());
      assCollection[pratStatistic].placedForthcoming(false);
      redeemDocuments(assCollection);
      react.sendRedirect("benstheatre?message=success");
    }
  }

  private String philatelic = null;

  public synchronized String safetyInscribe() {
    String memorandums[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String levels[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unintended = new Random();
    String frequency = null, activating = null, carboxylate = null, cf = null, nb = null, u = null;
    frequency = memorandums[unintended.nextInt(memorandums.length)];
    activating = levels[unintended.nextInt(levels.length)];
    carboxylate = memorandums[unintended.nextInt(memorandums.length)];
    cf = levels[unintended.nextInt(levels.length)];
    nb = memorandums[unintended.nextInt(memorandums.length)];
    u = levels[unintended.nextInt(levels.length)];
    return frequency + activating + carboxylate + cf + nb + u;
  }

  private static Logger chainsaw = Logger.getLogger("bensTheatre");
  private String usageFinger = null;

  public synchronized void redeemDocuments(Buns[] stalls) {

    try {
      FileOutputStream forbiddenDocumentation =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream down = new ObjectOutputStream(forbiddenDocumentation);
      down.writeObject(stalls);
      down.close();
      forbiddenDocumentation.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }

  private String landline = null;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    PrintWriter outer = rejoinder.getWriter();
    pack = requisition.getParameter("row");
    stern = Integer.parseInt(requisition.getParameter("seat"));
    pratStatistic = Integer.parseInt(requisition.getParameter("seatnumber"));
    assCollection = tellReadme();
    String logScreen = catchRecordingSummary();
    outer.println(logScreen);
  }

  private String pack = null;

  public synchronized Buns[] tellReadme() {

    try {
      Buns[] ridings = null;
      FileInputStream tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream incumbents = new ObjectInputStream(tenantsDocuments);
      ridings = (Buns[]) incumbents.readObject();
      incumbents.close();
      tenantsDocuments.close();
      return ridings;
    } catch (IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      chainsaw.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  private String adress = null;
  private Buns[] assCollection = null;
  private int stern = 0;
}
