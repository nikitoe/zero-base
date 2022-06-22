package sam07;

public abstract class 도형 {

	protected int x좌표값;
	protected int y좌표값;

	public 도형(int x좌표값, int y좌표값) {
		this.x좌표값 = x좌표값;
		this.y좌표값 = y좌표값;
	}

	public void 초기화() {
		x좌표값 = 0;
		y좌표값 = 0;
	}

	public abstract void 그리기();

}
