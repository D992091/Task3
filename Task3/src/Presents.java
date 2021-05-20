public class Presents extends Earnings {
	protected final int maxSum = 5000;
	protected final int percent = 1;
	
	Presents(int sum,boolean isPay) {
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
