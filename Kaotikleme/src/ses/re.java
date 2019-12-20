package ses;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Normalizer.Form;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class re {

    File file;
    AudioFileFormat.Type type;
    TargetDataLine line;
    re x;
    int y = 0;
    File file2;
    String path;
    byte[] file_data;
    AudioInputStream ais;
    DataInputStream dis;
    AudioFormat af;
    String[] array;
    String ex;
    FileOutputStream fos;
    
    public re() {
        
        file2 = new File("kayit.wav");
        type = AudioFileFormat.Type.WAVE;
    }
    
    AudioFormat getAudioFormat() {
        float sampleRate = 32000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
        return format;
    }
    
    public void start() {
        try {
            AudioFormat format = getAudioFormat();
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
 
            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("Desteklenmiyor");
                System.exit(0);
            }
            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();  
 
            System.out.println("Mikrofon açık");
 
            AudioInputStream ais = new AudioInputStream(line);
 
            System.out.println("Kayıtta");
 
            AudioSystem.write(ais, type, file2);
 
        } catch (LineUnavailableException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
     public void finish() {
        line.stop();
        line.close();
        System.out.println("bitti");
        
        file = new File("kayit.wav");
        path = file.getAbsolutePath();

        
        try {
            ais = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("desteklemeyen format");
        } catch (IOException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        dis = new DataInputStream(ais);
        af = ais.getFormat();
        file_data = new byte[(int)(ais.getFrameLength() * af.getFrameSize())];
         System.out.println("Frmae Ln : " + ais.getFrameLength());
         System.out.println("Frame Sz : " + af.getFrameSize());
        form.MainForm.jLabel5.setText("Çerçeve Uzunluğu : " + ais.getFrameLength());
        form.MainForm.jLabel6.setText("Kanal Sayısı : " + af.getFrameSize());
        form.MainForm.jLabel7.setText("Saniyede Örneklem Sayısı : " + af.getSampleRate());
        try {
            dis.readFully(file_data);
        } catch (IOException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dis.close();
        } catch (IOException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     
                
        array = path.split("\\.");
        ex = array[array.length - 1];
  
        try {
            fos = new FileOutputStream("ses." + ex);
            fos.write(file_data);
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Kayıt Yolu Hatası");
        } catch (IOException ex) {
            System.out.println("Kayıt Hatası");
        }
    }

   
     
    
    
}
