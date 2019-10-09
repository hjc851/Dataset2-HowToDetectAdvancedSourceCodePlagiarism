import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AstonArtsAdvance extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger thermometer =
      java.util.logging.Logger.getLogger("bensTheatre");
  public int tushFigure;

  public synchronized Derriere[] perusedArchives() {

    try {
      java.io.FileInputStream withoutRegister;
      java.io.ObjectInputStream nii;
      Derriere[] benches;
      withoutRegister =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new java.io.ObjectInputStream(withoutRegister);
      benches = (Derriere[]) nii.readObject();
      nii.close();
      withoutRegister.close();
      return benches;
    } catch (java.io.IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      thermometer.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void salveDocumentation(Derriere[] space) {

    try {
      java.io.FileOutputStream tabuInitiate;
      java.io.ObjectOutputStream unstylish;
      tabuInitiate =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unstylish = new java.io.ObjectOutputStream(tabuInitiate);
      unstylish.writeObject(space);
      unstylish.close();
      tabuInitiate.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public synchronized java.lang.String insecureCodex() {
    java.lang.String cards[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String amounts[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random serendipity;
    java.lang.String fc, c2, interval, c1, b, ses;
    serendipity = new java.util.Random();
    fc = cards[serendipity.nextInt(cards.length)];
    c2 = amounts[serendipity.nextInt(amounts.length)];
    interval = cards[serendipity.nextInt(cards.length)];
    c1 = amounts[serendipity.nextInt(amounts.length)];
    b = cards[serendipity.nextInt(cards.length)];
    ses = amounts[serendipity.nextInt(amounts.length)];
    return fc + c2 + interval + c1 + b + ses;
  }

  public java.lang.String cellphone;
  public java.lang.String customerCaller;
  public java.lang.String messaging;
  public java.lang.String accost;

  public synchronized java.lang.String canLogScreen() {
    java.lang.String laws;
    java.lang.String bitmap;
    laws = insecureCodex();
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
    bitmap += "<p class=\"option\">" + dispute + behind + "</p>";
    bitmap +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    bitmap += "<p class=\"option\" data-code=\"" + laws + "\">" + laws + "</p>";
    bitmap +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + dispute
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tushFigure
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

  public java.lang.String dispute;

  public synchronized void doPost(HttpServletRequest decision, HttpServletResponse responsive)
      throws ServletException, IOException {
    int arranged;
    dispute = decision.getParameter("row");
    behind = java.lang.Integer.parseInt(decision.getParameter("seat"));
    tushFigure = java.lang.Integer.parseInt(decision.getParameter("seatnumber"));
    customerCaller = decision.getParameter("userid");
    accost = decision.getParameter("address");
    messaging = decision.getParameter("email");
    cellphone = decision.getParameter("phone");
    buttocksMultitude = perusedArchives();
    arranged = 0;
    for (Derriere fh : buttocksMultitude) synx140(fh, arranged);

    if (arranged > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttocksMultitude[tushFigure].fitConsumerIdem(customerCaller);
      buttocksMultitude[tushFigure].fitPlow(accost);
      buttocksMultitude[tushFigure].readyMails(messaging);
      buttocksMultitude[tushFigure].doLaptop(cellphone);
      buttocksMultitude[tushFigure].rigidAmount(RemoTheater.conveyFormerAmount());
      buttocksMultitude[tushFigure].arrangeUncommitted(false);
      salveDocumentation(buttocksMultitude);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse responds)
      throws ServletException, IOException {
    java.io.PrintWriter kayoed;
    java.lang.String recordingSummary;
    kayoed = responds.getWriter();
    dispute = asks.getParameter("row");
    behind = java.lang.Integer.parseInt(asks.getParameter("seat"));
    tushFigure = java.lang.Integer.parseInt(asks.getParameter("seatnumber"));
    buttocksMultitude = perusedArchives();
    recordingSummary = canLogScreen();
    kayoed.println(recordingSummary);
  }

  public Derriere[] buttocksMultitude;
  public int behind;

  private synchronized void synx140(Derriere fh, int arranged)
      throws ServletException, IOException {

    if (fh.makeUsernameDimidiate() != null && fh.makeUsernameDimidiate().equals(customerCaller)) {
      arranged++;
    }
  }
}
