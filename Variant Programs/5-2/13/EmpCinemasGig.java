import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends javax.servlet.http.HttpServlet {
  private Tush[] derriereVariety;
  private java.lang.String round;
  private int investFrequency;
  private int buttocks;
  private java.lang.String subscriberHandle;
  private java.lang.String handset;
  private java.lang.String identify;
  private java.lang.String electronic;
  private static java.util.logging.Logger voyage =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest petition, HttpServletResponse reacted)
      throws ServletException, IOException {
    java.io.PrintWriter unfashionable = reacted.getWriter();
    round = petition.getParameter("row");
    buttocks = java.lang.Integer.parseInt(petition.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(petition.getParameter("seatnumber"));
    derriereVariety = readerInitiate();
    java.lang.String recordingSummary = startRegisterChapter();
    unfashionable.println(recordingSummary);
  }

  public void doPost(HttpServletRequest motions, HttpServletResponse react)
      throws ServletException, IOException {
    round = motions.getParameter("row");
    buttocks = java.lang.Integer.parseInt(motions.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(motions.getParameter("seatnumber"));
    subscriberHandle = motions.getParameter("userid");
    identify = motions.getParameter("address");
    electronic = motions.getParameter("email");
    handset = motions.getParameter("phone");
    derriereVariety = readerInitiate();
    int leased = 0;
    for (Tush ora : derriereVariety) {

      if (ora.obtainViewerEst() != null && ora.obtainViewerEst().equals(subscriberHandle)) {
        leased++;
      }
    }

    if (leased > 2) {
      react.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      derriereVariety[investFrequency].fixedUsePhoto(subscriberHandle);
      derriereVariety[investFrequency].layDeal(identify);
      derriereVariety[investFrequency].placeFacsimile(electronic);
      derriereVariety[investFrequency].doLaptop(handset);
      derriereVariety[investFrequency].arrangeYears(GarethTheatrical.generateUnderwayYear());
      derriereVariety[investFrequency].fitOpen(false);
      preventBinder(derriereVariety);
      react.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String startRegisterChapter() {
    java.lang.String encrypt = policePrefix();
    java.lang.String wysiwyg = "";
    wysiwyg +=
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
    wysiwyg += "<p class=\"option\">" + round + buttocks + "</p>";
    wysiwyg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    wysiwyg += "<p class=\"option\" data-code=\"" + encrypt + "\">" + encrypt + "</p>";
    wysiwyg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buttocks
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + round
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
    return wysiwyg;
  }

  public java.lang.String policePrefix() {
    java.lang.String words[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String totals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random serendipity = new java.util.Random();
    java.lang.String rl, c3, lituus, force, c1, sw;
    rl = words[serendipity.nextInt(words.length)];
    c3 = totals[serendipity.nextInt(totals.length)];
    lituus = words[serendipity.nextInt(words.length)];
    force = totals[serendipity.nextInt(totals.length)];
    c1 = words[serendipity.nextInt(words.length)];
    sw = totals[serendipity.nextInt(totals.length)];
    return rl + c3 + lituus + force + c1 + sw;
  }

  public Tush[] readerInitiate() {

    try {
      Tush[] stools;
      java.io.FileInputStream adherentsPaperwork =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream advocates = new java.io.ObjectInputStream(adherentsPaperwork);
      stools = (Tush[]) advocates.readObject();
      advocates.close();
      adherentsPaperwork.close();
      return stools;
    } catch (java.io.IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      voyage.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public void preventBinder(Tush[] votes) {

    try {
      java.io.FileOutputStream impossibleDocuments =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream forbidden = new java.io.ObjectOutputStream(impossibleDocuments);
      forbidden.writeObject(votes);
      forbidden.close();
      impossibleDocuments.close();
    } catch (java.io.IOException late) {
      late.printStackTrace();
    }
  }
}
