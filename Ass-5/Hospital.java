class Hospital{
	public static void check(String patientname,int age,double mobile,String email,String sickness)
	{
		System.out.println("Name: "+patientname+" Age:"+age+" Number:"+mobile+" Email:"+email+" Sickness:"+sickness);
		Doctor.treatment(patientname,age);
	}
}
