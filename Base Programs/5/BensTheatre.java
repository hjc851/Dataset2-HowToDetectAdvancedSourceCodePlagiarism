import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: SENG2050
 * UID: 3063467
 * Assignment 1
 * BensTheatre Class
 * BensTheatre.java
 * Last Modified: 22/08/16
 */

@WebServlet(urlPatterns = {"/benstheatre"})
public class BensTheatre extends HttpServlet {
    // Members
    private Seat[] seatArray;
    private String message;

    // Logger
    private static Logger logger = Logger.getLogger("bensTheatre");

    /*
     * doGet - handles GET requests to load home page
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Init writer
        PrintWriter out = response.getWriter();

        // Check for any messages
        message = request.getParameter("message");
        if (message != null) {
            if (message.equals("success")) {
                message = "Seat was successfully booked.  We look forward to seeing you on the night.";
            } else if (message.equals("limitexceeded")) {
                message = "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
            }
        } else {
            message = "";
        }

        // Init our seat array
        seatArray = new Seat[64];

        // Load data file, or create if its not there
        File bookingFile = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
        if (bookingFile.exists()) {
            // File exists, so load data in
            seatArray = readFile();
        }else{
            // Create a new file
            for (int i = 0; i < 64; i++) {
                Seat newSeat = new Seat();
                seatArray[i] = newSeat;
            }
            // Now save it
            saveFile(seatArray);
        }

        // Now we have the file sorted, look at loading the first page
        String homePage = getHomePage();
        out.println(homePage);
    }

    /**
     * Loads in a file from storage
     * @return
     */
    public Seat[] readFile()
    {
        try
        {
            Seat[] seats;
            FileInputStream inFile = new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));// Read serial file.
            ObjectInputStream in = new ObjectInputStream(inFile);// input the read file.
            seats = (Seat[]) in.readObject();// allocate it to the object file already instanciated.
            in.close();//closes the input stream.
            inFile.close();//closes the file data stream.
            return seats;
        }catch(IOException i)//exception stuff
        {
            logger.info(i.toString());
            return null;
        }catch(ClassNotFoundException c)//more exception stuff
        {
            logger.info(c.toString());
            c.printStackTrace();
            return null;
        }
    }

    /**
     * Saves seat array to server storage
     * @param seats
     */
    public void saveFile(Seat[] seats) {
        try {
            FileOutputStream outFile = new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));//creates a card serial file in output stream
            ObjectOutputStream out = new ObjectOutputStream(outFile);//routs an object into the output stream.
            out.writeObject(seats);// we designate our array of cards to be routed
            out.close();// closes the data paths
            outFile.close();// closes the data paths
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Generates HTML content for the home page
     * @return
     */
    public String getHomePage() {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=utf-8>\n" +
                "    <title>Theatre Booking System</title>\n" +
                "    <!--[if IE]>\n" +
                "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n" +
                "      </script>\n" +
                "    <![endif]-->\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "  </head>\n" +
                "  <body class=\"home\">\n" +
                "    <header>\n" +
                "      <h1>Theatre Booking System</h1>\n" +
                "    </header>\n" +
                "    <article>\n" +
                "      <p class=\"message\">" + message + "</p>\n" +
                "      <h2>Seats</h2>\n" +
                "      <div class=\"time\">\n" +
                "        <p>" + getCurrentTime() + " (DD-MM-YY SS-MM-HH)</p>\n" +
                "      </div>\n" +
                "      <div class=\"instructions\">\n" +
                "        <p>Select a seat below to place your booking...</p>\n" +
                "      </div>\n" +
                "      <table>\n" +
                "        <thead>\n" +
                "          <tr>\n" +
                "            <td colspan=\"8\">\n" +
                "              <p>Stage</p>\n" +
                "            </td>\n" +
                "          </tr>\n" +
                "        </thead>\n" +
                "        <tbody>";
        // Now Load the seat array
        String[] rowArray = {"A", "B", "C", "D", "E", "F", "G", "H"};

        int seatNumber = 0;
        for (int i = 0; i < 8; i++) {
            html += "<tr>\n";
            for (int j = 0; j < 8; j++) {
                String booked = "";
                if (!seatArray[seatNumber].isAvailable()) {
                    booked = " booked";
                }
                html += "<td class=\"seat" + booked +
                        "\" data-user=\"" + seatArray[seatNumber].getUserId() +
                        "\" data-time=\"" + seatArray[seatNumber].getTime() +
                        "\" data-row=\"" + rowArray[i] +
                        "\" data-seat=\"" + (j+1) +
                        "\" data-seatNumber=\"" + seatNumber +
                        "\">\n" +
                        "  <p>" + rowArray[i] + (j+1) + "</p>\n" +
                        "</td>";

                seatNumber++;
            }
            html += "</tr>\n";
        }

        html += "</tbody>\n" +
                "      </table>\n" +
                "      <div class=\"legend\">\n" +
                "        <div class=\"available\">\n" +
                "          <p>Available</p>\n" +
                "        </div>\n" +
                "        <div class=\"booked\">\n" +
                "          <p>Booked</p>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </article>\n" +
                "    <footer>\n" +
                "      <div class=\"author\">\n" +
                "        <p>&copy; Ben Sutter 2016</p>\n" +
                "        <p>c3063467</p>\n" +
                "      </div>\n" +
                "    </footer>\n" +
                "    <div id=\"popup\">\n" +
                "      <div class=\"inner\">\n" +
                "        <h3>This seat is already booked.</h3>\n" +
                "        <p>Booked By:<span class=\"booked-name\"></span></p>\n" +
                "        <p>Booked On:<span class=\"booked-time\"></span></p>\n" +
                "        <div class=\"close\">\n" +
                "          <button>OK</button>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <script src=\"js/jquery.min.js\"></script>\n" +
                "    <script src=\"js/script.js\"></script>\n" +
                "  </body>\t\n" +
                "</html>";

        return html;
    }

    /**
     * Calculates the current time in required format and returns as a String
     * @return
     */
    public static String getCurrentTime(){
        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
        Date date = new Date();
        String curDateTime = newDateFormat.format(date);
        return curDateTime;
    }
}