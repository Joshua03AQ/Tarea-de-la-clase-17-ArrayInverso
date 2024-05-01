import java.util.Scanner;
//Nombre: Josua Rennier Avila Quintanilla
//N° de carné: 2024-1381U
public class ArrayInverso {
    public static Scanner sc = new Scanner(System.in);
    public static int tam = 0;
    public static void main(String[] args) {
        boolean continuar = true;
        do {
        try {
            System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 2");
            tam = sc.nextInt();
            continuar = (tam >= 2 && tam <= 16)?false:true;
        } catch (Exception e) {
             System.out.println(e);
             System.out.println("Ingrese valores numericos");
             sc.nextLine();
            }
        } while (continuar);
          int array[] = llenado();
          System.out.println("Mostrar");
          mostrar(array);
          System.out.println("Inverso de los numeros ingresados");
          inverso(array);
    }
    public static int[] llenado(){
        int[] arreglo = new int[tam];
        boolean repetir = true;
        do {
            try {
                for (int i = 0; i < arreglo.length; i++) {
                        System.out.println("Ingrese el valor ["+i+"]");
                    arreglo[i] = sc.nextInt();
                    repetir = (arreglo[i]>=tam)?false:true;
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores numericos");
                sc.nextLine();
            }
        } while (repetir);
        return arreglo;
    }
    public static void mostrar(int[]a){
        for (int i : a) {
            System.out.println(i);
        }
    }
    public static void inverso(int[]Inv){
        
        for (int i = Inv.length - 1; i >= 0; i--) {
            System.out.println(Inv[i]);
        }
    }
}