
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;




public class NewJFrame extends javax.swing.JFrame {
    public  static boolean H_D  ; 
    static DataInputStream dataInputStream ;
    static DataOutputStream dataOutputStream ;
    public static String Keyy ="ABCDEFGT";
   
    public static String Counter ="AZSXDCFV";
    static ServerSocket serversocket ;
    static Socket socket ;
    public static int[][] key_sub = new int[16][48];
    private static int[] Ss = new int[28];
    static int[] Bb = new int[28];
    public static String KeyHil ="ddcf"; 
    
          
          
     
    
    
  
          

    
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TextC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaClient = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter here", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        TextC.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Hill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextC, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TextAreaClient.setBackground(new java.awt.Color(204, 204, 204));
        TextAreaClient.setColumns(20);
        TextAreaClient.setRows(5);
        jScrollPane1.setViewportView(TextAreaClient);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

         private static int[][] getKey_Mat() { 
     
      
      int q = KeyHil.length()% 2 ;
     
       if (q != 0) {  
           JOptionPane.showMessageDialog(null,"Cannot Form a square matrix");
        } 
       
        int lenght = KeyHil.length() ;
       int[][] Matrix = new int[lenght][lenght];
       
        int g = 0;  
        for (int i = 0; i < 2; i++)  
        {  
            for (int j = 0; j < 2; j++)  
            {  
              Matrix[i][j] = ((int) KeyHil.charAt(g))-97 ; 
         
                g++; 
            }  
        }
        return Matrix ; 
      }
         
         
         
           private static void v_Matrix(int[][] key_ATch_Matrix) {  
        int lim = key_ATch_Matrix[0][0] * key_ATch_Matrix[1][1] - key_ATch_Matrix[0][1] * key_ATch_Matrix[1][0];  
  
        if(lim == 0) {  
             JOptionPane.showMessageDialog(null,"Det equals to zero, invalid key matrix!");
          
        }  
    }
           
           
           
        public static String encrypt(String phrase)  
    {   
        
          int phraseToNum[]; 
          int phraseEncoded[] ; 
          int IVxorPhrase[] = new int[phrase.length()]; 
   
      
        Random R = new Random();
     
        
        phrase = phrase.replaceAll("[^a-zA-Z]","").toUpperCase();  
 
 
        if(phrase.length() % 2 == 1) {  
            phrase += "Q";     
        }  

        int[][] keyMatrix1towdi;  
          
        keyMatrix1towdi = getKey_Mat(); 
         
      
  
        v_Matrix(keyMatrix1towdi);  
       
 
         phraseToNum = new int[phrase.length()];
         phraseEncoded = new int[phrase.length()];
        
    
        
        for(int i=0; i < phrase.length(); i++) {  

         
            phraseToNum[i]=(int)phrase.charAt(i) - (65); 
          
        } 
     
       
       
       
     
       
        for( int i=0; i < phraseToNum.length; i += 2) {  
            int x = (keyMatrix1towdi[0][0] * phraseToNum[i] + keyMatrix1towdi[0][1] * phraseToNum[i+1]) % 26;  
            int y = (keyMatrix1towdi[1][0] * phraseToNum[i] + keyMatrix1towdi[1][1] * phraseToNum[i+1]) % 26;  
            phraseEncoded[i]= x;  
            phraseEncoded[i+1]=y ;  
            
        } 
        
        char c[];
         String mohr = "";
      for( int g =0; g < phraseEncoded.length; g += 1) {  
         c=  Character.toChars(phraseEncoded[g] + (65 ));  
        mohr += String.valueOf(c);
       

      }
     
         JOptionPane.showMessageDialog(null,mohr);
    
      return mohr;
    }  
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
             H_D = false;
           dataOutputStream.writeBoolean(H_D);
        String Note = ""  ;
       Note = ""+  encrypt(TextC.getText());

