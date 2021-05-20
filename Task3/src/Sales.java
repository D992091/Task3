public class Sales extends Earnings {
	protected final int maxSum = 20000;
	protected final int percent = 8;
	
	Sales(int sum,boolean isPay) {
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
