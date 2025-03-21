class RegionalPostOffice
{
	public static void deliver(String customername,String address)
	{
		String name2="Shivamogga";
		System.out.println("Regional Post Office."+name2);
		subRegionalPostOffice.deliver(customername,address);
	}
}