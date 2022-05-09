package UF2_2_Subprogrames;
import java.util.InputMismatchException;
import java.util.Scanner;

public class asciiArt {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in); //Creem el lector

        boolean Error = true;
        //Aquest while fa que el codi és vagi executant fins que l'usuari introdueix un 0.
        while (Error) {
            try {
                int repeticio;
                //Sol·licitem les vegades que vol mostrar l'ascii a l'usuari
                    System.out.print("Quantes vegades vols mostrar l'Ascii Art(0-100) // 0 = sortir: ");
                    repeticio = lector.nextInt();

                //Aquest if comprova si l'usuari ha introduit un número entre 1-100, i si no ho ha fet mostra un error i torna a sol·licitar el numero de vegades.
                System.out.println();
                if (repeticio < 0 || repeticio > 100){
                    System.out.println("Has de introduir un número entre 1-100!!");
                }else {
                    //Aquest bucle és realitza tantes vegades com ha dit l'usuari
                    for (int i = 0; i < repeticio; i++) {
                        mostraAsciiArt();
                    }
                }

                //Si l'usuari introdueix un 0, el bucle s'acaba i el programa es para.
                if (repeticio == 0){
                    System.out.println();
                    System.out.println("Gracies per utilitzar el programa de ORIOL TORRENT");
                    Error = false;
                }

            }
            //Si l'usuari ha introduit un valor incorrecta, salta aquest error i torna a executar-se el codi.
            catch (InputMismatchException e) {
                System.out.println("Has introduit un valor incorrecta torna-l a introduir-lo:");
                lector.nextLine();
            }
        }

    }

    //Creem un metode que ens permet mostrar l'ascii art.
    static void mostraAsciiArt(){

        System.out.println();
        System.out.println("""
                  //_\\\\_
                 ."\\\\    ".
                /          \\
                |           \\_
                |       ,--.-.)
                 \\     /  o \\o\\
                 /\\/\\  \\    /_/
                  (_.   `--'__)
                   |     .-'  \\
                   |  .-'.     )
                   | (  _/--.-'
                   |  `.___.'
                         (""");

    }

}
