import java.util.Scanner;

/**
 * Created by adm on 22.02.2015.
 */
public class Notebook {
    Scanner sc = new Scanner(System.in);

    private int cpu, hdd, rom;
    private String model;

    public Notebook() {   }

    public Notebook (int cpu, int hdd, int rom, String model) {
        this.model = model;
        this.cpu = cpu;
        this.hdd = hdd;
        this.rom = rom;
    }

    public int getModel() {
        System.out.println("Set the Model ");
        this.model = sc.nextLine();
        return rom;
    }

    public int getCpu() {
        System.out.println("Set the cpu ");
        this.cpu = sc.nextInt();
        return cpu;
    }

    public int getHdd() {
        System.out.println("Set the hdd ");
        this.hdd = sc.nextInt();
        return hdd;
    }

    public int getRom() {
        System.out.println("Set the rom ");
        this.rom = sc.nextInt();
        return rom;
    }



    public static void compare_cpu(Notebook n1, Notebook n2) {
        if(n1.cpu > n2.cpu)
            System.out.println(n1.model+ " Has better cpu than " + n2.model);
        if(n1.cpu == n2.cpu)
            System.out.println(n1.model+ " Has same cpu as " + n2.model);
        if(n1.cpu < n2.cpu)
            System.out.println(n1.model+ " Has worse cpu than " + n2.model);
    }
    public static void compare_hdd(Notebook n1, Notebook n2) {
        if(n1.hdd > n2.hdd)
            System.out.println(n1.model+ " Has better hdd than " + n2.model);
        if(n1.hdd == n2.hdd)
            System.out.println(n1.model+ " Has same hdd as " + n2.model);
        if(n1.hdd < n2.hdd)
            System.out.println(n1.model+ " Has worse hdd than " + n2.model);
    }
    public static void compare_rom(Notebook n1, Notebook n2) {
        if(n1.rom > n2.rom)
            System.out.println(n1.model+ " Has better rom than " + n2.model);
        if(n1.rom == n2.rom)
            System.out.println(n1.model+ " Has same rom as " + n2.model);
        if(n1.rom < n2.rom)
            System.out.println(n1.model+ " Has worse rom than " + n2.model);
    }

}
