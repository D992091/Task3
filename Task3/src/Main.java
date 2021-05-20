

public class Main {
	
	public static double[] sortArr(double[] arr){
		double el = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					el = arr[i];
					arr[i] = arr[j];
					arr[j] = el;
				}
			}
		}
		return arr;
	}
	
	public static void main(String... args){
		double sum = 0;
		
		BaseJob baseJob = new BaseJob(100, true);
		AddJob addJob = new AddJob(100, true);
		Rewards rewards = new Rewards(100, false);
		Rewards rewards1 = new Rewards(100, true);
		Sales sales = new Sales(100, true);
		Transits transits = new Transits(100,true);
		Privilegies privilegies = new Privilegies(100, true);
		Presents presents = new Presents(100, true);
		double[] arr = new double[]{baseJob.getTax(), addJob.getTax(), rewards.getTax(), rewards1.getTax(), sales.getTax(), transits.getTax(), privilegies.getTax(), presents.getTax()};
		sortArr(arr);
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
	

}
