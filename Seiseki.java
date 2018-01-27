/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.ArrayList;

/**
 *
 * @author plane
 */
public class Seiseki {
    private String name;
    private String ID;
    private ArrayList<Integer> score;
    
    public Seiseki(String name, String id){
        this.name = name;
        this.ID = id;
        this.score = new ArrayList<Integer>();
    }
    
    public void setName(String str){
        this.name = str;
    }
    public String getName(){
        return this.name;
    }
    public void setID(String str){
        this.ID = str;
    }
    public String getID(){
        return this.ID;
    }
    public void setScore(ArrayList<Integer> scores){
        this.score = new ArrayList<Integer>();
        for(int score: scores){
            this.score.add(score);
        }
    }
    public ArrayList<Integer> getScore(){
        return this.score;
    }
    
    public float Average(){
        int size = this.score.size();
        return (this.Total()/(float)size);
    }
    
    public int Total(){
        int total = 0;
        for(int i = 0; i < this.score.size() ; i++){
            total += this.score.get(i);
        }
        return total;
    }
}
