import java.awt.Color;

import java.awt.*;

import javax.swing.*;

public class janela {

    public static void main(String[] args){

        JLabel label = new JLabel("Pedro pfv tenha misericordia da gente \uD83D\uDC94", JLabel.CENTER);
        label.setFont(new Font("MerriWeather", Font.BOLD, 25));
        label.setForeground(Color.white);

        JFrame janela = new JFrame();
        janela.setSize(700, 700);
        janela.getContentPane().setBackground(new Color(135, 206, 235));
        janela.add(label);
        janela.setVisible(true);

    }
}