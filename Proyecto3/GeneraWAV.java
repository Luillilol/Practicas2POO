import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GeneraWAV {
    public void escribe(String nombre, int iTiempo, int iFrecuenciaMuestreo, int iArmonico) {
        try {
            FileOutputStream fw = new FileOutputStream(nombre ); //para escribir en bytes en el archivo .wav
            //variables auxiliares
            int bitsM = 16; //bits por muestra
            int bytesM = bitsM / 8; //bytes por muestra
            int canales = 1; //número de canales
            int blockAlign = canales * bytesM; //tamaño de bloque
            int bytesPs = iFrecuenciaMuestreo * blockAlign; //bytes por segundo
            int dataSize = iFrecuenciaMuestreo * bytesM * iTiempo; //tamaño de la data
            int totalData = 36 + dataSize; //tamaño total del archivo

            //cabecera RIFF
            fw.write("RIFF".getBytes());
            fw.write(convertirEndiannessInt(totalData));
            fw.write("WAVE".getBytes());
            //cabecera fmt
            fw.write("fmt ".getBytes());
            




        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }



    }

    //Métodos auxiliares littleEndian y bigEndian
    public byte[] convertirEndiannessShort(short valor){
        byte[] resultado;
        byte b1 = (byte)((valor>>8) & 0xff);
        byte b0 = (byte)(valor & 0xff);
        resultado = new byte[]{b0, b1};
        return resultado;
    }

    public byte[] convertirEndiannessInt(int valor){
        byte[] resultado;
        byte b3 = (byte)((valor>>24) & 0xff);
        byte b2 = (byte)((valor>>16) & 0xff);
        byte b1 = (byte)((valor>>8) & 0xff);
        byte b0 = (byte)(valor & 0xff);
        resultado = new byte[]{b0, b1, b2, b3};
        return resultado;
    }

}