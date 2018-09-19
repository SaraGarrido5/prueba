/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author aitor
 */

public class Person {
        
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final SimpleStringProperty postua;
    
    public Person(String fName, String lName, String email, String postua) { //derrigortuta nago, ezta? public jartzera beste pakete batetik sortuko dudalako?
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
        this.postua = new SimpleStringProperty(postua);
    }
    public String getFirstName() 
    {
        return firstName.get();
    }
    public void setFirstName(String fName) 
    {
        firstName.set(fName);
    }
    public String getLastName() 
    {
        return lastName.get();
    }
    public void setLastName(String fName)
    {
        lastName.set(fName);
    }
    public String getEmail() 
    {
        return email.get();
    }
    public void setEmail(String fName) 
    {
        email.set(fName);
    }
    public String getPostua()
    {
        return postua.get();
    }
    public void setPostua(String fName) 
    {
        postua.set(fName);
    }
}