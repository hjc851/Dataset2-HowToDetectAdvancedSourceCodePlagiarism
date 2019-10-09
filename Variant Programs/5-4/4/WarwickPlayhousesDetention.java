import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends HttpServlet {
  public String patientNerfling;
  public int sitTotal;

  public synchronized void doPost(HttpServletRequest bespeak, HttpServletResponse reacting)
      throws ServletException, IOException {
    int withheld;
    round = bespeak.getParameter("row");
    backside = Integer.parseInt(bespeak.getParameter("seat"));
    sitTotal = Integer.parseInt(bespeak.getParameter("seatnumber"));
    patientNerfling = bespeak.getParameter("userid");
    accost = bespeak.getParameter("address");
    fax = bespeak.getParameter("email");
    sound = bespeak.getParameter("phone");
    placeAlign = writeDatabase();
    withheld = 0;
    for (Butt fh : placeAlign) synx20(fh, withheld);

    if (withheld > 2) {
      reacting.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      placeAlign[sitTotal].fixedUsePhoto(patientNerfling);
      placeAlign[sitTotal].arrangeRespond(accost);
      placeAlign[sitTotal].solidifyingPhilatelic(fax);
      placeAlign[sitTotal].settledLandline(sound);
      placeAlign[sitTotal].placeWeek(SthTeatro.takeTopicalPeriod());
      placeAlign[sitTotal].determinedFree(false);
      economiseInitiate(placeAlign);
      reacting.sendRedirect("benstheatre?message=success");
    }
  }

  public String fax;
  public String sound;

  public synchronized String secureLaw() {
    String memos[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String volume[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sample;
    String diameters, a, fc, contractual, coordinates, g;
    sample = new Random();
    diameters = memos[sample.nextInt(memos.length)];
    a = volume[sample.nextInt(volume.length)];
    fc = memos[sample.nextInt(memos.length)];
    contractual = volume[sample.nextInt(volume.length)];
    coordinates = memos[sample.nextInt(memos.length)];
    g = volume[sample.nextInt(volume.length)];
    return diameters + a + fc + contractual + coordinates + g;
  }

  public int backside;

  public synchronized Butt[] writeDatabase() {

    try {
      FileInputStream nsiPapers;
      ObjectInputStream nii;
      Butt[] spots;
      nsiPapers = new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new ObjectInputStream(nsiPapers);
      spots = (Butt[]) nii.readObject();
      nii.close();
      nsiPapers.close();
      return spots;
    } catch (IOException i) {
      register.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      register.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public String round;

  public synchronized String becomeVenueFront() {
    String encoding;
    String bitmap;
    encoding = secureLaw();
    bitmap = "";
    bitmap +=
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
    bitmap += "<p class=\"option\">" + round + backside + "</p>";
    bitmap +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    bitmap += "<p class=\"option\" data-code=\"" + encoding + "\">" + encoding + "</p>";
    bitmap +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + backside
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + round
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + sitTotal
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
    return bitmap;
  }

  public synchronized void economiseInitiate(Butt[] elections) {

    try {
      FileOutputStream outgoingArchives;
      ObjectOutputStream kayoed;
      outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      kayoed = new ObjectOutputStream(outgoingArchives);
      kayoed.writeObject(elections);
      kayoed.close();
      outgoingArchives.close();
    } catch (IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse retort)
      throws ServletException, IOException {
    PrintWriter proscribed;
    String gigFolio;
    proscribed = retort.getWriter();
    round = asks.getParameter("row");
    backside = Integer.parseInt(asks.getParameter("seat"));
    sitTotal = Integer.parseInt(asks.getParameter("seatnumber"));
    placeAlign = writeDatabase();
    gigFolio = becomeVenueFront();
    proscribed.println(gigFolio);
  }

  public String accost;
  public static Logger register = Logger.getLogger("bensTheatre");
  public Butt[] placeAlign;

  private synchronized void synx20(Butt fh, int withheld) throws ServletException, IOException {

    if (fh.driveOperatorSecurity() != null && fh.driveOperatorSecurity().equals(patientNerfling)) {
      withheld++;
    }
  }
}
