import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends HttpServlet {

  public synchronized Sit[] proofreadComplaint() {

    try {
      Sit[] stools;
      FileInputStream establishmentFolders =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nsi = new ObjectInputStream(establishmentFolders);
      stools = ((Sit[]) nsi.readObject());
      nsi.close();
      establishmentFolders.close();
      return stools;
    } catch (IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      lumberman.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void doPost(HttpServletRequest petitioning, HttpServletResponse feedback)
      throws ServletException, IOException {
    wrangle = (petitioning.getParameter("row"));
    tail = (Integer.parseInt(petitioning.getParameter("seat")));
    bumFewer = (Integer.parseInt(petitioning.getParameter("seatnumber")));
    someoneSelf = (petitioning.getParameter("userid"));
    alleviate = (petitioning.getParameter("address"));
    couriers = (petitioning.getParameter("email"));
    cellphone = (petitioning.getParameter("phone"));
    assCollection = (proofreadComplaint());
    int accounted = 0;
    for (Sit fh : assCollection) {

      if (fh.receiveUsabilityCard() != null && fh.receiveUsabilityCard().equals(someoneSelf)) {
        accounted++;
      }
    }

    if (accounted > 2) {
      feedback.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[bumFewer].solidifyingLearnerUser(someoneSelf);
      assCollection[bumFewer].doIdentify(alleviate);
      assCollection[bumFewer].fixDissemination(couriers);
      assCollection[bumFewer].primedCellphone(cellphone);
      assCollection[bumFewer].placedWhen(YyyDramatics.generateUnderwayYear());
      assCollection[bumFewer].primedAcquirable(false);
      deliverDocument(assCollection);
      feedback.sendRedirect("benstheatre?message=success");
    }
  }

  private String couriers;

  public synchronized String confidentialityEncoding() {
    String notices[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportion[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sampling = new Random();
    String fc, cc, amplitude, contractual, logarithm, fgf;
    fc = (notices[sampling.nextInt(notices.length)]);
    cc = (proportion[sampling.nextInt(proportion.length)]);
    amplitude = (notices[sampling.nextInt(notices.length)]);
    contractual = (proportion[sampling.nextInt(proportion.length)]);
    logarithm = (notices[sampling.nextInt(notices.length)]);
    fgf = (proportion[sampling.nextInt(proportion.length)]);
    return (fc + cc + amplitude + contractual + logarithm + fgf);
  }

  private String cellphone;

  public synchronized void deliverDocument(Sit[] spots) {

    try {
      FileOutputStream extinctComplaint =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream outgoing = new ObjectOutputStream(extinctComplaint);
      outgoing.writeObject(spots);
      outgoing.close();
      extinctComplaint.close();
    } catch (IOException pro) {
      pro.printStackTrace();
    }
  }

  private String wrangle;
  private Sit[] assCollection;
  private String someoneSelf;
  private static Logger lumberman = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse reactions)
      throws ServletException, IOException {
    PrintWriter impermissible = reactions.getWriter();
    wrangle = (suggestion.getParameter("row"));
    tail = (Integer.parseInt(suggestion.getParameter("seat")));
    bumFewer = (Integer.parseInt(suggestion.getParameter("seatnumber")));
    assCollection = (proofreadComplaint());
    String rentingSection = findTicketHomepage();
    impermissible.println(rentingSection);
  }

  private int bumFewer;

  public synchronized String findTicketHomepage() {
    String cipher = confidentialityEncoding();
    String ajax = "";
    ajax +=
        (ajax
            + ("<!DOCTYPE html>\n"
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
    ajax += (ajax + ("<p class=\"option\">" + wrangle + tail + "</p>"));
    ajax +=
        (ajax
            + ("</div>\n"
                + "      <div class=\"security\">\n"
                + "        <p class=\"heading\">Security Code:</p>"));
    ajax += (ajax + ("<p class=\"option\" data-code=\"" + cipher + "\">" + cipher + "</p>"));
    ajax +=
        (ajax
            + ("</div>\n"
                + "\n"
                + "      <form method=\"post\" action=\"./booking\">\n"
                + "        <input type=\"hidden\" name=\"seat\" value=\""
                + tail
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"row\" value=\""
                + wrangle
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
                + bumFewer
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
    return ajax;
  }

  private int tail;
  private String alleviate;
}
