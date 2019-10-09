import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends javax.servlet.http.HttpServlet {
  private Stern[] bumSelection;
  private java.lang.String squabble;
  private int keisterRoutine;
  private int place;
  private java.lang.String subscriberHandle;
  private java.lang.String sound;
  private java.lang.String speech;
  private java.lang.String electronic;
  private static java.util.logging.Logger woodcutter =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest bespeak, HttpServletResponse reception)
      throws ServletException, IOException {
    java.io.PrintWriter extinct = reception.getWriter();
    squabble = bespeak.getParameter("row");
    place = java.lang.Integer.parseInt(bespeak.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(bespeak.getParameter("seatnumber"));
    bumSelection = rereadSubmitted();
    java.lang.String rentingSection = letRegistrationTab();
    extinct.println(rentingSection);
  }

  public void doPost(HttpServletRequest plea, HttpServletResponse replies)
      throws ServletException, IOException {
    squabble = plea.getParameter("row");
    place = java.lang.Integer.parseInt(plea.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(plea.getParameter("seatnumber"));
    subscriberHandle = plea.getParameter("userid");
    speech = plea.getParameter("address");
    electronic = plea.getParameter("email");
    sound = plea.getParameter("phone");
    bumSelection = rereadSubmitted();
    int allocated = 0;
    for (Stern fh : bumSelection) {

      if (fh.generateConsumerIdem() != null && fh.generateConsumerIdem().equals(subscriberHandle)) {
        allocated++;
      }
    }

    if (allocated > 2) {
      replies.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bumSelection[keisterRoutine].arrangeVisitorOwnership(subscriberHandle);
      bumSelection[keisterRoutine].settledDestination(speech);
      bumSelection[keisterRoutine].prepareAddress(electronic);
      bumSelection[keisterRoutine].laidCall(sound);
      bumSelection[keisterRoutine].layMoment(GarethTheatrical.fetchPresentBeginning());
      bumSelection[keisterRoutine].markEasy(false);
      economizeSubmitted(bumSelection);
      replies.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String letRegistrationTab() {
    java.lang.String laws = guardingEncrypt();
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
    wysiwyg += "<p class=\"option\">" + squabble + place + "</p>";
    wysiwyg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    wysiwyg += "<p class=\"option\" data-code=\"" + laws + "\">" + laws + "</p>";
    wysiwyg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabble
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
    return wysiwyg;
  }

  public java.lang.String guardingEncrypt() {
    java.lang.String memorandums[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String volumes[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unannounced = new java.util.Random();
    java.lang.String momenta, c3, fc, ac, finite, rn;
    momenta = memorandums[unannounced.nextInt(memorandums.length)];
    c3 = volumes[unannounced.nextInt(volumes.length)];
    fc = memorandums[unannounced.nextInt(memorandums.length)];
    ac = volumes[unannounced.nextInt(volumes.length)];
    finite = memorandums[unannounced.nextInt(memorandums.length)];
    rn = volumes[unannounced.nextInt(volumes.length)];
    return momenta + c3 + fc + ac + finite + rn;
  }

  public Stern[] rereadSubmitted() {

    try {
      Stern[] benches;
      java.io.FileInputStream entriesLodge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream officeholders = new java.io.ObjectInputStream(entriesLodge);
      benches = (Stern[]) officeholders.readObject();
      officeholders.close();
      entriesLodge.close();
      return benches;
    } catch (java.io.IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      woodcutter.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void economizeSubmitted(Stern[] constituencies) {

    try {
      java.io.FileOutputStream unfashionableFilename =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream prohibited = new java.io.ObjectOutputStream(unfashionableFilename);
      prohibited.writeObject(constituencies);
      prohibited.close();
      unfashionableFilename.close();
    } catch (java.io.IOException late) {
      late.printStackTrace();
    }
  }
}
