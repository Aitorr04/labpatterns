package iterator;

import adapter.InvertedIterator;
import adapter2.Covid19Pacient;
import domain.Symptom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator {

    private Covid19Pacient covid19Pacient;
    int position;

    public Covid19PacientInvertedIteratorAdapter(Covid19Pacient covid19Pacient)
    {
        this.covid19Pacient = covid19Pacient;
        goLast();
    }

    private List<Symptom> getSymptoms()
    {
        return new ArrayList<Symptom>(covid19Pacient.getSymptoms());
    }

    @Override
    public Object previous() {
        Symptom symptom = getSymptoms().get(position);
        position--;
        return symptom;
    }

    @Override
    public boolean hasPrevious() {
        return position >= 0;
    }

    @Override
    public void goLast() {
        position = getSymptoms().size()-1;
    }
}
