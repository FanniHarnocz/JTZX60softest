package jtzx60sweng.junit;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListCanini {

    private ArrayList<String> canini = new ArrayList<String>();

    public void add (String dog){
        canini.add(dog);
    }

    public void remove(String dog){
        if(!canini.contains(dog)){
            throw new NoSuchElementException();
        }
        canini.remove(dog);
    }

    public int size() {
        return canini.size();
    }

    public boolean isEmpty(){
        return canini.isEmpty();
    }

    public void removeAll(){
        canini.clear();
    }
}