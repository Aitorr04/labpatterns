package iterator;

import java.util.Iterator;

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
			
			Iterator i=p.iterator();
			while(i.hasNext())
				System.out.println(i.next());

		}

	}

