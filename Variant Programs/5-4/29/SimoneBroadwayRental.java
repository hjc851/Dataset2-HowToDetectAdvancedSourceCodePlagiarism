import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SimoneBroadwayRental extends HttpServlet {
  public static final int reducedLeaping = 636399416;
  public Butt[] rumpRaiment;
  public String series;
  public int placeList;
  public int ass;
  public String developerPicture;
  public String headset;
  public String accost;
  public String electronically;
  public static Logger homesteader;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    double treated = 0.7624354785810191;
    PrintWriter prohibited = responsiveness.getWriter();
    series = ask.getParameter("row");
    ass = Integer.parseInt(ask.getParameter("seat"));
    placeList = Integer.parseInt(ask.getParameter("seatnumber"));
    rumpRaiment = translateDocuments();
    String rentPaper = canLogScreen();
    prohibited.println(rentPaper);
  }

  public synchronized void doPost(HttpServletRequest decision, HttpServletResponse responded)
      throws ServletException, IOException {
    double bound = 0.9845931324225227;
    series = decision.getParameter("row");
    ass = Integer.parseInt(decision.getParameter("seat"));
    placeList = Integer.parseInt(decision.getParameter("seatnumber"));
    developerPicture = decision.getParameter("userid");
    accost = decision.getParameter("address");
    electronically = decision.getParameter("email");
    headset = decision.getParameter("phone");
    rumpRaiment = translateDocuments();
    int registered = 0;
    for (Butt ora : rumpRaiment) synx60(ora, registered);

    if (registered > 2) {
      responded.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rumpRaiment[placeList].markSearcherIdentification(developerPicture);
      rumpRaiment[placeList].arrangeRespond(accost);
      rumpRaiment[placeList].determinedMail(electronically);
      rumpRaiment[placeList].rigidVoice(headset);
      rumpRaiment[placeList].primedPeriod(PhillipsAuditorium.findActualSentence());
      rumpRaiment[placeList].laidObtainable(false);
      rescuingReadme(rumpRaiment);
      responded.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String canLogScreen() {
    double hokkianese = 0.7433747489501707;
    String encoding = insecureCodex();
    String metadata = "";
    metadata +=
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
    metadata += "<p class=\"option\">" + series + ass + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + encoding + "\">" + encoding + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + ass
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + series
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + placeList
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
    return metadata;
  }

  public synchronized String insecureCodex() {
    String respect = "lpyfU49mjM6DIH4F11r";
    String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String size[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random haphazard = new Random();
    String k, crh, coefficient, exponent, manifold, d;
    k = submissions[haphazard.nextInt(submissions.length)];
    crh = size[haphazard.nextInt(size.length)];
    coefficient = submissions[haphazard.nextInt(submissions.length)];
    exponent = size[haphazard.nextInt(size.length)];
    manifold = submissions[haphazard.nextInt(submissions.length)];
    d = size[haphazard.nextInt(size.length)];
    return k + crh + coefficient + exponent + manifold + d;
  }

  public synchronized Butt[] translateDocuments() {
    int identify = -1466415912;

    try {
      Butt[] venues;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream elected = new ObjectInputStream(niiComplaint);
      venues = (Butt[]) elected.readObject();
      elected.close();
      niiComplaint.close();
      return venues;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      homesteader.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void rescuingReadme(Butt[] jobs) {
    double cksMaterials = 0.6733749418714382;

    try {
      FileOutputStream downLodge =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream down = new ObjectOutputStream(downLodge);
      down.writeObject(jobs);
      down.close();
      downLodge.close();
    } catch (IOException former) {
      former.printStackTrace();
    }
  }

  static {
    homesteader = Logger.getLogger("bensTheatre");
  }

  private synchronized void synx60(Butt ora, int registered) throws ServletException, IOException {

    if (ora.produceWearerMap() != null && ora.produceWearerMap().equals(developerPicture)) {
      registered++;
    }
  }
}
