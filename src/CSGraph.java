import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class CSGraph extends JPanel {
	public CSGraph() {
		System.out.println("new CSGraph");
	}
	public void Update()
	{
		
	}
	public void AddPoints(double a)
	{
		System.out.println(a);
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
