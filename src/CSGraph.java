import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class CSGraph extends JPanel {
	
	private int lineWidth;
	private LinkedList<Double> pointList = new LinkedList<Double>();
	private int maxPoints;
	private String name;
	private String units;
	
	public CSGraph(String name) {
		this.maxPoints = 200;

		this.lineWidth = 3;
		this.units = "";
		this.name = name;
		JLabel lab = new JLabel(name); this.add(lab);
		System.out.println("new CSGraph");
		GenerateTestPoints();
		System.out.println(pointList.size());
	}
	
	public void paintComponent(Graphics g)
	{
		System.out.println("Repainting graph " + name + " with " + pointList.size() + " points");
		super.paintComponent(g);

		// Calculate max value (for height adjustment)
		int maxVal = 5;
		for (int i = 0; i < pointList.size(); i++) {
			if (pointList.get(i).intValue() > maxVal) {
				maxVal = pointList.get(i).intValue();
			}
		}

		// Get current width/height
		int width = this.getWidth();
		int height = this.getHeight();
		int numPoints = pointList.size();

		for(int i = 0; i<pointList.size(); i++)
		{
			g.setColor(new Color(50, 200, 50));

			// Map values to coordinates
			int x = i * width / (numPoints - 1);
			int y = pointList.get(i).intValue() * height / maxVal;
			g.fillOval(x, y, lineWidth, lineWidth);
		}
		
		this.setBackground(new Color(42, 42, 50));
	}
	
	public void AddPoints(double a){
		// System.out.println(a);
		pointList.add(a);
		if (pointList.size() > this.maxPoints) {
			pointList.remove(); // Remove head of list
		}
	}
	
	public void GenerateTestPoints(){		
		for(int i=0;i<200;i++){
		double temp=(Math.random()*100)+1;	
		AddPoints(temp);
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
		JLabel lab = new JLabel(name); this.add(lab);
	}
	
	public String getUnits(){
		return units;
	}
	
	public void setUnits(String units){
		this.units = units;
	}
	
	public int getLineWidth() {
		return lineWidth;
	}
	
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}
}
