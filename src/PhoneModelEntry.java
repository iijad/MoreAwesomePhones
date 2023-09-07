import javax.swing.ImageIcon;

public class PhoneModelEntry extends Object implements Comparable<PhoneModelEntry> {
	private String modelName;
	private double basePrice;
	private double contractPrice;
	private String imagePath;

	public PhoneModelEntry() {

	}
	public PhoneModelEntry(String modelName, double basePrice)
	{
		this.modelName = modelName;
		this.basePrice = basePrice;
	}
	

	public PhoneModelEntry(String modelName, double basePrice, double contractPrice, ImageIcon imagPath) {

		this.modelName = modelName;
		this.basePrice = basePrice;
		this.contractPrice = contractPrice;
		this.imagePath = imagePath;

	}
	
	public PhoneModelEntry(String modelName, double contractPrice, String imagePath )
	{
		this.modelName= modelName;
		this.contractPrice= contractPrice;
		this.imagePath = imagePath;
	}

	public String toString() {
		return modelName + " | $" + contractPrice + " ($" + basePrice + " no contract)";
	}

	public boolean equals(Object o) {
		boolean retVal = false;
		if (o instanceof PhoneModelEntry) {
			PhoneModelEntry p = (PhoneModelEntry) o;
			retVal = this.modelName.equalsIgnoreCase(p.modelName);

		}
		return retVal;

	}

	@Override
	public int compareTo(PhoneModelEntry o) {
		int retVal = 0;
		retVal = this.modelName.compareTo(o.modelName);

		return retVal;

	}
	public String[] split(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
