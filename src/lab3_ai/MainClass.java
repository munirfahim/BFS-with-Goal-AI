/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ai;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author munir
 */
public class MainClass {

    private Queue<Integer> queue;
 
    public MainClass()
    {
        queue = new LinkedList<Integer>();
    }
    
    public void addEdge(int adj_matrix[][], int start, int e)
{
        adj_matrix[start][e] = 1;
        adj_matrix[e][start] = 1;
}
 
    public void bfs(int adjacency_matrix[][], int source,int goal)
    {
        int number_of_nodes = adjacency_matrix[source].length - 1;
        
        int[][] outputmatrix=new int[9][9];
 
        int[] visited = new int[number_of_nodes + 1];
        int i, element;
 
        visited[source] = 1;
        queue.add(source);
        System.out.printf("%d",source);
        System.out.printf(" ");
 
        while (!queue.isEmpty())
        {
            element = queue.remove();
            i = element;
            while (i <= number_of_nodes)
            {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
                {
                    queue.add(i);
                    visited[i] = 1;
                    System.out.printf("%d ", i);
                }
                if(i==goal)
                break;
                i++;
            }
            
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int number_no_nodes, source,goal;
     
            number_no_nodes = 9;
 
            int adjacency_matrix[][]=new int[8][8];
            
            
            source = 1;
            goal=4;
 
            
            MainClass bfs = new MainClass();
            bfs.addEdge(adjacency_matrix, 1, 2);
            bfs.addEdge(adjacency_matrix, 1, 3);
            bfs.addEdge(adjacency_matrix, 1, 5);
            bfs.addEdge(adjacency_matrix, 2, 4);
            bfs.addEdge(adjacency_matrix, 2, 6);
            bfs.addEdge(adjacency_matrix, 3, 7);
            bfs.addEdge(adjacency_matrix, 5, 6);
            bfs.bfs(adjacency_matrix, source,goal);
 
         
    }
    
}
