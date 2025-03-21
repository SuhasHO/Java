class PostHeadMaster
{
	public static void deliver(String customername,String address)
	{
		String name1 = "Skanda";
		String location1="Karnataka";
		System.out.println("Post Office Head Master."+name1+" "+location1);
		RegionalPostOffice.deliver(customername,address);
	}
}