import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends HttpServlet {
  private Buns[] tailMultiplicity;
  private String bickering;
  private int bunsPercentage;
  private int posterior;
  private String searcherIdentification;
  private String mobile;
  private String discuss;
  private String electronic;
  private static Logger register = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest suggestion, HttpServletResponse retort)
      throws ServletException, IOException {
    PrintWriter unfashionable = retort.getWriter();
    bickering = suggestion.getParameter("row");
    posterior = Integer.parseInt(suggestion.getParameter("seat"));
    bunsPercentage = Integer.parseInt(suggestion.getParameter("seatnumber"));
    tailMultiplicity = interpretLodge();
    String reservingWeb = goReservationPageboy();
    unfashionable.println(reservingWeb);
  }

  public void doPost(HttpServletRequest decision, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    bickering = decision.getParameter("row");
    posterior = Integer.parseInt(decision.getParameter("seat"));
    bunsPercentage = Integer.parseInt(decision.getParameter("seatnumber"));
    searcherIdentification = decision.getParameter("userid");
    discuss = decision.getParameter("address");
    electronic = decision.getParameter("email");
    mobile = decision.getParameter("phone");
    tailMultiplicity = interpretLodge();
    int counted = 0;
    for (Buns fh : tailMultiplicity) {

      if (fh.goExploiterQuod() != null && fh.goExploiterQuod().equals(searcherIdentification)) {
        counted++;
      }
    }

    if (counted > 2) {
      rejoinder.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tailMultiplicity[bunsPercentage].solidifyingLearnerUser(searcherIdentification);
      tailMultiplicity[bunsPercentage].laidSpeak(discuss);
      tailMultiplicity[bunsPercentage].determinedMail(electronic);
      tailMultiplicity[bunsPercentage].arrangeSwitchboard(mobile);
      tailMultiplicity[bunsPercentage].dictatedMeter(RemoTheater.makeIncumbentDay());
      tailMultiplicity[bunsPercentage].primedAcquirable(false);
      safeguardArchiving(tailMultiplicity);
      rejoinder.sendRedirect("benstheatre?message=success");
    }
  }

  public String goReservationPageboy() {
    String inscribe = protectingEncryption();
    String meta = "";
    meta +=
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
    meta += "<p class=\"option\">" + bickering + posterior + "</p>";
    meta +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    meta += "<p class=\"option\" data-code=\"" + inscribe + "\">" + inscribe + "</p>";
    meta +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + posterior
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + bickering
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bunsPercentage
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
    return meta;
  }

  public String protectingEncryption() {
    String epistles[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String numerals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random wanton = new Random();
    String fc, ao, amplitude, bt, en, ses;
    fc = epistles[wanton.nextInt(epistles.length)];
    ao = numerals[wanton.nextInt(numerals.length)];
    amplitude = epistles[wanton.nextInt(epistles.length)];
    bt = numerals[wanton.nextInt(numerals.length)];
    en = epistles[wanton.nextInt(epistles.length)];
    ses = numerals[wanton.nextInt(numerals.length)];
    return fc + ao + amplitude + bt + en + ses;
  }

  public Buns[] interpretLodge() {

    try {
      Buns[] constituencies;
      FileInputStream cbsDocument =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(cbsDocument);
      constituencies = (Buns[]) tenants.readObject();
      tenants.close();
      cbsDocument.close();
      return constituencies;
    } catch (IOException i) {
      register.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      register.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void safeguardArchiving(Buns[] spots) {

    try {
      FileOutputStream impermissibleArchiving =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(impermissibleArchiving);
      kayoed.writeObject(spots);
      kayoed.close();
      impermissibleArchiving.close();
    } catch (IOException past) {
      past.printStackTrace();
    }
  }
}
