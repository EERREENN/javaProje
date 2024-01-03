
package javaproje;
import java.io.*;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class NewOtomat extends javax.swing.JFrame {

    private static Map stok;
    String DOGRU_SIFRE = "1234";
    double bakiye=0;
    static double kazanç;
    static Javaproje obje;
    int urunNo;
    
    static String urundosya="C:\\Users\\erena\\OneDrive\\Belgeler\\NetBeansProjects\\javaproje\\src\\javaproje\\urunler.txt";
    static String stokdosya="C:\\Users\\erena\\OneDrive\\Belgeler\\NetBeansProjects\\javaproje\\src\\javaproje\\stoklar.txt";
    static String fiyatdosya="C:\\Users\\erena\\OneDrive\\Belgeler\\NetBeansProjects\\javaproje\\src\\javaproje\\fiyatlar.txt";
    static String kazancdosya="C:\\Users\\erena\\OneDrive\\Belgeler\\NetBeansProjects\\javaproje\\src\\javaproje\\kazanç.txt";
    
   static void dosyadanVeriOku(String dosyaYolu,Map s) {
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                String[] parcalar = satir.split(",");
                if (parcalar.length == 2) {
                    int anahtar = Integer.parseInt(parcalar[0].trim());
                    String deger = parcalar[1].trim();
                    s.put(anahtar, deger);
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
   
   static void dosyadanVeriOku2(String dosyaYolu, Map<Integer, Integer> s) {
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                String[] parcalar = satir.split(",");
                if (parcalar.length == 2) {
                    int anahtar = Integer.parseInt(parcalar[0].trim());
                    int deger = Integer.parseInt(parcalar[1].trim());
                    s.put(anahtar, deger);
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
    static void dosyadanVeriOku3(String dosyaYolu, Map<Integer, Double> s) {
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                String[] parcalar = satir.split(",");
                if (parcalar.length == 2) {
                    int anahtar = Integer.parseInt(parcalar[0].trim());
                    double deger = Double.parseDouble(parcalar[1].trim());
                    s.put(anahtar, deger);
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
    static String satir;
    static double deger;
    static double dosyadanVeriOku4(String dosyaYolu){
      
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            while ((satir = reader.readLine()) != null&& !satir.trim().isEmpty()) {
                deger = Double.parseDouble(satir);
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
        return deger;
    }
   



   
    public NewOtomat() throws IOException {
        
        SwingUtilities.invokeLater(() -> {
            

            // Add a WindowListener to the frame
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    try {
                        // Perform the desired action when the close button is clicked
                        performCloseAction();
                    } catch (IOException ex) {
                        Logger.getLogger(NewOtomat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Handle close button provided by the OS

            // Add other components and settings as needed
            // ...

            setVisible(true);
        });
        
        
        obje = new Javaproje();
  
        Map<Integer, String> urunTextMap = obje.getUrunTextMap();
        Map<Integer, Integer> stok = obje.getStok();
        Map<Integer, Double> fiyatlar = obje.getFiyatlar();
        
        dosyadanVeriOku(urundosya,obje.urunTextMap);
        dosyadanVeriOku2(stokdosya,obje.stok);
        dosyadanVeriOku3(fiyatdosya,obje.fiyatlar);
        kazanç=dosyadanVeriOku4(kazancdosya);
        
        
        initComponents();
        jButton5.setEnabled(false);
        jButton6.setEnabled(false); 
        jButton7.setEnabled(false); 
        jButton8.setEnabled(false); 
        jButton9.setEnabled(false); 
        jButton10.setEnabled(false);
        jLabel1.setText(obje.urunTextMap.get(1));
        jLabel8.setText(obje.urunTextMap.get(2));
        jLabel10.setText(obje.urunTextMap.get(3));
        jLabel7.setText(obje.urunTextMap.get(4));
        jLabel4.setText(obje.urunTextMap.get(5));
        jLabel5.setText(obje.urunTextMap.get(6));
        jLabel6.setText(obje.urunTextMap.get(7));
        jLabel2.setText(String.valueOf(obje.fiyatlar.get(1)));
        jLabel11.setText(String.valueOf(obje.fiyatlar.get(2)));
        jLabel12.setText(String.valueOf(obje.fiyatlar.get(3)));
        jLabel13.setText(String.valueOf(obje.fiyatlar.get(4)));
        jLabel14.setText(String.valueOf(obje.fiyatlar.get(5)));
        jLabel16.setText(String.valueOf(obje.fiyatlar.get(6)));
        jLabel15.setText(String.valueOf(obje.fiyatlar.get(7)));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ürün");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Fiyat(TL)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Ürünler");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("ürün");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("ürün");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("ürün");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("ürün");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("ürün");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("ürün");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Fiyat(TL)");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Fiyat(TL)");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Fiyat(TL)");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Fiyat(TL)");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Fiyat(TL)");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Fiyat(TL)");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("Fiyat(TL)");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("  1");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("  2");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("  3");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setText("  4");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setText("  5");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setText("  6");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setText("  7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("para ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("ürün al");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("para iade");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setText("admin giriş");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setText("admin çıkış");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton6.setText(" kazancı al");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("stok  görüntüle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton8.setText("ürün çıkar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton9.setText("ürün ekle");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton10.setText("stok ekle");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String input = JOptionPane.showInputDialog(this, "eklemek istediginiz miktarı giriniz");

    try {
        bakiye += Integer.parseInt(input);
        if (bakiye <= 0) {
            JOptionPane.showMessageDialog(this, "Lütfen 0'dan büyük bir sayı girin.", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {         
            JOptionPane.showMessageDialog(this, "bakiyeniz " + bakiye+"TL");  
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Geçerli bir sayı girmelisiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(this, bakiye+ "TL Paranız iade edilmiştir");
        bakiye=0;
    }//GEN-LAST:event_jButton3ActionPerformed
    //Almak istenilen ürünün numarasını,yüklenen bakiyeye ve ürünün stok durumunu kontrol eder
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String input = JOptionPane.showInputDialog(this, "Almak istediğiniz ürünün numarasını giriniz");

        try {     
        if (input != null) {
             urunNo = Integer.parseInt(input);

            if ((obje.urunTextMap).containsKey(urunNo)) {
                int kalanStok = obje.stok.get(urunNo);

                if (kalanStok > 0) {
                    if (bakiye >= obje.fiyatlar.get(urunNo)) {
                        bakiye -= obje.fiyatlar.get(urunNo);
                        obje.stok.put(urunNo, kalanStok - 1);
                        kazanç +=obje.fiyatlar.get(urunNo);
                        

                        JOptionPane.showMessageDialog(this, obje.urunTextMap.get(urunNo)+ " alındı."+ "\nYeni bakiyeniz: " + bakiye);
                    } else {
                        JOptionPane.showMessageDialog(this, "Yetersiz bakiye. Lütfen daha fazla para ekleyin.", "Hata",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,obje.urunTextMap.get(urunNo) + " ürünü stokta yok.", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Geçerli bir ürün numarası girin.", "Hata",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Geçerli bir sayı girmelisiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed
    //Şifreyi kontrol eder 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String adminSifre = JOptionPane.showInputDialog(this, "Admin şifresini girin:");

    if (DOGRU_SIFRE.equals(adminSifre)) {

        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);

        JOptionPane.showMessageDialog(this, "Admin girişi başarılı.");
    } else {
        JOptionPane.showMessageDialog(this, "Yanlış şifre. Admin girişi başarısız.", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton4ActionPerformed
    //Eklenmek istenen ürünü kontrol eder ve ekler
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    try {
    String numaraInput = JOptionPane.showInputDialog(this, "Eklemek istediğiniz ürünün numarasını girin:");

    urunNo = Integer.parseInt(numaraInput);

    if (urunNo < 1 || urunNo > 7) {
        JOptionPane.showMessageDialog(this, "Geçerli bir ürün numarası girin (1 ile 7 arasında).", "Hata", JOptionPane.ERROR_MESSAGE);
    } else {
        
        if (obje.urunTextMap.get(urunNo) != null) {
            JOptionPane.showMessageDialog(this, "Bu yer zaten dolu.", "Hata", JOptionPane.ERROR_MESSAGE);
        } else{
            String urunAdi = JOptionPane.showInputDialog(this, "Ürün adını girin:");
            double urunFiyati = Double.parseDouble(JOptionPane.showInputDialog(this, "Ürün fiyatını girin:"));
            int urunStogu = Integer.parseInt(JOptionPane.showInputDialog(this, "Ürün stok miktarını girin:"));
            
            obje.urunTextMap.put(urunNo,urunAdi);
            obje.stok.put(urunNo, urunStogu);
            obje.fiyatlar.put(urunNo, urunFiyati);
            
            switch (urunNo) {
                case (1):
                    jLabel1.setText(obje.urunTextMap.get(1));
                    jLabel2.setText(String.valueOf(obje.fiyatlar.get(1)));
                    break;
                case(2):
                    jLabel8.setText(obje.urunTextMap.get(2));
                    jLabel11.setText(String.valueOf(obje.fiyatlar.get(2)));
                    break;
                case(3):
                     jLabel10.setText(obje.urunTextMap.get(3));
                     jLabel12.setText(String.valueOf(obje.fiyatlar.get(3)));
                     break;
                case(4):
                    jLabel7.setText(obje.urunTextMap.get(4));
                    jLabel13.setText(String.valueOf(obje.fiyatlar.get(4)));
                    break;
                case(5):
                    jLabel4.setText(obje.urunTextMap.get(5));
                    jLabel14.setText(String.valueOf(obje.fiyatlar.get(5)));
                    break;
                case(6):
                    jLabel5.setText(obje.urunTextMap.get(6));
                    jLabel16.setText(String.valueOf(obje.fiyatlar.get(6)));
                case(7):
                    jLabel6.setText(obje.urunTextMap.get(7));
                    jLabel15.setText(String.valueOf(obje.fiyatlar.get(7)));
                    break;
                default:
                    throw new AssertionError();
            }

            JOptionPane.showMessageDialog(this, "Ürün başarıyla eklendi.");
        }
    }
    } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Geçerli bir sayı, fiyat veya stok miktarı girilmelidir.", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton9ActionPerformed
    //Çıkarılmak istenen ürünü kontrol eder ve Çıkarır
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    try {
    String input = JOptionPane.showInputDialog(this, "Çıkarmak istediğiniz ürünün numarasını girin:");

    urunNo = Integer.parseInt(input);

    if (urunNo >= 1 && urunNo <= 7) {
        
        obje.fiyatlar.put(urunNo, 0.0);
        obje.stok.put(urunNo,0);
        obje.urunTextMap.put(urunNo,null);
        
        switch (urunNo) {
            case 1:
                jLabel1.setText(null);
                jLabel2.setText(null);             
                break;
            case 2:
                jLabel8.setText(null);
                jLabel11.setText(null);              
                break;
            case 3:
                jLabel10.setText(null);
                jLabel12.setText(null);
                break;
            case 4:
                jLabel7.setText(null);
                jLabel13.setText(null);
                break;
            case 5:
                jLabel4.setText(null);
                jLabel14.setText(null);
                break;
            case 6:
                jLabel5.setText(null);
                jLabel16.setText(null);
                break;
            case 7:
                jLabel6.setText(null);
                jLabel15.setText(null);
                break;
            default:
                    throw new AssertionError();        
        }
        JOptionPane.showMessageDialog(this, urunNo+" numaralı ürün çıkarıldı.");
    } else {
        JOptionPane.showMessageDialog(this, "Geçerli bir ürün numarası girin (1 ile 7 arasında).", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Geçerli bir sayı girmelisiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        JOptionPane.showMessageDialog(this, (kazanç)+ "TL kazanılmıştır ve admine verilmiştir");
        kazanç=0.0;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        JOptionPane.showMessageDialog(this, obje.urunTextMap.get(1)+" : "+obje.stok.get(1)+
               "\n"+ obje.urunTextMap.get(2)+" : "+obje.stok.get(2)+
               "\n"+obje.urunTextMap.get(3)+" : "+obje.stok.get(3)+
               "\n"+obje.urunTextMap.get(4)+" : "+obje.stok.get(4)+
               "\n"+obje.urunTextMap.get(5)+" : "+obje.stok.get(5)+
               "\n"+obje.urunTextMap.get(6)+" : "+obje.stok.get(6)+
               "\n"+obje.urunTextMap.get(7)+" : "+obje.stok.get(7));

    }//GEN-LAST:event_jButton7ActionPerformed
    //stok ekler
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       try {
        String urunNoInput = JOptionPane.showInputDialog(this, "Stok eklemek istediğiniz ürünün numarasını girin:");

        urunNo = Integer.parseInt(urunNoInput);

        if (urunNo >= 1 && urunNo <= 7) {
            String stokEkleInput = JOptionPane.showInputDialog(this,  obje.urunTextMap.get(urunNo)+ " ürününe eklemek istediğiniz stok miktarını girin:");

            int eklenenStok = Integer.parseInt(stokEkleInput);
            if(eklenenStok>0){
            int mevcutStok = obje.stok.get(urunNo);
            obje.stok.put(urunNo, mevcutStok + eklenenStok);

            JOptionPane.showMessageDialog(this, eklenenStok + " adet stok " +obje.urunTextMap.get(urunNo) + " ürününe başarıyla eklendi. Yeni stok miktarı: " + obje.stok.get(urunNo));
            }else{
                JOptionPane.showMessageDialog(this, "buraya negatif sayı yazamazsınız", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Geçerli bir ürün numarası girin.", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Geçerli bir sayı girmelisiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       jButton5.setEnabled(false);
       jButton6.setEnabled(false);
       jButton7.setEnabled(false);
       jButton8.setEnabled(false);
       jButton9.setEnabled(false);
       jButton10.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed
    
    static void dosyaIceriginiSil(String dosyaYolu) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaYolu));
            writer.write(""); // Boş bir string yazarak içeriği sil
            writer.close();
            
            System.out.println("Dosya icerigi basariyla silindi.");
        } catch (IOException e) {
            System.out.println("Dosya içeriği silinirken bir hata oluştu: " + e.getMessage());
        }
    }
    
    public static void Ekle(String metin,String d){
        try{
            
            File f=new File(d);
            FileWriter yazici=new FileWriter(f,true);
            BufferedWriter yaz=new BufferedWriter(yazici);
            yaz.write(metin);
            yaz.newLine();
            yaz.close();
            System.out.println("okey");
        }
        catch(Exception hata){
            System.out.println("no");
        }
    }
    
    
    
     private static void performCloseAction() throws IOException {
        
        dosyaIceriginiSil(urundosya);
        dosyaIceriginiSil(stokdosya);
        dosyaIceriginiSil(fiyatdosya);
        dosyaIceriginiSil(kazancdosya);
        
        for (Map.Entry<Integer, String> entry : obje.urunTextMap.entrySet()) {
            int urunId = entry.getKey();
            String urunAdi = entry.getValue();
            Ekle(urunId + "," + urunAdi,urundosya);
        }
        int i=1;
        while( i<=7){
        Ekle( i+","+obje.stok.get(i), stokdosya);
        i++;
        }
         for (Map.Entry<Integer, Double> entry : obje.getFiyatlar().entrySet()) {
            int anahtar = entry.getKey();
            double deger = entry.getValue();
            String metin = anahtar + "," + deger;

            Ekle(metin, fiyatdosya);
        }
        Ekle(String.valueOf(kazanç),kazancdosya);
        
        

        dosyadanVeriOku(urundosya,obje.urunTextMap);
        dosyadanVeriOku2(stokdosya,obje.stok);
        dosyadanVeriOku3(fiyatdosya, obje.fiyatlar);
        dosyadanVeriOku4(kazancdosya);
        
    }
    
    
    public static void main(String args[]) {
        
       
         
        
        
        
        
        Javaproje proje = new Javaproje();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewOtomat().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NewOtomat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
