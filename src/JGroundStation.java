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

        // Create subpanels:
        JLabel serialLabel = new JLabel("Serial Window");
        serialLabel.setForeground(Color.white);
        
        JTextArea portList = new JTextArea("Available ports:");
        portList.setForeground(Color.white);
        portList.setBackground(new Color(28, 28, 34));
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(28, 28, 34));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(serialLabel);
        panel1.add(portList);
        
        mainFrame.add(panel1);


        // Test array
        CSPort port = new CSPort();
        String[] ports = port.availablePorts();
        System.out.println("Checking available ports");
        String portStrings = "";
        for (int i = 0; i < ports.length; i++) {
            System.out.println(ports[i]);
            portStrings = portStrings + ports[i] + "\n";
        }
        portList.setText(portList.getText() + "\n" + portStrings);
        
        // Make it visible
        mainFrame.setVisible(true);
        
        System.out.println("Done");
    }

    // *****
}
