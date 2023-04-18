package WritternTest;
/*8) There are four classes a) Car (carId, carcolor) b) Engine
(engineid ,lastenginecleandate) c) SubEngine (subenginetype)
d) Gear (type - auto manual)
Car has Engine, Engine has SubEngine, Car also has Gear
Create Object in Object (Containment) for above scenario [2M]

*/
class Engine{
	int engineid;
	int lastenginecleandate;
	SubEngine sub;
	
	Engine(int engineid,int lastenginecleandate,SubEngine sub){
		this.engineid=engineid;
		this.lastenginecleandate=lastenginecleandate;
		this.sub=sub;
	}
	
	public String toString (){
		return engineid+" "+lastenginecleandate+" "+sub;
	}
}
class SubEngine{
	String subenginetype;
	SubEngine(String subenginetype){
		this.subenginetype=subenginetype;
	}
	public String toString (){
		return subenginetype;
	}
}

class Gear{
	String gearType;
	Gear(String gearType){
		this.gearType=gearType;
	}
public String toString(){
	return gearType;
}
}

public class Car {
	int carId;
	String carColor;
	Engine eng;
	Gear gea;
	
	 Car(int carId,String carColor,Engine eng,Gear gea){
		this.carId=carId;
		this.carColor=carColor;
		this.eng=eng;
		this.gea=gea;
	}
	
void show(){
	System.out.println(carId+" "+carColor+" "+eng+" "+gea);
}
	
	
	public static void main(String args []){
		
		SubEngine sub=new  SubEngine("Boast");
		
		Engine eng=new Engine(101,14,sub);
		
		Gear gea=new Gear("auto");
		Car r=new Car(501,"red",eng,gea);
		
		
		
		r.show();
		
	}
 
}