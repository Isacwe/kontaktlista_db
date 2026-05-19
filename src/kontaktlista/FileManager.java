package kontaktlista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManager {
public void saveToFile(ArrayList<Kontakt> list){
    try{
    FileOutputStream fileOut = new FileOutputStream("savedKontaktLista.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(list);
    out.flush();
    out.close();
    fileOut.close();}
    catch(IOException ex){
        System.out.println("Något gick fel med att spara...");
    }
    
}
public ArrayList<Kontakt> readFromFile(){
    ArrayList<Kontakt> list=null;
    try{
    FileInputStream fileIn = new FileInputStream("savedKontaktLista.ser");
    ObjectInputStream oin = new ObjectInputStream(fileIn);
    list = (ArrayList)oin.readObject();
    oin.close();
    fileIn.close();
    }
    catch(IOException ex){
        System.out.println("Något gick fel med att läsa filen...");
    }
    catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

    return list;
}
}