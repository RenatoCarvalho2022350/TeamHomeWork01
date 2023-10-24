/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamhomework;

import java.util.*;

/**
 *
 * @author Renato
 */
public class Teams {
    
    private String name;
    private List<PersonTeam> members;

    public Teams(String name, List<PersonTeam> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<PersonTeam> getMembers() {
        return members;
    }



public enum TeamNameGenerator {
    TEAM_NAMES("Team Red", "Team Blue", "Team Green", "Team White", "Team Purple");

    private final String[] names;

    TeamNameGenerator(String... names) {
        this.names = names;
    }

    public String getRandomName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }
}



}
