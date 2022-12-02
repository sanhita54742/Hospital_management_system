/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HouseDirectory {
    
    private ArrayList<House> houseDirectory;
    
    public HouseDirectory(){
        houseDirectory = new ArrayList<>();
    }

    public ArrayList<House> getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(ArrayList<House> houseDirectory) {
        this.houseDirectory = houseDirectory;
    }
    
     public int houseCount(){
        return houseDirectory.size();
    }
    
    public House addHouse(){
        House p = new House();
        houseDirectory.add(p);
        return p;
    }
    
    public int housecount(){
        return houseDirectory.size();
    }

    
  
    public void deleteHouse(House h) {
        houseDirectory.remove(h);
    }
    
    
    
}
    
