import java.io.FileOutputStream;
import java.io.IOException;

public class GeneraWAV {
    public void escribe(String nombre, int iTiempo, int iFrecuenciaMuestreo, int iArmonico) {
        try {
            if (!nombre.contains(".wav")){
                throw new IllegalArgumentException("El archivo debe de ser de extensión .wav");
            }
            FileOutputStream fw = new FileOutputStream(nombre ); //para escribir en bytes en el archivo .wav
            //variables auxiliares
            int bitsM = 16; //bits por muestra
            int bytesM = bitsM / 8; //bytes por muestra
            int canales = 1; //número de canales
            int tamBloque = canales * bytesM; //tamaño de bloque
            int bytesPs = iFrecuenciaMuestreo * tamBloque; //bytes por segundo
            int dataSize = iFrecuenciaMuestreo * bytesM * iTiempo; //tamaño de la data
            int totalData = 36 + dataSize; //tamaño total del archivo

            //cabecera RIFF
            fw.write("RIFF".getBytes());
            fw.write(convertirEndiannessInt(totalData));
            fw.write("WAVE".getBytes());
            //cabecera fmt
            fw.write("fmt ".getBytes());
            fw.write(convertirEndiannessInt(16));
            fw.write(convertirEndiannessShort((short)1));
            fw.write(convertirEndiannessShort((short)canales)); //canales = 1
            fw.write(convertirEndiannessInt(iFrecuenciaMuestreo));
            fw.write(convertirEndiannessInt(bytesPs));
            fw.write(convertirEndiannessShort((short)tamBloque));
            fw.write(convertirEndiannessShort((short)bitsM));
            //cabecera data
            fw.write("data".getBytes());
            fw.write(convertirEndiannessInt(dataSize));
            //datos

            //se necesita iterar n veces
            //siendo n el número de muestras que se van a tomar a lo largo del muestreo
            int totalMuestreo = iFrecuenciaMuestreo * iTiempo;
            double t = 0;
            short amplitud =0;
            for (int i =0 ;  i<totalMuestreo; i++){
                //calcular amplitud de la onde en el instante de tiempo t = i/frecuenciaMuestreo
                t = (double) i  / iFrecuenciaMuestreo;
                //se calcula la amplitud de la onda en el instante de tiempo t en tipo de dato short para los 16 bits que mide cada bloque
                amplitud = (short) (Math.sin(2 * Math.PI * iArmonico * t) * Short.MAX_VALUE);
                fw.write(convertirEndiannessShort(amplitud));
            }
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