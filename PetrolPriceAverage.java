
public class PetrolPriceAverage {

	public static void main(String[] args) {
		Double[] petrolPrices= {67.2,99.4,34.7,78.5,9.6,90.9};
		double sum=0;
		for(int i=0;i<petrolPrices.length;i++)
		{
			sum+=petrolPrices[i];
	
		}
		double averagePrice=sum/petrolPrices.length;
		System.out.println("The average of Petrol price is " +averagePrice);
	}

}
