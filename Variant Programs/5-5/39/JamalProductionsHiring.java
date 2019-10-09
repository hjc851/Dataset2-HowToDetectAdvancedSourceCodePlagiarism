import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JamalProductionsHiring extends HttpServlet {
  static double discover = 0.07268321089602958;
  public Tail[] behindPanoply;
  public String spat;
  public int tailMany;
  public int rump;
  public String adopterTag;
  public String telephone;
  public String confront;
  public String messaging;
  public static Logger forestry = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    double describe = 0.059117461481990374;
    PrintWriter down = rebuttal.getWriter();
    spat = (proposal.getParameter("row"));
    rump = (Integer.parseInt(proposal.getParameter("seat")));
    tailMany = (Integer.parseInt(proposal.getParameter("seatnumber")));
    behindPanoply = (wrotePapers());
    String gigFolio = catchRecordingSummary();
    down.println(gigFolio);
  }

  public synchronized void doPost(HttpServletRequest bespeak, HttpServletResponse respond)
      throws ServletException, IOException {
    String significant = "8BDjw05nciUb03jAOL";
    spat = (bespeak.getParameter("row"));
    rump = (Integer.parseInt(bespeak.getParameter("seat")));
    tailMany = (Integer.parseInt(bespeak.getParameter("seatnumber")));
    adopterTag = (bespeak.getParameter("userid"));
    confront = (bespeak.getParameter("address"));
    messaging = (bespeak.getParameter("email"));
    telephone = (bespeak.getParameter("phone"));
    behindPanoply = (wrotePapers());
    int accounted = 0;
    for (Tail fh : behindPanoply) {

      if (fh.obtainViewerEst() != null && fh.obtainViewerEst().equals(adopterTag)) {
        accounted++;
      }
    }

    if (accounted > 2) {
      respond.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      behindPanoply[tailMany].rigidAdopterTag(adopterTag);
      behindPanoply[tailMany].placeAlleviate(confront);
      behindPanoply[tailMany].arrangeElectronically(messaging);
      behindPanoply[tailMany].readyRing(telephone);
      behindPanoply[tailMany].bentHour(SthTeatro.comeLatestClip());
      behindPanoply[tailMany].orderedGetable(false);
      redeemDocuments(behindPanoply);
      respond.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String catchRecordingSummary() {
    int beacon = -1500928717;
    String laws = secureLaw();
    String browser = "";
    browser +=
        (("<!DOCTYPE html>\n"
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
            + "        <p class=\"heading\">Selected Seat:</p>"));
    browser += (("<p class=\"option\">" + spat + rump + "</p>"));
    browser +=
        (("</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>"));
    browser += (("<p class=\"option\" data-code=\"" + laws + "\">" + laws + "</p>"));
    browser +=
        (("</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + rump
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + spat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tailMany
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
            + "</html>"));
    return browser;
  }

  public synchronized String secureLaw() {
    double fare = 0.46046234958508403;
    String initials[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String amounts[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random wanton = new Random();
    String radius, cn, amplitude, ac, dn, rn;
    radius = (initials[wanton.nextInt(initials.length)]);
    cn = (amounts[wanton.nextInt(amounts.length)]);
    amplitude = (initials[wanton.nextInt(initials.length)]);
    ac = (amounts[wanton.nextInt(amounts.length)]);
    dn = (initials[wanton.nextInt(initials.length)]);
    rn = (amounts[wanton.nextInt(amounts.length)]);
    return (radius + cn + amplitude + ac + dn + rn);
  }

  public synchronized Tail[] wrotePapers() {
    double loadRadius = 0.5499784419624092;

    try {
      Tail[] ridings;
      FileInputStream advocatesExecutable =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nii = new ObjectInputStream(advocatesExecutable);
      ridings = ((Tail[]) nii.readObject());
      nii.close();
      advocatesExecutable.close();
      return ridings;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      forestry.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void redeemDocuments(Tail[] posts) {
    double measure = 0.8557366241356406;

    try {
      FileOutputStream forbiddenDocumentation =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impossible = new ObjectOutputStream(forbiddenDocumentation);
      impossible.writeObject(posts);
      impossible.close();
      forbiddenDocumentation.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }
}
