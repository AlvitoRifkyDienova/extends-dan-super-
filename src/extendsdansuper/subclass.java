/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendsdansuper;

//subclass
public class subclass extends induk{
   
    void induk(){
        //menmpilkan nilai value dari variabel nama,umur,dan kelas yang ada di induk
        System.out.println("Nama: "+super.nama);
        System.out.println("Umur: "+super.umur);
        System.out.println("Kelas: "+super.kelas);
    
    }}
