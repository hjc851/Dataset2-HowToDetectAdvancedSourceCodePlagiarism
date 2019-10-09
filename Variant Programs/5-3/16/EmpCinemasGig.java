import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends HttpServlet {
  static double decreaseRolled = 0.9817782273272303;
  private Hindquarters[] sitRegalia;
  private String quarrel;
  private int investFrequency;
  private int backside;
  private String usePhoto;
  private String mobiles;
  private String answer;
  private String electronic;
  private static Logger thermometer;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse reacted)
      throws ServletException, IOException {
    int fatty = -731835484;
    PrintWriter taboo = reacted.getWriter();
    quarrel = petition.getParameter("row");
    backside = Integer.parseInt(petition.getParameter("seat"));
    investFrequency = Integer.parseInt(petition.getParameter("seatnumber"));
    sitRegalia = registerSubmit();
    String overbookingText = goReservationPageboy();
    taboo.println(overbookingText);
  }

  public synchronized void doPost(HttpServletRequest suggestion, HttpServletResponse responded)
      throws ServletException, IOException {
    double hokkianeseRadius = 0.8215314486153641;
    quarrel = suggestion.getParameter("row");
    backside = Integer.parseInt(suggestion.getParameter("seat"));
    investFrequency = Integer.parseInt(suggestion.getParameter("seatnumber"));
    usePhoto = suggestion.getParameter("userid");
    answer = suggestion.getParameter("address");
    electronic = suggestion.getParameter("email");
    mobiles = suggestion.getParameter("phone");
    sitRegalia = registerSubmit();
    int made = 0;
    for (Hindquarters fh : sitRegalia) {

      if (fh.drawPersonName() != null && fh.drawPersonName().equals(usePhoto)) {
        made++;
      }
    }

    if (made > 2) {
      responded.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      sitRegalia[investFrequency].markSearcherIdentification(usePhoto);
      sitRegalia[investFrequency].prepareConfront(answer);
      sitRegalia[investFrequency].orderedPostage(electronic);
      sitRegalia[investFrequency].fixedHeadset(mobiles);
      sitRegalia[investFrequency].markHours(AstonArts.goPrevailingClock());
      sitRegalia[investFrequency].fitOpen(false);
      salvagingSubmitting(sitRegalia);
      responded.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String goReservationPageboy() {
    String ceilingSlot = "dUJcV4WJw7ymR";
    String encrypt = confidentialityEncoding();
    String htm = "";
    htm +=
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
    htm += "<p class=\"option\">" + quarrel + backside + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + encrypt + "\">" + encrypt + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + backside
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + quarrel
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
    return htm;
  }

  public synchronized String confidentialityEncoding() {
    double notional = 0.14608499022041688;
    String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String numerals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random randomization = new Random();
    String density, r6, eigenvalue, c1, eq, d;
    density = circulars[randomization.nextInt(circulars.length)];
    r6 = numerals[randomization.nextInt(numerals.length)];
    eigenvalue = circulars[randomization.nextInt(circulars.length)];
    c1 = numerals[randomization.nextInt(numerals.length)];
    eq = circulars[randomization.nextInt(circulars.length)];
    d = numerals[randomization.nextInt(numerals.length)];
    return density + r6 + eigenvalue + c1 + eq + d;
  }

  public synchronized Hindquarters[] registerSubmit() {
    double measure = 0.3024581938514208;

    try {
      Hindquarters[] elects;
      FileInputStream nihDocket =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nih = new ObjectInputStream(nihDocket);
      elects = (Hindquarters[]) nih.readObject();
      nih.close();
      nihDocket.close();
      return elects;
    } catch (IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      thermometer.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void salvagingSubmitting(Hindquarters[] slots) {
    int greatestFatty = -1323950982;

    try {
      FileOutputStream retiredExecutable =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(retiredExecutable);
      kayoed.writeObject(slots);
      kayoed.close();
      retiredExecutable.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }

  static {
    thermometer = Logger.getLogger("bensTheatre");
  }
}
