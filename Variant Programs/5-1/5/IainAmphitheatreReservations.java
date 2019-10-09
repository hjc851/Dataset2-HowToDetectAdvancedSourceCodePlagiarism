import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class IainAmphitheatreReservations extends HttpServlet {
  private Hindquarters[] bottomSpectrum;
  private String quarrel;
  private int backsideNumeral;
  private int tail;
  private String developerPicture;
  private String earphone;
  private String confronting;
  private String dissemination;
  private static Logger lumberjack = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asks, HttpServletResponse responding)
      throws ServletException, IOException {
    PrintWriter extinct = responding.getWriter();
    quarrel = asks.getParameter("row");
    tail = Integer.parseInt(asks.getParameter("seat"));
    backsideNumeral = Integer.parseInt(asks.getParameter("seatnumber"));
    bottomSpectrum = proofreadComplaint();
    String leasingAddendum = driveGigFolio();
    extinct.println(leasingAddendum);
  }

  public void doPost(HttpServletRequest appeals, HttpServletResponse responds)
      throws ServletException, IOException {
    quarrel = appeals.getParameter("row");
    tail = Integer.parseInt(appeals.getParameter("seat"));
    backsideNumeral = Integer.parseInt(appeals.getParameter("seatnumber"));
    developerPicture = appeals.getParameter("userid");
    confronting = appeals.getParameter("address");
    dissemination = appeals.getParameter("email");
    earphone = appeals.getParameter("phone");
    bottomSpectrum = proofreadComplaint();
    int reported = 0;
    for (Hindquarters waffen : bottomSpectrum) {

      if (waffen.startDeveloperPicture() != null
          && waffen.startDeveloperPicture().equals(developerPicture)) {
        reported++;
      }
    }

    if (reported > 2) {
      responds.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bottomSpectrum[backsideNumeral].fitConsumerIdem(developerPicture);
      bottomSpectrum[backsideNumeral].determineConfronting(confronting);
      bottomSpectrum[backsideNumeral].situatedPostal(dissemination);
      bottomSpectrum[backsideNumeral].determinedSound(earphone);
      bottomSpectrum[backsideNumeral].putClock(WarwickPlayhouses.bringOngoingMeter());
      bottomSpectrum[backsideNumeral].arrangedProcurable(false);
      protectComplaint(bottomSpectrum);
      responds.sendRedirect("benstheatre?message=success");
    }
  }

  public String driveGigFolio() {
    String statute = suretyCodification();
    String ajax = "";
    ajax +=
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
    ajax += "<p class=\"option\">" + quarrel + tail + "</p>";
    ajax +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ajax += "<p class=\"option\" data-code=\"" + statute + "\">" + statute + "</p>";
    ajax +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tail
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + quarrel
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + backsideNumeral
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
    return ajax;
  }

  public String suretyCodification() {
    String initials[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unintended = new Random();
    String radius, acetylcholine, acetal, cp, fgf, d;
    radius = initials[unintended.nextInt(initials.length)];
    acetylcholine = estimates[unintended.nextInt(estimates.length)];
    acetal = initials[unintended.nextInt(initials.length)];
    cp = estimates[unintended.nextInt(estimates.length)];
    fgf = initials[unintended.nextInt(initials.length)];
    d = estimates[unintended.nextInt(estimates.length)];
    return radius + acetylcholine + acetal + cp + fgf + d;
  }

  public Hindquarters[] proofreadComplaint() {

    try {
      Hindquarters[] spaces;
      FileInputStream proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream immigration = new ObjectInputStream(proponentsDatabase);
      spaces = (Hindquarters[]) immigration.readObject();
      immigration.close();
      proponentsDatabase.close();
      return spaces;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      lumberjack.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void protectComplaint(Hindquarters[] mats) {

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream prohibited = new ObjectOutputStream(impossibleDocuments);
      prohibited.writeObject(mats);
      prohibited.close();
      impossibleDocuments.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }
}
