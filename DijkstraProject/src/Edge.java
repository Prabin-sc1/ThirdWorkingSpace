
public class Edge {
	private int fromNodeIndex;
    private int toNodeIndex;
    private int length;
    
    public Edge(int f,int t, int l) {
    	fromNodeIndex = f;
    	toNodeIndex = t;
    	length = l;
    }
    public int getFromNodeIndex() {
    	return fromNodeIndex;
    }
    public int getToNodeIndex() {
    	return toNodeIndex;
    }
    public int getLength() {
    	return length;
    }
    
    public int getNeighboursIndex(int nodeIndex) {
    	if(this.fromNodeIndex == nodeIndex) {
    		return this.toNodeIndex;
    	}
    	else {
    		return this.fromNodeIndex;
    	}
    	
    }
    
}
