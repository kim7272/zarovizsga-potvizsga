 package hu.nive.ujratervezes.zarovizsga.people;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.nio.file.Files;
 import java.nio.file.Path;

 public class People {
    public int getNumberOfMales(String s) {
        int counter = 0;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(s))){
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine())  != null) {
                String[] parts = line.split(",");
                if (parts[4].equals("Male")){
                    counter = counter + 1;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!",e);
        }
        return counter;
    }
}


