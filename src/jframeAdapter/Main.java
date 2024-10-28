package jframeAdapter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(SymptomFactory.createSymptom("s1"), 1);
			p.addSymptom(SymptomFactory.createSymptom("s2"), 2);
			p.addSymptom(SymptomFactory.createSymptom("s3"), 3);
			p.addSymptom(SymptomFactory.createSymptom("s4"), 4);
			p.addSymptom(SymptomFactory.createSymptom("s5"), 5);
			
			
			Covid19PacientModelAdapter pacientModelAdapter=new Covid19PacientModelAdapter(p);        
			
			JFrame j=new JFrame();
			JTable table = new JTable(pacientModelAdapter);
			 j.add(new JScrollPane(table));
	         
		     j.setTitle(p.getName()+"'s symptoms");
		     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		     j.pack();
		     j.setVisible(true);

		}

	}

