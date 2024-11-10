package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Sorting;
import adapter2.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(SymptomFactory.createSymptom("tos seca"), 1);
			p.addSymptom(SymptomFactory.createSymptom("fiebre"), 2);
			p.addSymptom(SymptomFactory.createSymptom("diarrea"), 3);
			p.addSymptom(SymptomFactory.createSymptom("disnea"), 4);
			p.addSymptom(SymptomFactory.createSymptom("astenia"), 5);


			Covid19PacientInvertedIteratorAdapter p2 = new Covid19PacientInvertedIteratorAdapter(p);

			Iterator i= Sorting.sortedIterator(p2, new SeverityIndexComparator());

			while(i.hasNext())
				System.out.println(i.next());

		}

	}

