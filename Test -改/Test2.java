//(1) Biology生物接口定义了breathe()抽象方法（用输出语句模拟即可）。
//(2) Animal动物接口继承了Biology接口，增加了eat()和sleep()两个抽象方法。
//(3) Humman人类接口继承了Animal接口，增加了think()和learn()两个抽象方法。
//(4) 定义一个人类Person实现Human接口，并进行测试
public class Test2 {
	//Bioligy生物接口；
	interface Biology {
        public abstract void breath();//breath抽象方法
	}
	//Animal动物接口继承Biology生物接口；
	interface Animal extends Biology {
        public abstract void eat();//eat抽象方法
        public abstract void sleep();//eat抽象方法
	}
	//Animal人类接口继承Animal动物接口；
	interface Human extends Animal {
        public abstract void think();//think抽象方法
        public abstract void learn();//learn抽象方法
	}
	//人类Person实现Human接口；
    static class Person implements Human {

        @Override
        public void breath() {
            System.out.println("Human can breath");
        }

        @Override
        public void eat() {
            System.out.println("Human can eat");
        }

        @Override
        public void sleep() {
            System.out.println("Human sleep");
        }

        @Override
        public void think() {
            System.out.println("Human can think");
		}
		
        @Override
        public void learn() {
            System.out.println("Human can learn");
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.breath();
        person.eat();
        person.sleep();
        person.think();
        person.learn();
    }
}
