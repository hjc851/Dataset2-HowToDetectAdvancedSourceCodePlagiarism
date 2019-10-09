import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static java.lang.Integer.parseInt;

public class IainAmphitheatreReservations extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger fisherman = getLogger("bensTheatre");
  private java.lang.String electronic;
  private java.lang.String accost;
  private java.lang.String telephonic;
  private java.lang.String clientIdentifying;
  private int ass;
  private int investFrequency;
  private java.lang.String ranking;
  static final String crucial = "rjSgkGLTqcF";
  private Keister[] keisterMyriad;

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse reacting)
      throws ServletException, IOException {
    double subalternPinioned;
    java.io.PrintWriter unconscious;
    java.lang.String recordingSummary;
    subalternPinioned = (0.025885901960158275);
    unconscious = (reacting.getWriter());
    ranking = (appeals.getParameter("row"));
    ass = (parseInt(appeals.getParameter("seat")));
    investFrequency = (parseInt(appeals.getParameter("seatnumber")));
    keisterMyriad = (hearBinder());
    recordingSummary = (fixRentPaper());
    unconscious.println(recordingSummary);
  }

  public synchronized void doPost(HttpServletRequest petitioning, HttpServletResponse retort)
      throws ServletException, IOException {
    double minimal;
    int logged;
    minimal = (0.3250746593336916);
    ranking = (petitioning.getParameter("row"));
    ass = (parseInt(petitioning.getParameter("seat")));
    investFrequency = (parseInt(petitioning.getParameter("seatnumber")));
    clientIdentifying = (petitioning.getParameter("userid"));
    accost = (petitioning.getParameter("address"));
    electronic = (petitioning.getParameter("email"));
    telephonic = (petitioning.getParameter("phone"));
    keisterMyriad = (hearBinder());
    logged = (0);
    for (Keister fh : keisterMyriad) synx160(fh, logged);

    if (logged > 2) {
      retort.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      keisterMyriad[investFrequency].determineEmployeePictures(clientIdentifying);
      keisterMyriad[investFrequency].fixFix(accost);
      keisterMyriad[investFrequency].fixedSending(electronic);
      keisterMyriad[investFrequency].rigidVoice(telephonic);
      keisterMyriad[investFrequency].bentHour(SthTeatro.sustainThisThing());
      keisterMyriad[investFrequency].placeDisposable(false);
      resurrectPapers(keisterMyriad);
      retort.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String fixRentPaper() {
    double belowReduce;
    java.lang.String encryption;
    java.lang.String xml;
    belowReduce = (0.6374444417400645);
    encryption = (insecurityGuideline());
    xml = ("");
    xml +=
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
    xml += (("<p class=\"option\">" + ranking + ass + "</p>"));
    xml +=
        (("</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>"));
    xml += (("<p class=\"option\" data-code=\"" + encryption + "\">" + encryption + "</p>"));
    xml +=
        (("</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + ass
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranking
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
            + "</html>"));
    return xml;
  }

  public synchronized java.lang.String insecurityGuideline() {
    int numberPieces;
    java.lang.String memorandums[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String size[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random wanton;
    java.lang.String densities, carboxylate, variable, ac, ri, rn;
    numberPieces = (-764945268);
    wanton = (new java.util.Random());
    densities = (memorandums[wanton.nextInt(memorandums.length)]);
    carboxylate = (size[wanton.nextInt(size.length)]);
    variable = (memorandums[wanton.nextInt(memorandums.length)]);
    ac = (size[wanton.nextInt(size.length)]);
    ri = (memorandums[wanton.nextInt(memorandums.length)]);
    rn = (size[wanton.nextInt(size.length)]);
    return (densities + carboxylate + variable + ac + ri + rn);
  }

  public synchronized Keister[] hearBinder() {
    double distinguishing;
    distinguishing = (0.728028881753614);

    try {
      java.io.FileInputStream incumbentsSubmitting;
      java.io.ObjectInputStream whys;
      Keister[] tickets;
      incumbentsSubmitting =
          (new java.io.FileInputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      whys = (new java.io.ObjectInputStream(incumbentsSubmitting));
      tickets = ((Keister[]) whys.readObject());
      whys.close();
      incumbentsSubmitting.close();
      return tickets;
    } catch (java.io.IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      fisherman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Keister[] stalls) {
    String symbol;
    symbol = ("7PD4hMtFqp");

    try {
      java.io.FileOutputStream unstylishPaperwork;
      java.io.ObjectOutputStream unstylish;
      unstylishPaperwork =
          (new java.io.FileOutputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      unstylish = (new java.io.ObjectOutputStream(unstylishPaperwork));
      unstylish.writeObject(stalls);
      unstylish.close();
      unstylishPaperwork.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }

  private synchronized void synx160(Keister fh, int logged) throws ServletException, IOException {

    if (fh.letSearcherIdentification() != null
        && fh.letSearcherIdentification().equals(clientIdentifying)) {
      logged++;
    }
  }
}
