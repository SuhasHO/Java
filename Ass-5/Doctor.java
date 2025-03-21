class Doctor{
	public static void treatment(String patientName,int age)
	{
		System.out.println("Doctor: "+patientName+" Age:"+age);
		Nurse.assist(patientName);
	}
}