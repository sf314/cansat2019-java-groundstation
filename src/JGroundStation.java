/*
Java Ground Station
Stephen Flores
CanSat 2018
For all you Windows users out there

Requires RXTX Library for development (see rxtx folder)
Running on Java version 1.8.0_131
*/

// ***** Imports
import java.io.*;
import java.util.*;
import gnu.io.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

// ***** Main Class
public class JGroundStation {

    // ***** Main function
    public static void main(String[] args) {
        System.out.println("JGroundStation: Starting up");

        // Setup main frame and sub-panels
        JFrame mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);

        // Create two subpanels:
        JPanel panel1 = new JPanel();
        JLabel label = new JLabel("Pick me, ei ei!");
        
        label.setForeground(Color.white);
        panel1.setBackground(new Color(28, 28, 34));
        panel1.add(label);
        mainFrame.add(panel1);

        // Make it visible
        mainFrame.setVisible(true);

        // Test array
        CSPort port = new CSPort();
        String[] ports = port.availablePorts();
        System.out.println("Checking available ports");
        for (int i = 0; i < ports.length; i++) {
            System.out.println(ports[i]);
        }
        System.out.println("Done");
    }

    // *****
}
