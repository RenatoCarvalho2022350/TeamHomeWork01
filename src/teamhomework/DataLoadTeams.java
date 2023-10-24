/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamhomework;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato
 */
public class DataLoadTeams {
    public static List<PersonTeam> loadData(String ReadDock){
        List<PersonTeam> people = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(ReadDock))){
            String Line;
            
            while ((Line = reader.readLine()) != null){
            String[] parts = Line.split(",");
             int ID = Integer.parseInt(parts[0]);
             String Name = parts[1];
             String lastName = parts[2];
             String email = parts[3];
             
             people.add(new PersonTeam(ID, Name, lastName, email));
                
            }
        }catch (IOException e) {
     }
        return people;
}
}