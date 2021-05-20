public class Transits extends Earnings {
	protected final int maxSum = 10000;
	protected final int percent = 4;
	
	Transits(int sum,boolean isPay) {
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
