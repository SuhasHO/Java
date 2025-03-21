class subRegionalPostOffice
{
	public static void deliver(String customername,String address)
	{
		String name1 = "Shivamogga";
		String location1="Karnataka";
		System.out.println("Sub Regional Post Office: "+name1+" "+location1);
		AreaPostOffice.deliver(customername,address);
	}
}