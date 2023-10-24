/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamhomework;

import java.util.*;
import teamhomework.Teams.TeamNameGenerator;
 
 // https://github.com/RenatoCarvalho2022350/TeamHomeWork  link for gitHub

/**
 *
 * @author Renato
 */
public class TeamHomeWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        List<PersonTeam> people = DataLoadTeams.loadData("C:\\Users\\Renato\\Desktop\\Projects\\JAVA\\TeamHomeWork01\\src\\teamhomework\\MOCK_DATA.txt");

       
        Collections.shuffle(people);

        List<Teams> teams = new ArrayList<>();
        Set<Integer> usedIds = new HashSet<>();

       TeamNameGenerator nameGenerator = TeamNameGenerator.TEAM_NAMES;

        for (int i = 0; i < 20; i++) {
            List<PersonTeam> teamMembers = new ArrayList<>();
            String teamName = nameGenerator.getRandomName();

            for (int j = 0; j < 5; j++) {
                PersonTeam person = selectRandomPerson(people, usedIds);
                teamMembers.add(person);
                usedIds.add(person.getID());
            }

            teams.add(new Teams(teamName, teamMembers));
        }

        // Imprima as equipes
        for (Teams team : teams) {
            System.out.println("Team Name: " + team.getName());
            System.out.println("Members:");
            for (PersonTeam person : team.getMembers()) {
                System.out.println(person.getName()+ " " + person.getLastName());
            }
            System.out.println();
        }
        
    
    }
      private static PersonTeam selectRandomPerson(List<PersonTeam> people, Set<Integer> usedIds) {
        Random random = new Random();
        PersonTeam person;
        do {
            person = people.get(random.nextInt(people.size()));
        } while (usedIds.contains(person.getID()));
        return person;
    }

 }

