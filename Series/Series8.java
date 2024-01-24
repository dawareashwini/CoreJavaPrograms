package Series;

public class Series8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
for(int i=1;i<=15;i++)
{
	System.out.print(i+"*"+(i+1));
	if(i<15)
		System.out.print(" + ");
	sum=sum+(i*(i+1));
}
System.out.println(" = "+sum);
	}

}
