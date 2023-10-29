import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sam
 */
public class StopwatchSwing extends JFrame implements ActionListener, Runnable {
    private JPanel panel;
    private JLabel timeDisplay;
    private JButton startButton, stopButton, resetButton;
    private int hours, minutes, seconds, milliseconds;
    private String timeString;
    private boolean isRunning;

    public StopwatchSwing() {
        isRunning = false;
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 6, 10));
        hours = minutes = seconds = milliseconds = 0;
        timeString = "00 : 00 : 00 : 000";
        timeDisplay = new JLabel(timeString);
        panel.add(timeDisplay);

        startButton = new JButton("Start");
        startButton.addActionListener(this);
        panel.add(startButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        panel.add(resetButton);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        panel.add(stopButton);

        add(panel);

        new Thread(this, "StopWatch").start();

        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);// Ensures that the gui is not resizable ever since vs code was used therefore
                            // if the screen is maximised the gui might be ugly
        setLocationRelativeTo(null); // Makes sure that the gui is always displayed in the center evemn and then the
                                     // user can change its position

    }

    public void resetTime() {
        try {
            Thread.sleep(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        hours = minutes = seconds = milliseconds = 0; // When the reset button is pressed then it sets the timer back to
                                                      // zerooo
    }

    public void updateTime() {
        milliseconds++;

        if (milliseconds == 500) { // used 500 milliseconds because 1000 mili seconds was way too slow.
            milliseconds = 0;
            seconds++;

            if (seconds == 60) {
                seconds = 0;
                minutes++;

                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
            }
        }
    }

    public void updateDisplay() {
        timeString = String.format("%02d : %02d : %02d : %03d", hours, minutes, seconds, milliseconds);
        timeDisplay.setText(timeString); // Update the display
    }

    public void run() {
        while (isRunning) {
            try {
                Thread.sleep(1);
                updateTime();
                updateDisplay();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            isRunning = true;
            new Thread(this, "StopWatch").start();
        }

        if (e.getSource() == resetButton) {
            isRunning = false;
            resetTime();
            updateDisplay();
        }

        if (e.getSource() == stopButton) {
            isRunning = false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StopwatchSwing());
    }
}
