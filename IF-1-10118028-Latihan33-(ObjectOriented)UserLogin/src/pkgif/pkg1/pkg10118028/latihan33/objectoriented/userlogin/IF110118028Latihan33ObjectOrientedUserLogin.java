/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan33.objectoriented.userlogin;
import java.util.Scanner;
/**
 *
 * @author User
 *  NAMA      : Surya Fakhriy Hasbi
    KELAS     : IF-01 2018
    NIM       : 10118028
    DESKRIPSI : (Object Oriented) UserLogin

 */
public class IF110118028Latihan33ObjectOrientedUserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);
    }
    
}
