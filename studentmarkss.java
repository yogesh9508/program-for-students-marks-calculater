import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentmarkss
{
    private JTextField txtstname;
    private JTextField txtmarks1;
    private JTextField txtmarks2;
    private JTextField txtmarks4;
    private JTextField txttotal;
    private JTextField txtavg;
    private JTextField txtgrade;
    private JTextField txtmarks3;
    private JButton calculateButton;
    private JPanel main;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("studentmarkss");
        frame.setContentPane(new studentmarkss().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public studentmarkss() {
        calculateButton.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                int m1, m2, m3, m4, total;
                double avg;
                m1 = Integer.parseInt(txtmarks1.getText());
                m2 = Integer.parseInt(txtmarks2.getText());
                m3 = Integer.parseInt(txtmarks3.getText());
                m4 = Integer.parseInt(txtmarks4.getText());
                total = m1 + m2 + m3 + m4;
                txttotal.setText(String.valueOf(total));
                avg = total / 4;
                txtavg.setText(String.valueOf(avg));
                if (avg > 50) {
                    txtgrade.setText(("pass"));
                } else {
                    txtgrade.setText(("fail"));
                }
            }
        });
    }
}

