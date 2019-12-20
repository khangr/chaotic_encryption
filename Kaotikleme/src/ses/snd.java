package ses;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.text.html.HTML;

public class snd {

    String ex;
    String[] array;
    String path;
    File file;
    byte[] file_data;
    byte[] temp_data;
    byte[] temp;
    byte[] temp2;
    FileInputStream fis;
    FileOutputStream fos;
    AudioInputStream ais;
    DataInputStream dis;
    AudioFormat af;
    
    public byte[] dondur(){
        return temp_data;
    }

    public snd(double x1, double y1, double z1, int blok_boyutu) {

        JFileChooser cho = new JFileChooser();
        cho.showOpenDialog(null);
        file = cho.getSelectedFile();
        path = file.getAbsolutePath();

        temp_data = new byte[(int) file.length()];

        try {
            ais = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("desteklemeyen format");
        } catch (IOException ex) {
            Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        dis = new DataInputStream(ais);
        af = ais.getFormat();
        file_data = new byte[(int) (ais.getFrameLength() * af.getFrameSize())];
        try {
            dis.readFully(file_data);
        } catch (IOException ex) {
            Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dis.close();
        } catch (IOException ex) {
            Logger.getLogger(Normalizer.Form.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı!");
        }

        try {
            fis.read(temp_data);
        } catch (IOException ex) {
            System.out.println("Dosya okunamadı!");
        }

        try {
            fis.close();
        } catch (IOException ex) {
            System.out.println("Hata");
        }

        for (int i = 0; i < file_data.length; i++){
            file_data[i] ^= (byte) Integer.parseInt(kaotik.Lorenz.run(x1, y1, z1, i % blok_boyutu), 2);
        }

        for (int i = 44; i < temp_data.length; i++) {
            temp_data[i] = file_data[i - 44];
        }
 

        array = path.split("\\.");
        ex = array[array.length - 1];

        try {
            fos = new FileOutputStream("sesx.wav");
            fos.write(temp_data);
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Kayıt Yolu Hatası");
        } catch (IOException ex) {
            System.out.println("Kayıt Hatası");
        }

        

    }

}
