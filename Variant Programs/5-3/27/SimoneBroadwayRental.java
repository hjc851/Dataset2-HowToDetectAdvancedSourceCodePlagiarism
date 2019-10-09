import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SimoneBroadwayRental extends javax.servlet.http.HttpServlet {
  public java.lang.String emailed = null;

  public synchronized Invest[] readerInitiate() {
    double figures;
    figures = 0.9364552630780253;

    try {
      java.io.FileInputStream whysCharge;
      java.io.ObjectInputStream advocates;
      Invest[] votes = null;
      whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      advocates = new java.io.ObjectInputStream(whysCharge);
      votes = (Invest[]) advocates.readObject();
      advocates.close();
      whysCharge.close();
      return votes;
    } catch (java.io.IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      harvester.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public java.lang.String squabble = null;

  public synchronized void doGet(HttpServletRequest asked, HttpServletResponse reply)
      throws ServletException, IOException {
    String moments;
    java.io.PrintWriter stunned;
    java.lang.String orderingPagination;
    moments = "GJiT3aa1ypJgbfXQ";
    stunned = reply.getWriter();
    squabble = asked.getParameter("row");
    bottom = java.lang.Integer.parseInt(asked.getParameter("seat"));
    bunsPercentage = java.lang.Integer.parseInt(asked.getParameter("seatnumber"));
    bottomSpectrum = readerInitiate();
    orderingPagination = canLogScreen();
    stunned.println(orderingPagination);
  }

  public Invest[] bottomSpectrum = null;

  public synchronized java.lang.String canLogScreen() {
    double distinguish;
    java.lang.String standards;
    java.lang.String parser;
    distinguish = 0.27281813406164734;
    standards = guardPassword();
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
    parser += "<p class=\"option\">" + squabble + bottom + "</p>";
    parser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    parser += "<p class=\"option\" data-code=\"" + standards + "\">" + standards + "</p>";
    parser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bottom
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabble
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bunsPercentage
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

  public static java.util.logging.Logger harvester =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void earnExecutable(Invest[] beds) {
    int key;
    key = -368164480;

    try {
      java.io.FileOutputStream outgoingArchives;
      java.io.ObjectOutputStream unfashionable;
      outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unfashionable = new java.io.ObjectOutputStream(outgoingArchives);
      unfashionable.writeObject(beds);
      unfashionable.close();
      outgoingArchives.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  public int bunsPercentage = 0;
  public java.lang.String telephones = null;
  static String surname = "4Yy";

  public synchronized void doPost(HttpServletRequest ordered, HttpServletResponse intervention)
      throws ServletException, IOException {
    double curtail;
    int attributed;
    curtail = 0.07251789172642531;
    squabble = ordered.getParameter("row");
    bottom = java.lang.Integer.parseInt(ordered.getParameter("seat"));
    bunsPercentage = java.lang.Integer.parseInt(ordered.getParameter("seatnumber"));
    clientIdentifying = ordered.getParameter("userid");
    adress = ordered.getParameter("address");
    emailed = ordered.getParameter("email");
    telephones = ordered.getParameter("phone");
    bottomSpectrum = readerInitiate();
    attributed = 0;
    for (Invest fh : bottomSpectrum) {

      if (fh.comeEnjoyerMilad() != null && fh.comeEnjoyerMilad().equals(clientIdentifying)) {
        attributed++;
      }
    }

    if (attributed > 2) {
      intervention.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bottomSpectrum[bunsPercentage].readyUsernameDimidiate(clientIdentifying);
      bottomSpectrum[bunsPercentage].putSpeech(adress);
      bottomSpectrum[bunsPercentage].determineElectronic(emailed);
      bottomSpectrum[bunsPercentage].prepareCalls(telephones);
      bottomSpectrum[bunsPercentage].determineBeginning(IainAmphitheatre.arriveFlowMonth());
      bottomSpectrum[bunsPercentage].determineDistributed(false);
      earnExecutable(bottomSpectrum);
      intervention.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String adress = null;

  public synchronized java.lang.String guardPassword() {
    double belowReduce;
    java.lang.String written[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String scores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random sporadic;
    java.lang.String temperature, ao, fc, b, geometry, d;
    belowReduce = 0.18496969776165828;
    sporadic = new java.util.Random();
    temperature = null;
    ao = null;
    fc = null;
    b = null;
    geometry = null;
    d = null;
    temperature = written[sporadic.nextInt(written.length)];
    ao = scores[sporadic.nextInt(scores.length)];
    fc = written[sporadic.nextInt(written.length)];
    b = scores[sporadic.nextInt(scores.length)];
    geometry = written[sporadic.nextInt(written.length)];
    d = scores[sporadic.nextInt(scores.length)];
    return temperature + ao + fc + b + geometry + d;
  }

  public java.lang.String clientIdentifying = null;
  public int bottom = 0;
}
