import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends HttpServlet {
  private Fanny[] investRaft = null;
  private String squabbling = null;
  private int sitTotal = 0;
  private int place = 0;
  private String usabilityCard = null;
  private String mobiles = null;
  private String solve = null;
  private String send = null;
  private static Logger woodcutter = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    PrintWriter impermissible = rebuttal.getWriter();
    squabbling = appeal.getParameter("row");
    place = Integer.parseInt(appeal.getParameter("seat"));
    sitTotal = Integer.parseInt(appeal.getParameter("seatnumber"));
    investRaft = studyPaperwork();
    String ticketingWebpage = fetchAppointmentLayouts();
    impermissible.println(ticketingWebpage);
  }

  public synchronized void doPost(HttpServletRequest asks, HttpServletResponse responded)
      throws ServletException, IOException {
    squabbling = asks.getParameter("row");
    place = Integer.parseInt(asks.getParameter("seat"));
    sitTotal = Integer.parseInt(asks.getParameter("seatnumber"));
    usabilityCard = asks.getParameter("userid");
    solve = asks.getParameter("address");
    send = asks.getParameter("email");
    mobiles = asks.getParameter("phone");
    investRaft = studyPaperwork();
    int taken = 0;
    for (Fanny fh : investRaft) {

      if (fh.beatLearnerUser() != null && fh.beatLearnerUser().equals(usabilityCard)) {
        taken++;
      }
    }

    if (taken > 2) {
      responded.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      investRaft[sitTotal].fixedUsePhoto(usabilityCard);
      investRaft[sitTotal].arrangedHandle(solve);
      investRaft[sitTotal].placeFacsimile(send);
      investRaft[sitTotal].placedTelephones(mobiles);
      investRaft[sitTotal].orderedChance(NigelDramaturgy.startPresentlyMinutes());
      investRaft[sitTotal].solidifyingAccessed(false);
      earnExecutable(investRaft);
      responded.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String fetchAppointmentLayouts() {
    String law = policemenStandards();
    String ascii = "";
    ascii +=
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
    ascii += "<p class=\"option\">" + squabbling + place + "</p>";
    ascii +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ascii += "<p class=\"option\" data-code=\"" + law + "\">" + law + "</p>";
    ascii +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabbling
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + sitTotal
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
    return ascii;
  }

  public synchronized String policemenStandards() {
    String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportions[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sampling = new Random();
    String tc = null, acetal = null, fl = null, act = null, detector = null, fgf = null;
    tc = circulars[sampling.nextInt(circulars.length)];
    acetal = proportions[sampling.nextInt(proportions.length)];
    fl = circulars[sampling.nextInt(circulars.length)];
    act = proportions[sampling.nextInt(proportions.length)];
    detector = circulars[sampling.nextInt(circulars.length)];
    fgf = proportions[sampling.nextInt(proportions.length)];
    return tc + acetal + fl + act + detector + fgf;
  }

  public synchronized Fanny[] studyPaperwork() {

    try {
      Fanny[] members = null;
      FileInputStream cbsDocument =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream establishment = new ObjectInputStream(cbsDocument);
      members = (Fanny[]) establishment.readObject();
      establishment.close();
      cbsDocument.close();
      return members;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      woodcutter.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void earnExecutable(Fanny[] elections) {

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream exterior = new ObjectOutputStream(outgoingArchives);
      exterior.writeObject(elections);
      exterior.close();
      outgoingArchives.close();
    } catch (IOException past) {
      past.printStackTrace();
    }
  }
}
