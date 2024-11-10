package iterator;

import domain.Symptom;

import java.util.Comparator;

public class SeverityIndexComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Symptom symptom1 = (Symptom)o1;
        Symptom symptom2 = (Symptom)o2;
        return symptom1.getSeverityIndex() - symptom2.getSeverityIndex();
    }
}
