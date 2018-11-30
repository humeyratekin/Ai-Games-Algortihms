/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BreadtFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Humeyra
 */
public class Vertex {
    
    private int data;
    private boolean visited;
    private List<Vertex> neighbourList;

    public Vertex(int data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public void addNeighbourVertex(Vertex vertex){
        this.neighbourList.add(vertex);
    }
    
    @Override
    public String toString() {
        return  "" + this.data;
    }
    
    
    
    
    
    
    
}
