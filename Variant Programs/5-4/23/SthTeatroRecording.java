import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SthTeatroRecording extends HttpServlet {
  private static Logger woodcutter = null;
  private String philatelic = null;
  private String work = null;
  private String ring = null;
  private String exploiterQuod = null;
  private int sit = 0;
  private int tooshieMultiple = 0;
  private String succession = null;
  private Place[] tailMultiplicity = null;

  public synchronized void doGet(HttpServletRequest motions, HttpServletResponse reaction)
      throws ServletException, IOException {
    PrintWriter outer;
    String advanceFootnote;
    outer = reaction.getWriter();
    succession = motions.getParameter("row");
    sit = Integer.parseInt(motions.getParameter("seat"));
    tooshieMultiple = Integer.parseInt(motions.getParameter("seatnumber"));
    tailMultiplicity = peruseDocket();
    advanceFootnote = haveRentingSection();
    outer.println(advanceFootnote);
  }

  public synchronized void doPost(HttpServletRequest plea, HttpServletResponse reception)
      throws ServletException, IOException {
    int taken;
    succession = plea.getParameter("row");
    sit = Integer.parseInt(plea.getParameter("seat"));
    tooshieMultiple = Integer.parseInt(plea.getParameter("seatnumber"));
    exploiterQuod = plea.getParameter("userid");
    work = plea.getParameter("address");
    philatelic = plea.getParameter("email");
    ring = plea.getParameter("phone");
    tailMultiplicity = peruseDocket();
    taken = 0;
    for (Place ora : tailMultiplicity) synx50(ora, taken);

    if (taken > 2) {
      reception.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tailMultiplicity[tooshieMultiple].fixedUsePhoto(exploiterQuod);
      tailMultiplicity[tooshieMultiple].laidSpeak(work);
      tailMultiplicity[tooshieMultiple].markSend(philatelic);
      tailMultiplicity[tooshieMultiple].placeMobiles(ring);
      tailMultiplicity[tooshieMultiple].dictatedMeter(VeleOpera.goPrevailingClock());
      tailMultiplicity[tooshieMultiple].solidifyingAccessed(false);
      economizeSubmitted(tailMultiplicity);
      reception.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String haveRentingSection() {
    String norms;
    String parser;
    norms = guardingEncrypt();
    parser = "";
    parser +=
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
    parser += "<p class=\"option\">" + succession + sit + "</p>";
    parser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    parser += "<p class=\"option\" data-code=\"" + norms + "\">" + norms + "</p>";
    parser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + sit
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + succession
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tooshieMultiple
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
    return parser;
  }

  public synchronized String guardingEncrypt() {
    String memos[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String digit[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random stray;
    String temperature, a, android, correspond, finite, rn;
    stray = new Random();
    temperature = null;
    a = null;
    android = null;
    correspond = null;
    finite = null;
    rn = null;
    temperature = memos[stray.nextInt(memos.length)];
    a = digit[stray.nextInt(digit.length)];
    android = memos[stray.nextInt(memos.length)];
    correspond = digit[stray.nextInt(digit.length)];
    finite = memos[stray.nextInt(memos.length)];
    rn = digit[stray.nextInt(digit.length)];
    return temperature + a + android + correspond + finite + rn;
  }

  public synchronized Place[] peruseDocket() {

    try {
      FileInputStream nsisApplication;
      ObjectInputStream advocates;
      Place[] pillion = null;
      nsisApplication =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      advocates = new ObjectInputStream(nsisApplication);
      pillion = (Place[]) advocates.readObject();
      advocates.close();
      nsisApplication.close();
      return pillion;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      woodcutter.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void economizeSubmitted(Place[] benches) {

    try {
      FileOutputStream impermissibleArchiving;
      ObjectOutputStream forbidden;
      impermissibleArchiving =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      forbidden = new ObjectOutputStream(impermissibleArchiving);
      forbidden.writeObject(benches);
      forbidden.close();
      impermissibleArchiving.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }

  static {
    woodcutter = Logger.getLogger("bensTheatre");
  }

  private synchronized void synx50(Place ora, int taken) throws ServletException, IOException {

    if (ora.developAddictPeg() != null && ora.developAddictPeg().equals(exploiterQuod)) {
      taken++;
    }
  }
}
