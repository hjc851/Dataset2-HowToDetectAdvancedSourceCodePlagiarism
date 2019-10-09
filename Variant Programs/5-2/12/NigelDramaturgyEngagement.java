import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class NigelDramaturgyEngagement extends HttpServlet {
  private Buns[] buttocksMultitude;
  private String place;
  private int fannyCome;
  private int bum;
  private String employeePictures;
  private String device;
  private String destination;
  private String emailed;
  private static Logger rancher = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest wishes, HttpServletResponse reaction)
      throws ServletException, IOException {
    PrintWriter unsuccessful = reaction.getWriter();
    place = wishes.getParameter("row");
    bum = Integer.parseInt(wishes.getParameter("seat"));
    fannyCome = Integer.parseInt(wishes.getParameter("seatnumber"));
    buttocksMultitude = scanFolders();
    String reservationPageboy = becomeVenueFront();
    unsuccessful.println(reservationPageboy);
  }

  public void doPost(HttpServletRequest asking, HttpServletResponse reception)
      throws ServletException, IOException {
    place = asking.getParameter("row");
    bum = Integer.parseInt(asking.getParameter("seat"));
    fannyCome = Integer.parseInt(asking.getParameter("seatnumber"));
    employeePictures = asking.getParameter("userid");
    destination = asking.getParameter("address");
    emailed = asking.getParameter("email");
    device = asking.getParameter("phone");
    buttocksMultitude = scanFolders();
    int earmarked = 0;
    for (Buns ora : buttocksMultitude) {

      if (ora.haveSubscriberHandle() != null
          && ora.haveSubscriberHandle().equals(employeePictures)) {
        earmarked++;
      }
    }

    if (earmarked > 2) {
      reception.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttocksMultitude[fannyCome].orderedPatientNerfling(employeePictures);
      buttocksMultitude[fannyCome].arrangeRespond(destination);
      buttocksMultitude[fannyCome].bentCourier(emailed);
      buttocksMultitude[fannyCome].rigidVoice(device);
      buttocksMultitude[fannyCome].determineBeginning(NathanMovie.becomeTheOpportunity());
      buttocksMultitude[fannyCome].primedAcquirable(false);
      keepSubmit(buttocksMultitude);
      reception.sendRedirect("benstheatre?message=success");
    }
  }

  public String becomeVenueFront() {
    String guideline = safeguardsIdentifier();
    String htm = "";
    htm +=
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
    htm += "<p class=\"option\">" + place + bum + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + guideline + "\">" + guideline + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bum
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + place
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
    return htm;
  }

  public String safeguardsIdentifier() {
    String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportions[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random spontaneous = new Random();
    String density, a1, amplitude, d2, coordinates, ans;
    density = circulars[spontaneous.nextInt(circulars.length)];
    a1 = proportions[spontaneous.nextInt(proportions.length)];
    amplitude = circulars[spontaneous.nextInt(circulars.length)];
    d2 = proportions[spontaneous.nextInt(proportions.length)];
    coordinates = circulars[spontaneous.nextInt(circulars.length)];
    ans = proportions[spontaneous.nextInt(proportions.length)];
    return density + a1 + amplitude + d2 + coordinates + ans;
  }

  public Buns[] scanFolders() {

    try {
      Buns[] positions;
      FileInputStream advocatesExecutable =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(advocatesExecutable);
      positions = (Buns[]) tenants.readObject();
      tenants.close();
      advocatesExecutable.close();
      return positions;
    } catch (IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      rancher.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void keepSubmit(Buns[] jobs) {

    try {
      FileOutputStream stunnedFolder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinguished = new ObjectOutputStream(stunnedFolder);
      extinguished.writeObject(jobs);
      extinguished.close();
      stunnedFolder.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }
}
