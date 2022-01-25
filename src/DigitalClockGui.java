import javax.swing.*;


public class DigitalClockGui extends JFrame{
    private JPanel panel1;
    private JLabel clockToDisplay;


    DigitalClockGui(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


    public void setTime() throws InterruptedException {
        GettingTime gettingTime = new GettingTime();
        while (true) {
            clockToDisplay.setText(gettingTime.displayTime());
            Thread.sleep(1000);
        }
    }


}
