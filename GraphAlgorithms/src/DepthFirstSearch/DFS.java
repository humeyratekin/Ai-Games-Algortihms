package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Humeyra
 */
public class DFS {
    
    private Stack<Vertex> stack;
    
    public DFS(){
        this.stack=new Stack<>();
    }
    
    public void dfs(List<Vertex> vertexList){
        
        for(Vertex v:vertexList){
            if(!v.isVisited()){
                v.setVisited(true);
                //dfsRecursive(v);
                dfsWithStack(v);
                 
            }
        }
    }

    private void dfsWithStack(Vertex root) {
        
        this.stack.add(root);
        root.setVisited(true);
        
        while(!stack.isEmpty()){
            Vertex actualVertex=this.stack.pop();
            System.out.println(actualVertex+" ");
            
            for(Vertex v:actualVertex.getNeighbourList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }    

    private void dfsRecursive(Vertex v) {
        System.out.println(v+" ");
        
        for(Vertex vertex:v.getNeighbourList()){
            
            if(!vertex.isVisited()){
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        
        }
    }
}
