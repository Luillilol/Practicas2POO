import java.util.HashMap;

public class Ejercicio3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Rojo",1);
        map.put("Verde",2);
        map.put("Negro",3);
        map.put("Blanco",4);
        map.put("Azul",5);

        //Imprimmos el hashmap 
        System.out.println("El mapa original es: " + map);
        System.out.println("1.- ¿La llave \"Verde\" existe?");
        if (map.containsKey("Verde")) {
            System.out.println("¡Sí ! " + map.get("Verde"));
        }else{
            System.out.println("No...");
        }
        System.out.println("2.- ¿La llave \"Naranja\" existe?");
        if (map.containsKey("Naranja")) {
            System.out.println("!Sí ¡" + map.get("Naranja"));     
        }else{                                              
            System.out.println("No...");
        }

    }
}
