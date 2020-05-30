package loanapplication.javaproject;

public class javapractise implements bankproject{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String t="appu is a good boy";
		//System.out.println(t.trim());
		//System.out.println(t.concat(" and a good person"));
		//System.out.println(t.length());
		//System.out.println(t.split("is"));
		//System.out.println(t.toUpperCase());
		//System.out.println(t.substring(4));
		//String arr[]=t.split("good");
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(t.replace("appu", "mayuran"));
		
	//	for(int i=0;i<=100;i++)
	//	{
	//		if(i==100)
	//		{
	//		System.out.println("equal to 100");
	//		}
	//		else
	//		{
	//			System.out.println("less than 100");
	//		}
				
	//	}
		   
		int sen=0;
		while(sen<10)
		{
			System.out.println("super");
			
			sen++;
			
			
		}
        
		int xy=0;
		do
		{
			
			System.out.println("test");
			xy++;
		}while(xy<10);
		
		bankproject bp=new javapractise();
		bp.building();
		bp.construtions();
		bp.development();
		javapractise jp= new javapractise();
		jp.branch();
		
	}

	@Override
	public void construtions() {
		// TODO Auto-generated method stub
		
		System.out.println("good");
		
	}

	@Override
	public void building() {
		System.out.println("nice");
		
	}

	@Override
	public void development() {
		// TODO Auto-generated method stub
		System.out.println("CHAMP");
		
	}
		public void branch() {
			// TODO Auto-generated method stub
			System.out.println("Cgrep");
		
		
	}

}
