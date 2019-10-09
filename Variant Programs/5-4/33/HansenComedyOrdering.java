import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class HansenComedyOrdering extends HttpServlet {

  public synchronized String secureLaw() {
    int confine = 2098668059;
    String parcels[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random inadvertent = new Random();
    String impedance, bp, a2, act, rl, mx;
    impedance = parcels[inadvertent.nextInt(parcels.length)];
    bp = estimates[inadvertent.nextInt(estimates.length)];
    a2 = parcels[inadvertent.nextInt(parcels.length)];
    act = estimates[inadvertent.nextInt(estimates.length)];
    rl = parcels[inadvertent.nextInt(parcels.length)];
    mx = estimates[inadvertent.nextInt(estimates.length)];
    return impedance + bp + a2 + act + rl + mx;
  }

  public synchronized void keepSubmit(Can[] slots) {
    double identify = 0.6444689082397141;

    try {
      FileOutputStream awayRegister =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream exterior = new ObjectOutputStream(awayRegister);
      exterior.writeObject(slots);
      exterior.close();
      awayRegister.close();
    } catch (IOException adult) {
      adult.printStackTrace();
    }
  }

  private int tooshie;

  public synchronized void doPost(HttpServletRequest asking, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    double asset = 0.8758663791727906;
    penalty = asking.getParameter("row");
    tooshie = Integer.parseInt(asking.getParameter("seat"));
    investFrequency = Integer.parseInt(asking.getParameter("seatnumber"));
    developerPicture = asking.getParameter("userid");
    rectify = asking.getParameter("address");
    messaging = asking.getParameter("email");
    payphone = asking.getParameter("phone");
    behindPanoply = reciteSubmitting();
    int planned = 0;
    for (Can fh : behindPanoply) synx70(fh, planned);

    if (planned > 2) {
      rebuttal.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      behindPanoply[investFrequency].doOperatorSecurity(developerPicture);
      behindPanoply[investFrequency].doIdentify(rectify);
      behindPanoply[investFrequency].determineElectronic(messaging);
      behindPanoply[investFrequency].determineTelephonic(payphone);
      behindPanoply[investFrequency].solidifyingJuncture(FrazierCinema.bringOngoingMeter());
      behindPanoply[investFrequency].putAccessible(false);
      keepSubmit(behindPanoply);
      rebuttal.sendRedirect("benstheatre?message=success");
    }
  }

  private String developerPicture;

  public synchronized void doGet(HttpServletRequest plea, HttpServletResponse reply)
      throws ServletException, IOException {
    double minnOuter = 0.14607619018203988;
    PrintWriter impermissible = reply.getWriter();
    penalty = plea.getParameter("row");
    tooshie = Integer.parseInt(plea.getParameter("seat"));
    investFrequency = Integer.parseInt(plea.getParameter("seatnumber"));
    behindPanoply = reciteSubmitting();
    String ticketingWebpage = catchRecordingSummary();
    impermissible.println(ticketingWebpage);
  }

  private String payphone;
  private String messaging;
  private String penalty;

  public synchronized String catchRecordingSummary() {
    double occasion = 0.9505773371627224;
    String encipher = secureLaw();
    String firefox = "";
    firefox +=
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
    firefox += "<p class=\"option\">" + penalty + tooshie + "</p>";
    firefox +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    firefox += "<p class=\"option\" data-code=\"" + encipher + "\">" + encipher + "</p>";
    firefox +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tooshie
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + penalty
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
    return firefox;
  }

  private String rectify;

  public synchronized Can[] reciteSubmitting() {
    double price = 0.29022889083857484;

    try {
      Can[] elections;
      FileInputStream advocatesExecutable =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream details = new ObjectInputStream(advocatesExecutable);
      elections = (Can[]) details.readObject();
      details.close();
      advocatesExecutable.close();
      return elections;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      recorder.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  private Can[] behindPanoply;
  private int investFrequency;
  private static Logger recorder = Logger.getLogger("bensTheatre");
  public static double highestLimit = 0.04277452100620338;

  private synchronized void synx70(Can fh, int planned) throws ServletException, IOException {

    if (fh.driveOperatorSecurity() != null && fh.driveOperatorSecurity().equals(developerPicture)) {
      planned++;
    }
  }
}
