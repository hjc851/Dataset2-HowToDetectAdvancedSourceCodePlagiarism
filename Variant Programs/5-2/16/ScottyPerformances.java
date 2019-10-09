import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ScottyPerformances extends javax.servlet.http.HttpServlet {
  private Ass[] bunsNumber;
  private java.lang.String word;
  private static java.util.logging.Logger woodcutter =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest appeals, HttpServletResponse responsive)
      throws ServletException, IOException {
    java.io.PrintWriter impermissible = responsive.getWriter();
    word = appeals.getParameter("message");

    if (word != null) {

      if (word.equals("success")) {
        word = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (word.equals("limitexceeded")) {
        word =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      word = "";
    }
    bunsNumber = new Ass[64];
    java.io.File rentingDocumentation =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentingDocumentation.exists()) {
      bunsNumber = writtenFilename();
    } else {

      for (int i = 0; i < 64; i++) {
        Ass babyBum = new Ass();
        bunsNumber[i] = babyBum;
      }
      salvagingSubmitting(bunsNumber);
    }
    java.lang.String apartmentLayout = bringAbodeWebpage();
    impermissible.println(apartmentLayout);
  }

  public Ass[] writtenFilename() {

    try {
      Ass[] vacancies;
      java.io.FileInputStream proponentsDatabase =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nih = new java.io.ObjectInputStream(proponentsDatabase);
      vacancies = (Ass[]) nih.readObject();
      nih.close();
      proponentsDatabase.close();
      return vacancies;
    } catch (java.io.IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      woodcutter.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void salvagingSubmitting(Ass[] elections) {

    try {
      java.io.FileOutputStream impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream quenched = new java.io.ObjectOutputStream(impermissibleArchiving);
      quenched.writeObject(elections);
      quenched.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  public java.lang.String bringAbodeWebpage() {
    java.lang.String ajax =
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Theatre Booking System</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"home\">\n"
            + "    <header>\n"
            + "      <h1>Theatre Booking System</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <p class=\"message\">"
            + word
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + comeLatestClip()
            + " (DD-MM-YY SS-MM-HH)</p>\n"
            + "      </div>\n"
            + "      <div class=\"instructions\">\n"
            + "        <p>Select a seat below to place your booking...</p>\n"
            + "      </div>\n"
            + "      <table>\n"
            + "        <thead>\n"
            + "          <tr>\n"
            + "            <td colspan=\"8\">\n"
            + "              <p>Stage</p>\n"
            + "            </td>\n"
            + "          </tr>\n"
            + "        </thead>\n"
            + "        <tbody>";
    String[] meleeSpectrum = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int sternProportion = 0;

    for (int i = 0; i < 8; i++) {
      ajax += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String counted = "";

        if (!bunsNumber[sternProportion].isAccessible()) {
          counted = " booked";
        }

        ajax +=
            "<td class=\"seat"
                + counted
                + "\" data-user=\""
                + bunsNumber[sternProportion].fetchEmployeePictures()
                + "\" data-time=\""
                + bunsNumber[sternProportion].bringMeter()
                + "\" data-row=\""
                + meleeSpectrum[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + sternProportion
                + "\">\n"
                + "  <p>"
                + meleeSpectrum[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        sternProportion++;
      }
      ajax += "</tr>\n";
    }
    ajax +=
        "</tbody>\n"
            + "      </table>\n"
            + "      <div class=\"legend\">\n"
            + "        <div class=\"available\">\n"
            + "          <p>Available</p>\n"
            + "        </div>\n"
            + "        <div class=\"booked\">\n"
            + "          <p>Booked</p>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <div id=\"popup\">\n"
            + "      <div class=\"inner\">\n"
            + "        <h3>This seat is already booked.</h3>\n"
            + "        <p>Booked By:<span class=\"booked-name\"></span></p>\n"
            + "        <p>Booked On:<span class=\"booked-time\"></span></p>\n"
            + "        <div class=\"close\">\n"
            + "          <button>OK</button>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>";
    return ajax;
  }

  public static java.lang.String comeLatestClip() {
    java.text.SimpleDateFormat babyUpdatedCompress =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date due = new java.util.Date();
    java.lang.String crossbredSeeMeter = babyUpdatedCompress.format(due);
    return crossbredSeeMeter;
  }
}
