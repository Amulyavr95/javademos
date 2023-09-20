package polymorphism;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		Windows wn=new WindowsAir();
		wn.start();
		wn.shutdown();
	}
}

class Windows{
	void start() {
		System.out.println("windows started");
	}
	void shutdown() {
		System.out.println("windows stoped");
	}
}

class WindowsAir extends Windows{
	void start() {
		System.out.println("windowsair started");
	}
	void shutdown() {
		System.out.println("windowsAir stoped");
	}
}

class WindowsPro extends Windows{
	void start() {
		System.out.println("windowspro started");
	}
	void shutdown() {
		System.out.println("windowspros stoped");
	}
}