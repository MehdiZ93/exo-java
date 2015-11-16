package testsUnitaires.tp;

public class TestPoint implements InterfacePoint {
	
	private int ord, abs;
	
	public int getOrd(){
		return ord;
	}
    public int getAbs(){
    	return abs;
    }
    public void setOrd(int ord){
    	this.ord = ord;
    }
    public void setAbs(int abs){
    	this.abs = abs;
    }

    /**
     * Retourne la somme des deux points.
     */

    public InterfacePoint add(InterfacePoint p){
    	return this + p;
    }
	@Override
	public boolean equals(InterfacePoint p) {
		// TODO Auto-generated method stub
		return false;
	}

}
