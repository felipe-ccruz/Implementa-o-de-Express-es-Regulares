public class Edge {
    private Node source;
    private Node destination;
    private char[] password;
    public Edge(Node source, Node destination) {
        this.source = source;
        this.destination = destination;
    }


    //GETTER & SETTER
    public Node getSource() {
        return source;
    }
    public void setSource(Node source) {
        this.source = source;
    }
    public Node getDestination() {
        return destination;
    }
    public void setDestination(Node destination) {
        this.destination = destination;
    }
    public char[] getPassword() {
        return password;
    }
}