        dataOutputStream.writeUTF(Note);  
    }catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed
  private static String En_or_De(String Platex,boolean Y_or_N) {                    
         
         
          
           int INB[] = new int[ 8 *Platex.length()]; 
           for(int i=0 ; i < Platex.length() ; i++) {
			
			String l = Integer.toBinaryString( (int)Platex.charAt(i) );
			
			
			while(l.length() < 8) {
				l+= "0";
			}
                 			for(int j=0 ; j < 8 ; j++) {
				INB[(8*i)+j] = Integer.parseInt(l.charAt(j) + "");
                                
			}
                          
		} 
        
           int keYB[] = new int[64];
           for(int i=0 ; i < Keyy.length() ; i++) {
			String l = Integer.toBinaryString( (int)Keyy.charAt(i) );
			while(l.length() < 8) {
			l+= "0";
			}
                        
			for(int j=0 ; j < 8 ; j++) {
				keYB[(8*i)+j] = Integer.parseInt(l.charAt(j) + "");
			}
                   
		}
              
          
            if(Y_or_N){
    
           return ranking(keYB, true, INB);
            }
            else{
                  
       
              return ranking(keYB, true, INB);
            
            }
            
            
}
 
  private static String ranking( int[] keyBits ,  boolean trueOrFalase , int[] inputBits) {
          
            
		int newBits[] = new int[inputBits.length];
		for(int i=0 ; i < inputBits.length ; i++) {
			newBits[i] = inputBits[Initial_Permutation [i]-1];
		}
	
		int Lef[] = new int[32];
		int Raght[] = new int[32];
                
		System.arraycopy(newBits, 0, Lef, 0, 32);
		System.arraycopy(newBits, 32, Raght, 0, 32);
		
		
	
		
		
                int i;
		for(i=0 ; i < 28 ; i++) {
			Ss[i] = keyBits[Permuted_Choice_1[i]-1];
		}
		for( ; i < 56 ; i++) {
			Bb[i-28] = keyBits[Permuted_Choice_1[i]-1];
		}
		
	
		for(int e=0 ; e < 16 ; e++) {
			
			
			int R[] = new int[0];
                        
		        if(trueOrFalase) {
				R = Q(Raght, key_sub[15-e]);
                                   
                        }
                        else{
			R = Q(Raght, KR(e, keyBits));
                                }         
			
			int newL[] = xor(Lef, R);
			Lef = Raght;
			Raght = newL;
		
		}
                
       
		int output[] = new int[64];
		System.arraycopy(Raght, 0, output, 0, 32);
		System.arraycopy(Lef, 0, output, 32, 32);
		int finalOutput[] = new int[64];
		
		for(i=0 ; i < 64 ; i++) {
			finalOutput[i] = output[ Final_permutation[i]-1];
		}
	
		String Output = new String();
		for(i=0 ; i < 8 ; i++) {
			String in = new String();
			for(int j=0 ; j < 8 ; j++) {
				in += finalOutput[(8*i)+j];
			}
			int dmal = Integer.parseInt(in, 2);
                          
			Output += (char)dmal;
		}
                  JOptionPane.showMessageDialog(null,Output);
		   
		return Output;
        }
  
  
    
        private static int[] xor(int[] h, int[] g) {
		int w[] = new int[h.length];
		for(int i=0 ; i < h.length ; i++) {
			w[i] = h[i]^g[i];
		}
		return w;
	}
        
        
 
        
        
        private static int[] KR(int round, int[] key) {
		
		int lCg[] = new int[28];
		int lDg[] = new int[28];
		
	
		int rotationTimes = (int) rotations[round];
	
		lCg = leftS(Ss, rotationTimes);
		lDg = leftS(Bb, rotationTimes);
	
		int CnDn[] = new int[56];
		System.arraycopy(lCg, 0, CnDn, 0, 28);
		System.arraycopy(lDg, 0, CnDn, 28, 28);
		
		int Vvg[] = new int[48];
		for(int i=0 ; i < Vvg.length ; i++) {
			Vvg[i] = CnDn[Permuted_Choice_2[i]-1];
		}
		
	
                 
		Ss = lCg;
		Bb = lDg;
		return Vvg;
	}
        
        
	private static int[] Q(int[] R, int[] v) {
	
		int ex[] = new int[48];
		for(int i=0 ; i < 48 ; i++) {
			ex[i] = R[Expansion[i]-1];
		}
	
		int Howbits[] = xor(ex, v);
	
		int output[] = sawblo(Howbits);
		return output;
	}
	
        private static int[] sawblo(int[] Howbits) {
		
            int bitsout[] = new int[32];
		
		for(int i=0 ; i < 8 ; i++) {
			
			int row_[] = new int [2];
			row_[0] = Howbits[6*i];
			row_[1] = Howbits[(6*i)+5];
			String _Row = row_[0] + "" + row_[1];
			
			int _column[] = new int[4];
			_column[0] = Howbits[(6*i)+1];
			_column[1] = Howbits[(6*i)+2];
			_column[2] = Howbits[(6*i)+3];
			_column[3] = Howbits[(6*i)+4];
			String __Column = _column[0] +""+ _column[1] +""+ _column[2] +""+ _column[3];
			
			int i_Row = Integer.parseInt(_Row, 2);
			int i_Column = Integer.parseInt(__Column, 2);
			int x = S_boxes[i][(i_Row*16) + i_Column];
		
			String s = Integer.toBinaryString(x);
			
			while(s.length() < 4) {
				s = "0" + s;
			}
		
			for(int j=0 ; j < 4 ; j++) {
				bitsout[(i*4) + j] = Integer.parseInt(s.charAt(j) + "");
			}
		}
		
		int finbit[] = new int[32];
		for(int i=0 ; i < 32 ; i++) {
			finbit[i] = bitsout[Permutation[i]-1];
		}
		return finbit;
	}
	
	private static int[] leftS(int[] bits, int n) {
	
		int an[] = new int[bits.length];
		System.arraycopy(bits, 0, an, 0, bits.length);
		for(int i=0 ; i < n ; i++) {
			int temp = an[0];
			for(int j=0 ; j < bits.length-1 ; j++) {
				an[j] = an[j+1];
			}
			an[bits.length-1] = temp;
		}
		return an;
	}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            H_D = true;
            dataOutputStream.writeBoolean(H_D);
            String Note = ""  ;

            Note= ""+ (En_or_De(En_or_De( TextC.getText(),false ),true) );

            dataOutputStream.writeUTF(Note); 
        }catch(Exception e){}

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
         String display ="";
        try{
        
              socket = new Socket("127.0.0.1",1201); //server start at 1201 port number
             
             dataInputStream = new DataInputStream(socket.getInputStream());
             dataOutputStream = new DataOutputStream(socket.getOutputStream());
        
            ;
           while(!display.equals("exit") ){
               
              display=dataInputStream.readUTF();
             
    
             TextAreaClient.setText(TextAreaClient.getText().trim() + " \n Server : "+ display);  
              
           }
          
               }catch(Exception e){}
    }
    
    
    
    
    
    
    
    
       
	private static final byte[] Initial_Permutation  = { 
		58, 50, 42, 34, 26, 18, 10, 2,
		60, 52, 44, 36, 28, 20, 12, 4,
		62, 54, 46, 38, 30, 22, 14, 6,
		64, 56, 48, 40, 32, 24, 16, 8,
		57, 49, 41, 33, 25, 17, 9,  1,
		59, 51, 43, 35, 27, 19, 11, 3,
		61, 53, 45, 37, 29, 21, 13, 5,
		63, 55, 47, 39, 31, 23, 15, 7
	};
	
    

	private static final byte[] Permuted_Choice_1 = {
		57, 49, 41, 33, 25, 17, 9,
		1,  58, 50, 42, 34, 26, 18,
		10, 2,  59, 51, 43, 35, 27,
		19, 11, 3,  60, 52, 44, 36,
		63, 55, 47, 39, 31, 23, 15,
		7,  62, 54, 46, 38, 30, 22,
		14, 6,  61, 53, 45, 37, 29,
		21, 13, 5,  28, 20, 12, 4
	};
    
    

	private static final byte[] Permuted_Choice_2 = {
		14, 17, 11, 24, 1,  5,
		3,  28, 15, 6,  21, 10,
		23, 19, 12, 4,  26, 8,
		16, 7,  27, 20, 13, 2,
		41, 52, 31, 37, 47, 55,
		30, 40, 51, 45, 33, 48,
		44, 49, 39, 56, 34, 53,
		46, 42, 50, 36, 29, 32
	};
        
        
  
	private static final byte[] rotations = {
		1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1
	};
        
        
        
    
	private static final byte[] Expansion = {
		32, 1,  2,  3,  4,  5,
		4,  5,  6,  7,  8,  9,
		8,  9,  10, 11, 12, 13,
		12, 13, 14, 15, 16, 17,
		16, 17, 18, 19, 20, 21,
		20, 21, 22, 23, 24, 25,
		24, 25, 26, 27, 28, 29,
		28, 29, 30, 31, 32, 1
	};
        
        
        
        
	private static final byte[][] S_boxes = { {
		14, 4,  13, 1,  2,  15, 11, 8,  3,  10, 6,  12, 5,  9,  0,  7,
		0,  15, 7,  4,  14, 2,  13, 1,  10, 6,  12, 11, 9,  5,  3,  8,
		4,  1,  14, 8,  13, 6,  2,  11, 15, 12, 9,  7,  3,  10, 5,  0,
		15, 12, 8,  2,  4,  9,  1,  7,  5,  11, 3,  14, 10, 0,  6,  13
	}, {
		15, 1,  8,  14, 6,  11, 3,  4,  9,  7,  2,  13, 12, 0,  5,  10,
		3,  13, 4,  7,  15, 2,  8,  14, 12, 0,  1,  10, 6,  9,  11, 5,
		0,  14, 7,  11, 10, 4,  13, 1,  5,  8,  12, 6,  9,  3,  2,  15,
		13, 8,  10, 1,  3,  15, 4,  2,  11, 6,  7,  12, 0,  5,  14, 9
	}, {
		10, 0,  9,  14, 6,  3,  15, 5,  1,  13, 12, 7,  11, 4,  2,  8,
		13, 7,  0,  9,  3,  4,  6,  10, 2,  8,  5,  14, 12, 11, 15, 1,
		13, 6,  4,  9,  8,  15, 3,  0,  11, 1,  2,  12, 5,  10, 14, 7,
		1,  10, 13, 0,  6,  9,  8,  7,  4,  15, 14, 3,  11, 5,  2,  12
	}, {
		7,  13, 14, 3,  0,  6,  9,  10, 1,  2,  8,  5,  11, 12, 4,  15,
		13, 8,  11, 5,  6,  15, 0,  3,  4,  7,  2,  12, 1,  10, 14, 9,
		10, 6,  9,  0,  12, 11, 7,  13, 15, 1,  3,  14, 5,  2,  8,  4,
		3,  15, 0,  6,  10, 1,  13, 8,  9,  4,  5,  11, 12, 7,  2,  14
	}, {
		2,  12, 4,  1,  7,  10, 11, 6,  8,  5,  3,  15, 13, 0,  14, 9,
		14, 11, 2,  12, 4,  7,  13, 1,  5,  0,  15, 10, 3,  9,  8,  6,
		4,  2,  1,  11, 10, 13, 7,  8,  15, 9,  12, 5,  6,  3,  0,  14,
		11, 8,  12, 7,  1,  14, 2,  13, 6,  15, 0,  9,  10, 4,  5,  3
	}, {
		12, 1,  10, 15, 9,  2,  6,  8,  0,  13, 3,  4,  14, 7,  5,  11,
		10, 15, 4,  2,  7,  12, 9,  5,  6,  1,  13, 14, 0,  11, 3,  8,
		9,  14, 15, 5,  2,  8,  12, 3,  7,  0,  4,  10, 1,  13, 11, 6,
		4,  3,  2,  12, 9,  5,  15, 10, 11, 14, 1,  7,  6,  0,  8,  13
	}, {
		4,  11, 2,  14, 15, 0,  8,  13, 3,  12, 9,  7,  5,  10, 6,  1,
		13, 0,  11, 7,  4,  9,  1,  10, 14, 3,  5,  12, 2,  15, 8,  6,
		1,  4,  11, 13, 12, 3,  7,  14, 10, 15, 6,  8,  0,  5,  9,  2,
		6,  11, 13, 8,  1,  4,  10, 7,  9,  5,  0,  15, 14, 2,  3,  12
	}, {
		13, 2,  8,  4,  6,  15, 11, 1,  10, 9,  3,  14, 5,  0,  12, 7,
		1,  15, 13, 8,  10, 3,  7,  4,  12, 5,  6,  11, 0,  14, 9,  2,
		7,  11, 4,  1,  9,  12, 14, 2,  0,  6,  10, 13, 15, 3,  5,  8,
		2,  1,  14, 7,  4,  10, 8,  13, 15, 12, 9,  0,  3,  5,  6,  11
	} };
	
        
        
        
    
	private static final byte[] Permutation = {
		16, 7,  20, 21,
		29, 12, 28, 17,
		1,  15, 23, 26,
		5,  18, 31, 10,
		2,  8,  24, 14,
		32, 27, 3,  9,
		19, 13, 30, 6,
		22, 11, 4,  25
	};
	
        
	private static final byte[]  Final_permutation = {
		40, 8, 48, 16, 56, 24, 64, 32,
		39, 7, 47, 15, 55, 23, 63, 31,
		38, 6, 46, 14, 54, 22, 62, 30,
		37, 5, 45, 13, 53, 21, 61, 29,
		36, 4, 44, 12, 52, 20, 60, 28,
		35, 3, 43, 11, 51, 19, 59, 27,
		34, 2, 42, 10, 50, 18, 58, 26,
		33, 1, 41, 9, 49, 17, 57, 25
	};
  
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea TextAreaClient;
    private javax.swing.JTextField TextC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
