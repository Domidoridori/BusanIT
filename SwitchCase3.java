package ifexample;

public class SwitchCase3 {

	public static void main(String[] args) {
		// ctrl + shift + o : 자동 임포트 단축키
		String buliding = "floor";
		
		switch(buliding) {
			case "pharmacy":
				System.out.println("1층 약국입니다.");
				break;
			case "orthopedics":
				System.out.println("2층 정형외과입니다.");
				break;
			case "dermatology":
				System.out.println("3층 피부과입니다.");
				break;
			case "dentist":
				System.out.println("4층 치과입니다.");
			case "healthclub":
				System.out.println("5층 헬스클럽입니다.");
			default:
				System.out.println("엘리베이터가 운행되고 있습니다. 층을 선택해주세요.");
		}

	}

}
