
package javaproje;

import java.util.HashMap;
import java.util.Map;


public class Javaproje {
    public static Map<Integer, String> urunTextMap;
    public static Map<Integer, Integer> stok;
    public static Map<Integer, Double> fiyatlar;

    public Javaproje() {
       urunTextMap = new HashMap<>();    
       
       stok = new HashMap<>();
       
       fiyatlar = new HashMap<>();     
         
    }
    public Map<Integer, String> getUrunTextMap() {
        return urunTextMap;
    }

    public Map<Integer, Integer> getStok() {
        return stok;
    }

    public Map<Integer, Double> getFiyatlar() {
        return fiyatlar;
    }   
    
    public static void main(String[] args) {
        Javaproje proje = new Javaproje();
 
         

    }
    
    
    
}
