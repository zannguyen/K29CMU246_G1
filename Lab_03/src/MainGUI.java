import javax.swing.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    public MainGUI() {
        setTitle("Chương trình tính toán");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton btnCong = new JButton("Cộng");
        btnCong.setBounds(50, 50, 120, 30);
        btnCong.addActionListener(e -> new CongGUI().setVisible(true));
        add(btnCong);

        JButton btnTru = new JButton("Trừ");
        btnTru.setBounds(200, 50, 120, 30);
        btnTru.addActionListener(e -> new TruGUI().setVisible(true));
        add(btnTru);

        JButton btnNhan = new JButton("Nhân");
        btnNhan.setBounds(50, 100, 120, 30);
        btnNhan.addActionListener(e -> new NhanGUI().setVisible(true));
        add(btnNhan);

        JButton btnChia = new JButton("Chia");
        btnChia.setBounds(200, 100, 120, 30);
        btnChia.addActionListener(e -> new ChiaGUI().setVisible(true));
        add(btnChia);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainGUI().setVisible(true);
        });
    }
}