class Solution {
    public int findCenter(int[][] edges) {
        if(edges==null || edges.length<2){
            throw new IllegalArgumentException("Invalid graph structure input stream");
        }
        //Find coordinates of first two edges
        int u1 = edges[0][0];
        int v1 = edges[0][1];

        int u2 = edges[1][0];
        int v2 = edges[1][1];

        if(u1 == u2 || u1 == v2){
            return u1;
        }
        return v1;
    }
}