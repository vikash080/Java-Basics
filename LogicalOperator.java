
class LogicalOperator
{
	public static void main(String[] args)
	{
		boolean a = true;
		boolean b = false;
		System.out.println(a&&a);
		System.out.println(a&&b);
		System.out.println(b&&a);
		System.out.println(b&&b);

		System.out.println(a||a);
		System.out.println(a||b);
		System.out.println(b||a);
		System.out.println(b||b);
	}
}