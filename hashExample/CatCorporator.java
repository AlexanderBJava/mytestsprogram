package hashExample;

        import java.util.Comparator;

public class CatCorporator implements Comparator<Cat> {


    @Override
    public int compare(Cat cat1, Cat cat2) {
        //return cat1.getAge()-cat2.getAge();
        return cat1.getName().compareTo(cat2.getName());
    }
}
