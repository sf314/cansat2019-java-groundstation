import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class CSGraph extends JPanel {
	private Queue<Double> pointQueue = new LinkedList<Double>();
	public CSGraph() {
		System.out.println("new CSGraph");
		GenerateTestPoints();
		GenerateTestPoints();
		System.out.println(pointQueue.size());
	}
	public void Update()
	{
		
	}
	public void AddPoints(double a)
	{
		System.out.println(a);
		pointQueue.add(a);
		if (pointQueue.size()>200) {
			pointQueue.remove();
		}
	}
	public double Map(double b)
	{
		return 0.0;
	}
	public void Draw()
	{
		
	}
	public void GenerateTestPoints()
	{		
		for(int i=0;i<50;i++)
		{
		double temp=(Math.random()*100)+1;	
		AddPoints(temp);
		}
	}
}
