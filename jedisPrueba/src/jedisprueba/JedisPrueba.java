/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jedisprueba;

import java.util.Set;
import redis.clients.jedis.Jedis;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class JedisPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        try {
            Jedis jedis = new Jedis();
            //Jedis jedis = new Jedis("localhost");
            //System.out.println("Yasss");
            //System.out.println("Status: " + jedis.ping());
        } catch (Exception e) {
            System.out.println(e);
        }

        Jedis jedis = new Jedis("localhost", 6379);
        /*Set<byte[]> keys = jedis.keys("*".getBytes());
        for (byte[] key : keys) {
            // do something
        } // forF*/

        String pattern = "abc" + "*";
        Set<String> keys2 = jedis.keys(pattern);

        for (String key : keys2) {
            // System.out.println(jedis.keys(key));

        }

//        jedis.set("1", "Español");
//        jedis.set("1001", "1+5");
//        jedis.set("2001", "Llueve hoy+Responda+1+F");
//        jedis.set("106", "Sebas+Seb+abc");
//        jedis.set("101", "Paulina Ester Euceda Figueroa+Pau+abc+2*56");
//        jedis.set("102", "Nohelia+Nohe+abc+2*56%3*8");
//        jedis.set("103", "Natalia+Nat+abc+2*56");
        HashMap<String, String> examen = new HashMap<String, String>();
        examen.put("Nombre", "Sebas");
        examen.put("login", "Seb");
        examen.put("Contrasena", "abc");
//        
        jedis.hmset("999", examen);
//        

        examen = new HashMap<String, String>();
        examen.put("Nombre", "Paulina");
        examen.put("login", "Pau");
        examen.put("Contrasena", "abc");
//        
        jedis.hmset("998", examen);

        examen = new HashMap<>();
        examen.put("Nombre", "Pau");
        examen.put("login", "Rosa");
        examen.put("Contrasena", "abc");
//        
        jedis.hmset("997", examen);
//        Set<String> names = jedis.keys("*");
//
//        java.util.Iterator<String> it = names.iterator();
//        while (it.hasNext()) {
//            String s = it.next(); 
//            System.out.println(s + " : " + jedis.hgetAll(s));
//        }
//        
//        System.out.println(jedis.hgetAll("998"));

        Set<String> names = jedis.keys("*");
        java.util.Iterator<String> it = names.iterator();
        boolean validar = false;
        String s = "";
        while (it.hasNext()) {
            int igual = 0;
            s = it.next();
            List<String> todo = jedis.hvals(s);
            Set<String> llaves = jedis.hkeys(s);

            Iterator<String> i = llaves.iterator();
            int cont = 0;
            while (i.hasNext()) {
                if (i.next().equals("login")) {
                    System.out.println("cont " + cont);
                    igual = cont;

                }
                cont++;
            }

            System.out.println(llaves);
            System.out.println(igual);
            System.out.println(todo);
            System.out.println(todo.get(igual));
            System.out.println(todo.contains("Pau"));
            System.out.println("");
        }

    }

}
