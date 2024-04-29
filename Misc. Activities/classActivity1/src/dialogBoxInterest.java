import javax.swing.JOptionPane;
public class dialogBoxInterest {
    public static void main(String[] args) {
        double totalMoney;
        int principal;
        double interestRate;
        int timesCompounded;
        int years;

        principal = Integer.parseInt(JOptionPane.showInputDialog("Enter the principal:"));
        interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate:"));
        interestRate = interestRate / 100;
        timesCompounded = Integer.parseInt(JOptionPane.showInputDialog("Enter number of times compounded a year:"));
        years = Integer.parseInt(JOptionPane.showInputDialog("Enter numbers of years in account:"));
        totalMoney = principal * (Math.pow((1 + (interestRate)/timesCompounded), timesCompounded * years));
        /*
        Can't figure out how to truncate final money amount and output it.
        Currently has lots of decimals
        */
        JOptionPane.showMessageDialog(null, "Total amount is: " + totalMoney);

    }
}
