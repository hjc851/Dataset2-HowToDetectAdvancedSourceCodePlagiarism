import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class HansenComedyOrdering extends HttpServlet {

  public synchronized void salvagingSubmitting(Induct[] spaces) {
    int profitability;
    profitability = 198275306;

    try {
      FileOutputStream prohibitedPapers;
      ObjectOutputStream extinct;
      prohibitedPapers =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      extinct = new ObjectOutputStream(prohibitedPapers);
      extinct.writeObject(spaces);
      extinct.close();
      prohibitedPapers.close();
    } catch (IOException exwife) {
      exwife.printStackTrace();
    }
  }

  public synchronized String letRegistrationTab() {
    String cay;
    String ciphers;
    String metadata;
    cay = "TaSK6K";
    ciphers = insecurityGuideline();
    metadata = "";
    metadata +=
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
    metadata += "<p class=\"option\">" + place + hindquarters + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + ciphers + "\">" + ciphers + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + hindquarters
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tailMany
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
    return metadata;
  }

  public synchronized Induct[] tellReadme() {
    double pinioned;
    pinioned = 0.9879706949218342;

    try {
      FileInputStream cbsDocument;
      ObjectInputStream nsis;
      Induct[] space = null;
      cbsDocument =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsis = new ObjectInputStream(cbsDocument);
      space = (Induct[]) nsis.readObject();
      nsis.close();
      cbsDocument.close();
      return space;
    } catch (IOException i) {
      timber.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      timber.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public String customerCaller = null;
  public String mobiles = null;
  public String dissemination = null;

  public synchronized String insecurityGuideline() {
    String peak;
    String correspondence[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String numerals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random stray;
    String density, acetylcholine, impedance, bt, detector, d;
    peak = "8hgcFxp2";
    stray = new Random();
    density = null;
    acetylcholine = null;
    impedance = null;
    bt = null;
    detector = null;
    d = null;
    density = correspondence[stray.nextInt(correspondence.length)];
    acetylcholine = numerals[stray.nextInt(numerals.length)];
    impedance = correspondence[stray.nextInt(correspondence.length)];
    bt = numerals[stray.nextInt(numerals.length)];
    detector = correspondence[stray.nextInt(correspondence.length)];
    d = numerals[stray.nextInt(numerals.length)];
    return density + acetylcholine + impedance + bt + detector + d;
  }

  public static Logger timber = Logger.getLogger("bensTheatre");
  public Induct[] keisterMyriad = null;
  public String respond = null;
  public int hindquarters = 0;
  public static double apexRestrictions = 0.9113747957132838;

  public synchronized void doPost(HttpServletRequest proposal, HttpServletResponse react)
      throws ServletException, IOException {
    String subalternRestricting;
    int accounted;
    subalternRestricting = "N7yc5U3bSD7Y";
    place = proposal.getParameter("row");
    hindquarters = Integer.parseInt(proposal.getParameter("seat"));
    tailMany = Integer.parseInt(proposal.getParameter("seatnumber"));
    customerCaller = proposal.getParameter("userid");
    respond = proposal.getParameter("address");
    dissemination = proposal.getParameter("email");
    mobiles = proposal.getParameter("phone");
    keisterMyriad = tellReadme();
    accounted = 0;
    for (Induct waffen : keisterMyriad) synx65(waffen, accounted);

    if (accounted > 2) {
      react.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      keisterMyriad[tailMany].markSearcherIdentification(customerCaller);
      keisterMyriad[tailMany].doIdentify(respond);
      keisterMyriad[tailMany].adjustUrl(dissemination);
      keisterMyriad[tailMany].determinedSound(mobiles);
      keisterMyriad[tailMany].markHours(NathanMovie.comeLatestClip());
      keisterMyriad[tailMany].arrangedProcurable(false);
      salvagingSubmitting(keisterMyriad);
      react.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void doGet(HttpServletRequest motions, HttpServletResponse reception)
      throws ServletException, IOException {
    int thickness;
    PrintWriter kayoed;
    String ticketHomepage;
    thickness = -2010437696;
    kayoed = reception.getWriter();
    place = motions.getParameter("row");
    hindquarters = Integer.parseInt(motions.getParameter("seat"));
    tailMany = Integer.parseInt(motions.getParameter("seatnumber"));
    keisterMyriad = tellReadme();
    ticketHomepage = letRegistrationTab();
    kayoed.println(ticketHomepage);
  }

  public String place = null;
  public int tailMany = 0;

  private synchronized void synx65(Induct waffen, int accounted)
      throws ServletException, IOException {

    if (waffen.canVisitorOwnership() != null
        && waffen.canVisitorOwnership().equals(customerCaller)) {
      accounted++;
    }
  }
}
