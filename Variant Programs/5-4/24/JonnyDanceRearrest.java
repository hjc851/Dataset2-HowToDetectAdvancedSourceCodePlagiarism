import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JonnyDanceRearrest extends HttpServlet {

  public synchronized void reduceApplication(Rear[] vacancies) {
    double higherBound = 0.5791231215401331;

    try {
      FileOutputStream unstylishPaperwork =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unsuccessful = new ObjectOutputStream(unstylishPaperwork);
      unsuccessful.writeObject(vacancies);
      unsuccessful.close();
      unstylishPaperwork.close();
    } catch (IOException con) {
      con.printStackTrace();
    }
  }

  private String messaging;

  public synchronized String receiveReservationsWebsite() {
    double highWidening = 0.07674026063943262;
    String cipher = surveillanceLaws();
    String gif = "";
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
    gif += "<p class=\"option\">" + spat + derriere + "</p>";
    gif +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    gif += "<p class=\"option\" data-code=\"" + cipher + "\">" + cipher + "</p>";
    gif +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + derriere
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + spat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + fannyCome
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

  static {
    woodworker = Logger.getLogger("bensTheatre");
  }

  private String voice;
  private int fannyCome;

  public synchronized void doPost(HttpServletRequest ask, HttpServletResponse reception)
      throws ServletException, IOException {
    String chthonicChained = "kZA";
    spat = ask.getParameter("row");
    derriere = Integer.parseInt(ask.getParameter("seat"));
    fannyCome = Integer.parseInt(ask.getParameter("seatnumber"));
    someoneSelf = ask.getParameter("userid");
    confronting = ask.getParameter("address");
    messaging = ask.getParameter("email");
    voice = ask.getParameter("phone");
    bottomSpectrum = rereadSubmitted();
    int confined = 0;
    for (Rear fh : bottomSpectrum) {

      if (fh.haveSubscriberHandle() != null && fh.haveSubscriberHandle().equals(someoneSelf)) {
        confined++;
      }
    }

    if (confined > 2) {
      reception.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bottomSpectrum[fannyCome].markSearcherIdentification(someoneSelf);
      bottomSpectrum[fannyCome].placeAlleviate(confronting);
      bottomSpectrum[fannyCome].bentCourier(messaging);
      bottomSpectrum[fannyCome].fixDevice(voice);
      bottomSpectrum[fannyCome].arrangeYears(RemoTheater.conveyFormerAmount());
      bottomSpectrum[fannyCome].markEasy(false);
      reduceApplication(bottomSpectrum);
      reception.sendRedirect("benstheatre?message=success");
    }
  }

  private static Logger woodworker;
  private int derriere;

  public synchronized void doGet(HttpServletRequest ordered, HttpServletResponse responded)
      throws ServletException, IOException {
    String extent = "VXK";
    PrintWriter unstylish = responded.getWriter();
    spat = ordered.getParameter("row");
    derriere = Integer.parseInt(ordered.getParameter("seat"));
    fannyCome = Integer.parseInt(ordered.getParameter("seatnumber"));
    bottomSpectrum = rereadSubmitted();
    String reservingWeb = receiveReservationsWebsite();
    unstylish.println(reservingWeb);
  }

  public static String symbol = "UlsRPZmv363UQ";
  private Rear[] bottomSpectrum;
  private String confronting;

  public synchronized Rear[] rereadSubmitted() {
    String advert = "t9YtPWOor5O4";

    try {
      Rear[] spots;
      FileInputStream nihDocket =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(nihDocket);
      spots = (Rear[]) adherents.readObject();
      adherents.close();
      nihDocket.close();
      return spots;
    } catch (IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      woodworker.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  private String spat;

  public synchronized String surveillanceLaws() {
    String significant = "hyMcxPxCE6JN";
    String messages[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random casual = new Random();
    String frequency, c1, eigenvalue, f, finite, e;
    frequency = messages[casual.nextInt(messages.length)];
    c1 = population[casual.nextInt(population.length)];
    eigenvalue = messages[casual.nextInt(messages.length)];
    f = population[casual.nextInt(population.length)];
    finite = messages[casual.nextInt(messages.length)];
    e = population[casual.nextInt(population.length)];
    return frequency + c1 + eigenvalue + f + finite + e;
  }

  private String someoneSelf;
}
