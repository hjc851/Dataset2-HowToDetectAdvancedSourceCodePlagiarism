import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PhillipsAuditoriumSubscription extends javax.servlet.http.HttpServlet {
  private Buns[] tooshiePortfolio = null;
  private java.lang.String pack = null;
  private int investFrequency = 0;
  private int tush = 0;
  private java.lang.String subscriberHandle = null;
  private java.lang.String mobile = null;
  private java.lang.String treat = null;
  private java.lang.String correspondence = null;
  private static java.util.logging.Logger lumberjack = null;

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    java.io.PrintWriter unconscious = rebuttal.getWriter();
    pack = appeal.getParameter("row");
    tush = java.lang.Integer.parseInt(appeal.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(appeal.getParameter("seatnumber"));
    tooshiePortfolio = writtenFilename();
    java.lang.String advanceFootnote = goReservationPageboy();
    unconscious.println(advanceFootnote);
  }

  public synchronized void doPost(HttpServletRequest plea, HttpServletResponse retort)
      throws ServletException, IOException {
    pack = plea.getParameter("row");
    tush = java.lang.Integer.parseInt(plea.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(plea.getParameter("seatnumber"));
    subscriberHandle = plea.getParameter("userid");
    treat = plea.getParameter("address");
    correspondence = plea.getParameter("email");
    mobile = plea.getParameter("phone");
    tooshiePortfolio = writtenFilename();
    int rented = 0;
    for (Buns fh : tooshiePortfolio) {

      if (fh.haveSubscriberHandle() != null && fh.haveSubscriberHandle().equals(subscriberHandle)) {
        rented++;
      }
    }

    if (rented > 2) {
      retort.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tooshiePortfolio[investFrequency].putExploiterQuod(subscriberHandle);
      tooshiePortfolio[investFrequency].settledDestination(treat);
      tooshiePortfolio[investFrequency].orderedPostage(correspondence);
      tooshiePortfolio[investFrequency].placedTelephones(mobile);
      tooshiePortfolio[investFrequency].arrangedSentence(AstonArts.driveContinuingAgain());
      tooshiePortfolio[investFrequency].placedForthcoming(false);
      economiseInitiate(tooshiePortfolio);
      retort.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String goReservationPageboy() {
    java.lang.String encrypt = insecurityGuideline();
    java.lang.String gif = "";
    gif +=
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
    gif += "<p class=\"option\">" + pack + tush + "</p>";
    gif +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    gif += "<p class=\"option\" data-code=\"" + encrypt + "\">" + encrypt + "</p>";
    gif +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tush
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + pack
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + investFrequency
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
    return gif;
  }

  public synchronized java.lang.String insecurityGuideline() {
    java.lang.String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String scores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random stochastic = new java.util.Random();
    java.lang.String frequency = null,
        a1 = null,
        eigenvalue = null,
        anachronistic = null,
        ri = null,
        d = null;
    frequency = submissions[stochastic.nextInt(submissions.length)];
    a1 = scores[stochastic.nextInt(scores.length)];
    eigenvalue = submissions[stochastic.nextInt(submissions.length)];
    anachronistic = scores[stochastic.nextInt(scores.length)];
    ri = submissions[stochastic.nextInt(submissions.length)];
    d = scores[stochastic.nextInt(scores.length)];
    return frequency + a1 + eigenvalue + anachronistic + ri + d;
  }

  public synchronized Buns[] writtenFilename() {

    try {
      Buns[] space = null;
      java.io.FileInputStream immigrationFolder =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream officeholders = new java.io.ObjectInputStream(immigrationFolder);
      space = (Buns[]) officeholders.readObject();
      officeholders.close();
      immigrationFolder.close();
      return space;
    } catch (java.io.IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      lumberjack.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void economiseInitiate(Buns[] venues) {

    try {
      java.io.FileOutputStream quenchedDatabase =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream quenched = new java.io.ObjectOutputStream(quenchedDatabase);
      quenched.writeObject(venues);
      quenched.close();
      quenchedDatabase.close();
    } catch (java.io.IOException late) {
      late.printStackTrace();
    }
  }

  static {
    lumberjack = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
