import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PhillipsAuditoriumSubscription extends HttpServlet {
  private Bottom[] tailMultiplicity;
  private String quarrel;
  private int backsideNumeral;
  private int buns;
  private String customerCaller;
  private String calling;
  private String handle;
  private String dissemination;
  private static Logger surveyor = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest ordered, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    PrintWriter outgoing = rebuttal.getWriter();
    quarrel = ordered.getParameter("row");
    buns = Integer.parseInt(ordered.getParameter("seat"));
    backsideNumeral = Integer.parseInt(ordered.getParameter("seatnumber"));
    tailMultiplicity = readerInitiate();
    String ticketingWebpage = letRegistrationTab();
    outgoing.println(ticketingWebpage);
  }

  public void doPost(HttpServletRequest motions, HttpServletResponse feedback)
      throws ServletException, IOException {
    quarrel = motions.getParameter("row");
    buns = Integer.parseInt(motions.getParameter("seat"));
    backsideNumeral = Integer.parseInt(motions.getParameter("seatnumber"));
    customerCaller = motions.getParameter("userid");
    handle = motions.getParameter("address");
    dissemination = motions.getParameter("email");
    calling = motions.getParameter("phone");
    tailMultiplicity = readerInitiate();
    int engaged = 0;
    for (Bottom fh : tailMultiplicity) {

      if (fh.letSearcherIdentification() != null
          && fh.letSearcherIdentification().equals(customerCaller)) {
        engaged++;
      }
    }

    if (engaged > 2) {
      feedback.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tailMultiplicity[backsideNumeral].dictatedCustomerCaller(customerCaller);
      tailMultiplicity[backsideNumeral].fixFix(handle);
      tailMultiplicity[backsideNumeral].bentCourier(dissemination);
      tailMultiplicity[backsideNumeral].layHeadphone(calling);
      tailMultiplicity[backsideNumeral].settledPeriods(PkgHouse.drawStreamWeek());
      tailMultiplicity[backsideNumeral].arrangedProcurable(false);
      redeemDocuments(tailMultiplicity);
      feedback.sendRedirect("benstheatre?message=success");
    }
  }

  public String letRegistrationTab() {
    String rules = protectionCipher();
    String xml = "";
    xml +=
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
    xml += "<p class=\"option\">" + quarrel + buns + "</p>";
    xml +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    xml += "<p class=\"option\" data-code=\"" + rules + "\">" + rules + "</p>";
    xml +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buns
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
    return xml;
  }

  public String protectionCipher() {
    String notices[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String statistics[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random haphazardly = new Random();
    String momenta, antigen, android, anachronistic, geometries, sw;
    momenta = notices[haphazardly.nextInt(notices.length)];
    antigen = statistics[haphazardly.nextInt(statistics.length)];
    android = notices[haphazardly.nextInt(notices.length)];
    anachronistic = statistics[haphazardly.nextInt(statistics.length)];
    geometries = notices[haphazardly.nextInt(notices.length)];
    sw = statistics[haphazardly.nextInt(statistics.length)];
    return momenta + antigen + android + anachronistic + geometries + sw;
  }

  public Bottom[] readerInitiate() {

    try {
      Bottom[] stools;
      FileInputStream adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream establishment = new ObjectInputStream(adherentsPaperwork);
      stools = (Bottom[]) establishment.readObject();
      establishment.close();
      adherentsPaperwork.close();
      return stools;
    } catch (IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      surveyor.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void redeemDocuments(Bottom[] elects) {

    try {
      FileOutputStream backBinder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream retired = new ObjectOutputStream(backBinder);
      retired.writeObject(elects);
      retired.close();
      backBinder.close();
    } catch (IOException abdul) {
      abdul.printStackTrace();
    }
  }
}
