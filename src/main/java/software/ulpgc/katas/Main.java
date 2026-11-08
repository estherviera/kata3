package software.ulpgc.katas;

import software.ulpgc.katas.adapters.JsonRandomUserReader;

public class Main {
    public static void main(String[] args){
        JsonRandomUserReader reader = new JsonRandomUserReader();
        reader.read();
    }
}
