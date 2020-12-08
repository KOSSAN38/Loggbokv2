import java.util.Arrays;


public class save {

    Loggbok[] save;

    public void save(Loggbok SaveText) {
        save = Arrays.copyOf(save, save.length + 1);
        save[save.length - 1] = SaveText;
    }

    public Loggbok[] getSave() {
        return save;
    }


}
