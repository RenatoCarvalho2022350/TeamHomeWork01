/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamhomework;

/**
 *
 * @author Renato
 */
class PersonTeam {
        
        private int ID;
        private String Name;
        private String lastName;
        private String email;

    public PersonTeam(int ID, String Name, String lastName, String email) {
        this.ID = ID;
        this.Name = Name;
        this.lastName = lastName;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
        
        
    
    
}
