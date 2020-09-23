import java.util.Scanner;
public class HousePainting {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input building Building Length: ");
		int buildingLength = in.nextInt();	
		System.out.println("Input building Building Width: ");
		int buildingWidth = in.nextInt();		
		System.out.println("Input building Building Height");
		int buildingHeight = in.nextInt();
		
		System.out.println("Input # of windows");
		int NumWindows = in.nextInt();
		System.out.println("Input Length of windows");
		int LengthWindow = in.nextInt();
		System.out.println("Input Width of windows");
		int WidthWindow = in.nextInt();
		
		System.out.println("Input # of doors");
		int NumDoors = in.nextInt();
		System.out.println("Input Length of doors");
		int LengthDoor = in.nextInt();
		System.out.println("Input Width of doors");
		int WidthDoor = in.nextInt();
		
		int WindowsSQFT = (NumWindows*(LengthWindow*WidthWindow));
		int DoorsSQFT = (NumDoors*(LengthDoor*WidthDoor));
		int WindowsDoorsSQFT = (WindowsSQFT+DoorsSQFT);
		
		int buildingSide = (2*(buildingLength*buildingWidth));
		
		int x = (buildingHeight-buildingWidth);
		int y = (buildingLength*x);
		
		int PeakSide = buildingSide + y;
		int HouseSQFT = (PeakSide+buildingSide);
		System.out.println("The square footage of the building is: "+HouseSQFT);
		
		int PaintSQFT = (HouseSQFT-WindowsDoorsSQFT);
		System.out.println("The square footage to paint: "+PaintSQFT);
		
		System.out.println("Input the Cost Per SQFT");
		int CostPerSQFT = in.nextInt();
		int PaintCost = PaintSQFT*CostPerSQFT;
		System.out.println("The total cost to paint is: "+PaintCost);


		
		in.close();
	}

}

