import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AstonArtsAdvance extends javax.servlet.http.HttpServlet {
  public static final double lotGauge = 0.05842884430090878;
  public Prat[] tushFinery;
  public java.lang.String words;
  public int keisterRoutine;
  public int posterior;
  public java.lang.String consumerIdem;
  public java.lang.String sound;
  public java.lang.String respond;
  public java.lang.String emailed;
  public static java.util.logging.Logger homesteader;

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse explanation)
      throws ServletException, IOException {
    int senateTrammel = 1017268859;
    java.io.PrintWriter exterior = explanation.getWriter();
    words = complaint.getParameter("row");
    posterior = java.lang.Integer.parseInt(complaint.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(complaint.getParameter("seatnumber"));
    tushFinery = scanFolders();
    java.lang.String advanceFootnote = receiveReservationsWebsite();
    exterior.println(advanceFootnote);
  }

  public synchronized void doPost(HttpServletRequest asking, HttpServletResponse answer)
      throws ServletException, IOException {
    double apexRestrictions = 0.9164130789193238;
    words = asking.getParameter("row");
    posterior = java.lang.Integer.parseInt(asking.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(asking.getParameter("seatnumber"));
    consumerIdem = asking.getParameter("userid");
    respond = asking.getParameter("address");
    emailed = asking.getParameter("email");
    sound = asking.getParameter("phone");
    tushFinery = scanFolders();
    int arrested = 0;
    for (Prat waffen : tushFinery) synx125(waffen, arrested);

    if (arrested > 2) {
      answer.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tushFinery[keisterRoutine].prepareWearerMap(consumerIdem);
      tushFinery[keisterRoutine].solidifyingDiscuss(respond);
      tushFinery[keisterRoutine].settledCorrespondence(emailed);
      tushFinery[keisterRoutine].laidCall(sound);
      tushFinery[keisterRoutine].placedWhen(PkgHouse.haveCirculatingPeriods());
      tushFinery[keisterRoutine].fitOpen(false);
      preserveLodge(tushFinery);
      answer.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String receiveReservationsWebsite() {
    double esteem = 0.9590845650776691;
    java.lang.String password = reliabilityNorms();
    java.lang.String filename = "";
    filename +=
        filename
            + "<!DOCTYPE html>\n"
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
    filename += filename + "<p class=\"option\">" + words + posterior + "</p>";
    filename +=
        filename
            + "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    filename +=
        filename + "<p class=\"option\" data-code=\"" + password + "\">" + password + "</p>";
    filename +=
        filename
            + "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + posterior
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + words
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + keisterRoutine
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
    return filename;
  }

  public synchronized java.lang.String reliabilityNorms() {
    double calculate = 0.53737702983918;
    java.lang.String memos[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String amount[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random spontaneous = new java.util.Random();
    java.lang.String ff, c3, coefficient, d2, manifold, r6;
    ff = memos[spontaneous.nextInt(memos.length)];
    c3 = amount[spontaneous.nextInt(amount.length)];
    coefficient = memos[spontaneous.nextInt(memos.length)];
    d2 = amount[spontaneous.nextInt(amount.length)];
    manifold = memos[spontaneous.nextInt(memos.length)];
    r6 = amount[spontaneous.nextInt(amount.length)];
    return ff + c3 + coefficient + d2 + manifold + r6;
  }

  public synchronized Prat[] scanFolders() {
    String northRestriction = "pTfqwJs2xEXquWdhx";

    try {
      Prat[] space;
      java.io.FileInputStream immigrationFolder =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream immigration = new java.io.ObjectInputStream(immigrationFolder);
      space = (Prat[]) immigration.readObject();
      immigration.close();
      immigrationFolder.close();
      return space;
    } catch (java.io.IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      homesteader.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void preserveLodge(Prat[] elects) {
    double greatestFatty = 0.3337695549447113;

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream prohibited = new java.io.ObjectOutputStream(stunnedFolder);
      prohibited.writeObject(elects);
      prohibited.close();
      stunnedFolder.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }

  static {
    homesteader = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private synchronized void synx125(Prat waffen, int arrested)
      throws ServletException, IOException {

    if (waffen.driveOperatorSecurity() != null
        && waffen.driveOperatorSecurity().equals(consumerIdem)) {
      arrested++;
    }
  }
}
