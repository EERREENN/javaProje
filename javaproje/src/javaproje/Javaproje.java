
package javaproje;

import java.util.HashMap;
import java.util.Map;


public class Javaproje {
    public Map<Integer, String> urunTextMap;
    public Map<Integer, Integer> stok;
    public Map<Integer, Double> fiyatlar;

    public Javaproje() {
       urunTextMap = new HashMap<>();
       urunTextMap.put(1, "su");
       urunTextMap.put(2, "soda");
       urunTextMap.put(3, "cikolata");
       urunTextMap.put(4, "kraker");
       urunTextMap.put(5, "kek");
       urunTextMap.put(6, "meyve suyu");
       urunTextMap.put(7, "süt");
      
     
       
       stok = new HashMap<>();
       stok.put(1, 0);
       stok.put(2, 5);
       stok.put(3, 8);
       stok.put(4, 15);
       stok.put(5, 12);
       stok.put(6, 12);
       stok.put(7, 12);
       
       

       fiyatlar = new HashMap<>();
       fiyatlar.put(1, 2.5);
       fiyatlar.put(2, 1.8);
       fiyatlar.put(3, 3.0);
       fiyatlar.put(4, 2.0);
       fiyatlar.put(5, 2.5);
       fiyatlar.put(6, 2.0);
       fiyatlar.put(7, 2.0);
       
      
       
       
    }
    public Map<Integer, String> getUrunTextMap() {
        return urunTextMap;
    }

    public void setUrunTextMap(Map<Integer, String> urunTextMap) {
        this.urunTextMap = urunTextMap;
    }

    public Map<Integer, Integer> getStok() {
        return stok;
    }

    public void setStok(Map<Integer, Integer> stok) {
        this.stok = stok;
    }

    public Map<Integer, Double> getFiyatlar() {
        return fiyatlar;
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
 
}
