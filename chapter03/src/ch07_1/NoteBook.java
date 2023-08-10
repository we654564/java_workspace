package ch07_1;

public abstract class NoteBook extends Computer {

	@Override
	public abstract void display();

	@Override
	public void typing() {
		System.out.println("노트북 자판으로 글자를 입력 합니다.");
	}

} // end of class
