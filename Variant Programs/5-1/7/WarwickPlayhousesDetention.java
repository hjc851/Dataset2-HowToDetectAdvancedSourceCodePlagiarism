import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends HttpServlet {
  private Tush[] tushFinery;
  private String quarrel;
  private int canQuantity;
  private int bottom;
  private String employeePictures;
  private String dial;
  private String accost;
  private String courier;
  private static Logger consignor = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest application, HttpServletResponse reactions)
      throws ServletException, IOException {
    PrintWriter dead = reactions.getWriter();
    quarrel = application.getParameter("row");
    bottom = Integer.parseInt(application.getParameter("seat"));
    canQuantity = Integer.parseInt(application.getParameter("seatnumber"));
    tushFinery = translateDocuments();
    String reservationPageboy = canLogScreen();
    dead.println(reservationPageboy);
  }

  public void doPost(HttpServletRequest wishes, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    quarrel = wishes.getParameter("row");
    bottom = Integer.parseInt(wishes.getParameter("seat"));
    canQuantity = Integer.parseInt(wishes.getParameter("seatnumber"));
    employeePictures = wishes.getParameter("userid");
    accost = wishes.getParameter("address");
    courier = wishes.getParameter("email");
    dial = wishes.getParameter("phone");
    tushFinery = translateDocuments();
    int allotted = 0;
    for (Tush fh : tushFinery) {

      if (fh.letSearcherIdentification() != null
          && fh.letSearcherIdentification().equals(employeePictures)) {
        allotted++;
      }
    }

    if (allotted > 2) {
      rejoinder.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tushFinery[canQuantity].layUsabilityCard(employeePictures);
      tushFinery[canQuantity].markAdress(accost);
      tushFinery[canQuantity].placedMessage(courier);
      tushFinery[canQuantity].settledLandline(dial);
      tushFinery[canQuantity].settledPeriods(PkgHouse.bringOngoingMeter());
      tushFinery[canQuantity].placedForthcoming(false);
      avoidDatabase(tushFinery);
      rejoinder.sendRedirect("benstheatre?message=success");
    }
  }

  public String canLogScreen() {
    String ciphers = guardingEncrypt();
    String aspx = "";
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
    aspx += "<p class=\"option\">" + quarrel + bottom + "</p>";
    aspx +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    aspx += "<p class=\"option\" data-code=\"" + ciphers + "\">" + ciphers + "</p>";
    aspx +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bottom
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + quarrel
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + canQuantity
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

  public String guardingEncrypt() {
    String words[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String figure[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random spontaneous = new Random();
    String durations, a, betas, force, dn, r6;
    durations = words[spontaneous.nextInt(words.length)];
    a = figure[spontaneous.nextInt(figure.length)];
    betas = words[spontaneous.nextInt(words.length)];
    force = figure[spontaneous.nextInt(figure.length)];
    dn = words[spontaneous.nextInt(words.length)];
    r6 = figure[spontaneous.nextInt(figure.length)];
    return durations + a + betas + force + dn + r6;
  }

  public Tush[] translateDocuments() {

    try {
      Tush[] passengers;
      FileInputStream establishmentFolders =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream supporters = new ObjectInputStream(establishmentFolders);
      passengers = (Tush[]) supporters.readObject();
      supporters.close();
      establishmentFolders.close();
      return passengers;
    } catch (IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      consignor.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public void avoidDatabase(Tush[] jobs) {

    try {
      FileOutputStream unconsciousCharge =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream stunned = new ObjectOutputStream(unconsciousCharge);
      stunned.writeObject(jobs);
      stunned.close();
      unconsciousCharge.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }
}
