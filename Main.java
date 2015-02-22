/**
 * Created by adm on 22.02.2015.
 */
public class Main {
    public static void main(String [] args) {

        Notebook Acer = new Notebook(1500, 500, 3, "Acer");
        Notebook Lenovo = new Notebook(2000, 750, 3, "Lenovo");
        Notebook Dell = new Notebook();

        Dell.getModel();
        Dell.getCpu();
        Dell.getRom();
        Dell.getHdd();

        Notebook.compare_cpu(Acer, Lenovo);
        Notebook.compare_rom(Acer, Lenovo);
        Notebook.compare_hdd(Acer, Lenovo);

        Notebook.compare_cpu(Acer, Dell);
        Notebook.compare_rom(Acer, Dell);
        Notebook.compare_hdd(Acer, Dell);




    }
}
