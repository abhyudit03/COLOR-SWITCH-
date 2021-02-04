package sample;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Resources {

    public static void save(Serializable data,String file) throws Exception {
        try (ObjectOutputStream objectOutputStream
                     = new ObjectOutputStream(Files.newOutputStream(Paths.get(file)))){
            objectOutputStream.writeObject(data);
        }
    }


    public static Object loading(String file) throws Exception {
        try(ObjectInputStream objectInputStream=new ObjectInputStream(Files.newInputStream(Paths.get(file)))){
            return objectInputStream.readObject();
        }

    }
}