import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends HttpServlet {
  public static Logger registrar;
  public String inbox;
  public String rectify;
  public String sound;
  public String learnerUser;
  public int place;
  public int backsideNumeral;
  public String words;
  public Place[] bunsNumber;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse retort)
      throws ServletException, IOException {
    PrintWriter away;
    String overbookingText;
    away = retort.getWriter();
    words = ask.getParameter("row");
    place = Integer.parseInt(ask.getParameter("seat"));
    backsideNumeral = Integer.parseInt(ask.getParameter("seatnumber"));
    bunsNumber = writtenFilename();
    overbookingText = becomeVenueFront();
    away.println(overbookingText);
  }

  public synchronized void doPost(HttpServletRequest requisition, HttpServletResponse responsive)
      throws ServletException, IOException {
    int arrested;
    words = requisition.getParameter("row");
    place = Integer.parseInt(requisition.getParameter("seat"));
    backsideNumeral = Integer.parseInt(requisition.getParameter("seatnumber"));
    learnerUser = requisition.getParameter("userid");
    rectify = requisition.getParameter("address");
    inbox = requisition.getParameter("email");
    sound = requisition.getParameter("phone");
    bunsNumber = writtenFilename();
    arrested = 0;
    for (Place fh : bunsNumber) {

      if (fh.letSearcherIdentification() != null
          && fh.letSearcherIdentification().equals(learnerUser)) {
        arrested++;
      }
    }

    if (arrested > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bunsNumber[backsideNumeral].solidifyingLearnerUser(learnerUser);
      bunsNumber[backsideNumeral].primedAccost(rectify);
      bunsNumber[backsideNumeral].readyMails(inbox);
      bunsNumber[backsideNumeral].laidCall(sound);
      bunsNumber[backsideNumeral].placeWeek(AstonArts.goPrevailingClock());
      bunsNumber[backsideNumeral].placeDisposable(false);
      avertPaperwork(bunsNumber);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String becomeVenueFront() {
    String password;
    String aspx;
    password = secureLaw();
    aspx = "";
    aspx +=
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
    aspx += "<p class=\"option\">" + words + place + "</p>";
    aspx +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    aspx += "<p class=\"option\" data-code=\"" + password + "\">" + password + "</p>";
    aspx +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + words
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + backsideNumeral
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
    return aspx;
  }

  public synchronized String secureLaw() {
    String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String data[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unintended;
    String ordinate, bp, interval, internal, b, s2;
    unintended = new Random();
    ordinate = circulars[unintended.nextInt(circulars.length)];
    bp = data[unintended.nextInt(data.length)];
    interval = circulars[unintended.nextInt(circulars.length)];
    internal = data[unintended.nextInt(data.length)];
    b = circulars[unintended.nextInt(circulars.length)];
    s2 = data[unintended.nextInt(data.length)];
    return ordinate + bp + interval + internal + b + s2;
  }

  public synchronized Place[] writtenFilename() {

    try {
      FileInputStream immigrationFolder;
      ObjectInputStream supporters;
      Place[] elects;
      immigrationFolder =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      supporters = new ObjectInputStream(immigrationFolder);
      elects = (Place[]) supporters.readObject();
      supporters.close();
      immigrationFolder.close();
      return elects;
    } catch (IOException i) {
      registrar.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      registrar.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Place[] stalls) {

    try {
      FileOutputStream extinguishedDocument;
      ObjectOutputStream extinct;
      extinguishedDocument =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      extinct = new ObjectOutputStream(extinguishedDocument);
      extinct.writeObject(stalls);
      extinct.close();
      extinguishedDocument.close();
    } catch (IOException officio) {
      officio.printStackTrace();
    }
  }

  static {
    registrar = Logger.getLogger("bensTheatre");
  }
}
