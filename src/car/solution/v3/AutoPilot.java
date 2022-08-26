package car.solution.v3;

public class AutoPilot implements DriveOption {
    @Override
    public void work() {
        System.out.println("> 테슬라 AutoPilot: 어댑티드 크루즈 컨트롤, 차간거리 자동 유지, 차선유지, 자동주차 기능으로 주행중 입니다!!");
    }
}
