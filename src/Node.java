public class Node {
    private String name;
    private Node[] neighbours;   
    public Node(String name) {
        this.name = name;
    }


    //GETTER & SETTER
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Node[] getNeighbours() {
        return neighbours;
    }
}
