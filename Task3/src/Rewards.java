public class Rewards extends Earnings {
	protected final int maxSum = 10000;
	protected final int percent = 3;
	
	Rewards(int sum,boolean isPay) {
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
