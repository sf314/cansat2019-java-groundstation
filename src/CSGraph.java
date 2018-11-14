import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class CSGraph extends JPanel {
	private int lineWidth;
	private Queue<Double> pointQueue = new LinkedList<Double>();
	private String name;
	private String units;
	public CSGraph(String name) {
		lineWidth = 3;
		units = "";
		this.name = name;
		JLabel lab = new JLabel(name); this.add(lab);
		System.out.println("new CSGraph");
		GenerateTestPoints();
		GenerateTestPoints();
		System.out.println(pointQueue.size());
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i = 0; i<pointQueue.size(); i++)
		{
		g.fillOval(i, pointQueue.poll().intValue(), lineWidth, lineWidth);
		}
	}
	public void AddPoints(double a){
		System.out.println(a);
		pointQueue.add(a);
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
