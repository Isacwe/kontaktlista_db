package kontaktlista;

import java.io.Serializable;

public class Kontakt implements Serializable{
	private String förnamn;
	private String efternamn;
	private String telefonnummer;

public Kontakt(String f){
	förnamn = f;
	efternamn = "";
	telefonnummer = "";
                }
public Kontakt(String f, String e){
	förnamn = f;
	efternamn = e;
	telefonnummer = "";
                }
public Kontakt(String f, String e, String t){
	förnamn = f;
	efternamn = e;
	telefonnummer = t;
        }
	public void setTelefonnummer(String t){
		telefonnummer = t;
        }
	public String getFörnamn(){
                return förnamn;
        }
	public String getEfternamn(){
		return efternamn;
        }
        public String getTelefonnummer(){
            return telefonnummer;
        }
}
