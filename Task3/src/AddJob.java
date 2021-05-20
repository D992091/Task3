public class AddJob extends Earnings {
	protected final int maxSum = 50000;
	protected final int percent = 5;
	
	AddJob(int sum,boolean isPay) {
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
