import java.util.*;

class Dfs {
    static ArrayList<Integer> visited = new ArrayList<Integer>();
    static void dfs(HashMap<Integer, ArrayList<Integer>> map, int n){
        System.out.println(n);
        visited.add(n);
        if(map.containsKey(n)){
            for(int i =0 ; i< map.get(n).size();i++){
                if(visited.contains(map.get(n).get(i))){
                    //nada
                }else{
                    dfs(map, map.get(n).get(i));
                }
            }
        }
    }
    public static void main(String args[]){
        HashMap<Integer, ArrayList<Integer>> map  = new HashMap<Integer, ArrayList<Integer>>();
        map.put(1,new ArrayList<Integer>(){{
            add(2);
            add(3);
        }});
        map.put(2,new ArrayList<Integer>(){{
            add(4);
            add(5);
        }});
        dfs(map,1);
        
    }
}