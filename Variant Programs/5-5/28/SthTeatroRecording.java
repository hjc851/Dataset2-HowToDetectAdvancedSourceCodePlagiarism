import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class SthTeatroRecording extends javax.servlet.http.HttpServlet {
  private Stern[] fannyPlethora;
  private java.lang.String brawl;
  private int hindquartersNumerous;
  private int sit;
  private java.lang.String searcherIdentification;
  private java.lang.String calls;
  private java.lang.String alleviate;
  private java.lang.String dissemination;
  private static java.util.logging.Logger recorder;

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse reacting)
      throws ServletException, IOException {
    java.io.PrintWriter taboo = reacting.getWriter();
    brawl = application.getParameter("row");
    sit = parseInt(application.getParameter("seat"));
    hindquartersNumerous = parseInt(application.getParameter("seatnumber"));
    fannyPlethora = reciteSubmitting();
    java.lang.String reservationsWebsite = catchRecordingSummary();
    taboo.println(reservationsWebsite);
  }

  public synchronized void doPost(HttpServletRequest quest, HttpServletResponse explanation)
      throws ServletException, IOException {
    brawl = quest.getParameter("row");
    sit = parseInt(quest.getParameter("seat"));
    hindquartersNumerous = parseInt(quest.getParameter("seatnumber"));
    searcherIdentification = quest.getParameter("userid");
    alleviate = quest.getParameter("address");
    dissemination = quest.getParameter("email");
    calls = quest.getParameter("phone");
    fannyPlethora = reciteSubmitting();
    int confined = 0;
    for (Stern ora : fannyPlethora) synx95(ora, confined);

    if (confined > 2) {
      explanation.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      fannyPlethora[hindquartersNumerous].fixedUsePhoto(searcherIdentification);
      fannyPlethora[hindquartersNumerous].arrangeRespond(alleviate);
      fannyPlethora[hindquartersNumerous].arrangedInbox(dissemination);
      fannyPlethora[hindquartersNumerous].primedCellphone(calls);
      fannyPlethora[hindquartersNumerous].placeWeek(IainAmphitheatre.fixNewChance());
      fannyPlethora[hindquartersNumerous].fixedViewable(false);
      salveDocumentation(fannyPlethora);
      explanation.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String catchRecordingSummary() {
    java.lang.String encoding = secureLaw();
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
    gif += "<p class=\"option\">" + brawl + sit + "</p>";
    gif +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    gif += "<p class=\"option\" data-code=\"" + encoding + "\">" + encoding + "</p>";
    gif +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + sit
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + brawl
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + hindquartersNumerous
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

  public synchronized java.lang.String secureLaw() {
    java.lang.String writing[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String amounts[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random arbitrary = new java.util.Random();
    java.lang.String ff, ap, frequencies, adc, rn, c3;
    ff = writing[arbitrary.nextInt(writing.length)];
    ap = amounts[arbitrary.nextInt(amounts.length)];
    frequencies = writing[arbitrary.nextInt(writing.length)];
    adc = amounts[arbitrary.nextInt(amounts.length)];
    rn = writing[arbitrary.nextInt(writing.length)];
    c3 = amounts[arbitrary.nextInt(amounts.length)];
    return ff + ap + frequencies + adc + rn + c3;
  }

  public synchronized Stern[] reciteSubmitting() {

    try {
      Stern[] elects;
      java.io.FileInputStream adherentsPaperwork =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream immigration = new java.io.ObjectInputStream(adherentsPaperwork);
      elects = (Stern[]) immigration.readObject();
      immigration.close();
      adherentsPaperwork.close();
      return elects;
    } catch (java.io.IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      recorder.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void salveDocumentation(Stern[] mats) {

    try {
      java.io.FileOutputStream deadSubmit =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream outgoing = new java.io.ObjectOutputStream(deadSubmit);
      outgoing.writeObject(mats);
      outgoing.close();
      deadSubmit.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  static {
    recorder = getLogger("bensTheatre");
  }

  private synchronized void synx95(Stern ora, int confined) throws ServletException, IOException {

    if (ora.findLoginIdentifier() != null
        && ora.findLoginIdentifier().equals(searcherIdentification)) {
      confined++;
    }
  }
}
