package payrollmanagementsystsem;

public class Hi {
    public static void main(String[] args) {

        System.out.println("HI MAIN METHOD IS RUNNING");

        javax.swing.SwingUtilities.invokeLater(() -> {
            LOGIN login = new LOGIN();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        });
    }
}