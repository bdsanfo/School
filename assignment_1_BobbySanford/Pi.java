import java.util.*;

public class Pi {
	
	private double gregoryPi;

	public Pi(double k) {
		
		for (int i=1; i<=k; i++) {
			gregoryPi = gregoryPi + ((Math.pow(-1,(i+1)))/(2*i-1))*4;
		}
	}

	public double getCalculatedGregoryPiValue(){
		return gregoryPi;
	}
}