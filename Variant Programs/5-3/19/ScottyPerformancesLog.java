import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends HttpServlet {
  public static int minnOuter = 19066919;
  private Posterior[] inductMultiple;
  private String tiff;
  private int tushFigure;
  private int butt;
  private String usernameDimidiate;
  private String dial;
  private String confronting;
  private String postal;
  private static Logger lumberjack;

  public synchronized void doGet(HttpServletRequest motions, HttpServletResponse wake)
      throws ServletException, IOException {
    double bundleEdge = 0.751628229900049;
    PrintWriter tabu = wake.getWriter();
    tiff = motions.getParameter("row");
    butt = Integer.parseInt(motions.getParameter("seat"));
    tushFigure = Integer.parseInt(motions.getParameter("seatnumber"));
    inductMultiple = quoteData();
    String rentalSite = receiveReservationsWebsite();
    tabu.println(rentalSite);
  }

  public synchronized void doPost(HttpServletRequest requisition, HttpServletResponse reaction)
      throws ServletException, IOException {
    String juniorRestriction = "cC53tikNBIB";
    tiff = requisition.getParameter("row");
    butt = Integer.parseInt(requisition.getParameter("seat"));
    tushFigure = Integer.parseInt(requisition.getParameter("seatnumber"));
    usernameDimidiate = requisition.getParameter("userid");
    confronting = requisition.getParameter("address");
    postal = requisition.getParameter("email");
    dial = requisition.getParameter("phone");
    inductMultiple = quoteData();
    int earmarked = 0;
    for (Posterior fh : inductMultiple) {

      if (fh.findLoginIdentifier() != null && fh.findLoginIdentifier().equals(usernameDimidiate)) {
        earmarked++;
      }
    }

    if (earmarked > 2) {
      reaction.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      inductMultiple[tushFigure].dictatedCustomerCaller(usernameDimidiate);
      inductMultiple[tushFigure].determineConfronting(confronting);
      inductMultiple[tushFigure].layMessaging(postal);
      inductMultiple[tushFigure].solidifyingCalling(dial);
      inductMultiple[tushFigure].bentHour(CustArtists.letAfootHours());
      inductMultiple[tushFigure].putAccessible(false);
      savingsFilename(inductMultiple);
      reaction.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String receiveReservationsWebsite() {
    double shackled = 0.08459741677239252;
    String prefix = secureLaw();
    String keyword = "";
    keyword +=
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
    keyword += "<p class=\"option\">" + tiff + butt + "</p>";
    keyword +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    keyword += "<p class=\"option\" data-code=\"" + prefix + "\">" + prefix + "</p>";
    keyword +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + butt
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + tiff
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
            + "</html>";
    return keyword;
  }

  public synchronized String secureLaw() {
    String throttle = "cRFUjLTTEsHj";
    String missive[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random stray = new Random();
    String density, b2, d2, b, eq, ri;
    density = missive[stray.nextInt(missive.length)];
    b2 = estimates[stray.nextInt(estimates.length)];
    d2 = missive[stray.nextInt(missive.length)];
    b = estimates[stray.nextInt(estimates.length)];
    eq = missive[stray.nextInt(missive.length)];
    ri = estimates[stray.nextInt(estimates.length)];
    return density + b2 + d2 + b + eq + ri;
  }

  public synchronized Posterior[] quoteData() {
    String fukien = "MotXPWCgJRFC";

    try {
      Posterior[] tickets;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream officeholders = new ObjectInputStream(proponentsDatabase);
      tickets = (Posterior[]) officeholders.readObject();
      officeholders.close();
      proponentsDatabase.close();
      return tickets;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      lumberjack.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void savingsFilename(Posterior[] members) {
    int breadth = -1157980335;

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream proscribed = new ObjectOutputStream(outgoingArchives);
      proscribed.writeObject(members);
      proscribed.close();
      outgoingArchives.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }

  static {
    lumberjack = Logger.getLogger("bensTheatre");
  }
}
