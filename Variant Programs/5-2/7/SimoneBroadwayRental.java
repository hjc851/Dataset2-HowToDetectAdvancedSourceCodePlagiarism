import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SimoneBroadwayRental extends javax.servlet.http.HttpServlet {
  private Fanny[] rumpRaiment;
  private java.lang.String squabble;
  private int rearAmount;
  private int butt;
  private java.lang.String enjoyerMilad;
  private java.lang.String mobile;
  private java.lang.String rectify;
  private java.lang.String telefax;
  private static java.util.logging.Logger forester =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest invitation, HttpServletResponse riposte)
      throws ServletException, IOException {
    java.io.PrintWriter extinguished = riposte.getWriter();
    squabble = invitation.getParameter("row");
    butt = java.lang.Integer.parseInt(invitation.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(invitation.getParameter("seatnumber"));
    rumpRaiment = showDocumentation();
    java.lang.String rentalSite = catchRecordingSummary();
    extinguished.println(rentalSite);
  }

  public void doPost(HttpServletRequest petitioning, HttpServletResponse responds)
      throws ServletException, IOException {
    squabble = petitioning.getParameter("row");
    butt = java.lang.Integer.parseInt(petitioning.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(petitioning.getParameter("seatnumber"));
    enjoyerMilad = petitioning.getParameter("userid");
    rectify = petitioning.getParameter("address");
    telefax = petitioning.getParameter("email");
    mobile = petitioning.getParameter("phone");
    rumpRaiment = showDocumentation();
    int leased = 0;
    for (Fanny ora : rumpRaiment) {

      if (ora.bringCustomerCaller() != null && ora.bringCustomerCaller().equals(enjoyerMilad)) {
        leased++;
      }
    }

    if (leased > 2) {
      responds.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rumpRaiment[rearAmount].laidEnjoyerMilad(enjoyerMilad);
      rumpRaiment[rearAmount].doIdentify(rectify);
      rumpRaiment[rearAmount].layMessaging(telefax);
      rumpRaiment[rearAmount].orderedCaller(mobile);
      rumpRaiment[rearAmount].laidClip(IainAmphitheatre.producePrevalentNow());
      rumpRaiment[rearAmount].arrangedProcurable(false);
      spareFolder(rumpRaiment);
      responds.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String catchRecordingSummary() {
    java.lang.String designator = surveillanceLaws();
    java.lang.String aspx = "";
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
    aspx += "<p class=\"option\">" + squabble + butt + "</p>";
    aspx +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    aspx += "<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>";
    aspx +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + butt
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabble
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + rearAmount
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

  public java.lang.String surveillanceLaws() {
    java.lang.String digits[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String proportions[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random haphazard = new java.util.Random();
    java.lang.String frequency, antigen, lituus, ac, ri, r8;
    frequency = digits[haphazard.nextInt(digits.length)];
    antigen = proportions[haphazard.nextInt(proportions.length)];
    lituus = digits[haphazard.nextInt(digits.length)];
    ac = proportions[haphazard.nextInt(proportions.length)];
    ri = digits[haphazard.nextInt(digits.length)];
    r8 = proportions[haphazard.nextInt(proportions.length)];
    return frequency + antigen + lituus + ac + ri + r8;
  }

  public Fanny[] showDocumentation() {

    try {
      Fanny[] benches;
      java.io.FileInputStream incumbentsSubmitting =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream incumbents = new java.io.ObjectInputStream(incumbentsSubmitting);
      benches = (Fanny[]) incumbents.readObject();
      incumbents.close();
      incumbentsSubmitting.close();
      return benches;
    } catch (java.io.IOException i) {
      forester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      forester.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public void spareFolder(Fanny[] votes) {

    try {
      java.io.FileOutputStream proscribedSubmitting =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream impossible = new java.io.ObjectOutputStream(proscribedSubmitting);
      impossible.writeObject(votes);
      impossible.close();
      proscribedSubmitting.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }
}
