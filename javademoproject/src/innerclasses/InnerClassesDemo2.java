package innerclasses;

public class InnerClassesDemo2 {
	public static void main(String[] args) {
		Car car=new Car("white");
		car.start();
		Car.MusicSystem ms= car.new MusicSystem(5);
		ms.displayDetails();
		ms.playSomeMusic();
		
	}
}

class Car{
	private static String model="Hondai 120";
	private String color;
	
	void start() {
		System.out.println("Car whith "+color+" is starting");
	}
	
	Car(String color){
		this.color=color;
		
		
	}
	class MusicSystem{
		private int numofchannels;
		MusicSystem(int numofchannels){
			this.numofchannels=numofchannels;
		}
			void displayDetails() {
				System.out.println("model of car "+Car.model);
				System.out.println("color "+Car.this.color);
				System.out.println("num of channels "+this.numofchannels);

		}
			void playSomeMusic() {
				System.out.println("playing somem music");
				class Channel{
					int frequency;
					void getCurrentPlayingsong() {
						System.out.println("current song is playing");
						
					}
				}
				Channel channel=new Channel();
				channel.getCurrentPlayingsong();
			}
	}
}