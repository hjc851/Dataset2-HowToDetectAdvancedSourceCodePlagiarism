import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends HttpServlet {
  private Prat[] inductMultiple;
  private String ranked;
  private int inductBit;
  private int buttocks;
  private String visitorOwnership;
  private String call;
  private String adress;
  private String telefax;
  private static Logger thermometer = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest bespeak, HttpServletResponse responsive)
      throws ServletException, IOException {
    PrintWriter exterior = responsive.getWriter();
    ranked = bespeak.getParameter("row");
    buttocks = Integer.parseInt(bespeak.getParameter("seat"));
    inductBit = Integer.parseInt(bespeak.getParameter("seatnumber"));
    inductMultiple = writtenFilename();
    String arrestContents = becomeVenueFront();
    exterior.println(arrestContents);
  }

  public void doPost(HttpServletRequest ordered, HttpServletResponse reaction)
      throws ServletException, IOException {
    ranked = ordered.getParameter("row");
    buttocks = Integer.parseInt(ordered.getParameter("seat"));
    inductBit = Integer.parseInt(ordered.getParameter("seatnumber"));
    visitorOwnership = ordered.getParameter("userid");
    adress = ordered.getParameter("address");
    telefax = ordered.getParameter("email");
    call = ordered.getParameter("phone");
    inductMultiple = writtenFilename();
    int arranged = 0;
    for (Prat fh : inductMultiple) {

      if (fh.letSearcherIdentification() != null
          && fh.letSearcherIdentification().equals(visitorOwnership)) {
        arranged++;
      }
    }

    if (arranged > 2) {
      reaction.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      inductMultiple[inductBit].orderedPatientNerfling(visitorOwnership);
      inductMultiple[inductBit].bentAnswer(adress);
      inductMultiple[inductBit].primedMailing(telefax);
      inductMultiple[inductBit].determineTelephonic(call);
      inductMultiple[inductBit].markHours(ReqPlayhouse.beatTypicalJuncture());
      inductMultiple[inductBit].doUnavailable(false);
      earnExecutable(inductMultiple);
      reaction.sendRedirect("benstheatre?message=success");
    }
  }

  public String becomeVenueFront() {
    String identifier = suretyCodification();
    String browser = "";
    browser +=
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
    browser += "<p class=\"option\">" + ranked + buttocks + "</p>";
    browser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    browser += "<p class=\"option\" data-code=\"" + identifier + "\">" + identifier + "</p>";
    browser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buttocks
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranked
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
    return browser;
  }

  public String suretyCodification() {
    String memos[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String statistics[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random randomization = new Random();
    String coefficient, a1, android, cf, logarithm, rl;
    coefficient = memos[randomization.nextInt(memos.length)];
    a1 = statistics[randomization.nextInt(statistics.length)];
    android = memos[randomization.nextInt(memos.length)];
    cf = statistics[randomization.nextInt(statistics.length)];
    logarithm = memos[randomization.nextInt(memos.length)];
    rl = statistics[randomization.nextInt(statistics.length)];
    return coefficient + a1 + android + cf + logarithm + rl;
  }

  public Prat[] writtenFilename() {

    try {
      Prat[] pillion;
      FileInputStream detailsSubmitted =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(detailsSubmitted);
      pillion = (Prat[]) tenants.readObject();
      tenants.close();
      detailsSubmitted.close();
      return pillion;
    } catch (IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      thermometer.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public void earnExecutable(Prat[] posts) {

    try {
      FileOutputStream proscribedSubmitting =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream quenched = new ObjectOutputStream(proscribedSubmitting);
      quenched.writeObject(posts);
      quenched.close();
      proscribedSubmitting.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }
}
