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
        CSSerialPanel serialPanel = new CSSerialPanel();
        serialPanel.setBackground(new Color(28, 28, 34));
        
        CSGraphPanel graphPanel = new CSGraphPanel();
        serialPanel.setBackground(new Color(48, 48, 54));
        
        mainFrame.setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.X_AXIS));
        mainFrame.add(serialPanel);
        mainFrame.add(graphPanel);
        
        // Make it visible
        mainFrame.setVisible(true);
        
        System.out.println("Done");
    }

    // *****
}
