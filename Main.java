import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Caja<String> miCaja = new Caja<>(new String [10]);
        System.out.println("------------C A J A   C O N   G E N E R I C O S------------");
    miCaja.add(0, "Hello");
    miCaja.add(1, "Adios");
    miCaja.add(2, "Hola");

        System.out.println(miCaja);
        String temp = miCaja.get(0);

        System.out.println("----------C A J A   S I N    G E N E R I C O S----------------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0, "Holaa");
        cajaSin.add(1, "Hii");
        cajaSin.add(2, "Bye");
        System.out.println(cajaSin);
    String temp2 = (String) cajaSin.get(0);

        System.out.println("------------C O M I D A------------");

        Caja<Comida> cajacomida = new Caja<>(new Comida[10]);
        cajacomida.add(0, new Comida("Yogurt", true));
        System.out.println(cajacomida.get(0));

        System.out.println("-----A R R A Y   L I S T --------");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Manzana", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(9));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Yogurt", true));
        comidas2.add(new Comida("Danonino", true));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Beef steack", false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Fresa", false));
comidas2.add(3, new Comida("Naranja", false));
        System.out.println("---------F I N A L----------");
        for (Comida comida : comidas2){
            System.out.println(comida);
        }
    }
}