package ch11.circularity;

public class CircularityB {    
    private CircularityA circularityA;    
      
    public CircularityB() {    
    }    
      
    public CircularityB(CircularityA circularityA) {    
        this.circularityA = circularityA;    
    }    
      
    public void setCircularityA(CircularityA circularityA) {    
        this.circularityA = circularityA;    
    }    
      
    public void b() {    
    	circularityA.a();    
    }    
}    