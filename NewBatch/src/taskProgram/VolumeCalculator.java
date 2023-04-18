package taskProgram;

public class VolumeCalculator {
	double CalculatorVolume(double radius ,double height){
		
		double volume=3.14*radius*radius *height;
		
		return  volume;
		
	}
	
double CalculatorVolume(int length ,int breadth,double height){
		
		double volume=length*breadth *height;
		
		return  volume;
		
	}

	public static void main(String[] args) {
		VolumeCalculator vc= new VolumeCalculator();
		System.out.println("cylinder volume is:"+vc.CalculatorVolume(6.9, 9.0));
		System.out.println("cuboid volume is:"+vc.CalculatorVolume(5, 6, 5.0));

	}

}
