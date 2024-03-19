//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args)
    {
        Perso perso = new Perso("Rapa", 10, 2, 8);
        Perso perso1 = new Perso("lucky", 100, 0,100);
        System.out.println(perso.Description());
        System.out.println("\n\n"+perso1.Description());
    }
}