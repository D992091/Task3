public class Privilegies extends Earnings {
	protected final int maxSum = 15000;
	protected final int percent = 6;
	
	Privilegies(int sum,boolean isPay) {
		super(sum, isPay);
	}
	
	@Override
	public double getTax() {
		if(checkSum(maxSum) && isPay){
			return sum*percent/100;
		} else {
			return 0;
		}
	}
}
