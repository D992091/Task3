public abstract class Earnings{
	protected int sum;
	protected int percent;
	protected boolean isPay;
	
	Earnings(int sum, boolean isPay){
		this.sum = sum;
		this.isPay = isPay;
		
	}
	
	public abstract double getTax();
	
	protected boolean checkSum(int sum){
		if (sum >=0 && this.sum <= sum){
			return true;
		} else {
			return false;
		}
	};
	
	protected boolean isPay(){
		return isPay;
	}
	
}
