import javax.swing.*;
import java.awt.event.*;

public class CongGUI extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;

    public CongGUI() {
        setTitle("Cộng hai số");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblSo1 = new JLabel("Số 1:");
        lblSo1.setBounds(30, 30, 100, 25);
        add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(100, 30, 150, 25);
        add(txtSo1);

        JLabel lblSo2 = new JLabel("Số 2:");
        lblSo2.setBounds(30, 70, 100, 25);
        add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(100, 70, 150, 25);
        add(txtSo2);

        JButton btnTinh = new JButton("Tính");
        btnTinh.setBounds(30, 110, 100, 30);
        btnTinh.addActionListener(e -> tinhTong());
        add(btnTinh);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(30, 160, 220, 25);
        txtKetQua.setEditable(false);
        add(txtKetQua);
    }

    private void tinhTong() {
        try {
            int a = Integer.parseInt(txtSo1.getText());
            int b = Integer.parseInt(txtSo2.getText());
            int kq = a + b;
            txtKetQua.setText("Kết quả: " + kq);
        } catch (NumberFormatException e) {
            txtKetQua.setText("Lỗi: Nhập số không hợp lệ");
        }
    }
}
