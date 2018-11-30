/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Humeyra
 */
public class Vertex {
    
    private String name;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(String name) {
        this.name = name;
        neighbourList=new ArrayList<>();
    }

    @Override
    public String toString() {
        return  this.name;
    }
    
    
    public void addNeighbour(Vertex vertex){
    
        this.neighbourList.add(vertex);
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }
    
    
    
    
}
