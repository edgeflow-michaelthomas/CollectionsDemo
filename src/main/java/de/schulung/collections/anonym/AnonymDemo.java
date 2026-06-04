package de.schulung.collections.anonym;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AnonymDemo {
    public static void main(String[] args) {

        // Etwas Java GUI zu Demozwecken
        JFrame frame = new JFrame("Anonym Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton anonymButton = new JButton("Irgendwas");
        frame.add(anonymButton);
        frame.setLayout(new FlowLayout());
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // anonyme Klasse mit mehreren Methoden
        anonymButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Passiert, wenn der Mauszeiger über den Button fährt
                System.out.println("Mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        // Lambda: Functional Interface (mit genau einer Methode) als Lambda-Ausdruck implementiert
        // Wäre als anonyme Klasse oder eigenständige Klasse genauso richtig
        // Methode wird aufgerufen, wenn der Button angeklickt wird
        anonymButton.addActionListener( e -> System.out.println("Irgendwas Button clicked"));
    }
}
