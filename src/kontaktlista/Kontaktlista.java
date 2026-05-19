package kontaktlista;
import java.util.ArrayList;
import java.util.Scanner;
public class Kontaktlista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Kontakt> konLista = new ArrayList<>();
        FileManager Fil = new FileManager();
        int mer =1;
        int meny;
        do{
            meny = meny(input);
            switch(meny){
                case 1:
                     nyKontakt(konLista, input);
                     break;
                case 2:
                    fNamn(konLista);
                    break;
                case 3:
                    eNamn(konLista);
                    break;
                case 4:
                    Fil.saveToFile(konLista);
                    break;
                case 5:
                    konLista = Fil.readFromFile();
                    fNamn(konLista);
                    break;
                case 0:
                    mer = 0;
                    break;
            }
        } while(mer!=0);
    }
    public static int meny(Scanner input){
        System.out.println("");
        System.out.println("1. Ny kontakt");
        System.out.println("2. Skriv ut förnamn först");
        System.out.println("3. Skriv ut efternamn först");
        System.out.println("4. Spara till fil");
        System.out.println("5. Hämta från fil");
        System.out.println("0. Avsluta");
        int meny = input.nextInt();
        input.nextLine();
        return meny;
    }
    public static void nyKontakt(ArrayList<Kontakt> konLista, Scanner input){
        System.out.print("Skriv ditt förnamn: ");
        String förnamn = input.nextLine();
        System.out.print("Skriv ditt efternamn: ");
        String efternamn = input.nextLine();
        System.out.print("Skriv ditt telefonnummer: ");
        String telefonnummer = input.nextLine();
        Kontakt kon = new Kontakt(förnamn, efternamn, telefonnummer);
        konLista.add(kon);
    }
    public static void fNamn(ArrayList<Kontakt> konLista){
        for (int f = 0; f < konLista.size(); f++) {
        System.out.print((konLista.get(f).getFörnamn()+"\t"+konLista.get(f).getEfternamn()+"\t"+konLista.get(f).getTelefonnummer()+"\n"));
        }
        
    }
    public static void eNamn(ArrayList<Kontakt> konLista){
        for (int e = 0; e < konLista.size(); e++) {
            System.out.print((konLista.get(e).getEfternamn()+"\t"+konLista.get(e).getFörnamn()+"\t"+konLista.get(e).getTelefonnummer()+"\n"));
        }
    }

    
}
