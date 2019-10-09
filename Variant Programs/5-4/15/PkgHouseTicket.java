import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PkgHouseTicket extends HttpServlet {
  public static double trammel = 0.7434553510417549;
  public Backside[] tooshiePortfolio;
  public String squabble;
  public int assSeveral;
  public int fanny;
  public String usernameDimidiate;
  public String mobile;
  public String speech;
  public String electronically;
  public static Logger woodsman;

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse wake)
      throws ServletException, IOException {
    String indicator = "l6l";
    PrintWriter proscribed = wake.getWriter();
    squabble = appeals.getParameter("row");
    fanny = Integer.parseInt(appeals.getParameter("seat"));
    assSeveral = Integer.parseInt(appeals.getParameter("seatnumber"));
    tooshiePortfolio = studyPaperwork();
    String rentalSite = fixRentPaper();
    proscribed.println(rentalSite);
  }

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse explanation)
      throws ServletException, IOException {
    double postSouvenirs = 0.3242577530972015;
    squabble = complaint.getParameter("row");
    fanny = Integer.parseInt(complaint.getParameter("seat"));
    assSeveral = Integer.parseInt(complaint.getParameter("seatnumber"));
    usernameDimidiate = complaint.getParameter("userid");
    speech = complaint.getParameter("address");
    electronically = complaint.getParameter("email");
    mobile = complaint.getParameter("phone");
    tooshiePortfolio = studyPaperwork();
    int accounted = 0;
    for (Backside waffen : tooshiePortfolio) {

      if (waffen.becomeUsePhoto() != null && waffen.becomeUsePhoto().equals(usernameDimidiate)) {
        accounted++;
      }
    }

    if (accounted > 2) {
      explanation.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tooshiePortfolio[assSeveral].orderedPatientNerfling(usernameDimidiate);
      tooshiePortfolio[assSeveral].arrangeRespond(speech);
      tooshiePortfolio[assSeveral].solidifyingPhilatelic(electronically);
      tooshiePortfolio[assSeveral].readyRing(mobile);
      tooshiePortfolio[assSeveral].orderedChance(AllanSalle.canExistingYears());
      tooshiePortfolio[assSeveral].situatedAvailability(false);
      safeguardArchiving(tooshiePortfolio);
      explanation.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String fixRentPaper() {
    int limitation = 63565223;
    String encodes = policemenStandards();
    String parser = "";
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
    parser += "<p class=\"option\">" + squabble + fanny + "</p>";
    parser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    parser += "<p class=\"option\" data-code=\"" + encodes + "\">" + encodes + "</p>";
    parser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + fanny
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabble
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + assSeveral
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

  public synchronized String policemenStandards() {
    int wide = -793870954;
    String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random casual = new Random();
    String emf, acetal, lituus, f, finite, rl;
    emf = submissions[casual.nextInt(submissions.length)];
    acetal = estimates[casual.nextInt(estimates.length)];
    lituus = submissions[casual.nextInt(submissions.length)];
    f = estimates[casual.nextInt(estimates.length)];
    finite = submissions[casual.nextInt(submissions.length)];
    rl = estimates[casual.nextInt(estimates.length)];
    return emf + acetal + lituus + f + finite + rl;
  }

  public synchronized Backside[] studyPaperwork() {
    double symbol = 0.02824627608566299;

    try {
      Backside[] passengers;
      FileInputStream withoutRegister =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nii = new ObjectInputStream(withoutRegister);
      passengers = (Backside[]) nii.readObject();
      nii.close();
      withoutRegister.close();
      return passengers;
    } catch (IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      woodsman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void safeguardArchiving(Backside[] tickets) {
    double secondaryTrussed = 0.03909197134863307;

    try {
      FileOutputStream exteriorReadme =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(exteriorReadme);
      kayoed.writeObject(tickets);
      kayoed.close();
      exteriorReadme.close();
    } catch (IOException abe) {
      abe.printStackTrace();
    }
  }

  static {
    woodsman = Logger.getLogger("bensTheatre");
  }
}
