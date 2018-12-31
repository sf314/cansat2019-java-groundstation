
// ***** Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.LinkedList;


public class CSGraphPanel extends JPanel {
    // Data vars 
    int numGraphs = 8;
    LinkedList<CSGraph> graphList = new LinkedList<CSGraph>();
    String tempName;
    CSGraph graph;

    // Constructor 
    public CSGraphPanel() {
        // Initialize
    	super();
    	for(int i = 0; i < numGraphs; i++) {
    		tempName = ("Graph " + Integer.toString((i+1)));
    		graph = new CSGraph(tempName);
            graph.GenerateTestPoints(); // For testing
    		graph.setVisible(true);
    		graphList.add(graph);
    	}

        // Add subpanels with layout
        this.setLayout(new GridLayout(4, 2, 25, 25));
        while(!graphList.isEmpty()) {
        	this.add(graphList.poll());
        }
        
        // Assign colour
        this.setBackground(new Color(48, 48, 54));
    }
    
    // Functions
    
}