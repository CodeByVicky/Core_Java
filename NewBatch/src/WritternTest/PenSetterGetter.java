package WritternTest;
/*A Pen contains variables Refill, capLength and brand. Refill has variables
inkColor, length and Nib (tip). Nib has variables materialType and width. Create
a  class structure for above. Write a main method which sets values in all the variables
using setter methods and prints all the variables using getter methods. 
*/
class Nib{
	String materialType;
	float width;
	
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
}

class Refill{
	
	String color;
	float length;
	Nib tip;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public Nib getTip() {
		return tip;
	}
	public void setTip(Nib tip) {
		this.tip = tip;
	}
	
}


class PenContains{
	
	 Refill ref;
	 float capLength;
	 String brand;
	 
	 
	public Refill getRef() {
		return ref;
	}
	public void setRef(Refill ref) {
		this.ref = ref;
	}
	public float getCapLength() {
		return capLength;
	}
	public void setCapLength(float capLength) {
		this.capLength = capLength;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	 
	 
}
public class PenSetterGetter {

	
	
		public static void main(String[] args) {
			Nib nib=new Nib();
			nib.setMaterialType("steel");
			nib.setWidth(0.4f);
			
			
			Refill re= new Refill();
			re.setColor("blue");
			re.setLength(5.0f);
			re.setTip(nib);
			
			PenContains pe=new PenContains();
			pe.setBrand("Triamax");
			pe.setCapLength(2f);
			pe.setRef(re);
			
			
			
			System.out.println(pe.getBrand()+" "+pe.getCapLength()+pe.getRef().getColor()+" "+pe.getRef().getLength()+" "+pe.getRef().getTip().getMaterialType()+" "+pe.getRef().getTip().getWidth());
			
			}
			}
			
		