package sum_you_want;

import javax.swing.JOptionPane;

public class sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=JOptionPane.showInputDialog("请输入", JOptionPane.CLOSED_OPTION);
		int Last = Integer.parseInt( s ); 
		int Sum=0;
		for(int i=1;i<=Last;i++)
		{
			Sum+=i;
		}
		System.out.println("The sum from 1 to "+Last+" is:"+Sum);

	}

}
