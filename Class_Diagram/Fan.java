package Class_Diagram;

public class Fan {

	String color;
	int no_of_Wings;
	String Type_of_Motor;
	boolean isStart = false;

	public boolean Start_fan() {
		isStart = true;
		return isStart;
	}

	public boolean Stop_fan() {
		isStart = false;
		return isStart;
	}

	public void SpeedInc() {

	}

}
