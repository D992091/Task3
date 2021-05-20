

public class BaseJob  extends Earnings{
	protected final int maxSum = 2000000;
	protected final int percent = 15;
	
	BaseJob(int sum,boolean isPay){
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
